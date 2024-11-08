package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Resultados.class)
public class Resultados_ { 

    public static volatile SingularAttribute<Resultados, String> obs;
    public static volatile SingularAttribute<Resultados, String> codigo;
    public static volatile SingularAttribute<Resultados, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Resultados, String> deletado;
    public static volatile SingularAttribute<Resultados, String> inativo;
    public static volatile SingularAttribute<Resultados, String> modificado;
    public static volatile SingularAttribute<Resultados, Integer> id;
    public static volatile SingularAttribute<Resultados, Empresa> empresa;
    public static volatile SingularAttribute<Resultados, Date> datainativo;
    public static volatile SingularAttribute<Resultados, String> descricao;

}