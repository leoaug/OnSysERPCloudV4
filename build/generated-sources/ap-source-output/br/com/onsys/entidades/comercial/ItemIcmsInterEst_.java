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
@StaticMetamodel(ItemIcmsInterEst.class)
public class ItemIcmsInterEst_ { 

    public static volatile SingularAttribute<ItemIcmsInterEst, Item> item;
    public static volatile SingularAttribute<ItemIcmsInterEst, BigDecimal> aliqfcp;
    public static volatile SingularAttribute<ItemIcmsInterEst, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemIcmsInterEst, Estado> estadodestino;
    public static volatile SingularAttribute<ItemIcmsInterEst, BigDecimal> icmsinterest;
    public static volatile SingularAttribute<ItemIcmsInterEst, Integer> id;
    public static volatile SingularAttribute<ItemIcmsInterEst, BigDecimal> aliqfcpst;
    public static volatile SingularAttribute<ItemIcmsInterEst, Empresa> empresa;
    public static volatile SingularAttribute<ItemIcmsInterEst, Estado> estadoorigem;

}