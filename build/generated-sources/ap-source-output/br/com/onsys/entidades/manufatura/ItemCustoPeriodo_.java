package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemCustoPeriodo.class)
public class ItemCustoPeriodo_ { 

    public static volatile SingularAttribute<ItemCustoPeriodo, BigDecimal> vlunitmat;
    public static volatile SingularAttribute<ItemCustoPeriodo, Item> item;
    public static volatile SingularAttribute<ItemCustoPeriodo, Integer> ano;
    public static volatile SingularAttribute<ItemCustoPeriodo, String> periodo;
    public static volatile SingularAttribute<ItemCustoPeriodo, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemCustoPeriodo, BigDecimal> vlunitggf;
    public static volatile SingularAttribute<ItemCustoPeriodo, Integer> mes;
    public static volatile SingularAttribute<ItemCustoPeriodo, Integer> id;
    public static volatile SingularAttribute<ItemCustoPeriodo, Empresa> empresa;
    public static volatile SingularAttribute<ItemCustoPeriodo, BigDecimal> vlunitmod;

}