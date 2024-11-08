package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.logistica.Frete;
import br.com.onsys.entidades.logistica.FreteEstado;
import br.com.onsys.entidades.logistica.Transportadora;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FreteEstadoSession extends BasicSessionBean {
    
    public List<FreteEstado> getEstadoByTabela(Empresa empresa, Frete tabelaFrete) {
        return getList(FreteEstado.class,"select a "
                + "from FreteEstado a    "
                + "where a.frete    = ?2 "
                + "  and a.empresa  = ?1 "
                + "order by a.estado.uf  ",empresa, tabelaFrete);
    }

    public FreteEstado getyTabelaUF(Empresa empresa, Frete tabelaFrete, Estado uf) {
        return getPojo(FreteEstado.class,"select a "
                + "from FreteEstado a    "
                + "where a.estado   = ?3 "
                + "  and a.frete    = ?2 "
                + "  and a.empresa  = ?1 ",empresa, tabelaFrete, uf);
    }

    public FreteEstado getyTransportadoraUF(Empresa empresa, Transportadora transportadora, String uf) {
        return getPojo(FreteEstado.class,"select a "
                + "from FreteEstado a    "
                + "where a.estado.uf   = ?3 "
                + "  and a.frete.transportadora    = ?2 "
                + "  and a.empresa  = ?1 ",empresa, transportadora, uf);
    }
    
    public FreteEstado getById(int id) {
        return getPojo(FreteEstado.class,id);
    }    
    
    public FreteEstado save(FreteEstado emp) {
        getEm().persist(emp);
        return emp;
    }

    public FreteEstado set(FreteEstado emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(FreteEstado emp) {
        FreteEstado empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}