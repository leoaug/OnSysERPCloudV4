package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TabRentabilidade;
import br.com.onsys.entidades.tipos.TipoCor;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FaixaTabRentabil.class)
public class FaixaTabRentabil_ { 

    public static volatile SingularAttribute<FaixaTabRentabil, BigDecimal> comissao;
    public static volatile SingularAttribute<FaixaTabRentabil, BigDecimal> rentabfim;
    public static volatile SingularAttribute<FaixaTabRentabil, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FaixaTabRentabil, TipoCor> cor;
    public static volatile SingularAttribute<FaixaTabRentabil, TabRentabilidade> tabrentabilidade;
    public static volatile SingularAttribute<FaixaTabRentabil, Integer> id;
    public static volatile SingularAttribute<FaixaTabRentabil, Empresa> empresa;
    public static volatile SingularAttribute<FaixaTabRentabil, BigDecimal> rentabini;

}