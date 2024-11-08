package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.MetaPremio;
import br.com.onsys.entidades.comercial.Regiao;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.TabDescontoComis;
import br.com.onsys.entidades.comercial.TabRentabilidade;
import br.com.onsys.entidades.comercial.TabelaPreco;
import br.com.onsys.entidades.comercial.TipoDePedido;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Representante.class)
public class Representante_ { 

    public static volatile SingularAttribute<Representante, String> codigoClienteMarketplace;
    public static volatile SingularAttribute<Representante, String> obs;
    public static volatile SingularAttribute<Representante, BigDecimal> comissao2;
    public static volatile SingularAttribute<Representante, MetaPremio> metapremio;
    public static volatile SingularAttribute<Representante, Regiao> regiao;
    public static volatile SingularAttribute<Representante, TabelaPreco> tabelapreco;
    public static volatile SingularAttribute<Representante, Boolean> sincronizar;
    public static volatile SingularAttribute<Representante, Date> modificacao;
    public static volatile SingularAttribute<Representante, BigDecimal> descontoadicional;
    public static volatile SingularAttribute<Representante, String> idLojaOficial;
    public static volatile SingularAttribute<Representante, BigDecimal> descontomax;
    public static volatile SingularAttribute<Representante, BigDecimal> comissaoGestorMarketplace;
    public static volatile SingularAttribute<Representante, Integer> id;
    public static volatile SingularAttribute<Representante, String> senhaAPI;
    public static volatile SingularAttribute<Representante, BigDecimal> metavalor;
    public static volatile SingularAttribute<Representante, String> codigo;
    public static volatile SingularAttribute<Representante, Boolean> marketplace;
    public static volatile SingularAttribute<Representante, String> codigomeli;
    public static volatile SingularAttribute<Representante, Date> datacadastro;
    public static volatile SingularAttribute<Representante, String> deletado;
    public static volatile SingularAttribute<Representante, String> nome;
    public static volatile SingularAttribute<Representante, String> urlImagem;
    public static volatile SingularAttribute<Representante, BigDecimal> vlkm;
    public static volatile SingularAttribute<Representante, BigDecimal> saldoDespesa;
    public static volatile SingularAttribute<Representante, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Representante, Boolean> alteratabela;
    public static volatile SingularAttribute<Representante, Empresa> empresa;
    public static volatile SingularAttribute<Representante, Boolean> recebeEmail;
    public static volatile SingularAttribute<Representante, BigDecimal> comissaoFaturamento;
    public static volatile SingularAttribute<Representante, Boolean> alteratransporte;
    public static volatile SingularAttribute<Representante, BigDecimal> comissaoEmissaoPedido;
    public static volatile SingularAttribute<Representante, String> apelido;
    public static volatile SingularAttribute<Representante, BigDecimal> vlminfaturamento;
    public static volatile SingularAttribute<Representante, BigDecimal> comissaoTituloAR;
    public static volatile SingularAttribute<Representante, String> modificado;
    public static volatile SingularAttribute<Representante, Date> datainativo;
    public static volatile SingularAttribute<Representante, BigDecimal> comissaoMarketplace;
    public static volatile SingularAttribute<Representante, String> lojaMarketplace;
    public static volatile SingularAttribute<Representante, Usuario> usuariorep;
    public static volatile SingularAttribute<Representante, String> codigoAplicativoMarketplace;
    public static volatile SingularAttribute<Representante, String> tokenMarketplace;
    public static volatile SingularAttribute<Representante, Boolean> alteracondpagto;
    public static volatile SingularAttribute<Representante, String> urlMarketplace;
    public static volatile SingularAttribute<Representante, String> email;
    public static volatile SingularAttribute<Representante, Representante> gerente;
    public static volatile SingularAttribute<Representante, String> prefixoPedido;
    public static volatile SingularAttribute<Representante, Integer> metapedido;
    public static volatile SingularAttribute<Representante, String> fone;
    public static volatile SingularAttribute<Representante, BigDecimal> comissao;
    public static volatile SingularAttribute<Representante, String> usuarioAPI;
    public static volatile SingularAttribute<Representante, TabDescontoComis> tabdescontocomis;
    public static volatile SingularAttribute<Representante, TabelaPreco> tabelaPrecoMarketplace;
    public static volatile SingularAttribute<Representante, String> inativo;
    public static volatile SingularAttribute<Representante, TabRentabilidade> tabrentabilidade;
    public static volatile SingularAttribute<Representante, TipoDePedido> tipodepedido;
    public static volatile SingularAttribute<Representante, String> refreshToken;

}