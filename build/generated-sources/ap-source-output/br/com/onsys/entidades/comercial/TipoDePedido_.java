package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TipoDePedido.class)
public class TipoDePedido_ { 

    public static volatile SingularAttribute<TipoDePedido, String> obs;
    public static volatile SingularAttribute<TipoDePedido, String> codigo;
    public static volatile SingularAttribute<TipoDePedido, Boolean> ipi;
    public static volatile SingularAttribute<TipoDePedido, String> deletado;
    public static volatile SingularAttribute<TipoDePedido, String> modificado;
    public static volatile SingularAttribute<TipoDePedido, Date> datainativo;
    public static volatile SingularAttribute<TipoDePedido, String> descricao;
    public static volatile SingularAttribute<TipoDePedido, BigDecimal> comissao;
    public static volatile SingularAttribute<TipoDePedido, Boolean> aprovacao;
    public static volatile SingularAttribute<TipoDePedido, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TipoDePedido, String> inativo;
    public static volatile SingularAttribute<TipoDePedido, Integer> id;
    public static volatile SingularAttribute<TipoDePedido, Empresa> empresa;

}