package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.ParamGerais;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ParamGeraisSession extends BasicSessionBean {
    
    private String jpqlCount = " ";       
    
    public List<ParamGerais> getAll(int idEmpresa) {
        return getList(ParamGerais.class,"select param  "
                + "from ParamGerais param, Empresa emp "
                + "where param.empresa = emp "
                + "  and emp.id = ?1 ", idEmpresa);
    }
    
    public ParamGerais getByEmpresa(int idEmpresa) {
        return getPojo(ParamGerais.class,"select param  "
                + "from ParamGerais param, Empresa emp "
                + "where param.empresa = emp "
                + "  and (param.inativo  != 'S' or param.inativo  is null) "
                + "  and (param.deletado != 'S' or param.deletado is null) "
                + "  and emp.id = ?1 ", idEmpresa);
    }
    
    public List<ParamGerais> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String query = ""
                + "select a "
                + "from ParamGerais a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        jpqlCount = "";   
        
        return getListPaged(ParamGerais.class,query, empresaID, first, pageSize, filters);
    }    
    
    public int getCountTot(int idEmpresa) {       
        String sql = "select COUNT(a) from ParamGerais a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    

    public ParamGerais save(ParamGerais emp) {
        getEm().persist(emp);
        return emp;
    }

    public ParamGerais set(ParamGerais emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ParamGerais emp) {
        ParamGerais empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}