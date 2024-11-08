package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Estado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile SingularAttribute<Pais, String> obs;
    public static volatile SingularAttribute<Pais, String> codigo;
    public static volatile SingularAttribute<Pais, String> Continente;
    public static volatile SingularAttribute<Pais, String> deletado;
    public static volatile SingularAttribute<Pais, String> inativo;
    public static volatile SingularAttribute<Pais, String> modificado;
    public static volatile SingularAttribute<Pais, Integer> id;
    public static volatile SingularAttribute<Pais, Date> datainativo;
    public static volatile SingularAttribute<Pais, String> descricao;
    public static volatile ListAttribute<Pais, Estado> estados;

}