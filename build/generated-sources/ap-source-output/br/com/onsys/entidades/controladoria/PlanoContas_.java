package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.tipos.GrupoContaContabil;
import br.com.onsys.entidades.tipos.NaturezaContaContabil;
import br.com.onsys.entidades.tipos.TipoConta;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PlanoContas.class)
public class PlanoContas_ { 

    public static volatile SingularAttribute<PlanoContas, String> obs;
    public static volatile SingularAttribute<PlanoContas, TipoConta> tipo;
    public static volatile SingularAttribute<PlanoContas, Date> dataaltera;
    public static volatile SingularAttribute<PlanoContas, PlanoContas> contapai;
    public static volatile SingularAttribute<PlanoContas, Boolean> totalizadora;
    public static volatile SingularAttribute<PlanoContas, Date> datacadastro;
    public static volatile SingularAttribute<PlanoContas, String> conta;
    public static volatile SingularAttribute<PlanoContas, GrupoContaContabil> grupo;
    public static volatile SingularAttribute<PlanoContas, String> deletado;
    public static volatile SingularAttribute<PlanoContas, PlanoContas> contatotalizadora;
    public static volatile SingularAttribute<PlanoContas, Date> datainativo;
    public static volatile SingularAttribute<PlanoContas, String> descricao;
    public static volatile SingularAttribute<PlanoContas, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PlanoContas, Integer> reduzida;
    public static volatile SingularAttribute<PlanoContas, BigDecimal> valorOrcado;
    public static volatile SingularAttribute<PlanoContas, String> inativo;
    public static volatile SingularAttribute<PlanoContas, Integer> id;
    public static volatile SingularAttribute<PlanoContas, NaturezaContaContabil> natureza;
    public static volatile SingularAttribute<PlanoContas, Empresa> empresa;

}