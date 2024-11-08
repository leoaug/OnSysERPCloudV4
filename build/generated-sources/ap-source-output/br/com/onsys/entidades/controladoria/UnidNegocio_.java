package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UnidNegocio.class)
public class UnidNegocio_ { 

    public static volatile SingularAttribute<UnidNegocio, String> codigo;
    public static volatile SingularAttribute<UnidNegocio, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<UnidNegocio, String> deletado;
    public static volatile SingularAttribute<UnidNegocio, String> inativo;
    public static volatile SingularAttribute<UnidNegocio, Integer> id;
    public static volatile SingularAttribute<UnidNegocio, Empresa> empresa;
    public static volatile SingularAttribute<UnidNegocio, Date> datainativo;
    public static volatile SingularAttribute<UnidNegocio, String> descricao;

}