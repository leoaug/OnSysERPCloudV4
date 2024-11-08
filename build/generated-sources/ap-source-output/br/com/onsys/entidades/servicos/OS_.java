package br.com.onsys.entidades.servicos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.EnderecoParticipante;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.financeiro.Moeda;
import br.com.onsys.entidades.financeiro.TabFinanciamento;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.tipos.TipoPagamento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OS.class)
public class OS_ { 

    public static volatile SingularAttribute<OS, String> situacao;
    public static volatile SingularAttribute<OS, BigDecimal> desconto;
    public static volatile SingularAttribute<OS, CondPagamento> condpagamento;
    public static volatile SingularAttribute<OS, BigDecimal> vltotos;
    public static volatile SingularAttribute<OS, BigDecimal> vlcomissao;
    public static volatile SingularAttribute<OS, TabFinanciamento> tabfinanciamento;
    public static volatile SingularAttribute<OS, Usuario> usuariorep;
    public static volatile SingularAttribute<OS, String> freteemitente;
    public static volatile SingularAttribute<OS, Integer> id;
    public static volatile SingularAttribute<OS, Integer> nros;
    public static volatile SingularAttribute<OS, Boolean> cotacao;
    public static volatile SingularAttribute<OS, String> nrosrepre;
    public static volatile SingularAttribute<OS, BigDecimal> vltotliqos;
    public static volatile SingularAttribute<OS, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<OS, Usuario> usrimplant;
    public static volatile SingularAttribute<OS, String> mesrefer;
    public static volatile SingularAttribute<OS, Date> dataentrega;
    public static volatile SingularAttribute<OS, String> obsos;
    public static volatile SingularAttribute<OS, Participante> cliente;
    public static volatile SingularAttribute<OS, EnderecoParticipante> enderecoparticipante;
    public static volatile SingularAttribute<OS, Moeda> moeda;
    public static volatile SingularAttribute<OS, Date> dataemissao;
    public static volatile SingularAttribute<OS, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OS, BigDecimal> perccomissao;
    public static volatile SingularAttribute<OS, Empresa> empresa;
    public static volatile SingularAttribute<OS, TipoPagamento> formapagamento;
    public static volatile SingularAttribute<OS, String> nroscli;

}