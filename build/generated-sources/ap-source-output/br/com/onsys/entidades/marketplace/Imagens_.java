package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.marketplace.Anuncios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Imagens.class)
public class Imagens_ { 

    public static volatile SingularAttribute<Imagens, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Imagens, Integer> id;
    public static volatile SingularAttribute<Imagens, String> source;
    public static volatile SingularAttribute<Imagens, Empresa> empresa;
    public static volatile SingularAttribute<Imagens, Anuncios> mlAnuncios;

}