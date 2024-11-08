package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.PedidoVendas;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PedidoVendasTitAR.class)
public class PedidoVendasTitAR_ { 

    public static volatile SingularAttribute<PedidoVendasTitAR, BigDecimal> vlTotDocto;
    public static volatile SingularAttribute<PedidoVendasTitAR, Date> dataemissao;
    public static volatile SingularAttribute<PedidoVendasTitAR, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PedidoVendasTitAR, String> historico;
    public static volatile SingularAttribute<PedidoVendasTitAR, Integer> id;
    public static volatile SingularAttribute<PedidoVendasTitAR, String> nroDocto;
    public static volatile SingularAttribute<PedidoVendasTitAR, Empresa> empresa;
    public static volatile SingularAttribute<PedidoVendasTitAR, Participante> participante;
    public static volatile SingularAttribute<PedidoVendasTitAR, PedidoVendas> pedidoVendas;

}