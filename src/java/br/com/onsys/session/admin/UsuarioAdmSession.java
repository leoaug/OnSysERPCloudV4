package br.com.onsys.session.admin;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioAdmSession extends BasicSessionBean {
    
    private String jpqlCount = " ";   
    
    public List<Usuario> getAll() {
        return getList(Usuario.class,""
                + "select usuario "
                + "from Usuario usuario "
                + "order by usuario.apelido");
    }
    
    public Usuario getUsuarioById(int id) {
        return getPojo(Usuario.class,id);
    }
    
    public Usuario getByApelido(String apelido) {
        return getPojo(Usuario.class,"select usuario "
                + "from Usuario usuario "
                + " where usuario.apelido = ?1", apelido);
    }
    
    public Usuario getByEmail(String email) {
        return getPojo(Usuario.class,"select usuario "
                + "from Usuario usuario "
                + "where usuario.email = ?1 ", email);
    }

    public List<Usuario> getAllPaged(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.apelido ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a       "
                + "from Usuario a ";
        
        if(!filters.isEmpty()){
            query = adicionarParametrosSemEmpresa(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.apelido      like :globalFilter or "
                               + "a.email        like :globalFilter)");
        
        return getListPagedSemEmpresa(Usuario.class,query, first, pageSize, filters);
        
    }

    private String adicionarParametrosSemEmpresa(Map<String, Object> filtros, String jpql) {
        jpql += " where ";
        jpqlCount = "";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " where (a.apelido                   like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.email                     like '%"+entry.getValue()+ '%'+"')";
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
    
    public int getCountTot() {
        String sql = "select COUNT(a) from Usuario a ";        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    @Override
    public int count() {
        return super.count();
    }
    
    public Usuario save(Usuario emp) {
        getEm().persist(emp);
        return emp;
    }

    public Usuario set(Usuario emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Usuario emp) {
        Usuario empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}