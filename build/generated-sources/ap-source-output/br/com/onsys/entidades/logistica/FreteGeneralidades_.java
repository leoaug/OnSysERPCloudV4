package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Frete;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteGeneralidades.class)
public class FreteGeneralidades_ { 

    public static volatile SingularAttribute<FreteGeneralidades, String> codigo;
    public static volatile SingularAttribute<FreteGeneralidades, BigDecimal> indice;
    public static volatile SingularAttribute<FreteGeneralidades, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteGeneralidades, BigDecimal> valor;
    public static volatile SingularAttribute<FreteGeneralidades, Frete> frete;
    public static volatile SingularAttribute<FreteGeneralidades, Integer> id;
    public static volatile SingularAttribute<FreteGeneralidades, Empresa> empresa;
    public static volatile SingularAttribute<FreteGeneralidades, String> descricao;

}