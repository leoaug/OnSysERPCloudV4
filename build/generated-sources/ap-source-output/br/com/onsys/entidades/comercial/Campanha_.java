package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TabelaPreco;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Campanha.class)
public class Campanha_ { 

    public static volatile SingularAttribute<Campanha, String> obs;
    public static volatile SingularAttribute<Campanha, String> codigo;
    public static volatile SingularAttribute<Campanha, BigDecimal> valorminimopedido;
    public static volatile SingularAttribute<Campanha, String> deletado;
    public static volatile SingularAttribute<Campanha, String> modificado;
    public static volatile SingularAttribute<Campanha, Date> datainativo;
    public static volatile SingularAttribute<Campanha, TabelaPreco> tabelapreco;
    public static volatile SingularAttribute<Campanha, String> descricao;
    public static volatile SingularAttribute<Campanha, Date> dtfinal;
    public static volatile SingularAttribute<Campanha, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Campanha, BigDecimal> descontomax;
    public static volatile SingularAttribute<Campanha, Date> dtinicial;
    public static volatile SingularAttribute<Campanha, String> inativo;
    public static volatile SingularAttribute<Campanha, Integer> id;
    public static volatile SingularAttribute<Campanha, Empresa> empresa;

}