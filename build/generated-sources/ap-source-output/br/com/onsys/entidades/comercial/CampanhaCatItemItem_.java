package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Campanha;
import br.com.onsys.entidades.manufatura.CatItem;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.manufatura.SubcatItem;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CampanhaCatItemItem.class)
public class CampanhaCatItemItem_ { 

    public static volatile SingularAttribute<CampanhaCatItemItem, Item> item;
    public static volatile SingularAttribute<CampanhaCatItemItem, SubcatItem> subcatitem;
    public static volatile SingularAttribute<CampanhaCatItemItem, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CampanhaCatItemItem, CatItem> catitem;
    public static volatile SingularAttribute<CampanhaCatItemItem, Integer> id;
    public static volatile SingularAttribute<CampanhaCatItemItem, Empresa> empresa;
    public static volatile SingularAttribute<CampanhaCatItemItem, Campanha> campanha;

}