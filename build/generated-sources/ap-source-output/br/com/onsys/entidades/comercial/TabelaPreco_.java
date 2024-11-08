package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TipoDePedido;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TabelaPreco.class)
public class TabelaPreco_ { 

    public static volatile SingularAttribute<TabelaPreco, String> obs;
    public static volatile SingularAttribute<TabelaPreco, String> codigo;
    public static volatile SingularAttribute<TabelaPreco, Boolean> ipi;
    public static volatile SingularAttribute<TabelaPreco, Date> datavalini;
    public static volatile SingularAttribute<TabelaPreco, BigDecimal> comissaoMinima;
    public static volatile SingularAttribute<TabelaPreco, String> deletado;
    public static volatile SingularAttribute<TabelaPreco, String> modificado;
    public static volatile SingularAttribute<TabelaPreco, Date> datainativo;
    public static volatile SingularAttribute<TabelaPreco, String> descricao;
    public static volatile SingularAttribute<TabelaPreco, BigDecimal> comissao;
    public static volatile SingularAttribute<TabelaPreco, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TabelaPreco, String> inativo;
    public static volatile SingularAttribute<TabelaPreco, Integer> id;
    public static volatile SingularAttribute<TabelaPreco, Date> datavalfim;
    public static volatile SingularAttribute<TabelaPreco, TipoDePedido> tipodepedido;
    public static volatile SingularAttribute<TabelaPreco, Empresa> empresa;

}