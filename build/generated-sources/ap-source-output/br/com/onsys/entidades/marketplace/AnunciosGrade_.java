package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Grade;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.marketplace.Anuncios;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(AnunciosGrade.class)
public class AnunciosGrade_ { 

    public static volatile SingularAttribute<AnunciosGrade, String> gtin;
    public static volatile SingularAttribute<AnunciosGrade, BigDecimal> precoVenda;
    public static volatile SingularAttribute<AnunciosGrade, Item> item;
    public static volatile SingularAttribute<AnunciosGrade, Anuncios> anuncios;
    public static volatile SingularAttribute<AnunciosGrade, BigDecimal> custo;
    public static volatile SingularAttribute<AnunciosGrade, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<AnunciosGrade, Grade> grade;
    public static volatile SingularAttribute<AnunciosGrade, Integer> id;
    public static volatile SingularAttribute<AnunciosGrade, String> skuVariacao;
    public static volatile SingularAttribute<AnunciosGrade, Empresa> empresa;
    public static volatile SingularAttribute<AnunciosGrade, Integer> quantidade;

}