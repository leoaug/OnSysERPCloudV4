package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.logistica.Frete;
import br.com.onsys.entidades.logistica.FreteFaixasCEP;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FreteFaixasCEPSession extends BasicSessionBean {
    
    public List<FreteFaixasCEP> getFaixaByTabela(Empresa empresa, Frete tabelaFrete) {
        return getList(FreteFaixasCEP.class,"select a "
                + "from FreteFaixasCEP a   "
                + "where a.frete   = ?2 "
                + "  and a.empresa = ?1 "
                + "order by a.cepInicial ",empresa, tabelaFrete);
    }
    
    public FreteFaixasCEP getFaixaCEP(Empresa empresa, Frete tabelaFrete, Estado estado, String cepInicial, String cepFinal) {
        return getPojo(FreteFaixasCEP.class,"select a "
                + "from FreteFaixasCEP a     "
                + "where a.empresa      = ?1 "
                + "  and a.frete        = ?2 "
                + "  and a.estado       = ?3 "               
                + "  and a.cepInicial   = ?4 "
                + "  and a.cepFinal     = ?5 ",empresa, tabelaFrete, estado, cepInicial, cepFinal);
    }

    public FreteFaixasCEP getFxTabDescComisById(int id) {
        return getPojo(FreteFaixasCEP.class,id);
    }    
    
    public FreteFaixasCEP save(FreteFaixasCEP emp) {
        getEm().persist(emp);
        return emp;
    }

    public FreteFaixasCEP set(FreteFaixasCEP emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(FreteFaixasCEP emp) {
        FreteFaixasCEP empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}