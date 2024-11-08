package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(LogUsrProgAcessado.class)
public class LogUsrProgAcessado_ { 

    public static volatile SingularAttribute<LogUsrProgAcessado, Date> data;
    public static volatile SingularAttribute<LogUsrProgAcessado, Programa> programa;
    public static volatile SingularAttribute<LogUsrProgAcessado, Usuario> usuario;
    public static volatile SingularAttribute<LogUsrProgAcessado, Integer> id;
    public static volatile SingularAttribute<LogUsrProgAcessado, Empresa> empresa;

}