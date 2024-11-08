package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamSuporte.class)
public class ParamSuporte_ { 

    public static volatile SingularAttribute<ParamSuporte, String> obs;
    public static volatile SingularAttribute<ParamSuporte, Date> periniaberto;
    public static volatile SingularAttribute<ParamSuporte, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamSuporte, Integer> ultimochamado;
    public static volatile SingularAttribute<ParamSuporte, String> deletado;
    public static volatile SingularAttribute<ParamSuporte, String> inativo;
    public static volatile SingularAttribute<ParamSuporte, String> modificado;
    public static volatile SingularAttribute<ParamSuporte, Integer> id;
    public static volatile SingularAttribute<ParamSuporte, Empresa> empresa;
    public static volatile SingularAttribute<ParamSuporte, Date> perfimaberto;
    public static volatile SingularAttribute<ParamSuporte, Date> datainativo;

}