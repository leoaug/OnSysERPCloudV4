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
import br.com.onsys.entidades.logistica.DoctoEnt;
import br.com.onsys.entidades.projetos.Projeto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TituloAP.class)
public class TituloAP_ { 

    public static volatile SingularAttribute<TituloAP, CondPagamento> condpagamento;
    public static volatile SingularAttribute<TituloAP, String> origem;
    public static volatile SingularAttribute<TituloAP, TipoDoctoFinanceiro> tipodocto;
    public static volatile SingularAttribute<TituloAP, String> modificado;
    public static volatile SingularAttribute<TituloAP, BigDecimal> vltotdocto;
    public static volatile SingularAttribute<TituloAP, String> nrodocto;
    public static volatile SingularAttribute<TituloAP, DoctoEnt> doctologistica;
    public static volatile SingularAttribute<TituloAP, UnidNegocio> unidnegocio;
    public static volatile SingularAttribute<TituloAP, String> antecipa;
    public static volatile SingularAttribute<TituloAP, Integer> id;
    public static volatile SingularAttribute<TituloAP, BigDecimal> vlsaldo;
    public static volatile SingularAttribute<TituloAP, String> historico;
    public static volatile SingularAttribute<TituloAP, String> mesrefer;
    public static volatile SingularAttribute<TituloAP, Participante> participante;
    public static volatile SingularAttribute<TituloAP, Moeda> moeda;
    public static volatile SingularAttribute<TituloAP, Projeto> projeto;
    public static volatile SingularAttribute<TituloAP, Date> dataemissao;
    public static volatile SingularAttribute<TituloAP, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TituloAP, Portador> portador;
    public static volatile SingularAttribute<TituloAP, String> serie;
    public static volatile SingularAttribute<TituloAP, CatFluxoCaixa> catfluxocaixa;
    public static volatile SingularAttribute<TituloAP, String> sitdoctofin;
    public static volatile SingularAttribute<TituloAP, Date> datalancamento;
    public static volatile SingularAttribute<TituloAP, Empresa> empresa;
    public static volatile SingularAttribute<TituloAP, String> formapagamento;

}