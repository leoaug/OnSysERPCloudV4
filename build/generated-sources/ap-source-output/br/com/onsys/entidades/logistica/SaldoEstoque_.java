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
@StaticMetamodel(SaldoEstoque.class)
public class SaldoEstoque_ { 

    public static volatile SingularAttribute<SaldoEstoque, Double> vlggf;
    public static volatile SingularAttribute<SaldoEstoque, Item> item;
    public static volatile SingularAttribute<SaldoEstoque, Localizacao> localizacao;
    public static volatile SingularAttribute<SaldoEstoque, Deposito> deposito;
    public static volatile SingularAttribute<SaldoEstoque, Double> vlUnit;
    public static volatile SingularAttribute<SaldoEstoque, Double> vlunitmob;
    public static volatile SingularAttribute<SaldoEstoque, Double> vlunitmat;
    public static volatile SingularAttribute<SaldoEstoque, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SaldoEstoque, Double> vlSaldo;
    public static volatile SingularAttribute<SaldoEstoque, Double> vlunitggf;
    public static volatile SingularAttribute<SaldoEstoque, Integer> id;
    public static volatile SingularAttribute<SaldoEstoque, Double> vlmob;
    public static volatile SingularAttribute<SaldoEstoque, Double> vlmat;
    public static volatile SingularAttribute<SaldoEstoque, Empresa> empresa;
    public static volatile SingularAttribute<SaldoEstoque, Double> quantidade;

}