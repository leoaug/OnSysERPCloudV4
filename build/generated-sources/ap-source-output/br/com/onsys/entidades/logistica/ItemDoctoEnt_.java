package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.comercial.NaturezaOperacao;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.DoctoEnt;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemDoctoEnt.class)
public class ItemDoctoEnt_ { 

    public static volatile SingularAttribute<ItemDoctoEnt, String> obs;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlinss;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> descprod;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlicms;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlcofins;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> issretido;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlpis;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> outrasretencoes;
    public static volatile SingularAttribute<ItemDoctoEnt, DoctoEnt> doctoent;
    public static volatile SingularAttribute<ItemDoctoEnt, String> codigobarras;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlcsll;
    public static volatile SingularAttribute<ItemDoctoEnt, Integer> id;
    public static volatile SingularAttribute<ItemDoctoEnt, PlanoContas> planoContas;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlicmsoutras;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlipi;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vliss;
    public static volatile SingularAttribute<ItemDoctoEnt, Item> item;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> ipi;
    public static volatile SingularAttribute<ItemDoctoEnt, Localizacao> localizacao;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vldeducoes;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlir;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlinssretido;
    public static volatile SingularAttribute<ItemDoctoEnt, Deposito> deposito;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> desccondicionado;
    public static volatile SingularAttribute<ItemDoctoEnt, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlipioutras;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> descincondicionado;
    public static volatile SingularAttribute<ItemDoctoEnt, String> modulo;
    public static volatile SingularAttribute<ItemDoctoEnt, BigDecimal> vlunit;

}