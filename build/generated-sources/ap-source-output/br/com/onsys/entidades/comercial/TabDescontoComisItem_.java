package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TabDescontoComis;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TabDescontoComisItem.class)
public class TabDescontoComisItem_ { 

    public static volatile SingularAttribute<TabDescontoComisItem, BigDecimal> descfim;
    public static volatile SingularAttribute<TabDescontoComisItem, Item> item;
    public static volatile SingularAttribute<TabDescontoComisItem, BigDecimal> comissao;
    public static volatile SingularAttribute<TabDescontoComisItem, TabDescontoComis> tabDescontoComis;
    public static volatile SingularAttribute<TabDescontoComisItem, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TabDescontoComisItem, BigDecimal> descini;
    public static volatile SingularAttribute<TabDescontoComisItem, Integer> id;
    public static volatile SingularAttribute<TabDescontoComisItem, Empresa> empresa;

}