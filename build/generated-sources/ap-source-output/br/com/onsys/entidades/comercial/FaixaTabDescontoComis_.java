package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TabDescontoComis;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FaixaTabDescontoComis.class)
public class FaixaTabDescontoComis_ { 

    public static volatile SingularAttribute<FaixaTabDescontoComis, BigDecimal> descfim;
    public static volatile SingularAttribute<FaixaTabDescontoComis, BigDecimal> comissao;
    public static volatile SingularAttribute<FaixaTabDescontoComis, TabDescontoComis> tabDescontoComis;
    public static volatile SingularAttribute<FaixaTabDescontoComis, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FaixaTabDescontoComis, BigDecimal> descini;
    public static volatile SingularAttribute<FaixaTabDescontoComis, Integer> id;
    public static volatile SingularAttribute<FaixaTabDescontoComis, Empresa> empresa;

}