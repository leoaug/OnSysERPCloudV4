package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> obs;
    public static volatile SingularAttribute<Usuario, String> tipo;
    public static volatile SingularAttribute<Usuario, BigDecimal> percDescfim;
    public static volatile SingularAttribute<Usuario, Boolean> descontoItem;
    public static volatile SingularAttribute<Usuario, Boolean> alteraVlUnitPedido;
    public static volatile SingularAttribute<Usuario, UnidNegocio> unidNegocio;
    public static volatile SingularAttribute<Usuario, Boolean> recebeNFSemPedido;
    public static volatile SingularAttribute<Usuario, Boolean> fechamentopdv;
    public static volatile SingularAttribute<Usuario, Boolean> copiarPedido;
    public static volatile SingularAttribute<Usuario, Boolean> alterarTransportadora;
    public static volatile SingularAttribute<Usuario, Boolean> vertodosrepres;
    public static volatile SingularAttribute<Usuario, Integer> id;
    public static volatile SingularAttribute<Usuario, String> mensagemLogin;
    public static volatile SingularAttribute<Usuario, String> dashboard;
    public static volatile SingularAttribute<Usuario, Boolean> marketplace;
    public static volatile SingularAttribute<Usuario, Boolean> aprovaPDV;
    public static volatile SingularAttribute<Usuario, CentroCusto> centroCusto;
    public static volatile SingularAttribute<Usuario, String> deletado;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, Boolean> usatabelapreco;
    public static volatile SingularAttribute<Usuario, Boolean> sangriapdv;
    public static volatile SingularAttribute<Usuario, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Usuario, Boolean> aberturapdv;
    public static volatile SingularAttribute<Usuario, Empresa> empresa;
    public static volatile SingularAttribute<Usuario, Boolean> aprovarProspect;
    public static volatile SingularAttribute<Usuario, Boolean> recebeEmail;
    public static volatile SingularAttribute<Usuario, Boolean> admSuporte;
    public static volatile SingularAttribute<Usuario, String> apelido;
    public static volatile SingularAttribute<Usuario, Boolean> condPagtoPF;
    public static volatile SingularAttribute<Usuario, String> idiomaPadrao;
    public static volatile SingularAttribute<Usuario, String> modificado;
    public static volatile SingularAttribute<Usuario, Date> datainativo;
    public static volatile SingularAttribute<Usuario, String> senha;
    public static volatile SingularAttribute<Usuario, BigDecimal> percDescIni;
    public static volatile SingularAttribute<Usuario, Boolean> validaMultiploDeVendas;
    public static volatile SingularAttribute<Usuario, BigDecimal> comisfim;
    public static volatile SingularAttribute<Usuario, String> email;
    public static volatile SingularAttribute<Usuario, String> prefixoPedido;
    public static volatile SingularAttribute<Usuario, Boolean> vertodoscompradores;
    public static volatile SingularAttribute<Usuario, Boolean> tipoFrete;
    public static volatile SingularAttribute<Usuario, Boolean> verTodasCondicoes;
    public static volatile SingularAttribute<Usuario, Boolean> verTodasTabelas;
    public static volatile SingularAttribute<Usuario, Participante> participante;
    public static volatile SingularAttribute<Usuario, String> token;
    public static volatile SingularAttribute<Usuario, Boolean> validaDesconto;
    public static volatile SingularAttribute<Usuario, Boolean> suprimentopdv;
    public static volatile SingularAttribute<Usuario, Date> dtUltimoAcesso;
    public static volatile SingularAttribute<Usuario, String> inativo;
    public static volatile SingularAttribute<Usuario, BigDecimal> comisini;

}