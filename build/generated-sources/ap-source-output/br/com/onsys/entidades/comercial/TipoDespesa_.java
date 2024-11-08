package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TipoDespesa.class)
public class TipoDespesa_ { 

    public static volatile SingularAttribute<TipoDespesa, String> obs;
    public static volatile SingularAttribute<TipoDespesa, String> codigo;
    public static volatile SingularAttribute<TipoDespesa, String> tipo;
    public static volatile SingularAttribute<TipoDespesa, BigDecimal> indice;
    public static volatile SingularAttribute<TipoDespesa, PlanoContas> conta;
    public static volatile SingularAttribute<TipoDespesa, String> deletado;
    public static volatile SingularAttribute<TipoDespesa, String> modificado;
    public static volatile SingularAttribute<TipoDespesa, Date> datainativo;
    public static volatile SingularAttribute<TipoDespesa, String> descricao;
    public static volatile SingularAttribute<TipoDespesa, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TipoDespesa, String> inativo;
    public static volatile SingularAttribute<TipoDespesa, Integer> id;
    public static volatile SingularAttribute<TipoDespesa, Empresa> empresa;
    public static volatile SingularAttribute<TipoDespesa, String> tipousr;

}