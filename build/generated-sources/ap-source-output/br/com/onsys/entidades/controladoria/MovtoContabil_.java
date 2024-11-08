package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.controladoria.Lotes;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import br.com.onsys.entidades.financeiro.TituloAP;
import br.com.onsys.entidades.financeiro.TituloAR;
import br.com.onsys.entidades.logistica.DoctoEnt;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MovtoContabil.class)
public class MovtoContabil_ { 

    public static volatile SingularAttribute<MovtoContabil, CentroCusto> centrocusto;
    public static volatile SingularAttribute<MovtoContabil, TituloAP> tituloap;
    public static volatile SingularAttribute<MovtoContabil, String> lote;
    public static volatile SingularAttribute<MovtoContabil, TituloAR> tituloar;
    public static volatile SingularAttribute<MovtoContabil, String> historico;
    public static volatile SingularAttribute<MovtoContabil, String> origem;
    public static volatile SingularAttribute<MovtoContabil, BigDecimal> valor;
    public static volatile SingularAttribute<MovtoContabil, PlanoContas> conta;
    public static volatile SingularAttribute<MovtoContabil, Date> dtmovto;
    public static volatile SingularAttribute<MovtoContabil, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MovtoContabil, DoctoEnt> doctologistica;
    public static volatile SingularAttribute<MovtoContabil, UnidNegocio> unidnegocio;
    public static volatile SingularAttribute<MovtoContabil, Lotes> lotes;
    public static volatile SingularAttribute<MovtoContabil, Integer> id;
    public static volatile SingularAttribute<MovtoContabil, Empresa> empresa;
    public static volatile SingularAttribute<MovtoContabil, String> DC;

}