package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.FreteFaixasCEP;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteFaixasPesoOrdenado.class)
public class FreteFaixasPesoOrdenado_ { 

    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, BigDecimal> indice;
    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, BigDecimal> valor;
    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, FreteFaixasCEP> freteFaixasCEP;
    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, Integer> id;
    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, BigDecimal> pesoFinal;
    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, Empresa> empresa;
    public static volatile SingularAttribute<FreteFaixasPesoOrdenado, BigDecimal> pesoInicial;

}