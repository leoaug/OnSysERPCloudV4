package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.logistica.SerieMDFe;
import br.com.onsys.entidades.logistica.SerieNotaFiscal;
import br.com.onsys.entidades.logistica.TipoDoctoLogistica;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamLogistica.class)
public class ParamLogistica_ { 

    public static volatile SingularAttribute<ParamLogistica, String> obs;
    public static volatile SingularAttribute<ParamLogistica, Integer> ultManifesto;
    public static volatile SingularAttribute<ParamLogistica, TipoDoctoLogistica> tipoDoctoLog;
    public static volatile SingularAttribute<ParamLogistica, Deposito> depositoPadraoEstoque;
    public static volatile SingularAttribute<ParamLogistica, SerieMDFe> serieMDFe;
    public static volatile SingularAttribute<ParamLogistica, SerieNotaFiscal> serieNF;
    public static volatile SingularAttribute<ParamLogistica, String> deletado;
    public static volatile SingularAttribute<ParamLogistica, Localizacao> localizacaoPadraoEstoque;
    public static volatile SingularAttribute<ParamLogistica, String> modificado;
    public static volatile SingularAttribute<ParamLogistica, Boolean> cadastraItem;
    public static volatile SingularAttribute<ParamLogistica, Boolean> saldoNegativo;
    public static volatile SingularAttribute<ParamLogistica, Integer> ultpedidocompras;
    public static volatile SingularAttribute<ParamLogistica, Date> datainativo;
    public static volatile SingularAttribute<ParamLogistica, SerieMDFe> serieMDFeSaida;
    public static volatile SingularAttribute<ParamLogistica, Date> periniaberto;
    public static volatile SingularAttribute<ParamLogistica, Integer> ultimaColeta;
    public static volatile SingularAttribute<ParamLogistica, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamLogistica, String> inativo;
    public static volatile SingularAttribute<ParamLogistica, Integer> id;
    public static volatile SingularAttribute<ParamLogistica, Estabelecimento> estabelPadrao;
    public static volatile SingularAttribute<ParamLogistica, Empresa> empresa;
    public static volatile SingularAttribute<ParamLogistica, SerieNotaFiscal> seriePDV;
    public static volatile SingularAttribute<ParamLogistica, Date> perfimaberto;
    public static volatile SingularAttribute<ParamLogistica, SerieNotaFiscal> serieNFEntrada;

}