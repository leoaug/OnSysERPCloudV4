package br.com.onsys.session.sac;


import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.sac.Origens;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class OrigensSession extends BasicSessionBean {
    
    public List<Origens> getAll(int idEmpresa) {
        return getList(Origens.class,
                "select a "
                + " from Origens a, Empresa b "
                + "where a.empresa = b "
                + "  and b.id = ?1 "
                + "order by a.descricao",idEmpresa);
    }

    public Origens getById(int id) {
        return getPojo(Origens.class,id);
    }

    public Origens getByDescricao(String descricao) {
        return getPojo(Origens.class,"select a "
                + "from Origens a "
                + " where a.descricao = ?1",descricao);
    }
    
    public Origens getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Origens.class,"select a "
                + "  from Origens a, Empresa b"
                + " where a.empresa   = b "
                + "   and b.id        = ?1 "
                + "   and a.codigo    = ?2",idEmpresa, codigo);
    }        
    
    public Origens save(Origens emp) {
        getEm().persist(emp);
        return emp;
    }

    public Origens set(Origens emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Origens emp) {
        Origens empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}