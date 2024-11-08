package br.com.onsys.session.admin;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EmpresaAdmSession extends BasicSessionBean {
    
    private String jpqlCount = " ";       

    public List<Empresa> getAll() {
        return getList(Empresa.class,"select emp "
                + "from Empresa emp "
                + "order by emp.descricao");
    }
    
    public List<Empresa> getAllFiltro(String codFiltro, String descFiltro, int idEmpresa) {
        if(codFiltro != null && descFiltro != null){
            return getList(Empresa.class,""
                    + "select emp "
                    + "from Empresa emp "
                    + " where emp.codigo = ?1"
                    + "   and emp.descricao like ?2"
                    + "   and emp.id     = ?3 ", codFiltro, "%"+descFiltro+"%", idEmpresa);
        }else{
            if(descFiltro==null){
                return getList(Empresa.class,""
                        + "select emp "
                        + "from Empresa emp "
                        + " where emp.codigo = ?1"
                        + "   and emp.id     = ?2", codFiltro, idEmpresa);
            }else{
                return getList(Empresa.class,""
                        + "select emp "
                        + "from Empresa emp "
                        + " where emp.descricao like ?1"
                        + "   and emp.id      = ?2 ", "%"+descFiltro+"%", idEmpresa);
            }
        }
    }    
    
    public List<Empresa> getActiveEmpresas() {
        return getList(Empresa.class,"select emp "
                + "from Empresa emp");
    }

    public Empresa getByDescricao(String descricao) {
        return getPojo(Empresa.class,"select empresa "
                + "from Empresa empresa "
                + "where empresa.descricao = ?1",descricao);
    }

    public Empresa getByCNPJCPF(String cnpjcpf) {
        return getPojo(Empresa.class,"select empresa "
                + "from Empresa empresa "
                + "where empresa.cnpjcpfmatriz = ?1",cnpjcpf);
    }
    
    public Empresa getByCodigo(String codigo) {
        return getPojo(Empresa.class,"select empresa "
                + "from Empresa empresa "
                + "where empresa.codigo = ?1",codigo);
    }

    public Empresa getById(int idEmpresa) {
        return getPojo(Empresa.class,idEmpresa);
    }
    
    public List<Empresa> getAllPaged(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.nomeFantasia ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Empresa a "; 
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                               " (a.codigo       like :globalFilter or "
                              + " a.nomeFantasia like :globalFilter)");
        
        return getListPagedSemEmpresa(Empresa.class,query, first, pageSize, filters);
        
    }
    
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " where ";
        jpqlCount = " where ";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += "  and (a.codigo       like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "   or  a.nomeFantasia like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) from  Empresa a";
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Empresa save(Empresa emp) {
        getEm().persist(emp);
        return emp;
    }

    public Empresa set(Empresa emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Empresa emp) {
        Empresa empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}