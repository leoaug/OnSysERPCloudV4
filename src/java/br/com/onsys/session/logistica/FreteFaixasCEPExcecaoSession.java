package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.logistica.Frete;
import br.com.onsys.entidades.logistica.FreteFaixasCEPExcecao;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FreteFaixasCEPExcecaoSession extends BasicSessionBean {
    
    public List<FreteFaixasCEPExcecao> getFaixaByTabela(Empresa empresa, Frete tabelaFrete) {
        return getList(FreteFaixasCEPExcecao.class,"select a "
                + "from FreteFaixasCEPExcecao a   "
                + "where a.frete   = ?2 "
                + "  and a.empresa = ?1 "
                + "order by a.cepInicial ",empresa, tabelaFrete);
    }
    
    public FreteFaixasCEPExcecao getFaixaCEP(int idEmpresa, Frete tabelaFrete, String cepInicial, String cepFinal) {
        return getPojo(FreteFaixasCEPExcecao.class,"select a "
                + "from FreteFaixasCEPExcecao a, Empresa e   "
                + "where a.empresa      = e  "
                + "  and e.id           = ?1 "
                + "  and a.frete        = ?2 "    
                + "  and a.cepInicial   <= ?3 "
                + "  and a.cepFinal     >= ?4 ",idEmpresa, tabelaFrete, cepInicial, cepFinal);
    }

    public FreteFaixasCEPExcecao getFxTabDescComisById(int id) {
        return getPojo(FreteFaixasCEPExcecao.class,id);
    }    
    
    public FreteFaixasCEPExcecao save(FreteFaixasCEPExcecao emp) {
        getEm().persist(emp);
        return emp;
    }

    public FreteFaixasCEPExcecao set(FreteFaixasCEPExcecao emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(FreteFaixasCEPExcecao emp) {
        FreteFaixasCEPExcecao empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}