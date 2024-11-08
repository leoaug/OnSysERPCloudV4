package br.com.onsys.session.suporte;


import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.suporte.CatChamado;
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
public class CatChamadoSession extends BasicSessionBean {
    
    private String jpqlCount = " ";        
    
    public List<CatChamado> getAll(int idEmpresa) {
        return getList(CatChamado.class,""
                + "select a "
                + "from CatChamado a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 "
                + "order by a.descricao",idEmpresa);
    }

    public List<CatChamado> getAllAtivos(int idEmpresa) {
        return getList(CatChamado.class,""
                + "select a "
                + "from CatChamado a, Empresa emp "
                + "where a.empresa = emp "
                + "  and (a.inativo  != 'S' or a.inativo  is null) "
                + "  and (a.deletado != 'S' or a.deletado is null) "
                + "  and emp.id       = ?1 "
                + "order by a.descricao",idEmpresa);
    }
    
    public CatChamado getById(int id) {
        return getPojo(CatChamado.class,id);
    }

    public CatChamado getByDescricao(int idEmpresa, String descricao) {
        return getPojo(CatChamado.class,"select a "
                + "from CatChamado a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and a.descricao = ?2",idEmpresa, descricao);
    }
    
    public CatChamado getByCodigo(int idEmpresa, String codigo) {
        return getPojo(CatChamado.class,"select a "
                + "from CatChamado a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and a.codigo = ?2",idEmpresa, codigo);
    }
    
    public CatChamado getByCatChamado(int idEmpresa, CatChamado catChamado) {
        return getPojo(CatChamado.class,"select a "
                + "from CatChamado a, Empresa emp "
                + " where a.empresa = emp "
                + "   and emp.id    = ?1 "
                + "   and a = ?2",idEmpresa, catChamado);
    }
    
    public List<CatChamado> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from CatChamado a, Empresa emp "
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
        
        return getListPaged(CatChamado.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from CatChamado a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public CatChamado save(CatChamado emp) {
        getEm().persist(emp);
        return emp;
    }

    public CatChamado set(CatChamado emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(CatChamado emp) {
        CatChamado empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}