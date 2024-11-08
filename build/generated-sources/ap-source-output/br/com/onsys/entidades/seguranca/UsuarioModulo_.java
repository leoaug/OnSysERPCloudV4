package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Modulo;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioModulo.class)
public class UsuarioModulo_ { 

    public static volatile SingularAttribute<UsuarioModulo, String> obs;
    public static volatile SingularAttribute<UsuarioModulo, String> deletado;
    public static volatile SingularAttribute<UsuarioModulo, String> modificado;
    public static volatile SingularAttribute<UsuarioModulo, String> inativo;
    public static volatile SingularAttribute<UsuarioModulo, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioModulo, Integer> id;
    public static volatile SingularAttribute<UsuarioModulo, Empresa> empresa;
    public static volatile SingularAttribute<UsuarioModulo, Modulo> modulo;
    public static volatile SingularAttribute<UsuarioModulo, Date> datainativo;

}