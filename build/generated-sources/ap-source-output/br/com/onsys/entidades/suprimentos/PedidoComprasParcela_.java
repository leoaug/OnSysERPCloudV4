package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.suprimentos.PedidoCompras;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PedidoComprasParcela.class)
public class PedidoComprasParcela_ { 

    public static volatile SingularAttribute<PedidoComprasParcela, String> obs;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> qtdrecebida;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> desconto;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vlicms;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vltotrecebido;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> qtdpedida;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vltot;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> outdespesas;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> frete;
    public static volatile SingularAttribute<PedidoComprasParcela, Integer> id;
    public static volatile SingularAttribute<PedidoComprasParcela, Item> item;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> percicms;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> ipi;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> percst;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vlunitliq;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vltotitem;
    public static volatile SingularAttribute<PedidoComprasParcela, Date> dataentrega;
    public static volatile SingularAttribute<PedidoComprasParcela, PedidoCompras> pedidocompras;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> percfrete;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> percdesc;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> percipi;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> qtdsaldo;
    public static volatile SingularAttribute<PedidoComprasParcela, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PedidoComprasParcela, Empresa> empresa;
    public static volatile SingularAttribute<PedidoComprasParcela, BigDecimal> vlunit;

}