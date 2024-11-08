package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.comercial.NaturezaOperacao;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemDoctoSai.class)
public class ItemDoctoSai_ { 

    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlinss;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> descprod;
    public static volatile SingularAttribute<ItemDoctoSai, DoctoSai> doctosai;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlicms;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlcofins;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> issretido;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlpis;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> outrasretencoes;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlcsll;
    public static volatile SingularAttribute<ItemDoctoSai, Integer> id;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlicmsoutras;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlipi;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vliss;
    public static volatile SingularAttribute<ItemDoctoSai, Item> item;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> ipi;
    public static volatile SingularAttribute<ItemDoctoSai, Localizacao> localizacao;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vldeducoes;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlir;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlinssretido;
    public static volatile SingularAttribute<ItemDoctoSai, Deposito> deposito;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> desccondicionado;
    public static volatile SingularAttribute<ItemDoctoSai, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlipioutras;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> descincondicionado;
    public static volatile SingularAttribute<ItemDoctoSai, BigDecimal> vlunit;

}