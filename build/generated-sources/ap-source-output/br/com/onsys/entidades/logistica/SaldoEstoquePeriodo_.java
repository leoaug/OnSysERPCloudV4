package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.manufatura.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SaldoEstoquePeriodo.class)
public class SaldoEstoquePeriodo_ { 

    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlmatInicial;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlggf;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Item> item;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Integer> ano;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Localizacao> localizacao;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlunitmobInicial;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Deposito> deposito;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlUnit;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlunitmatInicial;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> quantidadeInicial;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlunitmat;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlunitmob;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlSaldo;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlggfInicial;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Integer> mes;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlunitggf;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Integer> id;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlmat;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlmob;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Empresa> empresa;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> quantidade;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlunitggfInicial;
    public static volatile SingularAttribute<SaldoEstoquePeriodo, Double> vlmobInicial;

}