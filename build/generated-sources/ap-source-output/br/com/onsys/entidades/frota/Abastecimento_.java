package br.com.onsys.entidades.frota;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Veiculos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Abastecimento.class)
public class Abastecimento_ { 

    public static volatile SingularAttribute<Abastecimento, BigDecimal> consumo;
    public static volatile SingularAttribute<Abastecimento, String> obs;
    public static volatile SingularAttribute<Abastecimento, BigDecimal> km;
    public static volatile SingularAttribute<Abastecimento, Veiculos> veiculos;
    public static volatile SingularAttribute<Abastecimento, Date> data;
    public static volatile SingularAttribute<Abastecimento, Integer> kmPercorrido;
    public static volatile SingularAttribute<Abastecimento, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Abastecimento, BigDecimal> valor;
    public static volatile SingularAttribute<Abastecimento, Integer> id;
    public static volatile SingularAttribute<Abastecimento, Empresa> empresa;
    public static volatile SingularAttribute<Abastecimento, BigDecimal> quantidade;
    public static volatile SingularAttribute<Abastecimento, Integer> kmInicial;

}