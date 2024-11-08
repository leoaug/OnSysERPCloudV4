package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamSAC.class)
public class ParamSAC_ { 

    public static volatile SingularAttribute<ParamSAC, Integer> ultimaocorrencia;
    public static volatile SingularAttribute<ParamSAC, Integer> ultimaocorrenciaSAC;
    public static volatile SingularAttribute<ParamSAC, Integer> ultimaocorrenciaEcommerce;
    public static volatile SingularAttribute<ParamSAC, Date> periniaberto;
    public static volatile SingularAttribute<ParamSAC, Integer> ultimaocorLogistica;
    public static volatile SingularAttribute<ParamSAC, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamSAC, Integer> id;
    public static volatile SingularAttribute<ParamSAC, Empresa> empresa;
    public static volatile SingularAttribute<ParamSAC, Date> perfimaberto;

}