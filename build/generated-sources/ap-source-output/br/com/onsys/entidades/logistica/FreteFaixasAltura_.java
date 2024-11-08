package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.FreteFaixasCEP;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteFaixasAltura.class)
public class FreteFaixasAltura_ { 

    public static volatile SingularAttribute<FreteFaixasAltura, BigDecimal> indice;
    public static volatile SingularAttribute<FreteFaixasAltura, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteFaixasAltura, BigDecimal> valor;
    public static volatile SingularAttribute<FreteFaixasAltura, FreteFaixasCEP> freteFaixasCEP;
    public static volatile SingularAttribute<FreteFaixasAltura, Integer> id;
    public static volatile SingularAttribute<FreteFaixasAltura, BigDecimal> alturaInicial;
    public static volatile SingularAttribute<FreteFaixasAltura, BigDecimal> alturaFinal;
    public static volatile SingularAttribute<FreteFaixasAltura, Empresa> empresa;

}