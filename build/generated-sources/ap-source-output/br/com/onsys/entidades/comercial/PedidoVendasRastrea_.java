package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.comercial.TipoRastreaPedido;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PedidoVendasRastrea.class)
public class PedidoVendasRastrea_ { 

    public static volatile SingularAttribute<PedidoVendasRastrea, TipoRastreaPedido> tipoRastreaPedido;
    public static volatile SingularAttribute<PedidoVendasRastrea, String> codigo;
    public static volatile SingularAttribute<PedidoVendasRastrea, String> data;
    public static volatile SingularAttribute<PedidoVendasRastrea, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PedidoVendasRastrea, Programa> programa;
    public static volatile SingularAttribute<PedidoVendasRastrea, Usuario> usuario;
    public static volatile SingularAttribute<PedidoVendasRastrea, Integer> id;
    public static volatile SingularAttribute<PedidoVendasRastrea, Empresa> empresa;
    public static volatile SingularAttribute<PedidoVendasRastrea, PedidoVendas> pedidoVendas;
    public static volatile SingularAttribute<PedidoVendasRastrea, String> descricao;

}