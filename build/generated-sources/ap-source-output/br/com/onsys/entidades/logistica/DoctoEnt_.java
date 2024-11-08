package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.comercial.NaturezaOperacao;
import br.com.onsys.entidades.logistica.ItemDoctoEnt;
import br.com.onsys.entidades.logistica.TipoDoctoLogistica;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.suprimentos.PedidoCompras;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoEnt.class)
public class DoctoEnt_ { 

    public static volatile SingularAttribute<DoctoEnt, String> situacao;
    public static volatile SingularAttribute<DoctoEnt, String> obsdocto;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vltotdoctoliq;
    public static volatile SingularAttribute<DoctoEnt, CondPagamento> condpagamento;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> descprod;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlicms;
    public static volatile SingularAttribute<DoctoEnt, String> chaveacesso;
    public static volatile SingularAttribute<DoctoEnt, TipoDoctoLogistica> tipodocto;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vltotdocto;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlcofins;
    public static volatile SingularAttribute<DoctoEnt, String> nrodocto;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlFrete;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlOutrasDespesas;
    public static volatile SingularAttribute<DoctoEnt, String> tipoDeFrete;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlpis;
    public static volatile SingularAttribute<DoctoEnt, Integer> id;
    public static volatile ListAttribute<DoctoEnt, ItemDoctoEnt> listServicos;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlicmsoutras;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlipi;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlSeguro;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vliss;
    public static volatile SingularAttribute<DoctoEnt, Date> dtlancamento;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlir;
    public static volatile SingularAttribute<DoctoEnt, Date> dtemissao;
    public static volatile SingularAttribute<DoctoEnt, PedidoCompras> pedidoCompras;
    public static volatile SingularAttribute<DoctoEnt, String> mesrefer;
    public static volatile SingularAttribute<DoctoEnt, Participante> participante;
    public static volatile SingularAttribute<DoctoEnt, Transportadora> transportadora;
    public static volatile SingularAttribute<DoctoEnt, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoEnt, String> serie;
    public static volatile SingularAttribute<DoctoEnt, BigDecimal> vlipioutras;
    public static volatile SingularAttribute<DoctoEnt, NaturezaOperacao> natoperacao;
    public static volatile SingularAttribute<DoctoEnt, Empresa> empresa;
    public static volatile ListAttribute<DoctoEnt, ItemDoctoEnt> listAtivoFixo;

}