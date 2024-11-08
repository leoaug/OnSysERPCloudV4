package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.SerieMDFe;
import br.com.onsys.entidades.logistica.SerieNotaFiscal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamSuprimentos.class)
public class ParamSuprimentos_ { 

    public static volatile SingularAttribute<ParamSuprimentos, String> obs;
    public static volatile SingularAttribute<ParamSuprimentos, Integer> ultManifesto;
    public static volatile SingularAttribute<ParamSuprimentos, Boolean> itemFornecedor;
    public static volatile SingularAttribute<ParamSuprimentos, String> deletado;
    public static volatile SingularAttribute<ParamSuprimentos, SerieMDFe> serieMDFe;
    public static volatile SingularAttribute<ParamSuprimentos, SerieNotaFiscal> serieNF;
    public static volatile SingularAttribute<ParamSuprimentos, String> modificado;
    public static volatile SingularAttribute<ParamSuprimentos, Integer> ultpedidocompras;
    public static volatile SingularAttribute<ParamSuprimentos, Date> datainativo;
    public static volatile SingularAttribute<ParamSuprimentos, SerieMDFe> serieMDFeSaida;
    public static volatile SingularAttribute<ParamSuprimentos, Date> periniaberto;
    public static volatile SingularAttribute<ParamSuprimentos, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamSuprimentos, String> inativo;
    public static volatile SingularAttribute<ParamSuprimentos, Integer> id;
    public static volatile SingularAttribute<ParamSuprimentos, Estabelecimento> estabelPadrao;
    public static volatile SingularAttribute<ParamSuprimentos, Empresa> empresa;
    public static volatile SingularAttribute<ParamSuprimentos, SerieNotaFiscal> seriePDV;
    public static volatile SingularAttribute<ParamSuprimentos, Date> perfimaberto;
    public static volatile SingularAttribute<ParamSuprimentos, SerieNotaFiscal> serieNFEntrada;

}