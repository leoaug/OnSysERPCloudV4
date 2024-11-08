package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.comercial.PlanoVenda;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PlanoVendaItem.class)
public class PlanoVendaItem_ { 

    public static volatile SingularAttribute<PlanoVendaItem, Item> item;
    public static volatile SingularAttribute<PlanoVendaItem, Integer> ano;
    public static volatile SingularAttribute<PlanoVendaItem, PlanoVenda> planoVenda;
    public static volatile SingularAttribute<PlanoVendaItem, Integer> id;
    public static volatile SingularAttribute<PlanoVendaItem, BigDecimal[]> quantidade;

}