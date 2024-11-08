package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.PedidoVendasTitAR;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PedidoVendasTitARParcela.class)
public class PedidoVendasTitARParcela_ { 

    public static volatile SingularAttribute<PedidoVendasTitARParcela, String> obs;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, BigDecimal> valorParcela;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, PedidoVendasTitAR> pedidoVendasTitAR;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, Date> dataVencimento;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, BigDecimal> vlSaldo;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, Integer> id;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, Date> dataPagto;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, Empresa> empresa;
    public static volatile SingularAttribute<PedidoVendasTitARParcela, Integer> parcela;

}