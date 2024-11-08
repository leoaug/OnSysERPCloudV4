package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Origens.class)
public class Origens_ { 

    public static volatile SingularAttribute<Origens, String> obs;
    public static volatile SingularAttribute<Origens, String> codigo;
    public static volatile SingularAttribute<Origens, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Origens, String> deletado;
    public static volatile SingularAttribute<Origens, String> inativo;
    public static volatile SingularAttribute<Origens, String> modificado;
    public static volatile SingularAttribute<Origens, Integer> id;
    public static volatile SingularAttribute<Origens, Empresa> empresa;
    public static volatile SingularAttribute<Origens, Date> datainativo;
    public static volatile SingularAttribute<Origens, String> descricao;

}