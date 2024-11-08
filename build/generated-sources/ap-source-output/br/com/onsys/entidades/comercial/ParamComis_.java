package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamComis.class)
public class ParamComis_ { 

    public static volatile SingularAttribute<ParamComis, Date> dtcomisini;
    public static volatile SingularAttribute<ParamComis, String> ano;
    public static volatile SingularAttribute<ParamComis, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamComis, Date> dtcomisfim;
    public static volatile SingularAttribute<ParamComis, String> mes;
    public static volatile SingularAttribute<ParamComis, Integer> id;
    public static volatile SingularAttribute<ParamComis, String> basecomis;
    public static volatile SingularAttribute<ParamComis, Empresa> empresa;

}