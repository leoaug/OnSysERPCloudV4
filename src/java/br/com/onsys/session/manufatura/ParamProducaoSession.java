package br.com.onsys.session.manufatura;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.manufatura.ParamProducao;
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
public class ParamProducaoSession extends BasicSessionBean {

    private String jpqlCount = " ";            
    
    public List<ParamProducao> getAll(int idEmpresa) {
        return getList(ParamProducao.class,
                  "select a "
                + "from ParamProducao a, Empresa emp "
                + "where a.empresa = emp "
                  + "and emp.id    = ?1 ",idEmpresa);
    }

    public ParamProducao getParamProducao(int idEmpresa) {
        return getPojo(ParamProducao.class,
                  "select a "
                + "from ParamProducao a, Empresa emp "
                + "where a.empresa = emp "
                 + " and emp.id = ?1 ",idEmpresa);
    }

    public ParamProducao getById(int idParam) {
        return getPojo(ParamProducao.class,idParam);
    }
    
    public ParamProducao getByEmpresa(int idEmpresa) {
        return getPojo(ParamProducao.class,
        "select p "
                + "from ParamProducao p, Empresa emp "
                + "where p.empresa = emp "
                + "  and (p.inativo  != 'S' or p.inativo  is null) "
                + "  and (p.deletado != 'S' or p.deletado is null) "
                + "  and emp.id = ?1 ",idEmpresa);
    }

    public List<ParamProducao> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String query = ""
                + "select a "
                + "from ParamProducao a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        jpqlCount = "";   
        
        return getListPaged(ParamProducao.class,query, empresaID, first, pageSize, filters);
    }    
    
    public int getCountTot(int idEmpresa) {       
        String sql = "select COUNT(a) from ParamProducao a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
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
    
    public ParamProducao save(ParamProducao emp) {
        getEm().persist(emp);
        return emp;
    }

    public ParamProducao set(ParamProducao emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ParamProducao emp) {
        ParamProducao empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}