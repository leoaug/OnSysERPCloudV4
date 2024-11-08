package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioPrograma.class)
public class UsuarioPrograma_ { 

    public static volatile SingularAttribute<UsuarioPrograma, Boolean> editar;
    public static volatile SingularAttribute<UsuarioPrograma, Programa> programa;
    public static volatile SingularAttribute<UsuarioPrograma, Boolean> incluir;
    public static volatile SingularAttribute<UsuarioPrograma, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioPrograma, Boolean> remover;
    public static volatile SingularAttribute<UsuarioPrograma, Boolean> consultar;
    public static volatile SingularAttribute<UsuarioPrograma, Integer> id;
    public static volatile SingularAttribute<UsuarioPrograma, Empresa> empresa;

}