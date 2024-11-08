package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.comercial.Ambiente;
import br.com.onsys.entidades.comercial.NaturezaOperacao;
import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.comercial.TabelaPreco;
import br.com.onsys.entidades.manufatura.ComponenteConfigurado;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemPedidoVendasGrid.class)
public class ItemPedidoVendasGrid_ { 

    public static volatile SingularAttribute<ItemPedidoVendasGrid, PedidoVendas> pedidovendas;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> obs;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> situacao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlunitliqipi;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlicms;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> focus;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> codigoAnuncio;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> seqOrdemCompra;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> qtdbonisaldo;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, TabelaPreco> tabelapreco;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> tipooperacao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> repasse;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> frete;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, Integer> id;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, Integer> seqAmbiente;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, Item> item;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percicms;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> ipi;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percst;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, Integer> seqerp;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, Boolean> ItemCliente;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> pontuacaoitem;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> ordemcompra;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percfrete;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> qtdsaldo;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> style;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> valorImpermeabilizacao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlunit;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> motivoDesconto;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percrentabilidade;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlMercadoria;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> rentabilidade;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, Ambiente> ambiente;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, ComponenteConfigurado> componenteConfigurado;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> qtdboniatendida;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> qtdatendida;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> valorMontagem;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlunitboni;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vltot;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlcomissao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> outdespesas;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> custo;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> valorUnitarioOriginal;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> desconto2;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlunitnegociacao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, String> descricaoConfigurado;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> basecomissao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlunitliq;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlUnitTabela;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> qtdbonificada;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percdesc5;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, Integer> seqPedido;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percdesc3;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percdesc4;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percipi;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> percdesc2;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> perccomissao;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vlliqaberto;
    public static volatile SingularAttribute<ItemPedidoVendasGrid, BigDecimal> vltotboni;

}