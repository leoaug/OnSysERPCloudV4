package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TabelaPreco;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemTabelaPauta.class)
public class ItemTabelaPauta_ { 

    public static volatile SingularAttribute<ItemTabelaPauta, BigDecimal> preco;
    public static volatile SingularAttribute<ItemTabelaPauta, TabelaPreco> tabelapauta;
    public static volatile SingularAttribute<ItemTabelaPauta, Item> item;
    public static volatile SingularAttribute<ItemTabelaPauta, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemTabelaPauta, Integer> id;
    public static volatile SingularAttribute<ItemTabelaPauta, Empresa> empresa;

}