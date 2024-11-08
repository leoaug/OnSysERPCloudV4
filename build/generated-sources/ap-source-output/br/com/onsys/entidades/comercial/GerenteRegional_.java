package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(GerenteRegional.class)
public class GerenteRegional_ { 

    public static volatile SingularAttribute<GerenteRegional, String> codigo;
    public static volatile SingularAttribute<GerenteRegional, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<GerenteRegional, Integer> id;
    public static volatile SingularAttribute<GerenteRegional, Empresa> empresa;
    public static volatile SingularAttribute<GerenteRegional, String> descricao;

}