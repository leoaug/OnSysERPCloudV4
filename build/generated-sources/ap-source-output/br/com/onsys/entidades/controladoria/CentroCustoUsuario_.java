package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CentroCustoUsuario.class)
public class CentroCustoUsuario_ { 

    public static volatile SingularAttribute<CentroCustoUsuario, CentroCusto> centroCusto;
    public static volatile SingularAttribute<CentroCustoUsuario, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CentroCustoUsuario, Integer> id;
    public static volatile SingularAttribute<CentroCustoUsuario, Usuario> usuarios;
    public static volatile SingularAttribute<CentroCustoUsuario, Empresa> empresa;

}