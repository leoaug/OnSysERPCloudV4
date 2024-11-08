package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.ComponenteConfigurado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ComponenteConfigurado.class)
public class ComponenteConfigurado_ { 

    public static volatile SingularAttribute<ComponenteConfigurado, String> obs;
    public static volatile SingularAttribute<ComponenteConfigurado, String> deletado;
    public static volatile SingularAttribute<ComponenteConfigurado, BigDecimal> adicionalValor;
    public static volatile SingularAttribute<ComponenteConfigurado, ComponenteConfigurado> componentePai;
    public static volatile SingularAttribute<ComponenteConfigurado, Date> datainativo;
    public static volatile SingularAttribute<ComponenteConfigurado, BigDecimal> adicionalPercentual;
    public static volatile SingularAttribute<ComponenteConfigurado, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ComponenteConfigurado, Boolean> informaPreco;
    public static volatile SingularAttribute<ComponenteConfigurado, String> tipoComponente;
    public static volatile SingularAttribute<ComponenteConfigurado, String> inativo;
    public static volatile SingularAttribute<ComponenteConfigurado, Integer> id;
    public static volatile SingularAttribute<ComponenteConfigurado, String> componente;
    public static volatile SingularAttribute<ComponenteConfigurado, Empresa> empresa;

}