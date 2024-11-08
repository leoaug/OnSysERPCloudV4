package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamFinanceiro.class)
public class ParamFinanceiro_ { 

    public static volatile SingularAttribute<ParamFinanceiro, String> obs;
    public static volatile SingularAttribute<ParamFinanceiro, Integer> ultDoctoFinanceiro;
    public static volatile SingularAttribute<ParamFinanceiro, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamFinanceiro, Date> dataInativo;
    public static volatile SingularAttribute<ParamFinanceiro, Date> perFimAberto;
    public static volatile SingularAttribute<ParamFinanceiro, String> deletado;
    public static volatile SingularAttribute<ParamFinanceiro, Date> perIniAberto;
    public static volatile SingularAttribute<ParamFinanceiro, String> inativo;
    public static volatile SingularAttribute<ParamFinanceiro, String> modificado;
    public static volatile SingularAttribute<ParamFinanceiro, Integer> id;
    public static volatile SingularAttribute<ParamFinanceiro, Empresa> empresa;

}