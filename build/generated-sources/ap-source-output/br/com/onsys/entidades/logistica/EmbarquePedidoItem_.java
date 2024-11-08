package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.logistica.Embarque;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EmbarquePedidoItem.class)
public class EmbarquePedidoItem_ { 

    public static volatile SingularAttribute<EmbarquePedidoItem, BigDecimal> qtdpedida;
    public static volatile SingularAttribute<EmbarquePedidoItem, Item> item;
    public static volatile SingularAttribute<EmbarquePedidoItem, Embarque> embarque;
    public static volatile SingularAttribute<EmbarquePedidoItem, Integer> id;
    public static volatile SingularAttribute<EmbarquePedidoItem, BigDecimal> qtdalocada;
    public static volatile SingularAttribute<EmbarquePedidoItem, PedidoVendas> pedidoVendas;
    public static volatile SingularAttribute<EmbarquePedidoItem, BigDecimal> qtdatendida;

}