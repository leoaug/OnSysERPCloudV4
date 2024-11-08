package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SubcatItem.class)
public class SubcatItem_ { 

    public static volatile SingularAttribute<SubcatItem, String> obs;
    public static volatile SingularAttribute<SubcatItem, String> codigo;
    public static volatile SingularAttribute<SubcatItem, String> backgroundColor;
    public static volatile SingularAttribute<SubcatItem, Integer> unidadeVendida;
    public static volatile SingularAttribute<SubcatItem, BigDecimal> metaDe80Ate90;
    public static volatile SingularAttribute<SubcatItem, String> deletado;
    public static volatile SingularAttribute<SubcatItem, String> modificado;
    public static volatile SingularAttribute<SubcatItem, BigDecimal> bonusAcima105;
    public static volatile SingularAttribute<SubcatItem, Date> datainativo;
    public static volatile SingularAttribute<SubcatItem, BigDecimal> premiacao;
    public static volatile SingularAttribute<SubcatItem, String> descricao;
    public static volatile SingularAttribute<SubcatItem, BigDecimal> metaDe90Ate100;
    public static volatile SingularAttribute<SubcatItem, BigDecimal> metaAbaixo80;
    public static volatile SingularAttribute<SubcatItem, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SubcatItem, String> inativo;
    public static volatile SingularAttribute<SubcatItem, Integer> id;
    public static volatile SingularAttribute<SubcatItem, Empresa> empresa;
    public static volatile SingularAttribute<SubcatItem, String> fontColor;

}