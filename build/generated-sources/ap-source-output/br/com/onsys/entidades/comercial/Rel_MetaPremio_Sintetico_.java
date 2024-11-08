package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Rel_MetaPremio_Sintetico.class)
public class Rel_MetaPremio_Sintetico_ { 

    public static volatile SingularAttribute<Rel_MetaPremio_Sintetico, String> subCategoria;
    public static volatile SingularAttribute<Rel_MetaPremio_Sintetico, Integer> quantidadeMeta;
    public static volatile SingularAttribute<Rel_MetaPremio_Sintetico, Integer> quantidadeVendida;
    public static volatile SingularAttribute<Rel_MetaPremio_Sintetico, Integer> id;
    public static volatile SingularAttribute<Rel_MetaPremio_Sintetico, Empresa> empresa;
    public static volatile SingularAttribute<Rel_MetaPremio_Sintetico, String> supervisor;

}