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
@StaticMetamodel(ItemAtivoFixoDoctoEnt.class)
public class ItemAtivoFixoDoctoEnt_ { 

    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, String> obs;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlinss;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> descprod;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlicms;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlcofins;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> issretido;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlpis;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> outrasretencoes;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, DoctoEnt> doctoent;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, String> codigobarras;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlcsll;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, Integer> id;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, PlanoContas> planoContas;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlicmsoutras;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlipi;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vliss;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, Item> item;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> ipi;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, Localizacao> localizacao;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vldeducoes;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlir;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlinssretido;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, Deposito> deposito;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> desccondicionado;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlipioutras;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> descincondicionado;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, String> modulo;
    public static volatile SingularAttribute<ItemAtivoFixoDoctoEnt, BigDecimal> vlunit;

}