package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TabRentabilidade.class)
public class TabRentabilidade_ { 

    public static volatile SingularAttribute<TabRentabilidade, String> codigo;
    public static volatile SingularAttribute<TabRentabilidade, Date> datavalini;
    public static volatile SingularAttribute<TabRentabilidade, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TabRentabilidade, Integer> id;
    public static volatile SingularAttribute<TabRentabilidade, Date> datavalfim;
    public static volatile SingularAttribute<TabRentabilidade, Empresa> empresa;
    public static volatile SingularAttribute<TabRentabilidade, String> descricao;

}