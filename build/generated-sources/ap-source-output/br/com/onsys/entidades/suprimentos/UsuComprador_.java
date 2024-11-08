package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.suprimentos.Comprador;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuComprador.class)
public class UsuComprador_ { 

    public static volatile SingularAttribute<UsuComprador, Usuario> usuario;
    public static volatile SingularAttribute<UsuComprador, Comprador> comprador;
    public static volatile SingularAttribute<UsuComprador, Integer> id;
    public static volatile SingularAttribute<UsuComprador, Empresa> empresa;

}