package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TabFinanciamento.class)
public class TabFinanciamento_ { 

    public static volatile SingularAttribute<TabFinanciamento, String> codigo;
    public static volatile SingularAttribute<TabFinanciamento, BigDecimal> Fator;
    public static volatile SingularAttribute<TabFinanciamento, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TabFinanciamento, Integer> id;
    public static volatile SingularAttribute<TabFinanciamento, Empresa> empresa;
    public static volatile SingularAttribute<TabFinanciamento, String> descricao;

}