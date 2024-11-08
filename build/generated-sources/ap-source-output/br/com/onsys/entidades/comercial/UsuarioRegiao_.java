package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Regiao;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioRegiao.class)
public class UsuarioRegiao_ { 

    public static volatile SingularAttribute<UsuarioRegiao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<UsuarioRegiao, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioRegiao, Integer> id;
    public static volatile SingularAttribute<UsuarioRegiao, Regiao> regiao;
    public static volatile SingularAttribute<UsuarioRegiao, Empresa> empresa;

}