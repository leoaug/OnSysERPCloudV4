package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SaldoContabil.class)
public class SaldoContabil_ { 

    public static volatile SingularAttribute<SaldoContabil, CentroCusto> centrocusto;
    public static volatile SingularAttribute<SaldoContabil, BigDecimal> vldebito;
    public static volatile SingularAttribute<SaldoContabil, String> periodo;
    public static volatile SingularAttribute<SaldoContabil, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SaldoContabil, UnidNegocio> unidnegocio;
    public static volatile SingularAttribute<SaldoContabil, PlanoContas> conta;
    public static volatile SingularAttribute<SaldoContabil, BigDecimal> vlcredito;
    public static volatile SingularAttribute<SaldoContabil, Integer> id;
    public static volatile SingularAttribute<SaldoContabil, Empresa> empresa;
    public static volatile SingularAttribute<SaldoContabil, BigDecimal> saldoini;

}