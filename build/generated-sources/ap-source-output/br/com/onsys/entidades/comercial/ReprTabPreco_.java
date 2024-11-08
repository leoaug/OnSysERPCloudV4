package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.TabelaPreco;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ReprTabPreco.class)
public class ReprTabPreco_ { 

    public static volatile SingularAttribute<ReprTabPreco, Representante> representante;
    public static volatile SingularAttribute<ReprTabPreco, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ReprTabPreco, Integer> id;
    public static volatile SingularAttribute<ReprTabPreco, Empresa> empresa;
    public static volatile SingularAttribute<ReprTabPreco, TabelaPreco> tabelapreco;

}