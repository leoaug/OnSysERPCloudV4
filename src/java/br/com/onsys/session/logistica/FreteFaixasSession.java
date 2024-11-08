package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.logistica.Frete;
import br.com.onsys.entidades.logistica.FreteFaixas;
import br.com.onsys.entidades.logistica.FreteFaixasAltura;
import br.com.onsys.entidades.logistica.FreteFaixasPeso;
import br.com.onsys.entidades.logistica.Transportadora;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FreteFaixasSession extends BasicSessionBean {
    
    public List<FreteFaixas> getFaixaByTabela(Empresa empresa, Frete tabelaFrete) {
        return getList(FreteFaixas.class,"select a "
                + "from FreteFaixas a   "
                + "where a.frete   = ?2 "
                + "  and a.empresa = ?1 "
                + "order by a.cepInicial ",empresa, tabelaFrete);
    }
    
    public FreteFaixasPeso getSelecionarFaixaPeso(String cep, double peso, Frete tabelaSelecionada) {
        
        System.out.println("***getSelecionarFaixaPeso***");
        System.out.println("cep======>"+cep);
        System.out.println("peso=====>"+peso);
        
        return getUltPojo(FreteFaixasPeso.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasPeso c "
                + "where c.freteFaixasCEP    = b   "
                + "  and b.frete             = ?3  "                                
                + "  and b.cepInicial       <= ?1  "
                + "  and b.cepFinal         >= ?1  "
                + "  and c.pesoInicial      <= ?2  "
                + "  and c.pesoFinal        >= ?2  "                
                + "order by c.valor ",1,cep,peso,tabelaSelecionada);
    }
    
    public FreteFaixasAltura getSelecionarFaixaAltura(String cep, double altura, Frete tabelaSelecionada) {
        
        System.out.println("***getSelecionarFaixaALtura***");
        System.out.println("cep======>"+cep);
        System.out.println("peso=====>"+altura);
        
        return getUltPojo(FreteFaixasAltura.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasAltura c "
                + "where c.freteFaixasCEP    = b   "
                + "  and b.frete             = ?3  "                                
                + "  and b.cepInicial       <= ?1  "
                + "  and b.cepFinal         >= ?1  "
                + "  and c.alturaInicial    <= ?2  "
                + "  and c.alturaFinal      >= ?2  "                
                + "order by c.valor ",1,cep,altura,tabelaSelecionada);
    }
    
    public FreteFaixasPeso getMelhorFrete(String cep, double peso, double altura, int volume) {
        
        System.out.println("***getMelhorFrete***");
        System.out.println("cep======>"+cep);
        System.out.println("peso=====>"+peso);
        System.out.println("altura===>"+altura);
        System.out.println("volume===>"+volume);
        
        return getUltPojo(FreteFaixasPeso.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasPeso c, Frete f, Transportadora t "
                + "where c.freteFaixasCEP   = b   "
                + "  and b.frete            = f   "
                + "  and f.transportadora   = t   "
                + "  and f.codigo           = '001'  "                                
                + "  and b.cepInicial       <= ?1 "
                + "  and b.cepFinal         >= ?1 "
                + "  and c.pesoInicial      <= ?2 "
                + "  and c.pesoFinal        >= ?2 "
                + "  and t.alturaInicial    <= ?3 "
                + "  and t.alturaFinal      >= ?3 "
                + "  and t.volumeInicial    <= ?4 "
                + "  and t.volumeFinal      >= ?4 "                
                + "order by c.valor ",1,cep,peso,altura,volume);
    }
    
    public FreteFaixasPeso getMelhorFreteSemTotal(String cep, double peso, double altura, int volume) {
        
        System.out.println("***getMelhorFreteSemTotal***");
        System.out.println("cep======>"+cep);
        System.out.println("peso=====>"+peso);
        System.out.println("altura===>"+altura);
        System.out.println("volume===>"+volume);
        
        return getUltPojo(FreteFaixasPeso.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasPeso c, Frete f, Transportadora t "
                + "where c.freteFaixasCEP   = b   "
                + "  and b.frete            = f   "
                + "  and f.transportadora   = t   "
                + "  and f.codigo           = '002'  "                
                + "  and b.cepInicial       <= ?1 "
                + "  and b.cepFinal         >= ?1 "
                + "  and c.pesoInicial      <= ?2 "
                + "  and c.pesoFinal        >= ?2 "
                + "  and t.alturaInicial    <= ?3 "
                + "  and t.alturaFinal      >= ?3 "
                + "  and t.volumeInicial    <= ?4 "
                + "  and t.volumeFinal      >= ?4 "                
                + "order by c.valor ",1,cep,peso,altura,volume);
    }


    public FreteFaixasPeso getFreteJAMAEF(String cep, double peso, double altura, int volume) {
        
        System.out.println("***getMelhorFreteJAMEF***");
        System.out.println("cep======>"+cep);
        System.out.println("peso=====>"+peso);
        System.out.println("altura===>"+altura);
        System.out.println("volume===>"+volume);
        
        return getUltPojo(FreteFaixasPeso.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasPeso c, Frete f, Transportadora t "
                + "where c.freteFaixasCEP   = b   "
                + "  and b.frete            = f   "
                + "  and f.transportadora   = t   "
                + "  and f.codigo           = '002'  "                
                + "  and b.cepInicial       <= ?1 "
                + "  and b.cepFinal         >= ?1 "
                + "  and c.pesoInicial      <= ?2 "
                + "  and c.pesoFinal        >= ?2 "
                + "  and t.alturaInicial    <= ?3 "
                + "  and t.alturaFinal      >= ?3 "
                + "  and t.volumeInicial    <= ?4 "
                + "  and t.volumeFinal      >= ?4 "                
                + "order by c.valor ",1,cep,peso,altura,volume);
    }
    
    public FreteFaixasPeso getFreteZUIANE(String cep, double peso, double altura, int volume) {
        
        System.out.println("***getMelhorFreteJADLOG***");
        System.out.println("cep======>"+cep);
        System.out.println("peso=====>"+peso);
        System.out.println("altura===>"+altura);
        System.out.println("volume===>"+volume);
        
        return getUltPojo(FreteFaixasPeso.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasPeso c, Frete f, Transportadora t "
                + "where c.freteFaixasCEP   = b   "
                + "  and b.frete            = f   "
                + "  and f.transportadora   = t   "
                + "  and f.codigo           = '005'  "                
                + "  and b.cepInicial       <= ?1 "
                + "  and b.cepFinal         >= ?1 "
                + "  and c.pesoInicial      <= ?2 "
                + "  and c.pesoFinal        >= ?2 "
                + "  and t.alturaInicial    <= ?3 "
                + "  and t.alturaFinal      >= ?3 "
                + "  and t.volumeInicial    <= ?4 "
                + "  and t.volumeFinal      >= ?4 "                
                + "order by c.valor ",1,cep,peso,altura,volume);
    }
    
    public FreteFaixasPeso getFreteJADLOG(String cep, double peso, double altura, int volume) {
        
        System.out.println("***getMelhorFreteJADLOG***");
        System.out.println("cep======>"+cep);
        System.out.println("peso=====>"+peso);
        System.out.println("altura===>"+altura);
        System.out.println("volume===>"+volume);
        
        return getUltPojo(FreteFaixasPeso.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasPeso c, Frete f, Transportadora t "
                + "where c.freteFaixasCEP   = b   "
                + "  and b.frete            = f   "
                + "  and f.transportadora   = t   "
                + "  and f.codigo           = '003'  "                
                + "  and b.cepInicial       <= ?1 "
                + "  and b.cepFinal         >= ?1 "
                + "  and c.pesoInicial      <= ?2 "
                + "  and c.pesoFinal        >= ?2 "
                + "  and t.alturaInicial    <= ?3 "
                + "  and t.alturaFinal      >= ?3 "
                + "  and t.volumeInicial    <= ?4 "
                + "  and t.volumeFinal      >= ?4 "                
                + "order by c.valor ",1,cep,peso,altura,volume);
    }
    
    public FreteFaixasPeso getFreteTransportadora(String cep, double peso, Transportadora transportadora) {
        
        System.out.println("cep==============>"+cep);
        System.out.println("peso=============>"+peso);
        System.out.println("transportadora===>"+transportadora.getNomefantasia());
        
        return getUltPojo(FreteFaixasPeso.class,"select c "
                + "from FreteFaixasCEP b, FreteFaixasPeso c, Frete f, Transportadora t "
                + "where c.freteFaixasCEP   = b   "
                + "  and b.frete            = f   "
                + "  and f.transportadora   = ?3  "
                + "  and b.cepInicial       <= ?1 "
                + "  and b.cepFinal         >= ?1 "
                + "  and c.pesoInicial      <= ?2 "
                + "  and c.pesoFinal        >= ?2 "
                + "order by c.valor ",1,cep,peso,transportadora);
    }

    public FreteFaixas getFxTabDescComisById(int id) {
        return getPojo(FreteFaixas.class,id);
    }    
    
    public FreteFaixas save(FreteFaixas emp) {
        getEm().persist(emp);
        return emp;
    }

    public FreteFaixas set(FreteFaixas emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(FreteFaixas emp) {
        FreteFaixas empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}