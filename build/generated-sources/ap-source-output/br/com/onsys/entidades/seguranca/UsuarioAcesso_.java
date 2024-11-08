package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioAcesso.class)
public class UsuarioAcesso_ { 

    public static volatile SingularAttribute<UsuarioAcesso, Date> dataUltimoAcesso;
    public static volatile SingularAttribute<UsuarioAcesso, Empresa> empresaAcessada;
    public static volatile SingularAttribute<UsuarioAcesso, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioAcesso, Integer> id;

}