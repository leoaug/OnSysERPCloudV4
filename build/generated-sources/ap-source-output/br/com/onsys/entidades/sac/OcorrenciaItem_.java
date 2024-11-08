package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.sac.Ocorrencia;
import br.com.onsys.entidades.sac.OcorrenciaMotivo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OcorrenciaItem.class)
public class OcorrenciaItem_ { 

    public static volatile SingularAttribute<OcorrenciaItem, Item> item;
    public static volatile SingularAttribute<OcorrenciaItem, OcorrenciaMotivo> motivo;
    public static volatile SingularAttribute<OcorrenciaItem, Ocorrencia> ocorrencia;
    public static volatile SingularAttribute<OcorrenciaItem, BigDecimal> valorFrete;
    public static volatile SingularAttribute<OcorrenciaItem, BigDecimal> valorTotal;
    public static volatile SingularAttribute<OcorrenciaItem, Integer> id;
    public static volatile SingularAttribute<OcorrenciaItem, Double> quantidade;
    public static volatile SingularAttribute<OcorrenciaItem, BigDecimal> valorUnit;

}