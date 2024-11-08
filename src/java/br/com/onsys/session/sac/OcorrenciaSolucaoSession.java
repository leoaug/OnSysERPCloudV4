package br.com.onsys.session.sac;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.sac.OcorrenciaSolucao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class OcorrenciaSolucaoSession extends BasicSessionBean {
    
    private String jpqlCount = " ";                
    
    public List<OcorrenciaSolucao> getAll(int idEmpresa) {
        return getList(OcorrenciaSolucao.class,""
                + "select a "
                + "from OcorrenciaSolucao a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 "
                + "order by a.descricao",idEmpresa);
    }

    public List<OcorrenciaSolucao> getAllAtivos(int idEmpresa) {
        return getList(OcorrenciaSolucao.class,""
                + "select a "
                + "from OcorrenciaSolucao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.codigo", idEmpresa);
    }    
    
    public List<OcorrenciaSolucao> getAllAtivosDevolucao(int idEmpresa) {
        return getList(OcorrenciaSolucao.class,""
                + "select a "
                + "from OcorrenciaSolucao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'Devolucao' or a.tipo = 'Todos') "
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.codigo", idEmpresa);
    }  

    public List<OcorrenciaSolucao> getAllAtivosSAC(int idEmpresa) {
        return getList(OcorrenciaSolucao.class,""
                + "select a "
                + "from OcorrenciaSolucao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'SAC' or a.tipo = 'Todos') "                
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.codigo", idEmpresa);
    }     

    public List<OcorrenciaSolucao> getAllAtivosEcommerce(int idEmpresa) {
        return getList(OcorrenciaSolucao.class,""
                + "select a "
                + "from OcorrenciaSolucao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'E-Commerce' or a.tipo = 'Todos') "                
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.descricao ", idEmpresa);
    }
    
    public List<OcorrenciaSolucao> getAllAtivosLogistica(int idEmpresa) {
        return getList(OcorrenciaSolucao.class,""
                + "select a "
                + "from OcorrenciaSolucao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'Logistica' or a.tipo = 'Todos') "                
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.descricao ", idEmpresa);
    }
    
    public OcorrenciaSolucao getById(int id) {
        return getPojo(OcorrenciaSolucao.class,id);
    }

    public OcorrenciaSolucao getByDescricao(int idEmpresa, String descricao) {
        return getPojo(OcorrenciaSolucao.class,"select a "
                + "from OcorrenciaSolucao a, Empresa emp "
                + "where a.empresa   = emp "
                + "  and emp.id      = ?1 "
                + "  and a.descricao = ?2",idEmpresa, descricao);
    }
    
    public OcorrenciaSolucao getByCodigo(int idEmpresa, String codigo) {
        return getPojo(OcorrenciaSolucao.class,"select a "
                + "from OcorrenciaSolucao a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 "
                + "  and a.codigo  = ?2",idEmpresa, codigo);
    }
    
    public List<OcorrenciaSolucao> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from OcorrenciaSolucao a, Empresa emp "
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
        
        return getListPaged(OcorrenciaSolucao.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from OcorrenciaSolucao a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public OcorrenciaSolucao save(OcorrenciaSolucao emp) {
        getEm().persist(emp);
        return emp;
    }

    public OcorrenciaSolucao set(OcorrenciaSolucao emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(OcorrenciaSolucao emp) {
        OcorrenciaSolucao empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}