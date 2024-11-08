package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.financeiro.Moeda;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.suprimentos.Comprador;
import br.com.onsys.entidades.suprimentos.Requisitante;
import br.com.onsys.entidades.tipos.TipoPagamento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PedidoCompras.class)
public class PedidoCompras_ { 

    public static volatile SingularAttribute<PedidoCompras, BigDecimal> percdesctotal;
    public static volatile SingularAttribute<PedidoCompras, String> obs;
    public static volatile SingularAttribute<PedidoCompras, String> situacao;
    public static volatile SingularAttribute<PedidoCompras, CondPagamento> condpagamento;
    public static volatile SingularAttribute<PedidoCompras, Requisitante> requisitante;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vlicms;
    public static volatile SingularAttribute<PedidoCompras, String> dataaprova;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vldesconto;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vltotliqrecebido;
    public static volatile SingularAttribute<PedidoCompras, Date> datainativo;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vltotpedido;
    public static volatile SingularAttribute<PedidoCompras, Boolean> pedidofechado;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> pesobruto;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> frete;
    public static volatile SingularAttribute<PedidoCompras, String> freteemitente;
    public static volatile SingularAttribute<PedidoCompras, Integer> id;
    public static volatile SingularAttribute<PedidoCompras, String> datafechamento;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> ipi;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> pesoliquido;
    public static volatile SingularAttribute<PedidoCompras, Integer> volumes;
    public static volatile SingularAttribute<PedidoCompras, String> deletado;
    public static volatile SingularAttribute<PedidoCompras, String> nrpedido;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vltotliqsaldo;
    public static volatile SingularAttribute<PedidoCompras, Date> dataentrega;
    public static volatile SingularAttribute<PedidoCompras, Transportadora> transportadora;
    public static volatile SingularAttribute<PedidoCompras, Usuario> usraprova;
    public static volatile SingularAttribute<PedidoCompras, Moeda> moeda;
    public static volatile SingularAttribute<PedidoCompras, Date> dataemissao;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> percfrete;
    public static volatile SingularAttribute<PedidoCompras, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PedidoCompras, String> inativo;
    public static volatile SingularAttribute<PedidoCompras, String> style;
    public static volatile SingularAttribute<PedidoCompras, Comprador> comprador;
    public static volatile SingularAttribute<PedidoCompras, Participante> fornecedor;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vltotbruto;
    public static volatile SingularAttribute<PedidoCompras, Empresa> empresa;
    public static volatile SingularAttribute<PedidoCompras, BigDecimal> vltotliqpedido;
    public static volatile SingularAttribute<PedidoCompras, TipoPagamento> formapagamento;

}