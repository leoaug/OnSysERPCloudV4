package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioSuporte.class)
public class UsuarioSuporte_ { 

    public static volatile SingularAttribute<UsuarioSuporte, Boolean> admSuporte;
    public static volatile SingularAttribute<UsuarioSuporte, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<UsuarioSuporte, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioSuporte, String> tipoUsuario;
    public static volatile SingularAttribute<UsuarioSuporte, Integer> id;
    public static volatile SingularAttribute<UsuarioSuporte, Empresa> empresa;

}