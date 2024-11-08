package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Grade;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemGrade.class)
public class ItemGrade_ { 

    public static volatile SingularAttribute<ItemGrade, String> gtin;
    public static volatile SingularAttribute<ItemGrade, BigDecimal> precoVenda;
    public static volatile SingularAttribute<ItemGrade, Item> item;
    public static volatile SingularAttribute<ItemGrade, BigDecimal> custo;
    public static volatile SingularAttribute<ItemGrade, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemGrade, Grade> grade;
    public static volatile SingularAttribute<ItemGrade, Integer> id;
    public static volatile SingularAttribute<ItemGrade, String> skuVariacao;
    public static volatile SingularAttribute<ItemGrade, Empresa> empresa;

}