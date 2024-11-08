package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Dashboard;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class DashboardSession extends BasicSessionBean {
    
    public Dashboard getUsuario(int idEmpresa, int idUsr ) {
        return getPojo(Dashboard.class,""
                + "select a "
                + "from Dashboard a, Empresa e, Usuario b "
                + "where a.empresa = e  "
                + "  and a.usuario = b  "
                + "  and e.id      = ?1 "
                + "  and b.id      = ?2 ", idEmpresa, idUsr );
    }    

    public Dashboard save(Dashboard emp) {
        getEm().persist(emp);
        return emp;
    }

    public Dashboard set(Dashboard emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Dashboard emp) {
        Dashboard empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}