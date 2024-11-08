package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Transportadora;
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
public class TransportadoraSession extends BasicSessionBean {
    
    private String jpqlCount = " ";          
    
    public List<Transportadora> getAll(int idEmpresa) {
        return getList(Transportadora.class,"select transp "
                + "from Transportadora transp, Empresa emp "
                + "where transp.empresa = emp "
                + "  and emp.id = ?1 "
                + "order by transp.nomefantasia", idEmpresa);
    }
    
    public List<Transportadora> getAllAtivos(int idEmpresa) {
        return getList(Transportadora.class,"select a "
                + "from Transportadora a, Empresa emp "
                + "where a.empresa = emp              "
                + "  and emp.id    = ?1               "
                + "  and (a.inativo  != 'S' or a.inativo  is null) "
                + "  and (a.deletado != 'S' or a.deletado is null) "
                + "order by a.nomefantasia", idEmpresa);
    }
    
    public List<Transportadora> getTransportadorasMarketplace(int idEmpresa) {
        return getList(Transportadora.class,"select a "
                + "from Transportadora a, Empresa emp "
                + "where a.empresa = emp              "
                + "  and emp.id    = ?1               "
                + "  and (a.urlAPI <> ' ')            "
                + "order by a.nomefantasia", idEmpresa);
    }
    
    public Transportadora getById(int id) {
        return getPojo(Transportadora.class,id);
    }

    public Transportadora getByNomeFantasia(int idEmpresa, String descricao) {
        return getPojo(Transportadora.class,"select transp "
                + "from Transportadora transp, Empresa emp "
                + " where transp.empresa = emp  "
                + " and emp.id = ?1 "                
                + " and transp.nomefantasia = ?2", idEmpresa, descricao);
    }

    public Transportadora getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Transportadora.class,"select transp "
                + " from Transportadora transp, Empresa emp "
                + " where transp.empresa = emp "
                + " and emp.id = ?1 "
                + " and transp.codigo = ?2 ", idEmpresa, codigo);
    }
    
    public Transportadora getByTransportadora(int idEmpresa, Transportadora transportadora) {
        return getPojo(Transportadora.class,"select transp "
                + "from Transportadora transp, Empresa emp "
                + " where transp.empresa = emp  "
                + " and emp.id = ?1 "                
                + " and transp = ?2", idEmpresa, transportadora);
    }
    
    // UTILIZADO NO AUTOCOMPLETE 
    public List<Transportadora> getAllComplete(int idEmpresa, String prefix) {
        return getList(Transportadora.class,"select a "
                + "from Transportadora a, Empresa emp "
                + "where a.empresa = emp and emp.id = ?1 and "
                + "(a.inativo  != 'S' or a.inativo  is null) and  "
                + "(a.deletado != 'S' or a.deletado is null) and  "
                + "a.nomefantasia like ?2 "
                + "order by a.nomefantasia", idEmpresa, prefix + '%');        
    }
    
    public List<Transportadora> getAllCompleteCodigo(int idEmpresa, String prefix) {
        return getList(Transportadora.class,"select a "
                + "from Transportadora a, Empresa emp "
                + "where a.empresa = emp and emp.id = ?1 and "
                + "(a.inativo  != 'S' or a.inativo  is null) and  "
                + "(a.deletado != 'S' or a.deletado is null) and "
                + "a.codigo like ?2 "
                + "order by a.codigo", idEmpresa,  prefix + '%');        
    }
    
    public List<Transportadora> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.nomefantasia ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Transportadora a, Empresa emp "
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
                               + "a.nomefantasia like :globalFilter)");
        
        return getListPaged(Transportadora.class,query, empresaID, first, pageSize, filters);
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
                    jpqlCount += " and (a.codigo        like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.nomefantasia  like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) from Transportadora a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id    = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Transportadora save(Transportadora emp) {
        getEm().persist(emp);
        return emp;
    }

    public Transportadora set(Transportadora emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Transportadora emp) {
        Transportadora empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}