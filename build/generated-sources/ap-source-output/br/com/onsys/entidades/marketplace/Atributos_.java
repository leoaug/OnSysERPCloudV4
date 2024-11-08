package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.marketplace.Anuncios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Atributos.class)
public class Atributos_ { 

    public static volatile SingularAttribute<Atributos, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Atributos, Integer> id;
    public static volatile SingularAttribute<Atributos, Empresa> empresa;
    public static volatile SingularAttribute<Atributos, String> value_name;
    public static volatile SingularAttribute<Atributos, Anuncios> mlAnuncios;

}