package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.financeiro.Moeda;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> obs;
    public static volatile SingularAttribute<Empresa, String> formatoCentroCustos;
    public static volatile SingularAttribute<Empresa, String> situacao;
    public static volatile SingularAttribute<Empresa, Boolean> validaCPFCNPJ;
    public static volatile SingularAttribute<Empresa, String> mensagem;
    public static volatile SingularAttribute<Empresa, String> formatoParticip;
    public static volatile SingularAttribute<Empresa, String> modificado;
    public static volatile SingularAttribute<Empresa, String> formatoConta;
    public static volatile SingularAttribute<Empresa, String> login;
    public static volatile SingularAttribute<Empresa, Date> datainativo;
    public static volatile SingularAttribute<Empresa, byte[]> logoimg;
    public static volatile SingularAttribute<Empresa, String> nomeFantasia;
    public static volatile SingularAttribute<Empresa, Boolean> participanteImagem;
    public static volatile SingularAttribute<Empresa, String> formatoLote;
    public static volatile SingularAttribute<Empresa, Integer> id;
    public static volatile SingularAttribute<Empresa, byte[]> imgfundo;
    public static volatile SingularAttribute<Empresa, String> sugerirCodigoItem;
    public static volatile SingularAttribute<Empresa, String> logotop;
    public static volatile SingularAttribute<Empresa, Boolean> participanteContrato;
    public static volatile SingularAttribute<Empresa, String> codigo;
    public static volatile SingularAttribute<Empresa, String> urlRelatorio;
    public static volatile SingularAttribute<Empresa, Boolean> participanteEnderecoEntrega;
    public static volatile SingularAttribute<Empresa, String> tpRegimeTributario;
    public static volatile SingularAttribute<Empresa, String> sugerirCodigoParticipante;
    public static volatile SingularAttribute<Empresa, BigDecimal> percSimples;
    public static volatile SingularAttribute<Empresa, String> deletado;
    public static volatile SingularAttribute<Empresa, String> formatoProduto;
    public static volatile SingularAttribute<Empresa, String> cnpjcpfmatriz;
    public static volatile SingularAttribute<Empresa, String> urlLogo;
    public static volatile SingularAttribute<Empresa, String> descricao;
    public static volatile SingularAttribute<Empresa, Boolean> usaCentroCustos;
    public static volatile SingularAttribute<Empresa, String> urlImagemProduto;
    public static volatile SingularAttribute<Empresa, Moeda> moeda;
    public static volatile SingularAttribute<Empresa, Boolean> preencheZeros;
    public static volatile SingularAttribute<Empresa, String> formatoEndereco;
    public static volatile SingularAttribute<Empresa, String> tipoCodigoParticip;
    public static volatile SingularAttribute<Empresa, String> inativo;
    public static volatile SingularAttribute<Empresa, Boolean> expandeMenu;
    public static volatile SingularAttribute<Empresa, Boolean> participanteContato;

}