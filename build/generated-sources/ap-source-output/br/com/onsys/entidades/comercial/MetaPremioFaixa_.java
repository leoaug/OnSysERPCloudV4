package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.MetaPremio;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MetaPremioFaixa.class)
public class MetaPremioFaixa_ { 

    public static volatile SingularAttribute<MetaPremioFaixa, BigDecimal> premio;
    public static volatile SingularAttribute<MetaPremioFaixa, BigDecimal> percini;
    public static volatile SingularAttribute<MetaPremioFaixa, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MetaPremioFaixa, Integer> id;
    public static volatile SingularAttribute<MetaPremioFaixa, MetaPremio> metapremio;
    public static volatile SingularAttribute<MetaPremioFaixa, BigDecimal> percfim;
    public static volatile SingularAttribute<MetaPremioFaixa, Empresa> empresa;

}