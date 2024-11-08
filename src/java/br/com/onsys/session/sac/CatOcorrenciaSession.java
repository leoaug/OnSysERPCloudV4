package br.com.onsys.session.sac;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.sac.CatOcorrencia;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class CatOcorrenciaSession extends BasicSessionBean {
    
    private String jpqlCount = " ";        
    
    public List<CatOcorrencia> getAll(int idEmpresa) {
        return getList(CatOcorrencia.class,""
                + "select a "
                + "from CatOcorrencia a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "order by a.descricao",idEmpresa);
    }

    public List<CatOcorrencia> getDEV(int idEmpresa) {
        return getList(CatOcorrencia.class,""
                + "select a "
                + "from CatOcorrencia a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and a.origem = 'DEV' "                
                + "order by a.descricao",idEmpresa);
    }
    
    public List<CatOcorrencia> getSAC(int idEmpresa) {
        return getList(CatOcorrencia.class,""
                + "select a "
                + "from CatOcorrencia a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and a.origem = 'SAC' "                
                + "order by a.descricao",idEmpresa);
    }
    
    public List<CatOcorrencia> getEcommerce(int idEmpresa) {
        return getList(CatOcorrencia.class,""
                + "select a "
                + "from CatOcorrencia a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and a.origem = 'ECOMMERCE' "                
                + "order by a.descricao",idEmpresa);
    }
    
    public List<CatOcorrencia> getLogistica(int idEmpresa) {
        return getList(CatOcorrencia.class,""
                + "select a "
                + "from CatOcorrencia a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id     = ?1 "
                + "  and a.origem   = 'Coleta' "                
                + "order by a.descricao",idEmpresa);
    }
    
    public List<CatOcorrencia> getAllAtivos(int idEmpresa) {
        return getList(CatOcorrencia.class,""
                + "select a "
                + "from CatOcorrencia a, Empresa emp     "
                + "where a.empresa  = emp                "
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo = ' ' or a.inativo is null) "
                + "order by a.codigo", idEmpresa);
    }
    
    public CatOcorrencia getById(int id) {
        return getPojo(CatOcorrencia.class,id);
    }

    public CatOcorrencia getByDescricao(int idEmpresa, String descricao) {
        return getPojo(CatOcorrencia.class,"select catocor "
                + "from CatOcorrencia catocor, Empresa emp "
                + "where catocor.empresa   = emp "
                + "  and emp.id            = ?1 "
                + "  and catocor.descricao = ?2 ",idEmpresa, descricao);
    }
    
    public CatOcorrencia getByCodigo(int idEmpresa, String codigo) {
        return getPojo(CatOcorrencia.class,"select catocor "
                + "from CatOcorrencia catocor, "
                + "Empresa emp "
                + "where catocor.empresa = emp and emp.id = ?1 and "
                + "catocor.codigo = ?2",idEmpresa, codigo);
    }
    
    public List<CatOcorrencia> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.descricao ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from CatOcorrencia a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.codigo       like :globalFilter or "
                               + "a.descricao    like :globalFilter)");
        
        return getListPaged(CatOcorrencia.class,query, empresaID, first, pageSize, filters);
    }
    
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " and ";
        jpqlCount = "";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (a.codigo     like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.descricao  like '%"+entry.getValue()+ '%'+"')";
                } else {
                   jpqlCount += " and a." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
                }
                
            }

            filtros.clear();
            filtros.putAll(filtrosTratados);
            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }
        return jpql;
    }    
    
    public int getCountTot(int idEmpresa) {
        String sql = "select COUNT(a) from CatOcorrencia a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public CatOcorrencia save(CatOcorrencia emp) {
        getEm().persist(emp);
        return emp;
    }

    public CatOcorrencia set(CatOcorrencia emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(CatOcorrencia emp) {
        CatOcorrencia empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}