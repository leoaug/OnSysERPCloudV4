package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Mesorregiao.class)
public class Mesorregiao_ { 

    public static volatile SingularAttribute<Mesorregiao, String> obs;
    public static volatile SingularAttribute<Mesorregiao, String> codigo;
    public static volatile SingularAttribute<Mesorregiao, Estado> estado;
    public static volatile SingularAttribute<Mesorregiao, BigDecimal> percfrete;
    public static volatile SingularAttribute<Mesorregiao, String> deletado;
    public static volatile SingularAttribute<Mesorregiao, String> inativo;
    public static volatile SingularAttribute<Mesorregiao, String> modificado;
    public static volatile SingularAttribute<Mesorregiao, Integer> id;
    public static volatile SingularAttribute<Mesorregiao, Empresa> empresa;
    public static volatile SingularAttribute<Mesorregiao, Date> datainativo;
    public static volatile SingularAttribute<Mesorregiao, String> descricao;

}