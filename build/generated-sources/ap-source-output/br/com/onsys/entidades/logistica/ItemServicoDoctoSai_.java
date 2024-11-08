package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.comercial.NaturezaOperacao;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemServicoDoctoSai.class)
public class ItemServicoDoctoSai_ { 

    public static volatile SingularAttribute<ItemServicoDoctoSai, String> obs;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlinss;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> descprod;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlicms;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlcofins;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> issretido;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlpis;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> outrasretencoes;
    public static volatile SingularAttribute<ItemServicoDoctoSai, String> codigobarras;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlcsll;
    public static volatile SingularAttribute<ItemServicoDoctoSai, Integer> id;
    public static volatile SingularAttribute<ItemServicoDoctoSai, PlanoContas> planoContas;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlicmsoutras;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlipi;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vliss;
    public static volatile SingularAttribute<ItemServicoDoctoSai, Item> item;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> ipi;
    public static volatile SingularAttribute<ItemServicoDoctoSai, Localizacao> localizacao;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vldeducoes;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<ItemServicoDoctoSai, DoctoSai> doctoSai;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlir;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlinssretido;
    public static volatile SingularAttribute<ItemServicoDoctoSai, Deposito> deposito;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> desccondicionado;
    public static volatile SingularAttribute<ItemServicoDoctoSai, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlipioutras;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> descincondicionado;
    public static volatile SingularAttribute<ItemServicoDoctoSai, String> modulo;
    public static volatile SingularAttribute<ItemServicoDoctoSai, BigDecimal> vlunit;

}