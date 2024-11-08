package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TipoRastreaPedido.class)
public class TipoRastreaPedido_ { 

    public static volatile SingularAttribute<TipoRastreaPedido, String> obs;
    public static volatile SingularAttribute<TipoRastreaPedido, String> codigo;
    public static volatile SingularAttribute<TipoRastreaPedido, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TipoRastreaPedido, Date> dataInativo;
    public static volatile SingularAttribute<TipoRastreaPedido, String> deletado;
    public static volatile SingularAttribute<TipoRastreaPedido, String> inativo;
    public static volatile SingularAttribute<TipoRastreaPedido, String> modificado;
    public static volatile SingularAttribute<TipoRastreaPedido, Integer> id;
    public static volatile SingularAttribute<TipoRastreaPedido, Empresa> empresa;
    public static volatile SingularAttribute<TipoRastreaPedido, String> descricao;

}