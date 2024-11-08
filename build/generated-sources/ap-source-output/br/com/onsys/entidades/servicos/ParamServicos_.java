package br.com.onsys.entidades.servicos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamServicos.class)
public class ParamServicos_ { 

    public static volatile SingularAttribute<ParamServicos, String> obs;
    public static volatile SingularAttribute<ParamServicos, Date> periniaberto;
    public static volatile SingularAttribute<ParamServicos, Integer> ultimaos;
    public static volatile SingularAttribute<ParamServicos, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamServicos, String> deletado;
    public static volatile SingularAttribute<ParamServicos, String> inativo;
    public static volatile SingularAttribute<ParamServicos, String> modificado;
    public static volatile SingularAttribute<ParamServicos, Integer> id;
    public static volatile SingularAttribute<ParamServicos, Empresa> empresa;
    public static volatile SingularAttribute<ParamServicos, Date> perfimaberto;
    public static volatile SingularAttribute<ParamServicos, Date> datainativo;

}