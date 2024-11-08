package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.projetos.Pacote;
import br.com.onsys.entidades.sac.CatOcorrencia;
import br.com.onsys.entidades.sac.Objetivos;
import br.com.onsys.entidades.sac.Ocorrencia;
import br.com.onsys.entidades.sac.OcorrenciaAnexo;
import br.com.onsys.entidades.sac.OcorrenciaMotivo;
import br.com.onsys.entidades.sac.OcorrenciaOperacao;
import br.com.onsys.entidades.sac.OcorrenciaSolucao;
import br.com.onsys.entidades.sac.Origens;
import br.com.onsys.entidades.sac.SubcatOcorrencia;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Ocorrencia.class)
public class Ocorrencia_ { 

    public static volatile SingularAttribute<Ocorrencia, String> obs;
    public static volatile SingularAttribute<Ocorrencia, String> financeironota;
    public static volatile SingularAttribute<Ocorrencia, Boolean> fechada;
    public static volatile SingularAttribute<Ocorrencia, Boolean> produtoFisico;
    public static volatile SingularAttribute<Ocorrencia, String> acaobs;
    public static volatile SingularAttribute<Ocorrencia, String> doctosai;
    public static volatile SingularAttribute<Ocorrencia, Deposito> logisticaDeposito;
    public static volatile SingularAttribute<Ocorrencia, String> entregaObs;
    public static volatile SingularAttribute<Ocorrencia, BigDecimal> vlnotadevolucao;
    public static volatile SingularAttribute<Ocorrencia, Date> embdata;
    public static volatile SingularAttribute<Ocorrencia, Deposito> faturamentoDeposito;
    public static volatile SingularAttribute<Ocorrencia, String> financeiroobs;
    public static volatile SingularAttribute<Ocorrencia, Usuario> executor;
    public static volatile SingularAttribute<Ocorrencia, Integer> id;
    public static volatile SingularAttribute<Ocorrencia, Date> acadata;
    public static volatile SingularAttribute<Ocorrencia, Date> datalimite;
    public static volatile SingularAttribute<Ocorrencia, Deposito> acaDeposito;
    public static volatile SingularAttribute<Ocorrencia, CentroCusto> centroCusto;
    public static volatile SingularAttribute<Ocorrencia, String> pcpObs;
    public static volatile SingularAttribute<Ocorrencia, String> banco;
    public static volatile SingularAttribute<Ocorrencia, String> descricao;
    public static volatile SingularAttribute<Ocorrencia, Date> logisticadata;
    public static volatile SingularAttribute<Ocorrencia, Date> qualidadedata;
    public static volatile SingularAttribute<Ocorrencia, String> solucao;
    public static volatile SingularAttribute<Ocorrencia, String> pedidoCliente;
    public static volatile SingularAttribute<Ocorrencia, String> envioObs;
    public static volatile SingularAttribute<Ocorrencia, OcorrenciaOperacao> operacao;
    public static volatile SingularAttribute<Ocorrencia, Usuario> usuario;
    public static volatile SingularAttribute<Ocorrencia, Date> dtrecebocor;
    public static volatile SingularAttribute<Ocorrencia, Deposito> qualidade2Deposito;
    public static volatile SingularAttribute<Ocorrencia, PedidoVendas> pedidoVendas;
    public static volatile SingularAttribute<Ocorrencia, String> status;
    public static volatile SingularAttribute<Ocorrencia, Date> dtiniatend;
    public static volatile SingularAttribute<Ocorrencia, OcorrenciaSolucao> ocorrenciasolucao;
    public static volatile SingularAttribute<Ocorrencia, byte[]> anexo;
    public static volatile SingularAttribute<Ocorrencia, Date> dtSaida;
    public static volatile SingularAttribute<Ocorrencia, String> modificado;
    public static volatile SingularAttribute<Ocorrencia, String> notacompra;
    public static volatile SingularAttribute<Ocorrencia, CatOcorrencia> catocorrencia;
    public static volatile SingularAttribute<Ocorrencia, Date> envioData;
    public static volatile SingularAttribute<Ocorrencia, String> empresaCliente;
    public static volatile SingularAttribute<Ocorrencia, Date> recebimentodata;
    public static volatile SingularAttribute<Ocorrencia, String> financeirotpoper;
    public static volatile SingularAttribute<Ocorrencia, Origens> origens;
    public static volatile SingularAttribute<Ocorrencia, String> logisticaobs;
    public static volatile SingularAttribute<Ocorrencia, Date> dtiniatendplan;
    public static volatile SingularAttribute<Ocorrencia, Date> faturamentodata;
    public static volatile SingularAttribute<Ocorrencia, String> qualidadeobs;
    public static volatile SingularAttribute<Ocorrencia, CentroCusto> proximaOperacao;
    public static volatile SingularAttribute<Ocorrencia, Participante> participante;
    public static volatile ListAttribute<Ocorrencia, OcorrenciaAnexo> listAnexos;
    public static volatile SingularAttribute<Ocorrencia, String> diagnostico;
    public static volatile SingularAttribute<Ocorrencia, Boolean> pagamentoProgramado;
    public static volatile SingularAttribute<Ocorrencia, String> inativo;
    public static volatile SingularAttribute<Ocorrencia, String> qualidade2obs;
    public static volatile SingularAttribute<Ocorrencia, Deposito> qualidadeDeposito;
    public static volatile SingularAttribute<Ocorrencia, String> embobs;
    public static volatile SingularAttribute<Ocorrencia, Date> rotadata;
    public static volatile SingularAttribute<Ocorrencia, String> nfgerada;
    public static volatile SingularAttribute<Ocorrencia, Deposito> rotaDeposito;
    public static volatile SingularAttribute<Ocorrencia, Boolean> tiporemota;
    public static volatile SingularAttribute<Ocorrencia, Usuario> usrcriacao;
    public static volatile SingularAttribute<Ocorrencia, String> statusCliente;
    public static volatile SingularAttribute<Ocorrencia, Integer> nrocorrencia;
    public static volatile SingularAttribute<Ocorrencia, Ocorrencia> ocorrenciaOriginal;
    public static volatile SingularAttribute<Ocorrencia, String> faturamentoobs;
    public static volatile SingularAttribute<Ocorrencia, Objetivos> objetivos;
    public static volatile SingularAttribute<Ocorrencia, String> arquivo;
    public static volatile SingularAttribute<Ocorrencia, Date> dataPrevistaPagamento;
    public static volatile SingularAttribute<Ocorrencia, String> doctoFaturamento;
    public static volatile SingularAttribute<Ocorrencia, Deposito> embDeposito;
    public static volatile SingularAttribute<Ocorrencia, Date> entregaData;
    public static volatile SingularAttribute<Ocorrencia, Date> dtfimatendplan;
    public static volatile SingularAttribute<Ocorrencia, Date> dtnfgerada;
    public static volatile SingularAttribute<Ocorrencia, Usuario> solicitante;
    public static volatile SingularAttribute<Ocorrencia, String> deletado;
    public static volatile SingularAttribute<Ocorrencia, Transportadora> transportadora;
    public static volatile SingularAttribute<Ocorrencia, String> pedidoInterno;
    public static volatile SingularAttribute<Ocorrencia, Date> expdata;
    public static volatile SingularAttribute<Ocorrencia, Date> dataemissao;
    public static volatile SingularAttribute<Ocorrencia, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Ocorrencia, Empresa> empresa;
    public static volatile SingularAttribute<Ocorrencia, Date> financeirodata;
    public static volatile SingularAttribute<Ocorrencia, OcorrenciaMotivo> motivo;
    public static volatile SingularAttribute<Ocorrencia, String> conta;
    public static volatile SingularAttribute<Ocorrencia, String> notadevolucao;
    public static volatile SingularAttribute<Ocorrencia, Date> dttransnotadevolucao;
    public static volatile SingularAttribute<Ocorrencia, String> agencia;
    public static volatile SingularAttribute<Ocorrencia, Date> datainativo;
    public static volatile SingularAttribute<Ocorrencia, Date> dtFimCliente;
    public static volatile SingularAttribute<Ocorrencia, Date> pcpData;
    public static volatile SingularAttribute<Ocorrencia, Date> qualidade2data;
    public static volatile SingularAttribute<Ocorrencia, String> rotaobs;
    public static volatile SingularAttribute<Ocorrencia, SubcatOcorrencia> subcatocorrencia;
    public static volatile SingularAttribute<Ocorrencia, byte[]> anexoFin;
    public static volatile SingularAttribute<Ocorrencia, Boolean> geraPendencia;
    public static volatile SingularAttribute<Ocorrencia, BigDecimal> horasaplicadas;
    public static volatile SingularAttribute<Ocorrencia, Date> dtfimatend;
    public static volatile SingularAttribute<Ocorrencia, Deposito> recebimentoDeposito;
    public static volatile SingularAttribute<Ocorrencia, String> expobs;
    public static volatile SingularAttribute<Ocorrencia, Pacote> pacote;
    public static volatile SingularAttribute<Ocorrencia, Date> dtemisnotadevolucao;
    public static volatile SingularAttribute<Ocorrencia, Date> followup;
    public static volatile SingularAttribute<Ocorrencia, String> reclameAqui;
    public static volatile SingularAttribute<Ocorrencia, String> anexoCaminhoArquivo;
    public static volatile SingularAttribute<Ocorrencia, Deposito> pcpDeposito;
    public static volatile SingularAttribute<Ocorrencia, Representante> representante;
    public static volatile SingularAttribute<Ocorrencia, Date> dtEntregaReal;
    public static volatile SingularAttribute<Ocorrencia, String> recebimentoobs;
    public static volatile SingularAttribute<Ocorrencia, String> tipoConta;

}