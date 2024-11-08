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
@StaticMetamodel(ItemServicoDoctoEnt.class)
public class ItemServicoDoctoEnt_ { 

    public static volatile SingularAttribute<ItemServicoDoctoEnt, String> obs;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlinss;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> descprod;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlicms;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlcofins;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> issretido;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlpis;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> outrasretencoes;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, DoctoEnt> doctoent;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, String> codigobarras;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlcsll;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, Integer> id;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, PlanoContas> planoContas;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlicmsoutras;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlipi;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vliss;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, Item> item;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> ipi;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, Localizacao> localizacao;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vldeducoes;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlir;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlinssretido;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, Deposito> deposito;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> desccondicionado;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlipioutras;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> descincondicionado;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, String> modulo;
    public static volatile SingularAttribute<ItemServicoDoctoEnt, BigDecimal> vlunit;

}