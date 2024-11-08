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
@StaticMetamodel(ItemPedidoVendas.class)
public class ItemPedidoVendas_ { 

    public static volatile SingularAttribute<ItemPedidoVendas, PedidoVendas> pedidovendas;
    public static volatile SingularAttribute<ItemPedidoVendas, String> obs;
    public static volatile SingularAttribute<ItemPedidoVendas, String> situacao;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlunitliqipi;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlicms;
    public static volatile SingularAttribute<ItemPedidoVendas, String> focus;
    public static volatile SingularAttribute<ItemPedidoVendas, String> codigoAnuncio;
    public static volatile SingularAttribute<ItemPedidoVendas, String> seqOrdemCompra;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> qtdbonisaldo;
    public static volatile SingularAttribute<ItemPedidoVendas, TabelaPreco> tabelapreco;
    public static volatile SingularAttribute<ItemPedidoVendas, String> tipooperacao;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> repasse;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> frete;
    public static volatile SingularAttribute<ItemPedidoVendas, Integer> id;
    public static volatile SingularAttribute<ItemPedidoVendas, Integer> seqAmbiente;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> quantidade;
    public static volatile SingularAttribute<ItemPedidoVendas, Item> item;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percicms;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> ipi;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percst;
    public static volatile SingularAttribute<ItemPedidoVendas, Integer> seqerp;
    public static volatile SingularAttribute<ItemPedidoVendas, Boolean> ItemCliente;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> pontuacaoitem;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vltotitem;
    public static volatile SingularAttribute<ItemPedidoVendas, String> ordemcompra;
    public static volatile SingularAttribute<ItemPedidoVendas, NaturezaOperacao> naturezaoperacao;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percfrete;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> qtdsaldo;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlIPILiquidoUnitario;
    public static volatile SingularAttribute<ItemPedidoVendas, String> style;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> valorImpermeabilizacao;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlunit;
    public static volatile SingularAttribute<ItemPedidoVendas, String> motivoDesconto;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percrentabilidade;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlMercadoria;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> rentabilidade;
    public static volatile SingularAttribute<ItemPedidoVendas, Ambiente> ambiente;
    public static volatile SingularAttribute<ItemPedidoVendas, ComponenteConfigurado> componenteConfigurado;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> qtdboniatendida;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vltoticmssubstitu;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> qtdatendida;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> valorMontagem;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlunitboni;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vltot;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlcomissao;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> outdespesas;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> custo;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> valorUnitarioOriginal;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> desconto2;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlunitnegociacao;
    public static volatile SingularAttribute<ItemPedidoVendas, String> descricaoConfigurado;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> basecomissao;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlunitliq;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlUnitTabela;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> qtdbonificada;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vltotipi;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percdesc5;
    public static volatile SingularAttribute<ItemPedidoVendas, Integer> seqPedido;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percdesc3;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percdesc4;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percdesc;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percipi;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlIPIBrutoUnitario;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> percdesc2;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> perccomissao;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vlliqaberto;
    public static volatile SingularAttribute<ItemPedidoVendas, BigDecimal> vltotboni;

}