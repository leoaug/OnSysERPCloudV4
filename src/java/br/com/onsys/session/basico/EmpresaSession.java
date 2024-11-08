package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EmpresaSession extends BasicSessionBean {
    
    private String jpqlCount = " ";       

    public List<Empresa> getAll() {
        return getList(Empresa.class,"select emp "
                + "from Empresa emp "
                + "order by emp.descricao");
    }
    
    public List<Empresa> getAll(int idEmpresa) {
        return getList(Empresa.class,"select emp "
                + "from Empresa emp "
                + "where emp.id = ?1 "
                + "order by emp.descricao", idEmpresa);
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

    public Empresa getByNomeFantasia(String nomeFantasia) {
        return getPojo(Empresa.class,"select empresa "
                + " from Empresa empresa "
                + "where empresa.nomeFantasia = ?1",nomeFantasia);
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
    
    public List<Empresa> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from Empresa a "
                + "where a.id = :empresaID ";
        
        return getListPaged(Empresa.class,query, empresaID, first, pageSize, filters);
    }
    
    public int getCountTot(int idEmpresa) {
        String sql = "select COUNT(a) from  Empresa a"
                + " where a.id = "+idEmpresa;
        
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