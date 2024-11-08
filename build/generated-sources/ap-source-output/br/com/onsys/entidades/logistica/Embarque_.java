package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.logistica.Transportadora;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Embarque.class)
public class Embarque_ { 

    public static volatile SingularAttribute<Embarque, String> situacao;
    public static volatile SingularAttribute<Embarque, Date> dtlancamento;
    public static volatile SingularAttribute<Embarque, BigDecimal> pesoliquido;
    public static volatile SingularAttribute<Embarque, Integer> volumes;
    public static volatile SingularAttribute<Embarque, Date> dtemissao;
    public static volatile SingularAttribute<Embarque, String> nroembarque;
    public static volatile SingularAttribute<Embarque, Date> dtsaida;
    public static volatile SingularAttribute<Embarque, Transportadora> transportadora;
    public static volatile SingularAttribute<Embarque, Estado> ufplaca;
    public static volatile SingularAttribute<Embarque, String> motorista;
    public static volatile SingularAttribute<Embarque, BigDecimal> pesobruto;
    public static volatile SingularAttribute<Embarque, Integer> id;
    public static volatile SingularAttribute<Embarque, String> placa;

}