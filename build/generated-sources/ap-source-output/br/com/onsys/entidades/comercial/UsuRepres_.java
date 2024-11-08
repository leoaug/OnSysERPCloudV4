package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuRepres.class)
public class UsuRepres_ { 

    public static volatile SingularAttribute<UsuRepres, Representante> representante;
    public static volatile SingularAttribute<UsuRepres, Usuario> usuario;
    public static volatile SingularAttribute<UsuRepres, Integer> id;
    public static volatile SingularAttribute<UsuRepres, Empresa> empresa;

}