package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Pais;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> uf;
    public static volatile SingularAttribute<Estado, String> obs;
    public static volatile SingularAttribute<Estado, String> codigo;
    public static volatile SingularAttribute<Estado, String> deletado;
    public static volatile SingularAttribute<Estado, String> inativo;
    public static volatile SingularAttribute<Estado, String> modificado;
    public static volatile SingularAttribute<Estado, Integer> id;
    public static volatile SingularAttribute<Estado, Date> datainativo;
    public static volatile SingularAttribute<Estado, String> descricao;
    public static volatile SingularAttribute<Estado, Pais> pais;

}