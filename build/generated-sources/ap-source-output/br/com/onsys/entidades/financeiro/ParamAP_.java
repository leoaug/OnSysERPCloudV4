package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.financeiro.Moeda;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TipoDoctoFinanceiro;
import br.com.onsys.entidades.logistica.TipoDoctoLogistica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamAP.class)
public class ParamAP_ { 

    public static volatile SingularAttribute<ParamAP, Date> periniaberto;
    public static volatile SingularAttribute<ParamAP, Moeda> moeda;
    public static volatile SingularAttribute<ParamAP, CondPagamento> condpagamento;
    public static volatile SingularAttribute<ParamAP, TipoDoctoFinanceiro> tipodoctofin;
    public static volatile SingularAttribute<ParamAP, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamAP, Portador> portador;
    public static volatile SingularAttribute<ParamAP, Integer> id;
    public static volatile SingularAttribute<ParamAP, TipoDoctoLogistica> tipodoctolog;
    public static volatile SingularAttribute<ParamAP, Empresa> empresa;
    public static volatile SingularAttribute<ParamAP, Date> perfimaberto;

}