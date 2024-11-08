package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.logistica.DoctoSaiExecutorOcorrencia;
import br.com.onsys.entidades.logistica.DoctoSaiOcorrencia;
import br.com.onsys.entidades.logistica.DoctoSaiResponsavelOcorrencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoSaiDoctoSaiOcorrencia.class)
public class DoctoSaiDoctoSaiOcorrencia_ { 

    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, String> obs;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, Date> dataOcorrencia;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, DoctoSai> doctoSai;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, CentroCusto> solicitante;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, DoctoSaiExecutorOcorrencia> doctoSaiExecutorOcorrencia;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, String> horaOcorrencia;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, DoctoSaiOcorrencia> doctoSaiOcorrencia;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, Integer> id;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, Empresa> empresa;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, PedidoVendas> pedidoVendas;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, DoctoSaiResponsavelOcorrencia> doctoSaiResponsavelOcorrencia;
    public static volatile SingularAttribute<DoctoSaiDoctoSaiOcorrencia, String> status;

}