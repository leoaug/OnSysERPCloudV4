package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsrParamProg.class)
public class UsrParamProg_ { 

    public static volatile SingularAttribute<UsrParamProg, Boolean> boolean2;
    public static volatile SingularAttribute<UsrParamProg, Programa> programa;
    public static volatile SingularAttribute<UsrParamProg, Usuario> usuario;
    public static volatile SingularAttribute<UsrParamProg, Integer> id;
    public static volatile SingularAttribute<UsrParamProg, Boolean> boolean1;
    public static volatile SingularAttribute<UsrParamProg, Empresa> empresa;
    public static volatile SingularAttribute<UsrParamProg, Date> ultimoAcesso;

}