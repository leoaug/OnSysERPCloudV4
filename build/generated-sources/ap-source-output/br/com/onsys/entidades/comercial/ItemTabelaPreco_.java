package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TabelaPreco;
import br.com.onsys.entidades.manufatura.ComponenteConfigurado;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemTabelaPreco.class)
public class ItemTabelaPreco_ { 

    public static volatile SingularAttribute<ItemTabelaPreco, BigDecimal> precofob;
    public static volatile SingularAttribute<ItemTabelaPreco, Item> item;
    public static volatile SingularAttribute<ItemTabelaPreco, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemTabelaPreco, ComponenteConfigurado> componenteConfigurado;
    public static volatile SingularAttribute<ItemTabelaPreco, BigDecimal> basecomis;
    public static volatile SingularAttribute<ItemTabelaPreco, TabelaPreco> tabelapreco;
    public static volatile SingularAttribute<ItemTabelaPreco, BigDecimal> preco;
    public static volatile SingularAttribute<ItemTabelaPreco, BigDecimal> precominfob;
    public static volatile SingularAttribute<ItemTabelaPreco, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemTabelaPreco, BigDecimal> precomincif;
    public static volatile SingularAttribute<ItemTabelaPreco, Integer> id;
    public static volatile SingularAttribute<ItemTabelaPreco, BigDecimal> precocif;
    public static volatile SingularAttribute<ItemTabelaPreco, Empresa> empresa;

}