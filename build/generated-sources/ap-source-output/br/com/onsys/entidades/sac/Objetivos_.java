package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Objetivos.class)
public class Objetivos_ { 

    public static volatile SingularAttribute<Objetivos, String> obs;
    public static volatile SingularAttribute<Objetivos, String> codigo;
    public static volatile SingularAttribute<Objetivos, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Objetivos, String> deletado;
    public static volatile SingularAttribute<Objetivos, String> inativo;
    public static volatile SingularAttribute<Objetivos, String> modificado;
    public static volatile SingularAttribute<Objetivos, Integer> id;
    public static volatile SingularAttribute<Objetivos, Empresa> empresa;
    public static volatile SingularAttribute<Objetivos, Date> datainativo;
    public static volatile SingularAttribute<Objetivos, String> descricao;

}