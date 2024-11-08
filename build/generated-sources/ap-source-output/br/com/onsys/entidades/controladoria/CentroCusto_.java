package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CentroCusto.class)
public class CentroCusto_ { 

    public static volatile SingularAttribute<CentroCusto, Boolean> ocorrenciaLogistica;
    public static volatile SingularAttribute<CentroCusto, String> obs;
    public static volatile SingularAttribute<CentroCusto, String> codigo;
    public static volatile SingularAttribute<CentroCusto, Boolean> ocorrenciaDevolucao;
    public static volatile SingularAttribute<CentroCusto, String> emailSAC;
    public static volatile SingularAttribute<CentroCusto, String> emailEcommerce;
    public static volatile SingularAttribute<CentroCusto, String> deletado;
    public static volatile SingularAttribute<CentroCusto, String> modificado;
    public static volatile SingularAttribute<CentroCusto, String> emailDevolucao;
    public static volatile SingularAttribute<CentroCusto, Boolean> ocorrenciaEcommerce;
    public static volatile SingularAttribute<CentroCusto, Date> datainativo;
    public static volatile SingularAttribute<CentroCusto, String> descricao;
    public static volatile SingularAttribute<CentroCusto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CentroCusto, String> inativo;
    public static volatile SingularAttribute<CentroCusto, Integer> id;
    public static volatile SingularAttribute<CentroCusto, Empresa> empresa;
    public static volatile SingularAttribute<CentroCusto, Boolean> ocorrenciaSAC;

}