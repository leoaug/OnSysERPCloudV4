package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.tipos.TipoCondPagamento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FormaDePagamento.class)
public class FormaDePagamento_ { 

    public static volatile SingularAttribute<FormaDePagamento, Integer> diasParaCompensar;
    public static volatile SingularAttribute<FormaDePagamento, Double> taxa;
    public static volatile SingularAttribute<FormaDePagamento, String> obs;
    public static volatile SingularAttribute<FormaDePagamento, String> codigo;
    public static volatile SingularAttribute<FormaDePagamento, TipoCondPagamento> tipo;
    public static volatile SingularAttribute<FormaDePagamento, String> deletado;
    public static volatile SingularAttribute<FormaDePagamento, String> modificado;
    public static volatile SingularAttribute<FormaDePagamento, Date> datainativo;
    public static volatile SingularAttribute<FormaDePagamento, String> descricao;
    public static volatile SingularAttribute<FormaDePagamento, Double> taxaAntecipacao;
    public static volatile SingularAttribute<FormaDePagamento, BigDecimal> descontoMaximo;
    public static volatile SingularAttribute<FormaDePagamento, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FormaDePagamento, String> inativo;
    public static volatile SingularAttribute<FormaDePagamento, Integer> id;
    public static volatile SingularAttribute<FormaDePagamento, Empresa> empresa;
    public static volatile SingularAttribute<FormaDePagamento, BigDecimal> valorMinimoDeFaturamento;

}