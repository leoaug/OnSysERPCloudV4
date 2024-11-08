package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
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
@StaticMetamodel(ParamAR.class)
public class ParamAR_ { 

    public static volatile SingularAttribute<ParamAR, Participante> cliente;
    public static volatile SingularAttribute<ParamAR, Date> periniaberto;
    public static volatile SingularAttribute<ParamAR, Moeda> moeda;
    public static volatile SingularAttribute<ParamAR, CondPagamento> condpagamento;
    public static volatile SingularAttribute<ParamAR, TipoDoctoFinanceiro> tipodoctofin;
    public static volatile SingularAttribute<ParamAR, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamAR, Portador> portador;
    public static volatile SingularAttribute<ParamAR, Integer> id;
    public static volatile SingularAttribute<ParamAR, TipoDoctoLogistica> tipodoctolog;
    public static volatile SingularAttribute<ParamAR, Empresa> empresa;
    public static volatile SingularAttribute<ParamAR, Boolean> diasuteis;
    public static volatile SingularAttribute<ParamAR, Date> perfimaberto;

}