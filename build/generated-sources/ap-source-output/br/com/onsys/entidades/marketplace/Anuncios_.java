package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.TipoDePedido;
import br.com.onsys.entidades.logistica.Grade;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.marketplace.Atributos;
import br.com.onsys.entidades.marketplace.Imagens;
import br.com.onsys.entidades.marketplace.WooCategoria;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Anuncios.class)
public class Anuncios_ { 

    public static volatile SingularAttribute<Anuncios, WooCategoria> wooCategoria;
    public static volatile SingularAttribute<Anuncios, String> obs;
    public static volatile SingularAttribute<Anuncios, String> skuPortal;
    public static volatile SingularAttribute<Anuncios, BigDecimal> promocao;
    public static volatile SingularAttribute<Anuncios, String> condicaoDoProduto;
    public static volatile SingularAttribute<Anuncios, Date> inicioPromocao;
    public static volatile SingularAttribute<Anuncios, String> categoriaWooCommerce;
    public static volatile SingularAttribute<Anuncios, String> skuSugerido;
    public static volatile SingularAttribute<Anuncios, String> titulo;
    public static volatile SingularAttribute<Anuncios, String> codigoAnuncio;
    public static volatile SingularAttribute<Anuncios, String> modificado;
    public static volatile SingularAttribute<Anuncios, String> obsIntegracao;
    public static volatile SingularAttribute<Anuncios, BigDecimal> comissaoGestor;
    public static volatile SingularAttribute<Anuncios, Atributos> mlAtributos;
    public static volatile SingularAttribute<Anuncios, String> garantia;
    public static volatile SingularAttribute<Anuncios, Double> preco;
    public static volatile SingularAttribute<Anuncios, Integer> estoque;
    public static volatile SingularAttribute<Anuncios, Imagens> mlImagens;
    public static volatile SingularAttribute<Anuncios, Boolean> anuncioFechado;
    public static volatile SingularAttribute<Anuncios, Integer> expedicao;
    public static volatile SingularAttribute<Anuncios, String> tipoDeAnuncio;
    public static volatile SingularAttribute<Anuncios, Integer> id;
    public static volatile SingularAttribute<Anuncios, String> categoriaMadeira;
    public static volatile SingularAttribute<Anuncios, BigDecimal> comissaoPortal;
    public static volatile SingularAttribute<Anuncios, String> statusPergunta;
    public static volatile SingularAttribute<Anuncios, String> skuViaVarejo;
    public static volatile SingularAttribute<Anuncios, Item> item;
    public static volatile SingularAttribute<Anuncios, Integer> idWooCommerce;
    public static volatile SingularAttribute<Anuncios, String> categoria;
    public static volatile SingularAttribute<Anuncios, Date> dataInativo;
    public static volatile SingularAttribute<Anuncios, String> deletado;
    public static volatile SingularAttribute<Anuncios, Date> finalPromocao;
    public static volatile SingularAttribute<Anuncios, Date> dataAtivo;
    public static volatile SingularAttribute<Anuncios, Representante> representante;
    public static volatile SingularAttribute<Anuncios, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Anuncios, Grade> gradeEstoque;
    public static volatile SingularAttribute<Anuncios, String> inativo;
    public static volatile SingularAttribute<Anuncios, Double> fulfillment;
    public static volatile SingularAttribute<Anuncios, TipoDePedido> tipoDePedido;
    public static volatile SingularAttribute<Anuncios, Empresa> empresa;
    public static volatile SingularAttribute<Anuncios, String> descricaoDetalhada;
    public static volatile SingularAttribute<Anuncios, String> status;

}