package br.com.onsys.session.projetos;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.projetos.ParamAdmProjetos;
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
public class ParamAdmProjetosSession extends BasicSessionBean {
    
    private String jpqlCount = " ";        

    public List<ParamAdmProjetos> getAllParamAdmProjetos(int idEmpresa) {
        return getList(ParamAdmProjetos.class,
        "select paramprojetos "
                + "from ParamAdmProjetos paramprojetos, Empresa emp "
                + "where paramprojetos.empresa = emp and emp.id = ?1 ",idEmpresa);
    }

    public ParamAdmProjetos getByEmpresa(int idEmpresa) {
        return getPojo(ParamAdmProjetos.class,
        "select p "
                + "from ParamAdmProjetos p, Empresa emp "
                + "where p.empresa = emp "
                + "  and (p.inativo  != 'S' or p.inativo  is null) "
                + "  and (p.deletado != 'S' or p.deletado is null) "
                + "  and emp.id = ?1 ",idEmpresa);
    }

    public ParamAdmProjetos getParamAdmProjetosById(int idParamAdmProjetos) {
        return getPojo(ParamAdmProjetos.class,idParamAdmProjetos);
    }
    
    public List<ParamAdmProjetos> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String query = ""
                + "select a "
                + "from ParamAdmProjetos a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
        jpqlCount = "";   
        
        return getListPaged(ParamAdmProjetos.class,query, empresaID, first, pageSize, filters);
    }    
    
    public int getCountTot(int idEmpresa) {       
        String sql = "select COUNT(a) from ParamAdmProjetos a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public ParamAdmProjetos save(ParamAdmProjetos emp) {
        getEm().persist(emp);
        return emp;
    }

    public ParamAdmProjetos set(ParamAdmProjetos emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ParamAdmProjetos emp) {
        ParamAdmProjetos empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}