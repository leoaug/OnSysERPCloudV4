package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamControladoria.class)
public class ParamControladoria_ { 

    public static volatile SingularAttribute<ParamControladoria, String> obs;
    public static volatile SingularAttribute<ParamControladoria, Date> periniaberto;
    public static volatile SingularAttribute<ParamControladoria, String> formatocentrocusto;
    public static volatile SingularAttribute<ParamControladoria, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamControladoria, String> formatoconta;
    public static volatile SingularAttribute<ParamControladoria, String> deletado;
    public static volatile SingularAttribute<ParamControladoria, String> inativo;
    public static volatile SingularAttribute<ParamControladoria, Integer> id;
    public static volatile SingularAttribute<ParamControladoria, Empresa> empresa;
    public static volatile SingularAttribute<ParamControladoria, Date> perfimaberto;
    public static volatile SingularAttribute<ParamControladoria, Date> datainativo;

}