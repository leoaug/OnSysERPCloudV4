package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Frete;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteFaixasGeneralidades.class)
public class FreteFaixasGeneralidades_ { 

    public static volatile SingularAttribute<FreteFaixasGeneralidades, BigDecimal> indice;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, BigDecimal> valor;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, Frete> frete;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, Integer> id;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, String> cepInicial;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, String> cepFinal;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, BigDecimal> pesoFinal;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, Empresa> empresa;
    public static volatile SingularAttribute<FreteFaixasGeneralidades, BigDecimal> pesoInicial;

}