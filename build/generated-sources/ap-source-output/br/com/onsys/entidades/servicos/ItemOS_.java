package br.com.onsys.entidades.servicos;

import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.servicos.OS;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemOS.class)
public class ItemOS_ { 

    public static volatile SingularAttribute<ItemOS, Item> item;
    public static volatile SingularAttribute<ItemOS, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemOS, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemOS, OS> os;
    public static volatile SingularAttribute<ItemOS, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemOS, Integer> id;
    public static volatile SingularAttribute<ItemOS, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemOS, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemOS, BigDecimal> vlunit;

}