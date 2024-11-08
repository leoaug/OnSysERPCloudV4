package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamGerais.class)
public class ParamGerais_ { 

    public static volatile SingularAttribute<ParamGerais, String> obs;
    public static volatile SingularAttribute<ParamGerais, String> cadastroRapidoCliente;
    public static volatile SingularAttribute<ParamGerais, String> deletado;
    public static volatile SingularAttribute<ParamGerais, String> modificado;
    public static volatile SingularAttribute<ParamGerais, String> cadastroRapidoItem;
    public static volatile SingularAttribute<ParamGerais, String> cadastroRapidoFornecedor;
    public static volatile SingularAttribute<ParamGerais, Boolean> usacodigobarras;
    public static volatile SingularAttribute<ParamGerais, Date> datainativo;
    public static volatile SingularAttribute<ParamGerais, Boolean> validacep;
    public static volatile SingularAttribute<ParamGerais, Date> periniaberto;
    public static volatile SingularAttribute<ParamGerais, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamGerais, String> execucaoOrcamentaria;
    public static volatile SingularAttribute<ParamGerais, String> inativo;
    public static volatile SingularAttribute<ParamGerais, Integer> id;
    public static volatile SingularAttribute<ParamGerais, Empresa> empresa;
    public static volatile SingularAttribute<ParamGerais, Date> perfimaberto;
    public static volatile SingularAttribute<ParamGerais, String> versao;

}