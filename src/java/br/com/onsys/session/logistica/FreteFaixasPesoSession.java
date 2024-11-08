package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.logistica.FreteFaixasCEP;
import br.com.onsys.entidades.logistica.FreteFaixasPeso;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FreteFaixasPesoSession extends BasicSessionBean {

    public List<FreteFaixasPeso> getFaixaPesoByAll(Empresa empresa) {
        return getList(FreteFaixasPeso.class,"select a "
                + "from FreteFaixasPeso a   "
                + "where a.empresa     = ?1 "
                + "order by a.pesoInicial   ",empresa);
    }
    
    public List<FreteFaixasPeso> getFaixaPesoByFaixaCEP(Empresa empresa, FreteFaixasCEP freteFaixasCEP) {
        return getList(FreteFaixasPeso.class,"select a "
                + "from FreteFaixasPeso a   "
                + "where a.freteFaixasCEP   = ?2 "
                + "  and a.empresa          = ?1 "
                + "order by a.pesoInicial   ",empresa, freteFaixasCEP);
    }
    
    public FreteFaixasPeso getByFaixaPeso(Empresa empresa, FreteFaixasCEP freteFaixasCEP, BigDecimal pesoInicial, BigDecimal pesoFinal ) {
        return getPojo(FreteFaixasPeso.class,"select a "
                + "from FreteFaixasPeso a   "
                + "where a.freteFaixasCEP   = ?2 "
                + "  and a.empresa          = ?1 "
                + "  and a.pesoInicial      = ?3 "
                + "  and a.pesoFinal        = ?4 ",empresa, freteFaixasCEP, pesoInicial, pesoFinal);
    }
    
    public FreteFaixasPeso getFxTabDescComisById(int id) {
        return getPojo(FreteFaixasPeso.class,id);
    }    
    
    public FreteFaixasPeso save(FreteFaixasPeso emp) {
        getEm().persist(emp);
        return emp;
    }

    public FreteFaixasPeso set(FreteFaixasPeso emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(FreteFaixasPeso emp) {
        FreteFaixasPeso empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}