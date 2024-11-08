package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TipoDePedido;
import br.com.onsys.entidades.tipos.TipoCondPagamento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CondPagamento.class)
public class CondPagamento_ { 

    public static volatile SingularAttribute<CondPagamento, String> obs;
    public static volatile SingularAttribute<CondPagamento, Integer> dias12;
    public static volatile SingularAttribute<CondPagamento, TipoCondPagamento> tipo;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> vlminfaturamento;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> desconto;
    public static volatile SingularAttribute<CondPagamento, Integer> dias10;
    public static volatile SingularAttribute<CondPagamento, Integer> dias11;
    public static volatile SingularAttribute<CondPagamento, Date> datainativo;
    public static volatile SingularAttribute<CondPagamento, Integer> dias9;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela3;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela2;
    public static volatile SingularAttribute<CondPagamento, Integer> dias7;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela1;
    public static volatile SingularAttribute<CondPagamento, Integer> dias8;
    public static volatile SingularAttribute<CondPagamento, Boolean> aprovacao;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela7;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela6;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela5;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela4;
    public static volatile SingularAttribute<CondPagamento, Integer> id;
    public static volatile SingularAttribute<CondPagamento, Integer> diavencimento;
    public static volatile SingularAttribute<CondPagamento, Integer> prazomedio;
    public static volatile SingularAttribute<CondPagamento, String> codigo;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela11;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela12;
    public static volatile SingularAttribute<CondPagamento, Integer> dias1;
    public static volatile SingularAttribute<CondPagamento, Integer> dias2;
    public static volatile SingularAttribute<CondPagamento, String> deletado;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela9;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela8;
    public static volatile SingularAttribute<CondPagamento, Integer> dias5;
    public static volatile SingularAttribute<CondPagamento, Integer> dias6;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> parcela10;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> custofinanceiro;
    public static volatile SingularAttribute<CondPagamento, Integer> dias3;
    public static volatile SingularAttribute<CondPagamento, String> descricao;
    public static volatile SingularAttribute<CondPagamento, Integer> dias4;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> fatorfinanciamento;
    public static volatile SingularAttribute<CondPagamento, BigDecimal> vlminparcela;
    public static volatile SingularAttribute<CondPagamento, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CondPagamento, String> inativo;
    public static volatile SingularAttribute<CondPagamento, TipoDePedido> tipodepedido;
    public static volatile SingularAttribute<CondPagamento, Empresa> empresa;

}