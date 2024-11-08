package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamAdmProjetos.class)
public class ParamAdmProjetos_ { 

    public static volatile SingularAttribute<ParamAdmProjetos, String> obs;
    public static volatile SingularAttribute<ParamAdmProjetos, Date> periniaberto;
    public static volatile SingularAttribute<ParamAdmProjetos, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamAdmProjetos, String> deletado;
    public static volatile SingularAttribute<ParamAdmProjetos, String> inativo;
    public static volatile SingularAttribute<ParamAdmProjetos, String> modificado;
    public static volatile SingularAttribute<ParamAdmProjetos, Integer> id;
    public static volatile SingularAttribute<ParamAdmProjetos, Integer> ultimafa;
    public static volatile SingularAttribute<ParamAdmProjetos, Empresa> empresa;
    public static volatile SingularAttribute<ParamAdmProjetos, Date> perfimaberto;
    public static volatile SingularAttribute<ParamAdmProjetos, Date> datainativo;

}