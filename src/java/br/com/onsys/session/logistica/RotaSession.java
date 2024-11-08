package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Rota;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RotaSession extends BasicSessionBean {
    
    private String jpqlCount = " ";    
    
    public List<Rota> getAll(int idEmpresa) {
        return getList(Rota.class,""
                + "select a "
                + "from Rota a, Empresa emp "
                + "where a.empresa        = emp "
                + "  and emp.id           = ?1  "
                + " order by a.nroRota desc" ,idEmpresa);
    }
    
    public Rota getById(int id) {
        return getPojo(Rota.class,id);
    }
    
    public Rota getByNroRota(int idEmpresa, String nroRota) {
        return getPojo(Rota.class,"select a "
                + "from Rota a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1  "
                + "  and a.nroRota  = ?2  ",idEmpresa, nroRota);
    }
    
    public List<Rota> getAllRotaComplete(int idEmpresa, String prefix) {
        return getList(Rota.class,"select a "
                + "from Rota a, Empresa emp "
                + "where a.empresa    = emp "
                + "  and emp.id       = ?1  "                
                + "  and a.nroRota like ?2  "
                + "order by a.nroRota       ", idEmpresa, prefix + '%');        
    }
    
    public Rota save(Rota emp) {
        getEm().persist(emp);
        return emp;
    }

    public Rota set(Rota emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Rota emp) {
        Rota empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}