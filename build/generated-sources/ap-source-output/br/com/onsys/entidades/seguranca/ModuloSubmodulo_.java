package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Modulo;
import br.com.onsys.entidades.seguranca.Submodulo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ModuloSubmodulo.class)
public class ModuloSubmodulo_ { 

    public static volatile SingularAttribute<ModuloSubmodulo, Submodulo> submodulo;
    public static volatile SingularAttribute<ModuloSubmodulo, Integer> id;
    public static volatile SingularAttribute<ModuloSubmodulo, Empresa> empresa;
    public static volatile SingularAttribute<ModuloSubmodulo, Modulo> modulo;

}