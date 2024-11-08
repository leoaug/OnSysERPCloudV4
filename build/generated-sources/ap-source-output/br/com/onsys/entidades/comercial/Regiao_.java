package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Regiao.class)
public class Regiao_ { 

    public static volatile SingularAttribute<Regiao, BigDecimal> perccomis;
    public static volatile SingularAttribute<Regiao, String> obs;
    public static volatile SingularAttribute<Regiao, String> codigo;
    public static volatile SingularAttribute<Regiao, String> deletado;
    public static volatile SingularAttribute<Regiao, String> modificado;
    public static volatile SingularAttribute<Regiao, Date> datainativo;
    public static volatile SingularAttribute<Regiao, BigDecimal> vlminpedido;
    public static volatile SingularAttribute<Regiao, String> descricao;
    public static volatile SingularAttribute<Regiao, BigDecimal> custocontratual;
    public static volatile SingularAttribute<Regiao, BigDecimal> percfrete;
    public static volatile SingularAttribute<Regiao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Regiao, String> inativo;
    public static volatile SingularAttribute<Regiao, Integer> id;
    public static volatile SingularAttribute<Regiao, Empresa> empresa;

}