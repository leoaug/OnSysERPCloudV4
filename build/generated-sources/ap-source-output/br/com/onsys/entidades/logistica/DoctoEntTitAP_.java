package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import br.com.onsys.entidades.financeiro.CatFluxoCaixa;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TipoDoctoFinanceiro;
import br.com.onsys.entidades.logistica.DoctoEnt;
import br.com.onsys.entidades.projetos.Projeto;
import br.com.onsys.entidades.tipos.SitDoctoFinanceiro;
import br.com.onsys.entidades.tipos.TipoPagamento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoEntTitAP.class)
public class DoctoEntTitAP_ { 

    public static volatile SingularAttribute<DoctoEntTitAP, CondPagamento> condpagamento;
    public static volatile SingularAttribute<DoctoEntTitAP, String> origem;
    public static volatile SingularAttribute<DoctoEntTitAP, String> historico;
    public static volatile SingularAttribute<DoctoEntTitAP, TipoDoctoFinanceiro> tipodocto;
    public static volatile SingularAttribute<DoctoEntTitAP, BigDecimal> vltotdocto;
    public static volatile SingularAttribute<DoctoEntTitAP, String> mesrefer;
    public static volatile SingularAttribute<DoctoEntTitAP, Participante> participante;
    public static volatile SingularAttribute<DoctoEntTitAP, String> nrodocto;
    public static volatile SingularAttribute<DoctoEntTitAP, Projeto> projeto;
    public static volatile SingularAttribute<DoctoEntTitAP, Date> dataemissao;
    public static volatile SingularAttribute<DoctoEntTitAP, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoEntTitAP, DoctoEnt> doctologistica;
    public static volatile SingularAttribute<DoctoEntTitAP, UnidNegocio> unidnegocio;
    public static volatile SingularAttribute<DoctoEntTitAP, Portador> portador;
    public static volatile SingularAttribute<DoctoEntTitAP, String> serie;
    public static volatile SingularAttribute<DoctoEntTitAP, String> antecipa;
    public static volatile SingularAttribute<DoctoEntTitAP, CatFluxoCaixa> catfluxocaixa;
    public static volatile SingularAttribute<DoctoEntTitAP, Integer> id;
    public static volatile SingularAttribute<DoctoEntTitAP, SitDoctoFinanceiro> sitdoctofin;
    public static volatile SingularAttribute<DoctoEntTitAP, Date> datalancamento;
    public static volatile SingularAttribute<DoctoEntTitAP, Empresa> empresa;
    public static volatile SingularAttribute<DoctoEntTitAP, TipoPagamento> formapagamento;
    public static volatile SingularAttribute<DoctoEntTitAP, BigDecimal> vlsaldo;

}