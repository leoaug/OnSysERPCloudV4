package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioComercial.class)
public class UsuarioComercial_ { 

    public static volatile SingularAttribute<UsuarioComercial, Boolean> alteraPrecoVenda;
    public static volatile SingularAttribute<UsuarioComercial, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<UsuarioComercial, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioComercial, Boolean> alteraLoteMultiplo;
    public static volatile SingularAttribute<UsuarioComercial, Integer> id;
    public static volatile SingularAttribute<UsuarioComercial, Empresa> empresa;

}