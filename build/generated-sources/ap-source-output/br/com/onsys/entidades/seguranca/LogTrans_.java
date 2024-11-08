package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(LogTrans.class)
public class LogTrans_ { 

    public static volatile SingularAttribute<LogTrans, Date> data;
    public static volatile SingularAttribute<LogTrans, String> operacao;
    public static volatile SingularAttribute<LogTrans, Programa> programa;
    public static volatile SingularAttribute<LogTrans, Usuario> usuario;
    public static volatile SingularAttribute<LogTrans, Integer> id;
    public static volatile SingularAttribute<LogTrans, Empresa> empresa;

}