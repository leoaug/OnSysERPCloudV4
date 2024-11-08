package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.logistica.Embarque;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EmbarquePedido.class)
public class EmbarquePedido_ { 

    public static volatile SingularAttribute<EmbarquePedido, Embarque> embarque;
    public static volatile SingularAttribute<EmbarquePedido, Integer> id;
    public static volatile SingularAttribute<EmbarquePedido, PedidoVendas> pedidoVendas;

}