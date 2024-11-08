package br.com.onsys.session.suporte;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.suporte.ParamSuporte;
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
public class ParamSuporteSession extends BasicSessionBean {
    
    private String jpqlCount = " ";      

    public List<ParamSuporte> getAll(int idEmpresa) {
        return getList(ParamSuporte.class,
                  "select a "
                + "from ParamSuporte a, Empresa e "
                + "where a.empresa  = e  "
                + "and e.id         = ?1 ",idEmpresa);
    }

    public ParamSuporte getByEmpresa(int idEmpresa) {
        return getPojo(ParamSuporte.class,
                  "select a "
                + "from ParamSuporte a, Empresa e "
                + "where a.empresa  = e       "
                + "and   e.id       = ?1      ",idEmpresa);
    }

    public ParamSuporte getById(int idParam) {
        return getPojo(ParamSuporte.class,idParam);
    }
    
    public List<ParamSuporte> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String query = ""
                + "select a "
                + "from ParamSuporte a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        jpqlCount = "";   
        
        return getListPaged(ParamSuporte.class,query, empresaID, first, pageSize, filters);
    }    
    
    public int getCountTot(int idEmpresa) {       
        String sql = "select COUNT(a) from ParamSuporte a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public ParamSuporte save(ParamSuporte emp) {
        getEm().persist(emp);
        return emp;
    }

    public ParamSuporte set(ParamSuporte emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ParamSuporte emp) {
        ParamSuporte empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}