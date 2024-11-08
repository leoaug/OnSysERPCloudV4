package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.EnderecoParticipante;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.Arquiteto;
import br.com.onsys.entidades.comercial.Campanha;
import br.com.onsys.entidades.comercial.CanalVenda;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.comercial.ItemPedidoVendas;
import br.com.onsys.entidades.comercial.NaturezaOperacao;
import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.comercial.Prospect;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.TabelaPreco;
import br.com.onsys.entidades.comercial.TipoDePedido;
import br.com.onsys.entidades.financeiro.FormaDePagamento;
import br.com.onsys.entidades.financeiro.Moeda;
import br.com.onsys.entidades.financeiro.TabFinanciamento;
import br.com.onsys.entidades.logistica.AreaTransporte;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.tipos.TipoPagamento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PedidoVendas.class)
public class PedidoVendas_ { 

    public static volatile SingularAttribute<PedidoVendas, String> apvContrato;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> percdesctotal;
    public static volatile SingularAttribute<PedidoVendas, String> obs;
    public static volatile SingularAttribute<PedidoVendas, String> telefone;
    public static volatile SingularAttribute<PedidoVendas, Boolean> mensagemPedidoEntregue;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> outrasDespesas;
    public static volatile SingularAttribute<PedidoVendas, CondPagamento> condpagamento;
    public static volatile SingularAttribute<PedidoVendas, Integer> qtdParcelas;
    public static volatile SingularAttribute<PedidoVendas, String> obstrocacondpag;
    public static volatile SingularAttribute<PedidoVendas, String> contatoentregaagendada;
    public static volatile SingularAttribute<PedidoVendas, Boolean> mensagemPedidoFaturado;
    public static volatile SingularAttribute<PedidoVendas, Date> dataExpedicao;
    public static volatile SingularAttribute<PedidoVendas, CanalVenda> canalvenda;
    public static volatile SingularAttribute<PedidoVendas, String> IdOrderMarketplace;
    public static volatile SingularAttribute<PedidoVendas, TabelaPreco> tabelapreco;
    public static volatile SingularAttribute<PedidoVendas, String> codigoRastreio;
    public static volatile SingularAttribute<PedidoVendas, Date> apvDtInicio;
    public static volatile SingularAttribute<PedidoVendas, TabFinanciamento> tabfinanciamento;
    public static volatile SingularAttribute<PedidoVendas, AreaTransporte> areatransporte;
    public static volatile SingularAttribute<PedidoVendas, Boolean> pedidofechado;
    public static volatile SingularAttribute<PedidoVendas, String> obscredito;
    public static volatile SingularAttribute<PedidoVendas, String> freteemitente;
    public static volatile SingularAttribute<PedidoVendas, FormaDePagamento> formaDepagamento;
    public static volatile SingularAttribute<PedidoVendas, Integer> id;
    public static volatile SingularAttribute<PedidoVendas, String> ocorrenciaAberta;
    public static volatile ListAttribute<PedidoVendas, ItemPedidoVendas> itens;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> ipi;
    public static volatile SingularAttribute<PedidoVendas, String> apvNegociacao;
    public static volatile SingularAttribute<PedidoVendas, String> bairro;
    public static volatile SingularAttribute<PedidoVendas, Boolean> apv;
    public static volatile SingularAttribute<PedidoVendas, String> obsintegra;
    public static volatile SingularAttribute<PedidoVendas, Date> apvDtFim;
    public static volatile SingularAttribute<PedidoVendas, Integer> volumes;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> apvPercentual;
    public static volatile SingularAttribute<PedidoVendas, String> dataFechamentoOrcamento;
    public static volatile SingularAttribute<PedidoVendas, Integer> nrpedido;
    public static volatile SingularAttribute<PedidoVendas, String> packs;
    public static volatile SingularAttribute<PedidoVendas, Usuario> usraprova;
    public static volatile SingularAttribute<PedidoVendas, Transportadora> transpredes;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> percfrete;
    public static volatile SingularAttribute<PedidoVendas, Boolean> retornoMarketplaceEntregue;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> qtdvendida;
    public static volatile SingularAttribute<PedidoVendas, String> style;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> valorImpermeabilizacao;
    public static volatile SingularAttribute<PedidoVendas, Boolean> retornoMarketplaceFaturamento;
    public static volatile SingularAttribute<PedidoVendas, String> statusTransportadora;
    public static volatile SingularAttribute<PedidoVendas, PedidoVendas> orcamento;
    public static volatile SingularAttribute<PedidoVendas, String> numero;
    public static volatile SingularAttribute<PedidoVendas, Date> dtaprovcredito;
    public static volatile SingularAttribute<PedidoVendas, String> origem;
    public static volatile SingularAttribute<PedidoVendas, String> dataaprova;
    public static volatile SingularAttribute<PedidoVendas, Campanha> campanha;
    public static volatile SingularAttribute<PedidoVendas, String> cep;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> valorMontagem;
    public static volatile SingularAttribute<PedidoVendas, String> nrpedcli;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> valorRepasse;
    public static volatile SingularAttribute<PedidoVendas, Usuario> usuariorep;
    public static volatile SingularAttribute<PedidoVendas, Boolean> cotacao;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> percRepasse;
    public static volatile SingularAttribute<PedidoVendas, String> apvMesReferencia;
    public static volatile SingularAttribute<PedidoVendas, Date> validadeOrcamento;
    public static volatile SingularAttribute<PedidoVendas, String> obslogistica;
    public static volatile SingularAttribute<PedidoVendas, String> obspedido;
    public static volatile SingularAttribute<PedidoVendas, PedidoVendas> pedidooriginal;
    public static volatile SingularAttribute<PedidoVendas, Date> dataentrega;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> qtdbonificada;
    public static volatile SingularAttribute<PedidoVendas, Prospect> prospect;
    public static volatile SingularAttribute<PedidoVendas, String> logradouro;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> perccomissao;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vltotbruto;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vltotliqpedido;
    public static volatile SingularAttribute<PedidoVendas, DoctoSai> notaFiscalVenda;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vlvenda;
    public static volatile SingularAttribute<PedidoVendas, String> atualizarPortal;
    public static volatile SingularAttribute<PedidoVendas, String> situacao;
    public static volatile SingularAttribute<PedidoVendas, String> dtentregaprogramada;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> apvValor;
    public static volatile SingularAttribute<PedidoVendas, String> nrOrcamento;
    public static volatile SingularAttribute<PedidoVendas, DoctoSai> notaFiscalRemessa;
    public static volatile SingularAttribute<PedidoVendas, Date> modificacao;
    public static volatile SingularAttribute<PedidoVendas, String> uf;
    public static volatile SingularAttribute<PedidoVendas, String> obsbonifica;
    public static volatile SingularAttribute<PedidoVendas, String> complemento;
    public static volatile SingularAttribute<PedidoVendas, String> shippingId;
    public static volatile SingularAttribute<PedidoVendas, String> string1;
    public static volatile SingularAttribute<PedidoVendas, String> string2;
    public static volatile SingularAttribute<PedidoVendas, String> mesentregaprogramada;
    public static volatile SingularAttribute<PedidoVendas, Boolean> boolean2;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> frete;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> percbonificado;
    public static volatile SingularAttribute<PedidoVendas, Boolean> boolean1;
    public static volatile SingularAttribute<PedidoVendas, String> datafechamento;
    public static volatile SingularAttribute<PedidoVendas, String> obstrocatabela;
    public static volatile SingularAttribute<PedidoVendas, Integer> nmes;
    public static volatile SingularAttribute<PedidoVendas, Boolean> retornoMarketplace;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> descfinanceiro;
    public static volatile SingularAttribute<PedidoVendas, Boolean> marketplace;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> pesoliquido;
    public static volatile SingularAttribute<PedidoVendas, Date> apvVencimento;
    public static volatile SingularAttribute<PedidoVendas, Transportadora> transportadora;
    public static volatile SingularAttribute<PedidoVendas, String> razaosocial;
    public static volatile SingularAttribute<PedidoVendas, Participante> cliente;
    public static volatile SingularAttribute<PedidoVendas, String> urlRastreio;
    public static volatile SingularAttribute<PedidoVendas, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<PedidoVendas, Date> dataemissao;
    public static volatile SingularAttribute<PedidoVendas, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PedidoVendas, String> nrpedbonificado;
    public static volatile SingularAttribute<PedidoVendas, Boolean> bonificacao;
    public static volatile SingularAttribute<PedidoVendas, Date> dataemissaooriginal;
    public static volatile SingularAttribute<PedidoVendas, Empresa> empresa;
    public static volatile SingularAttribute<PedidoVendas, String> apvObs;
    public static volatile SingularAttribute<PedidoVendas, TipoPagamento> formapagamento;
    public static volatile SingularAttribute<PedidoVendas, Date> dataEntregaEstimada;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> percrentabilidade;
    public static volatile SingularAttribute<PedidoVendas, String> cidade;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vlDesconto;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vlMercadoria;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> rentabilidade;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> descprod;
    public static volatile SingularAttribute<PedidoVendas, Usuario> usraprova2;
    public static volatile SingularAttribute<PedidoVendas, String> tipobloqueio;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vltotpedido;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vlcomissao;
    public static volatile SingularAttribute<PedidoVendas, Boolean> mensagemPedidoExpedido;
    public static volatile SingularAttribute<PedidoVendas, Boolean> entregaagendada;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> custo;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> pesobruto;
    public static volatile SingularAttribute<PedidoVendas, String> nomefantasia;
    public static volatile SingularAttribute<PedidoVendas, Arquiteto> arquiteto;
    public static volatile SingularAttribute<PedidoVendas, String> apvObsInvestimento;
    public static volatile SingularAttribute<PedidoVendas, String> nrpedrepre;
    public static volatile SingularAttribute<PedidoVendas, String> pedidoMarketplace;
    public static volatile SingularAttribute<PedidoVendas, String> anoentregaprogramada;
    public static volatile SingularAttribute<PedidoVendas, EnderecoParticipante> enderecoentrega;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> descontoAdicional;
    public static volatile SingularAttribute<PedidoVendas, Integer> ano;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> bigdecimal2;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> bigdecimal1;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> basecomissao;
    public static volatile SingularAttribute<PedidoVendas, Usuario> usrimplant;
    public static volatile SingularAttribute<PedidoVendas, String> situacaoOrcamento;
    public static volatile SingularAttribute<PedidoVendas, Boolean> fixardesconto;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> pontuacao;
    public static volatile SingularAttribute<PedidoVendas, Boolean> mensagemPedidoRecebido;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> vlbonificado;
    public static volatile SingularAttribute<PedidoVendas, EnderecoParticipante> enderecoparticipante;
    public static volatile SingularAttribute<PedidoVendas, Moeda> moeda;
    public static volatile SingularAttribute<PedidoVendas, String> tipopedido;
    public static volatile SingularAttribute<PedidoVendas, Boolean> entregaprogramada;
    public static volatile SingularAttribute<PedidoVendas, Representante> representante;
    public static volatile SingularAttribute<PedidoVendas, BigDecimal> freteTransportadora;
    public static volatile SingularAttribute<PedidoVendas, String> apvTipo;
    public static volatile SingularAttribute<PedidoVendas, TipoDePedido> tipodepedido;

}