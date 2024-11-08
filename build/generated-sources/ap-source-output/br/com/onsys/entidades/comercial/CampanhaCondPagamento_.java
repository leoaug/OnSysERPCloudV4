package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Campanha;
import br.com.onsys.entidades.comercial.CondPagamento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CampanhaCondPagamento.class)
public class CampanhaCondPagamento_ { 

    public static volatile SingularAttribute<CampanhaCondPagamento, CondPagamento> condpagamento;
    public static volatile SingularAttribute<CampanhaCondPagamento, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CampanhaCondPagamento, Integer> id;
    public static volatile SingularAttribute<CampanhaCondPagamento, Empresa> empresa;
    public static volatile SingularAttribute<CampanhaCondPagamento, Campanha> campanha;

}