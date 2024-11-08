package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Estado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Municipio.class)
public class Municipio_ { 

    public static volatile SingularAttribute<Municipio, String> obs;
    public static volatile SingularAttribute<Municipio, String> codigo;
    public static volatile SingularAttribute<Municipio, Estado> estado;
    public static volatile SingularAttribute<Municipio, BigDecimal> habitantes;
    public static volatile SingularAttribute<Municipio, String> deletado;
    public static volatile SingularAttribute<Municipio, String> inativo;
    public static volatile SingularAttribute<Municipio, String> modificado;
    public static volatile SingularAttribute<Municipio, Integer> id;
    public static volatile SingularAttribute<Municipio, String> faixaHabitantes;
    public static volatile SingularAttribute<Municipio, Date> datainativo;
    public static volatile SingularAttribute<Municipio, String> descricao;

}