package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Representante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(WooCategoria.class)
public class WooCategoria_ { 

    public static volatile SingularAttribute<WooCategoria, String> codigo;
    public static volatile SingularAttribute<WooCategoria, Representante> representante;
    public static volatile SingularAttribute<WooCategoria, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<WooCategoria, String> nome;
    public static volatile SingularAttribute<WooCategoria, Integer> id;
    public static volatile SingularAttribute<WooCategoria, Empresa> empresa;

}