package br.com.onsys.session.sac;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.sac.ParamSAC;
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
public class ParamSACSession extends BasicSessionBean {

    private String jpqlCount = " ";           
    
    public List<ParamSAC> getAll(int idEmpresa) {
        return getList(ParamSAC.class,
                  "select a "
                + "from ParamSAC a, Empresa e "
                + "where a.empresa  = e  "
                + "and e.id         = ?1 ",idEmpresa);
    }

    public ParamSAC getByIdEmpresa(int idEmpresa) {
        return getPojo(ParamSAC.class,
                  "select a "
                + "from ParamSAC a, Empresa e "
                + "where a.empresa  = e       "
                + "and   e.id       = ?1      ",idEmpresa);
    }

    public ParamSAC getById(int idParam) {
        return getPojo(ParamSAC.class,idParam);
    }
    
    public List<ParamSAC> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String query = ""
                + "select a "
                + "from ParamSAC a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        jpqlCount = "";   
        
        return getListPaged(ParamSAC.class,query, empresaID, first, pageSize, filters);
    }    
    
    public int getCountTot(int idEmpresa) {       
        String sql = "select COUNT(a) from ParamSAC a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public ParamSAC save(ParamSAC emp) {
        getEm().persist(emp);
        return emp;
    }

    public ParamSAC set(ParamSAC emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ParamSAC emp) {
        ParamSAC empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}