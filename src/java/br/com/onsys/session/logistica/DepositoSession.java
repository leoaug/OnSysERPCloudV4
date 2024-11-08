package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Deposito;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class DepositoSession extends BasicSessionBean {    

    private String jpqlCount = " ";        
    
    public List<Deposito> getAll(int idEmpresa) {
        return getList(Deposito.class,""
                + "select a "
                + "from Deposito a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1  "
                + "order by a.codigo     ",idEmpresa);
    }    
    
    public List<Deposito> getAllAtivos(int idEmpresa) {
        return getList(Deposito.class,"select a "
                + "from Deposito a, Empresa emp "
                + "where a.empresa = emp              "
                + "  and emp.id    = ?1               "
                + "  and (a.inativo  != 'S' or a.inativo  is null) "
                + "  and (a.deletado != 'S' or a.deletado is null) "
                + "order by a.codigo", idEmpresa);
    }
    
    public Deposito getById(int iddeposito) {
        return getPojo(Deposito.class,iddeposito);
    }

    public Deposito getByDescricao(int idEmpresa, String descricao) {
        return getPojo(Deposito.class,"select a "
                + "from Deposito a, Empresa emp "
                + "where a.empresa  = emp "
                + " and emp.id      = ?1 "
                + " and a.descricao = ?2",idEmpresa, descricao);
    }

    public Deposito getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Deposito.class,"select a "
                + "from Deposito a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and a.codigo = ?2",idEmpresa, codigo);
    }

    public List<Deposito> getAllDepositoComplete(int idEmpresa, String prefix) {
        return getList(Deposito.class,"select deposito "
                + "from Deposito deposito, Empresa emp "
                + "where deposito.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and deposito.codigo like ?2 "
                + "order by deposito.descricao", idEmpresa,  prefix + '%');        
    }
    
    public List<Deposito> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from Deposito a, Empresa emp "
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
        
        return getListPaged(Deposito.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from Deposito a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Deposito save(Deposito emp) {
        getEm().persist(emp);
        return emp;
    }

    public Deposito set(Deposito emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Deposito emp) {
        Deposito empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }    
    
}