package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.HistoricoPadrao;
import br.com.onsys.entidades.controladoria.Lotes;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(LotesLancamentos.class)
public class LotesLancamentos_ { 

    public static volatile SingularAttribute<LotesLancamentos, Integer> sequencia;
    public static volatile SingularAttribute<LotesLancamentos, String> complemento;
    public static volatile SingularAttribute<LotesLancamentos, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<LotesLancamentos, BigDecimal> valor;
    public static volatile SingularAttribute<LotesLancamentos, String> historico;
    public static volatile SingularAttribute<LotesLancamentos, PlanoContas> conta;
    public static volatile SingularAttribute<LotesLancamentos, Lotes> lotes;
    public static volatile SingularAttribute<LotesLancamentos, Integer> id;
    public static volatile SingularAttribute<LotesLancamentos, Empresa> empresa;
    public static volatile SingularAttribute<LotesLancamentos, String> DC;
    public static volatile SingularAttribute<LotesLancamentos, HistoricoPadrao> historicopadrao;

}