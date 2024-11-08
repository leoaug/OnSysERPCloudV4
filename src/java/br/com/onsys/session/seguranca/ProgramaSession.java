package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Programa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ProgramaSession extends BasicSessionBean {
    
    private String jpqlCount = " ";      
    
    public List<Programa> getAll(int idEmpresa) {
        return getList(Programa.class,""
                + "select programa "
                + "from Programa programa, Empresa emp "
                + "where programa.empresa = emp and emp.id = ?1 "
                + "order by programa.codigo ", idEmpresa);
    }
    
    public List<Programa> getAllFiltro(String codFiltro, String descFiltro) {
        if(codFiltro!=null && descFiltro!=null){
            return getList(Programa.class,""
                    + "select a "
                    + "from Programa a where a.codigo = ?1"
                    + " and a.descricao like ?2", codFiltro, "%"+descFiltro+"%");
        }else{
            if(descFiltro==null){
                return getList(Programa.class,""
                        + "select a "
                        + "from Programa a where a.codigo = ?1", codFiltro);
            }else{
                return getList(Programa.class,""
                        + "select a "
                        + "from Programa a where a.descricao like ?1", "%"+descFiltro+"%");
            }
        }
    }    

    public List<Programa> getAllOrderDescricao(int idEmpresa) {
        return getList(Programa.class,""
                + "select programa "
                + "from Programa programa, Empresa emp "
                + "where programa.empresa = emp and emp.id = ?1 "
                + "order by programa.descricao ", idEmpresa);
    }
    
    public Programa getById(int id) {
        return getPojo(Programa.class,id);
    }

    public Programa getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Programa.class,"select programa "
                + "from Programa programa, Empresa emp "
                + "where programa.empresa = emp and "
                + "emp.id = ?1 "
                + "and programa.codigo = ?2", idEmpresa, codigo);
    }

    public Programa getByDescricao(int idEmpresa, String descricao) {
        return getPojo(Programa.class,"select programa "
                + "from Programa programa, Empresa emp "
                + "where programa.empresa = emp and "
                + "emp.id = ?1 "
                + "and programa.descricao = ?2", idEmpresa, descricao);
    }
    
    public List<Programa> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from Programa a, Empresa emp "
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
        
        return getListPaged(Programa.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from Programa a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Programa save(Programa emp) {
        getEm().persist(emp);
        return emp;
    }

    public Programa set(Programa emp) {
        getEm().merge(emp);
        return emp;
    }
   
    public void setSQL(int idEmpresa, String codigo, String url) {
        String sql = "update Programa " 
                + " set caminho = '"+url+"'"
                + " where empresa_id = "+idEmpresa 
                + " and codigo = '"+codigo+"'";
        Query query = getEm().createQuery(sql);
        query.executeUpdate();
    }       

    public void remove(Programa emp) {
        Programa empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}