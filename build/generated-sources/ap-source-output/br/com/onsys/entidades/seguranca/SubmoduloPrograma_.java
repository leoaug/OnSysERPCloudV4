package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Submodulo;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SubmoduloPrograma.class)
public class SubmoduloPrograma_ { 

    public static volatile SingularAttribute<SubmoduloPrograma, Submodulo> submodulo;
    public static volatile SingularAttribute<SubmoduloPrograma, Boolean> editar;
    public static volatile SingularAttribute<SubmoduloPrograma, Boolean> incluir;
    public static volatile SingularAttribute<SubmoduloPrograma, Programa> programa;
    public static volatile SingularAttribute<SubmoduloPrograma, Boolean> remover;
    public static volatile SingularAttribute<SubmoduloPrograma, Boolean> consultar;
    public static volatile SingularAttribute<SubmoduloPrograma, Integer> id;
    public static volatile SingularAttribute<SubmoduloPrograma, Empresa> empresa;

}