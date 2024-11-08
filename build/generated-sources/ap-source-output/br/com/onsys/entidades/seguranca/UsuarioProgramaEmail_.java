package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioProgramaEmail.class)
public class UsuarioProgramaEmail_ { 

    public static volatile SingularAttribute<UsuarioProgramaEmail, Programa> programa;
    public static volatile SingularAttribute<UsuarioProgramaEmail, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioProgramaEmail, Integer> id;
    public static volatile SingularAttribute<UsuarioProgramaEmail, Empresa> empresa;

}