package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TipoDoctoFinanceiro.class)
public class TipoDoctoFinanceiro_ { 

    public static volatile SingularAttribute<TipoDoctoFinanceiro, String> obs;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, String> codigo;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, PlanoContas> conta;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, String> deletado;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, String> modificado;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, String> inativo;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, Integer> id;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, String> tipoDocto;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, Empresa> empresa;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, Date> datainativo;
    public static volatile SingularAttribute<TipoDoctoFinanceiro, String> descricao;

}