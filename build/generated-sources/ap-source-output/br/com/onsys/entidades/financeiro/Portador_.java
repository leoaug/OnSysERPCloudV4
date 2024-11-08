package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.financeiro.BcoFebraban;
import br.com.onsys.entidades.financeiro.Moeda;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Portador.class)
public class Portador_ { 

    public static volatile SingularAttribute<Portador, String> obs;
    public static volatile SingularAttribute<Portador, String> codigo;
    public static volatile SingularAttribute<Portador, String> chavePix;
    public static volatile SingularAttribute<Portador, String> codigocedente;
    public static volatile SingularAttribute<Portador, String> conta;
    public static volatile SingularAttribute<Portador, BcoFebraban> banco;
    public static volatile SingularAttribute<Portador, String> deletado;
    public static volatile SingularAttribute<Portador, String> modificado;
    public static volatile SingularAttribute<Portador, String> especiedoc;
    public static volatile SingularAttribute<Portador, BigDecimal> saldo;
    public static volatile SingularAttribute<Portador, String> statusPDV;
    public static volatile SingularAttribute<Portador, Usuario> operadorpdv;
    public static volatile SingularAttribute<Portador, String> agencia;
    public static volatile SingularAttribute<Portador, Date> datainativo;
    public static volatile SingularAttribute<Portador, String> descricao;
    public static volatile SingularAttribute<Portador, Moeda> moeda;
    public static volatile SingularAttribute<Portador, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Portador, String> carteira;
    public static volatile SingularAttribute<Portador, PlanoContas> contaativo;
    public static volatile SingularAttribute<Portador, String> inativo;
    public static volatile SingularAttribute<Portador, Integer> id;
    public static volatile SingularAttribute<Portador, String> digitocedente;
    public static volatile SingularAttribute<Portador, Empresa> empresa;
    public static volatile SingularAttribute<Portador, String> modalidade;

}