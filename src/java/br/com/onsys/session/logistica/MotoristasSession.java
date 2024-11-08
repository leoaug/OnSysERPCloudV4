package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Motoristas;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class MotoristasSession extends BasicSessionBean {    

    private String jpqlCount = " ";        
    
    public List<Motoristas> getAll(int idEmpresa) {
        return getList(Motoristas.class,""
                + "select a "
                + "from Motoristas a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 "
                + "order by a.apelido ",idEmpresa);
    }    
    
    public Motoristas getById(int idVeiculo) {
        return getPojo(Motoristas.class,idVeiculo);
    }

    public Motoristas getByCpf(int idEmpresa, String cpf) {
        return getPojo(Motoristas.class,"select a "
                + "from Motoristas a, Empresa emp "
                + "where a.empresa = emp "
                + " and emp.id     = ?1 "
                + " and a.cpf    = ?2",idEmpresa, cpf);
    }

    public List<Motoristas> getAllComplete(int idEmpresa, String prefix) {
        return getList(Motoristas.class,"select a "
                + "from Motoristas a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1  "
                + "  and a.placa like ?2 "
                + "order by a.cpf        ", idEmpresa,  prefix + '%');        
    }
    
    public List<Motoristas> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.cpf ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Motoristas a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.cpf          like :globalFilter)");
        
        return getListPaged(Motoristas.class,query, empresaID, first, pageSize, filters);
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
                    jpqlCount += " and (a.cpf                 like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) from Motoristas a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Motoristas save(Motoristas emp) {
        getEm().persist(emp);
        return emp;
    }

    public Motoristas set(Motoristas emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Motoristas emp) {
        Motoristas empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}