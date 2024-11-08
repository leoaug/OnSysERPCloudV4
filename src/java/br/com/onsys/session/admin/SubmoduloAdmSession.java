package br.com.onsys.session.admin;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Submodulo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SubmoduloAdmSession extends BasicSessionBean {
    
    private String jpqlCount = " ";      
    
    public List<Submodulo> getAll() {
        return getList(Submodulo.class,""
                + "select a "
                + "from Submodulo a "
                + "order by a.codigo");
    }
    
    public Submodulo getById(int id) {
        return getPojo(Submodulo.class,id);
    }

    public Submodulo getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Submodulo.class,"select a "
                + "from Submodulo a, Empresa emp "
                + "where a.empresa = emp and "
                + "emp.id = ?1 and a.codigo = ?2", idEmpresa, codigo);
    }

    public Submodulo getByDescricao(int idEmpresa, String descricao) {
        return getPojo(Submodulo.class,"select a "
                + "from Submodulo a, Empresa emp "
                + "where a.empresa = emp and "
                + "emp.id = ?1 and a.descricao = ?2", idEmpresa, descricao);
    }
    
    public List<Submodulo> getAllPaged(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from Submodulo a ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                 " (a.codigo              like :globalFilter or "
                               + " a.empresa.codigo       like :globalFilter or "                                         
                               + " a.empresa.nomeFantasia like :globalFilter or "
                               + " a.descricao            like :globalFilter)");
        
        query = query.replaceAll(":empresa.nomeFantasia", 
                                 ":empresa_nomeFantasia");
        
        query = query.replaceAll("a.empresa_nomeFantasia", 
                                 "a.empresa.nomeFantasia");     
        
        query = query.replaceAll(":empresa.codigo", 
                                 ":empresa_codigo");
        
        query = query.replaceAll("a.empresa_codigo", 
                                 "a.empresa.codigo");     
        
        return getListPagedSemEmpresa(Submodulo.class,query, first, pageSize, filters);
        
    }
    
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " where ";
        jpqlCount = " where ";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (jpqlCount.equals(" where ")) {
                    if (entry.getKey().equals("globalFilter")) {
                        jpqlCount += "  (a.codigo     like '%"+entry.getValue()+ '%'+"'";
                        jpqlCount += "  or  a.empresa.descricao like '%"+entry.getValue()+ '%'+"'";                        
                        jpqlCount += "  or  a.descricao  like '%"+entry.getValue()+ '%'+"')";
                    } else {
                       jpqlCount += "  a." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
                    }                
                } else {
                    if (entry.getKey().equals("globalFilter")) {
                        jpqlCount += " and (a.codigo     like '%"+entry.getValue()+ '%'+"'";
                        jpqlCount += "  or  a.empresa.descricao like '%"+entry.getValue()+ '%'+"'";                        
                        jpqlCount += "  or  a.descricao  like '%"+entry.getValue()+ '%'+"')";
                    } else {
                       jpqlCount += "  and a." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
                    }                
                }
            }

            filtros.clear();
            filtros.putAll(filtrosTratados);
            jpql = jpql.substring(0, jpql.length() - 4);
        }
        return jpql;
    }    
    
    public int getCountTot() {
        String sql = "select COUNT(a) from Submodulo a ";
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Submodulo save(Submodulo emp) {
        getEm().persist(emp);
        return emp;
    }

    public Submodulo set(Submodulo emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Submodulo emp) {
        Submodulo empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}