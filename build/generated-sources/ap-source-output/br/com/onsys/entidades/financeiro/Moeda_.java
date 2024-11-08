package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Moeda.class)
public class Moeda_ { 

    public static volatile SingularAttribute<Moeda, String> simbolo;
    public static volatile SingularAttribute<Moeda, String> obs;
    public static volatile SingularAttribute<Moeda, String> codigo;
    public static volatile SingularAttribute<Moeda, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Moeda, String> deletado;
    public static volatile SingularAttribute<Moeda, String> modificado;
    public static volatile SingularAttribute<Moeda, String> inativo;
    public static volatile SingularAttribute<Moeda, Integer> id;
    public static volatile SingularAttribute<Moeda, BigDecimal> cotacao;
    public static volatile SingularAttribute<Moeda, Empresa> empresa;
    public static volatile SingularAttribute<Moeda, Date> datainativo;
    public static volatile SingularAttribute<Moeda, String> descricao;

}