package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.CanalVenda;
import br.com.onsys.entidades.comercial.CatCliente;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.comercial.Microrregiao;
import br.com.onsys.entidades.comercial.NaturezaOperacao;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.SubcatCliente;
import br.com.onsys.entidades.comercial.TabelaPreco;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import br.com.onsys.entidades.financeiro.BcoFebraban;
import br.com.onsys.entidades.financeiro.CatFluxoCaixa;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TabFinanciamento;
import br.com.onsys.entidades.financeiro.TipoDoctoFinanceiro;
import br.com.onsys.entidades.logistica.AreaTransporte;
import br.com.onsys.entidades.logistica.TipoDoctoLogistica;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.projetos.Projeto;
import br.com.onsys.entidades.suprimentos.CatFornecedor;
import br.com.onsys.entidades.suprimentos.Comprador;
import br.com.onsys.entidades.suprimentos.SubcatFornecedor;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Participante.class)
public class Participante_ { 

    public static volatile SingularAttribute<Participante, String> obs;
    public static volatile SingularAttribute<Participante, CatFornecedor> catfornecedor;
    public static volatile SingularAttribute<Participante, String> tipo;
    public static volatile SingularAttribute<Participante, Boolean> contratoAtivo;
    public static volatile SingularAttribute<Participante, CondPagamento> condpagamento;
    public static volatile SingularAttribute<Participante, BigDecimal> limitecredito;
    public static volatile SingularAttribute<Participante, String> situacaocredito;
    public static volatile SingularAttribute<Participante, PlanoContas> contaresultado;
    public static volatile SingularAttribute<Participante, SubcatFornecedor> subcatfornecedor;
    public static volatile SingularAttribute<Participante, TipoDoctoLogistica> tipodoctolog;
    public static volatile SingularAttribute<Participante, String> mesAniversarioContrato;
    public static volatile SingularAttribute<Participante, CanalVenda> canalvenda;
    public static volatile SingularAttribute<Participante, TabelaPreco> tabelapreco;
    public static volatile SingularAttribute<Participante, Date> modificacao;
    public static volatile SingularAttribute<Participante, String> uf;
    public static volatile SingularAttribute<Participante, String> tipoconta;
    public static volatile SingularAttribute<Participante, String> complemento;
    public static volatile SingularAttribute<Participante, TabFinanciamento> tabfinanciamento;
    public static volatile SingularAttribute<Participante, AreaTransporte> areatransporte;
    public static volatile SingularAttribute<Participante, BigDecimal> descontomax;
    public static volatile SingularAttribute<Participante, byte[]> logo;
    public static volatile SingularAttribute<Participante, Integer> id;
    public static volatile SingularAttribute<Participante, String> natureza;
    public static volatile SingularAttribute<Participante, String> ie;
    public static volatile SingularAttribute<Participante, String> contato;
    public static volatile SingularAttribute<Participante, Date> dtFimContrato;
    public static volatile SingularAttribute<Participante, BigDecimal> perccomis;
    public static volatile SingularAttribute<Participante, String> suframa;
    public static volatile SingularAttribute<Participante, String> codigo;
    public static volatile SingularAttribute<Participante, Item> item;
    public static volatile SingularAttribute<Participante, BigDecimal> markup;
    public static volatile SingularAttribute<Participante, String> im;
    public static volatile SingularAttribute<Participante, String> bairro;
    public static volatile SingularAttribute<Participante, Date> datacadastro;
    public static volatile SingularAttribute<Participante, String> cod_cep;
    public static volatile SingularAttribute<Participante, String> deletado;
    public static volatile SingularAttribute<Participante, BcoFebraban> banco;
    public static volatile SingularAttribute<Participante, Date> ultimavisita;
    public static volatile SingularAttribute<Participante, String> razaosocial;
    public static volatile SingularAttribute<Participante, BigDecimal> custocontratual;
    public static volatile SingularAttribute<Participante, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<Participante, Projeto> projeto;
    public static volatile SingularAttribute<Participante, BigDecimal> percfrete;
    public static volatile SingularAttribute<Participante, String> rg;
    public static volatile SingularAttribute<Participante, NaturezaOperacao> naturezaoperacaoIE;
    public static volatile SingularAttribute<Participante, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Participante, Portador> portador;
    public static volatile SingularAttribute<Participante, String> obsCRM;
    public static volatile SingularAttribute<Participante, Comprador> comprador;
    public static volatile SingularAttribute<Participante, Empresa> empresa;
    public static volatile SingularAttribute<Participante, Boolean> recebeEmail;
    public static volatile SingularAttribute<Participante, String> formapagamento;
    public static volatile SingularAttribute<Participante, String> maladireta;
    public static volatile SingularAttribute<Participante, String> conceitocrm;
    public static volatile SingularAttribute<Participante, BigDecimal> descontoContrato;
    public static volatile SingularAttribute<Participante, String> cidade;
    public static volatile SingularAttribute<Participante, Date> dtTerminoLiminar;
    public static volatile SingularAttribute<Participante, String> numero;
    public static volatile SingularAttribute<Participante, TipoDoctoFinanceiro> tipodoctofin;
    public static volatile SingularAttribute<Participante, Date> dtInicioContrato;
    public static volatile SingularAttribute<Participante, String> modificado;
    public static volatile SingularAttribute<Participante, CatCliente> catcliente;
    public static volatile SingularAttribute<Participante, String> cnpjcpf;
    public static volatile SingularAttribute<Participante, String> agencia;
    public static volatile SingularAttribute<Participante, Date> datainativo;
    public static volatile SingularAttribute<Participante, Participante> matriz;
    public static volatile SingularAttribute<Participante, String> cep;
    public static volatile SingularAttribute<Participante, Boolean> mei;
    public static volatile SingularAttribute<Participante, String> TipoFrete;
    public static volatile SingularAttribute<Participante, UnidNegocio> unidnegocio;
    public static volatile SingularAttribute<Participante, String> nomefantasia;
    public static volatile SingularAttribute<Participante, Boolean> contribicms;
    public static volatile SingularAttribute<Participante, Item> itemServico;
    public static volatile SingularAttribute<Participante, String> email;
    public static volatile SingularAttribute<Participante, Microrregiao> microregiao;
    public static volatile SingularAttribute<Participante, SubcatCliente> subcatcliente;
    public static volatile SingularAttribute<Participante, String> categoria;
    public static volatile SingularAttribute<Participante, String> contacorrente;
    public static volatile SingularAttribute<Participante, Boolean> recebeEmailXML;
    public static volatile SingularAttribute<Participante, String> fone;
    public static volatile SingularAttribute<Participante, String> digitoconta;
    public static volatile SingularAttribute<Participante, String> site;
    public static volatile SingularAttribute<Participante, String> obsparticipante;
    public static volatile SingularAttribute<Participante, Representante> representante;
    public static volatile SingularAttribute<Participante, String> logradouro;
    public static volatile SingularAttribute<Participante, String> inativo;
    public static volatile SingularAttribute<Participante, CatFluxoCaixa> catfluxocaixa;
    public static volatile SingularAttribute<Participante, String> Fax;
    public static volatile SingularAttribute<Participante, String> digitoagencia;
    public static volatile SingularAttribute<Participante, String> alterado;

}