package br.com.onsys.session.manufatura;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.manufatura.ComponenteConfigurado;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ComponenteConfiguradoSession extends BasicSessionBean {    

    public List<ComponenteConfigurado> getAllComponentePai(int idEmpresa) {
        return getList(ComponenteConfigurado.class,""
                + "select   a "
                + "from     ComponenteConfigurado a, Empresa emp "
                + "where    a.empresa = emp "
                + "     and emp.id    = ?1 "
           /*     + "     and a.componentePai is null "*/
                + "order by a.componente ", idEmpresa);
    }    

    public List<ComponenteConfigurado> getAllComponentePaiPedido(int idEmpresa) {
        return getList(ComponenteConfigurado.class,""
                + "select   a "
                + "from     ComponenteConfigurado a, Empresa emp "
                + "where    a.empresa = emp "
                + "     and emp.id    = ?1 "
                + "     and a.componentePai is null "
                + "order by a.componente ", idEmpresa);
    }    

    
    public List<ComponenteConfigurado> getAllComponenteFilho(int idEmpresa) {
        return getList(ComponenteConfigurado.class,""
                + "select   a "
                + "from     ComponenteConfigurado a, Empresa emp "
                + "where    a.empresa = emp "
                + "     and emp.id    = ?1 "
                + "     and a.componentePai is not null "
                + "     and a.informaPreco  = 1         "                
                + "order by a.componente ", idEmpresa);
    }        

    public List<ComponenteConfigurado> getAllByComponenteFilhos(int idEmpresa, ComponenteConfigurado componentePai) {
        return getList(ComponenteConfigurado.class,""
                + "select   a "
                + "from     ComponenteConfigurado a, Empresa emp "
                + "where    a.empresa       = emp "
                + "     and emp.id          = ?1 "
                + "     and a.componentePai = ?2 "
                + "order by a.componente", idEmpresa, componentePai);
    }    
    
    public ComponenteConfigurado getById(int id) {
        return getPojo(ComponenteConfigurado.class,id);
    }

    public ComponenteConfigurado getByComponente(int idEmpresa, String componente) {
        return getPojo(ComponenteConfigurado.class,"select a "
                + "from ComponenteConfigurado a, Empresa emp "
                + "where a.empresa = emp and emp.id = ?1 and "
                + "a.componente = ?2",idEmpresa, componente);
    }
 
    public ComponenteConfigurado save(ComponenteConfigurado emp) {
        getEm().persist(emp);
        return emp;
    }

    public ComponenteConfigurado set(ComponenteConfigurado emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ComponenteConfigurado emp) {
        ComponenteConfigurado empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}