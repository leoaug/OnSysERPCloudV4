package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.ParamLogistica;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ParamLogisticaSession extends BasicSessionBean {
    
    private String jpqlCount = " ";       
    
    public ParamLogistica getByEmpresa(int idEmpresa) {
        return getPojo(ParamLogistica.class,"select param  "
                + "from ParamLogistica param, Empresa emp "
                + "where param.empresa = emp "
                + "  and emp.id = ?1 ", idEmpresa);
    }
    
    public List<ParamLogistica> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String query = ""
                + "select a "
                + "from ParamLogistica a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        jpqlCount = "";   
        
        return getListPaged(ParamLogistica.class,query, empresaID, first, pageSize, filters);
    }    
    
    public int getCountTot(int idEmpresa) {       
        String sql = "select COUNT(a) from ParamLogistica a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    

    public ParamLogistica save(ParamLogistica emp) {
        getEm().persist(emp);
        return emp;
    }

    public ParamLogistica set(ParamLogistica emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ParamLogistica emp) {
        ParamLogistica empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}