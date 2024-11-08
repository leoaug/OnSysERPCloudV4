package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EtiquetaDeProduto.class)
public class EtiquetaDeProduto_ { 

    public static volatile SingularAttribute<EtiquetaDeProduto, Item> item;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> chavenf;
    public static volatile SingularAttribute<EtiquetaDeProduto, Participante> participante;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> nomeTransportadora;
    public static volatile SingularAttribute<EtiquetaDeProduto, Transportadora> transportadora;
    public static volatile SingularAttribute<EtiquetaDeProduto, Date> dtEmissao;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> volume;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> nrpedcli;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> codigoBarra;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> protocoloNFe;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> embarque;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> impressa;
    public static volatile SingularAttribute<EtiquetaDeProduto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<EtiquetaDeProduto, BigDecimal> valorNF;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> operacao;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> serie;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> simulacao;
    public static volatile SingularAttribute<EtiquetaDeProduto, BigDecimal> pesoBruto;
    public static volatile SingularAttribute<EtiquetaDeProduto, Usuario> usuario;
    public static volatile SingularAttribute<EtiquetaDeProduto, Integer> id;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> notaFiscal;
    public static volatile SingularAttribute<EtiquetaDeProduto, Empresa> empresa;
    public static volatile SingularAttribute<EtiquetaDeProduto, String> quantidade;
    public static volatile SingularAttribute<EtiquetaDeProduto, BigDecimal> pesoLiquido;

}