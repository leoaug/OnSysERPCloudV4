package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Manifesto;
import br.com.onsys.entidades.logistica.ManifestoManifestoTipoDespesa;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ManifestoManifestoTipoDespesaSession extends BasicSessionBean {    

    public List<ManifestoManifestoTipoDespesa> getAllByDoctoSai(Manifesto manifesto) {
        return getList(ManifestoManifestoTipoDespesa.class,""
                + "select a "
                + "from ManifestoManifestoTipoDespesa a "
                + "where  a.manifesto    = ?1 ",manifesto);
    }    
    
    public ManifestoManifestoTipoDespesa getById(int id) {
        return getPojo(ManifestoManifestoTipoDespesa.class,id);
    }
    
    public ManifestoManifestoTipoDespesa save(ManifestoManifestoTipoDespesa emp) {
        getEm().persist(emp);
        return emp;
    }

    public ManifestoManifestoTipoDespesa set(ManifestoManifestoTipoDespesa emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ManifestoManifestoTipoDespesa emp) {
        ManifestoManifestoTipoDespesa empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}