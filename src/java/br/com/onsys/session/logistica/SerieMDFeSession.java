package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.SerieMDFe;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SerieMDFeSession extends BasicSessionBean {
    
    private String jpqlCount = " ";      
    
    public List<SerieMDFe> getAll(int idEmpresa) {
        return getList(SerieMDFe.class,""
                + "select a "
                + "from SerieMDFe a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 ", idEmpresa);
    }
    
    /* criar um método para retornar a serie padrão */
    public SerieMDFe getSerieNF(int idEmpresa) {
        return getPojo(SerieMDFe.class,""
                + "select a "
                + "from SerieMDFe a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 ", idEmpresa);
    }    
    
    public SerieMDFe getById(int id) {
        return getPojo(SerieMDFe.class,id);
    }

    public SerieMDFe getByDescricao(int idEmpresa, String descricao) {
        return getPojo(SerieMDFe.class,"select a "
                + "from SerieMDFe a, Empresa emp "
                + "where a.empresa   = emp "
                + "  and emp.id      = ?1 "
                + "  and a.descricao = ?2",idEmpresa, descricao);
    }
    
    public SerieMDFe getByCodigo(int idEmpresa, String codigo) {
        return getPojo(SerieMDFe.class,"select a "
                + "from SerieMDFe a, Empresa emp "
                + " where a.empresa = emp "
                + "   and emp.id    = ?1 "
                + "   and a.codigo  = ?2",idEmpresa, codigo);
    }

    public List<SerieMDFe> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from SerieMDFe a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.codigo       like :globalFilter or "
                               + "a.descricao    like :globalFilter)");
        
        return getListPaged(SerieMDFe.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from SerieMDFe a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id    = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public SerieMDFe save(SerieMDFe emp) {
        getEm().persist(emp);
        return emp;
    }

    public SerieMDFe set(SerieMDFe emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(SerieMDFe emp) {
        SerieMDFe empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}