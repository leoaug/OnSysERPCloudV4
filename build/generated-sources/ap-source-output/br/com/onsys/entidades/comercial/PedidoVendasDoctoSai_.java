package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.logistica.DoctoSai;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PedidoVendasDoctoSai.class)
public class PedidoVendasDoctoSai_ { 

    public static volatile SingularAttribute<PedidoVendasDoctoSai, DoctoSai> NotaFiscalVenda;
    public static volatile SingularAttribute<PedidoVendasDoctoSai, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PedidoVendasDoctoSai, Integer> id;
    public static volatile SingularAttribute<PedidoVendasDoctoSai, Empresa> empresa;
    public static volatile SingularAttribute<PedidoVendasDoctoSai, PedidoVendas> pedidoVendas;

}