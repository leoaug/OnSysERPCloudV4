package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.comercial.Regiao;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Microrregiao.class)
public class Microrregiao_ { 

    public static volatile SingularAttribute<Microrregiao, String> obs;
    public static volatile SingularAttribute<Microrregiao, String> codigo;
    public static volatile SingularAttribute<Microrregiao, Estado> estado;
    public static volatile SingularAttribute<Microrregiao, BigDecimal> percfrete;
    public static volatile SingularAttribute<Microrregiao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Microrregiao, String> modificado;
    public static volatile SingularAttribute<Microrregiao, String> inativo;
    public static volatile SingularAttribute<Microrregiao, Regiao> regiao;
    public static volatile SingularAttribute<Microrregiao, Integer> id;
    public static volatile SingularAttribute<Microrregiao, Empresa> empresa;
    public static volatile SingularAttribute<Microrregiao, Date> datainativo;
    public static volatile SingularAttribute<Microrregiao, String> descricao;

}