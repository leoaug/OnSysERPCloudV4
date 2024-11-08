package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import br.com.onsys.entidades.financeiro.CatFluxoCaixa;
import br.com.onsys.entidades.financeiro.Moeda;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TipoDoctoFinanceiro;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.projetos.Projeto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TituloAR.class)
public class TituloAR_ { 

    public static volatile SingularAttribute<TituloAR, CondPagamento> condpagamento;
    public static volatile SingularAttribute<TituloAR, String> origem;
    public static volatile SingularAttribute<TituloAR, String> historico;
    public static volatile SingularAttribute<TituloAR, TipoDoctoFinanceiro> tipodocto;
    public static volatile SingularAttribute<TituloAR, BigDecimal> vltotdocto;
    public static volatile SingularAttribute<TituloAR, String> mesrefer;
    public static volatile SingularAttribute<TituloAR, Participante> participante;
    public static volatile SingularAttribute<TituloAR, String> nrodocto;
    public static volatile SingularAttribute<TituloAR, Moeda> moeda;
    public static volatile SingularAttribute<TituloAR, Projeto> projeto;
    public static volatile SingularAttribute<TituloAR, Date> dataemissao;
    public static volatile SingularAttribute<TituloAR, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TituloAR, DoctoSai> doctologistica;
    public static volatile SingularAttribute<TituloAR, UnidNegocio> unidnegocio;
    public static volatile SingularAttribute<TituloAR, Portador> portador;
    public static volatile SingularAttribute<TituloAR, String> serie;
    public static volatile SingularAttribute<TituloAR, String> antecipa;
    public static volatile SingularAttribute<TituloAR, CatFluxoCaixa> catfluxocaixa;
    public static volatile SingularAttribute<TituloAR, Integer> id;
    public static volatile SingularAttribute<TituloAR, String> sitdoctofin;
    public static volatile SingularAttribute<TituloAR, Date> datalancamento;
    public static volatile SingularAttribute<TituloAR, Empresa> empresa;
    public static volatile SingularAttribute<TituloAR, String> formapagamento;
    public static volatile SingularAttribute<TituloAR, BigDecimal> vlsaldo;

}