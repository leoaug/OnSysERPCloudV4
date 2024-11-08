package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemUFST.class)
public class ItemUFST_ { 

    public static volatile SingularAttribute<ItemUFST, BigDecimal> icmsst;
    public static volatile SingularAttribute<ItemUFST, Item> item;
    public static volatile SingularAttribute<ItemUFST, Estado> estado;
    public static volatile SingularAttribute<ItemUFST, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemUFST, Estado> estadoOrigem;
    public static volatile SingularAttribute<ItemUFST, Integer> id;
    public static volatile SingularAttribute<ItemUFST, Empresa> empresa;
    public static volatile SingularAttribute<ItemUFST, BigDecimal> mvast;

}