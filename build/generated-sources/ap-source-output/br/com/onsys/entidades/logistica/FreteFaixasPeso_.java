package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.FreteFaixasCEP;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteFaixasPeso.class)
public class FreteFaixasPeso_ { 

    public static volatile SingularAttribute<FreteFaixasPeso, BigDecimal> indice;
    public static volatile SingularAttribute<FreteFaixasPeso, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteFaixasPeso, BigDecimal> valor;
    public static volatile SingularAttribute<FreteFaixasPeso, FreteFaixasCEP> freteFaixasCEP;
    public static volatile SingularAttribute<FreteFaixasPeso, Integer> id;
    public static volatile SingularAttribute<FreteFaixasPeso, BigDecimal> pesoFinal;
    public static volatile SingularAttribute<FreteFaixasPeso, Empresa> empresa;
    public static volatile SingularAttribute<FreteFaixasPeso, BigDecimal> pesoInicial;

}