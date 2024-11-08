package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TipoDoctoComercial.class)
public class TipoDoctoComercial_ { 

    public static volatile SingularAttribute<TipoDoctoComercial, String> codigo;
    public static volatile SingularAttribute<TipoDoctoComercial, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TipoDoctoComercial, Integer> id;
    public static volatile SingularAttribute<TipoDoctoComercial, Empresa> empresa;
    public static volatile SingularAttribute<TipoDoctoComercial, String> descricao;

}