package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Modulo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ModuloSession extends BasicSessionBean {
    
    private String jpqlCount = " ";      
    
    public List<Modulo> getAll(int idEmpresa) {
        return getList(Modulo.class,""
                + "select modulo "
                + "from Modulo modulo, Empresa emp "
                + "where modulo.empresa = emp "
                + "  and emp.id = ?1 "
                + "order by modulo.codigo", idEmpresa);
    }

    public List<Modulo> getAllFiltro(int idEmpresa, String codFiltro, String descFiltro) {
        if(codFiltro != null && descFiltro != null){
            return getList(Modulo.class,""
                    + "select a "
                    + "from Modulo a, Empresa b "
                    + " where a.codigo    like ?2"
                    + "   and a.empresa   = b "
                    + "   and a.descricao like ?3"
                    + "   and b.id        = ?1 ",idEmpresa, "%"+codFiltro+"%", "%"+descFiltro+"%");
        }else{
            if(descFiltro==null){
                return getList(Modulo.class,""
                        + "select a "
                        + "from Modulo a, Empresa b "
                        + " where a.codigo  like ?2"
                        + "   and a.empresa = b "
                        + "   and b.id      = ?1 ",idEmpresa, "%"+codFiltro+"%");
            }else{
                return getList(Modulo.class,""
                        + "select a "
                        + "from Modulo a, Empresa b "
                        + " where a.descricao like ?2"
                        + "   and a.empresa   = b "
                         + "  and b.id        = ?1 ",idEmpresa, "%"+descFiltro+"%");
            }
        }
    }    
    
    public Modulo getById(int id) {
        return getPojo(Modulo.class,id);
    }

    public Modulo getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Modulo.class,"select modulo "
                + "from Modulo modulo, Empresa emp "
                + "where modulo.empresa = emp and "
                + "emp.id = ?1 and modulo.codigo = ?2", idEmpresa, codigo);
    }

    public Modulo getByDescricao(int idEmpresa, String descricao) {
        return getPojo(Modulo.class,"select modulo "
                + "from Modulo modulo, Empresa emp "
                + "where modulo.empresa = emp and "
                + "emp.id = ?1 and modulo.descricao = ?2", idEmpresa, descricao);
    }
    
    public List<Modulo> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from Modulo a, Empresa emp "
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
        
        return getListPaged(Modulo.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from Modulo a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Modulo save(Modulo emp) {
        getEm().persist(emp);
        return emp;
    }

    public Modulo set(Modulo emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Modulo emp) {
        Modulo empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}