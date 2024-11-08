package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.CondPagamento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParcelaCondPagto.class)
public class ParcelaCondPagto_ { 

    public static volatile SingularAttribute<ParcelaCondPagto, CondPagamento> condpagamento;
    public static volatile SingularAttribute<ParcelaCondPagto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParcelaCondPagto, Integer> dias;
    public static volatile SingularAttribute<ParcelaCondPagto, BigDecimal> percparcela;
    public static volatile SingularAttribute<ParcelaCondPagto, Integer> id;
    public static volatile SingularAttribute<ParcelaCondPagto, Empresa> empresa;
    public static volatile SingularAttribute<ParcelaCondPagto, Integer> parcela;

}