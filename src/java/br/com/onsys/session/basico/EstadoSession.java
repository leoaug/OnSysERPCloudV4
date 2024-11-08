package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Estado;
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
public class EstadoSession extends BasicSessionBean {
    
    private String jpqlCount = " ";        
    
    public List<Estado> getAll() {
        return getList(Estado.class,"select uf "
                + " from Estado uf             "
                +"  where uf.uf != 'EX' "
                + "order by uf.descricao");
    }

    public List<Estado> getAllByPais(String descPais) {
        return getList(Estado.class,"select uf "
                + " from Estado uf, Pais p  "
                + " where uf.pais = p            "
                + "  p.descricao    = ?1           "
                + "order by uf.descricao", descPais);
    }
    
    public Estado getById(int idEstado) {
        return getPojo(Estado.class,idEstado);
    }

    public Estado getByDescricao(String descricao) {
        return getPojo(Estado.class,"select estado  "
                + " from Estado estado              "
                + "where estado.descricao = ?1      ", descricao);
    }
        
    public Estado getByCodigo(String codigo) {
        return getPojo(Estado.class,"select estado  "
                + " from Estado estado              "
                + "where estado.codigo  = ?1        ", codigo);
    }
    
    public Estado getByUF(String uf) {
        return getPojo(Estado.class,"select estado "
                + "from Estado estado              "
                + "where estado.uf = ?1            " , uf);
    }

    public List<Estado> getAllPaged(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.uf ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Estado a  ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.codigo       like :globalFilter or "
                               + "a.descricao    like :globalFilter)");
        
        return getListPagedSemEmpresa(Estado.class,query, first, pageSize, filters);
    }
    
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
       jpql += " where ";
        jpqlCount = "  ";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (a.codigo    like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.descricao like '%"+entry.getValue()+ '%'+"')";
                } else {
                    jpqlCount += "  a." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
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
        String sql = "select COUNT(a) from Estado a ";
        
        if (!jpqlCount.equals("")) {
            sql += " where " + jpqlCount;     
        }
        
        System.out.println("getCountTot()===>"+sql);
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Estado save(Estado emp) {
        getEm().persist(emp);
        return emp;
    }

    public Estado set(Estado emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Estado emp) {
        Estado empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}