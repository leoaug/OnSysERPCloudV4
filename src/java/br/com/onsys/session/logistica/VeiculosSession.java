package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Veiculos;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class VeiculosSession extends BasicSessionBean {    

    private String jpqlCount = " ";        
    
    public List<Veiculos> getAll(int idEmpresa) {
        return getList(Veiculos.class,""
                + "select a "
                + "from Veiculos a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 "
                + "order by a.placa ",idEmpresa);
    }    
    
    public Veiculos getById(int idVeiculo) {
        return getPojo(Veiculos.class,idVeiculo);
    }

    public Veiculos getByPlaca(int idEmpresa, String placa) {
        return getPojo(Veiculos.class,"select a "
                + "from Veiculos a, Empresa emp "
                + "where a.empresa = emp "
                + " and emp.id     = ?1 "
                + " and a.placa    = ?2",idEmpresa, placa);
    }

    public List<Veiculos> getAllComplete(int idEmpresa, String prefix) {
        return getList(Veiculos.class,"select a "
                + "from Veiculos a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1  "
                + "  and a.placa like ?2 "
                + "order by a.placa    ", idEmpresa,  prefix + '%');        
    }
    
    public List<Veiculos> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.placa ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Veiculos a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.placa        like :globalFilter or "
                               + "a.modeloVeiculo like :globalFilter)");
        
        return getListPaged(Veiculos.class,query, empresaID, first, pageSize, filters);
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
                    jpqlCount += " and (a.placa                        like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.marcaVeiculo                 like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) from Veiculos a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id    = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Veiculos save(Veiculos emp) {
        getEm().persist(emp);
        return emp;
    }

    public Veiculos set(Veiculos emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Veiculos emp) {
        Veiculos empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}