package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Frete;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteFaixas.class)
public class FreteFaixas_ { 

    public static volatile SingularAttribute<FreteFaixas, BigDecimal> indice;
    public static volatile SingularAttribute<FreteFaixas, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteFaixas, BigDecimal> valor;
    public static volatile SingularAttribute<FreteFaixas, Frete> frete;
    public static volatile SingularAttribute<FreteFaixas, Integer> id;
    public static volatile SingularAttribute<FreteFaixas, String> cepInicial;
    public static volatile SingularAttribute<FreteFaixas, String> cepFinal;
    public static volatile SingularAttribute<FreteFaixas, BigDecimal> pesoFinal;
    public static volatile SingularAttribute<FreteFaixas, Empresa> empresa;
    public static volatile SingularAttribute<FreteFaixas, BigDecimal> pesoInicial;

}