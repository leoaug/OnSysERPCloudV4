package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.manufatura.SubcatItem;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MetaPremioSubcatItem.class)
public class MetaPremioSubcatItem_ { 

    public static volatile SingularAttribute<MetaPremioSubcatItem, Integer> unidadeVendida;
    public static volatile SingularAttribute<MetaPremioSubcatItem, BigDecimal> metaDe80Ate90;
    public static volatile SingularAttribute<MetaPremioSubcatItem, SubcatItem> subcatitem;
    public static volatile SingularAttribute<MetaPremioSubcatItem, BigDecimal> metaAbaixo80;
    public static volatile SingularAttribute<MetaPremioSubcatItem, Representante> representante;
    public static volatile SingularAttribute<MetaPremioSubcatItem, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MetaPremioSubcatItem, Integer> id;
    public static volatile SingularAttribute<MetaPremioSubcatItem, BigDecimal> bonusAcima105;
    public static volatile SingularAttribute<MetaPremioSubcatItem, Empresa> empresa;
    public static volatile SingularAttribute<MetaPremioSubcatItem, BigDecimal> premiacao;
    public static volatile SingularAttribute<MetaPremioSubcatItem, BigDecimal> metaDe90Ate100;

}