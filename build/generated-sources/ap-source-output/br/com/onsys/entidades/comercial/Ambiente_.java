package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Ambiente.class)
public class Ambiente_ { 

    public static volatile SingularAttribute<Ambiente, String> obs;
    public static volatile SingularAttribute<Ambiente, String> codigo;
    public static volatile SingularAttribute<Ambiente, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Ambiente, String> deletado;
    public static volatile SingularAttribute<Ambiente, String> inativo;
    public static volatile SingularAttribute<Ambiente, String> modificado;
    public static volatile SingularAttribute<Ambiente, Integer> id;
    public static volatile SingularAttribute<Ambiente, Empresa> empresa;
    public static volatile SingularAttribute<Ambiente, Date> datainativo;
    public static volatile SingularAttribute<Ambiente, String> descricao;

}