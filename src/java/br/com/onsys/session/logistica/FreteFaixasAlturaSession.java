package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.logistica.FreteFaixasAltura;
import br.com.onsys.entidades.logistica.FreteFaixasCEP;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FreteFaixasAlturaSession extends BasicSessionBean {

    public List<FreteFaixasAltura> getFaixaAlturaByAll(Empresa empresa) {
        return getList(FreteFaixasAltura.class,"select a "
                + "from FreteFaixasAltura a   "
                + "where a.empresa     = ?1 "
                + "order by a.alturaInicial   ",empresa);
    }
    
    public List<FreteFaixasAltura> getFaixaAlturaByFaixaCEP(Empresa empresa, FreteFaixasCEP freteFaixasCEP) {
        return getList(FreteFaixasAltura.class,"select a "
                + "from FreteFaixasAltura a   "
                + "where a.freteFaixasCEP   = ?2 "
                + "  and a.empresa          = ?1 "
                + "order by a.alturaInicial ",empresa, freteFaixasCEP);
    }
    
    //ALTURA EM CM 
    public FreteFaixasAltura getByFaixaAltura(Empresa empresa, FreteFaixasCEP freteFaixasCEP, BigDecimal alturaInicial, BigDecimal alturaFinal ) { 
        return getPojo(FreteFaixasAltura.class,"select a "
                + "from FreteFaixasAltura a   "
                + "where a.freteFaixasCEP   = ?2 "
                + "  and a.empresa          = ?1 "
                + "  and a.alturaInicial    = ?3 "
                + "  and a.alturaFinal      = ?4 ",empresa, freteFaixasCEP, alturaInicial, alturaFinal);
    }
    
    public FreteFaixasAltura getFxTabDescComisById(int id) {
        return getPojo(FreteFaixasAltura.class,id);
    }    
    
    public FreteFaixasAltura save(FreteFaixasAltura emp) {
        getEm().persist(emp);
        return emp;
    }

    public FreteFaixasAltura set(FreteFaixasAltura emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(FreteFaixasAltura emp) {
        FreteFaixasAltura empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}