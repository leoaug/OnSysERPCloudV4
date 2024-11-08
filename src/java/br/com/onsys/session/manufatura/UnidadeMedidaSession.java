package br.com.onsys.session.manufatura;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.manufatura.UnidadeMedida;
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
public class UnidadeMedidaSession extends BasicSessionBean {
    
    private String jpqlCount = " ";            
    
    public List<UnidadeMedida> getAll(int idEmpresa) {
        return getList(UnidadeMedida.class,""
                + "select un from UnidadeMedida un, Empresa emp "
                + "where un.empresa = emp and emp.id = ?1 "
                + "order by un.descricao",idEmpresa);
    }

    public UnidadeMedida getById(int idUnidadeMedida) {
        return getPojo(UnidadeMedida.class,idUnidadeMedida);
    }

    public UnidadeMedida getByDescricao(int idEmpresa, String descricao) {
        return getPojo(UnidadeMedida.class,"select un "
                + "from UnidadeMedida un, Empresa emp "
                + "where un.empresa = emp and emp.id = ?1 "
                + "and un.descricao = ?2",idEmpresa, descricao);
    }

    public UnidadeMedida getByCodigo(int idEmpresa, String codigo) {
        return getPojo(UnidadeMedida.class,"select un from UnidadeMedida un, "
                + "Empresa emp where un.empresa = emp and emp.id = ?1 and "
                + "un.codigo = ?2",idEmpresa, codigo);
    }

    public List<UnidadeMedida> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from UnidadeMedida a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                         "(a.un                  like :globalFilter or "
                        + "a.descricao           like :globalFilter)");
        
        return getListPaged(UnidadeMedida.class,query, empresaID, first, pageSize, filters);
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
                    jpqlCount += " and (a.un            like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.descricao     like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) from UnidadeMedida a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public UnidadeMedida save(UnidadeMedida emp) {
        getEm().persist(emp);
        return emp;
    }

    public UnidadeMedida set(UnidadeMedida emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UnidadeMedida emp) {
        UnidadeMedida empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}