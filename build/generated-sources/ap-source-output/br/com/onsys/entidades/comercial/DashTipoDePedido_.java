package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DashTipoDePedido.class)
public class DashTipoDePedido_ { 

    public static volatile SingularAttribute<DashTipoDePedido, String> cliente;
    public static volatile SingularAttribute<DashTipoDePedido, String> codigo;
    public static volatile SingularAttribute<DashTipoDePedido, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DashTipoDePedido, BigDecimal> valorpedido;
    public static volatile SingularAttribute<DashTipoDePedido, Usuario> usuario;
    public static volatile SingularAttribute<DashTipoDePedido, Integer> id;
    public static volatile SingularAttribute<DashTipoDePedido, Empresa> empresa;
    public static volatile SingularAttribute<DashTipoDePedido, String> descricao;

}