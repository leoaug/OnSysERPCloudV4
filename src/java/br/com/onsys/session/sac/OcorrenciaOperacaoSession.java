package br.com.onsys.session.sac;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.sac.OcorrenciaOperacao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class OcorrenciaOperacaoSession extends BasicSessionBean {
    
    private String jpqlCount = " ";                
    
    public List<OcorrenciaOperacao> getAll(int idEmpresa) {
        return getList(OcorrenciaOperacao.class,""
                + "select a "
                + "from OcorrenciaOperacao a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 "
                + "order by a.descricao",idEmpresa);
    }
    
    public List<OcorrenciaOperacao> getAllAtivos(int idEmpresa) {
        return getList(OcorrenciaOperacao.class,""
                + "select a "
                + "from OcorrenciaOperacao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.codigo", idEmpresa);
    }    
    
    public List<OcorrenciaOperacao> getAllAtivosDevolucao(int idEmpresa) {
        return getList(OcorrenciaOperacao.class,""
                + "select a "
                + "from OcorrenciaOperacao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'Devolucao' or a.tipo = 'Todos') "
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.codigo", idEmpresa);
    }  

    public List<OcorrenciaOperacao> getAllAtivosSAC(int idEmpresa) {
        return getList(OcorrenciaOperacao.class,""
                + "select a "
                + "from OcorrenciaOperacao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'SAC' or a.tipo = 'Todos') "                
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.codigo", idEmpresa);
    }         


    public List<OcorrenciaOperacao> getAllAtivosEcommerce(int idEmpresa) {
        return getList(OcorrenciaOperacao.class,""
                + "select a "
                + "from OcorrenciaOperacao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'E-Commerce' or a.tipo = 'Todos') "                
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.descricao ", idEmpresa);
    }
    
    public List<OcorrenciaOperacao> getAllAtivosLogistica(int idEmpresa) {
        return getList(OcorrenciaOperacao.class,""
                + "select a "
                + "from OcorrenciaOperacao a, Empresa emp     "
                + "where a.empresa    = emp                "
                + "  and (a.tipo   = 'Logistica' or a.tipo = 'Todos') "                
                + "  and emp.id       = ?1                 "
                + "  and (a.inativo   = ' ' or a.inativo is null) "
                + "order by a.descricao ", idEmpresa);
    }
    
    public OcorrenciaOperacao getById(int id) {
        return getPojo(OcorrenciaOperacao.class,id);
    }

    public OcorrenciaOperacao getByDescricao(int idEmpresa, String descricao) {
        return getPojo(OcorrenciaOperacao.class,"select a "
                + "from OcorrenciaOperacao a, Empresa emp "
                + "where a.empresa   = emp "
                + "  and emp.id      = ?1 "
                + "  and a.descricao = ?2",idEmpresa, descricao);
    }
    
    public OcorrenciaOperacao getByCodigo(int idEmpresa, String codigo) {
        return getPojo(OcorrenciaOperacao.class,"select a "
                + "from OcorrenciaOperacao a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 "
                + "  and a.codigo  = ?2",idEmpresa, codigo);
    }
    
    public List<OcorrenciaOperacao> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from OcorrenciaOperacao a, Empresa emp "
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
        
        return getListPaged(OcorrenciaOperacao.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from OcorrenciaOperacao a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public OcorrenciaOperacao save(OcorrenciaOperacao emp) {
        getEm().persist(emp);
        return emp;
    }

    public OcorrenciaOperacao set(OcorrenciaOperacao emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(OcorrenciaOperacao emp) {
        OcorrenciaOperacao empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}