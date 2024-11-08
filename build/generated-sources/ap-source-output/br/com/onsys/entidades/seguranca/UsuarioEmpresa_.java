package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UsuarioEmpresa.class)
public class UsuarioEmpresa_ { 

    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> ultimo;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> admSuporte;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> marketplace;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> condPagtoPF;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> aprovaPDV;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> tipoFrete;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> descontoItem;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> verTodasCondicoes;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> alteraVlUnitPedido;
    public static volatile SingularAttribute<UsuarioEmpresa, Participante> participante;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> verTodasTabelas;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> copiarPedido;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> usaTabelaPreco;
    public static volatile SingularAttribute<UsuarioEmpresa, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> validaDesconto;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> validaMultiploDeVendas;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> alterarTransportadora;
    public static volatile SingularAttribute<UsuarioEmpresa, Usuario> usuario;
    public static volatile SingularAttribute<UsuarioEmpresa, Integer> id;
    public static volatile SingularAttribute<UsuarioEmpresa, String> mensagemLogin;
    public static volatile SingularAttribute<UsuarioEmpresa, Empresa> empresa;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> aprovarProspect;
    public static volatile SingularAttribute<UsuarioEmpresa, String> dashboard;
    public static volatile SingularAttribute<UsuarioEmpresa, Boolean> difal;

}