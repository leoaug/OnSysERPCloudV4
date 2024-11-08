package br.com.onsys.session.manufatura;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.manufatura.CatItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class CatItemSession extends BasicSessionBean {
    
    private String jpqlCount = " ";        
    
    public List<CatItem> getAll(int idEmpresa) {
        return getList(CatItem.class,""
                + "select catitem "
                + "from CatItem catitem, Empresa emp "
                + "where catitem.empresa = emp and emp.id = ?1 "
                + "order by catitem.codigo ",idEmpresa);
    }

    public List<CatItem> getAllAtivos(int idEmpresa) {
        return getList(CatItem.class,""
                + "select catitem "
                + "from CatItem catitem, Empresa emp "
                + "where catitem.empresa = emp and emp.id = ?1 and "
                + "(catitem.inativo  != 'S' or catitem.inativo  is null) and  "
                + "(catitem.deletado != 'S' or catitem.deletado is null) "
                + "order by catitem.descricao",idEmpresa);
    }    
    
    public CatItem getById(int idCatItem) {
        return getPojo(CatItem.class,idCatItem);
    }

    public CatItem getByDescricao(int idEmpresa, String descricao) {
        return getPojo(CatItem.class,"select catitem "
                + "from CatItem catitem, Empresa emp "
                + "where catitem.empresa = emp and emp.id = ?1 and "
                + "catitem.descricao = ?2",idEmpresa , descricao);
    }
    
    public CatItem getByCodigo(int idEmpresa, String codigo) {
        return getPojo(CatItem.class,"select catitem from CatItem catitem, "
                + "Empresa emp where catitem.empresa = emp and emp.id = ?1 and "
                + "catitem.codigo = ?2",idEmpresa, codigo);
    }
    
    public List<CatItem> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from CatItem a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                         "(a.codigo                        like :globalFilter or "
                        + "a.descricao                     like :globalFilter)");
        
        return getListPaged(CatItem.class,query, empresaID, first, pageSize, filters);
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
                    jpqlCount += " and (a.codigo                        like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.descricao                     like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) from CatItem a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public CatItem save(CatItem emp) {
        getEm().persist(emp);
        return emp;
    }

    public CatItem set(CatItem emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(CatItem emp) {
        CatItem empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}