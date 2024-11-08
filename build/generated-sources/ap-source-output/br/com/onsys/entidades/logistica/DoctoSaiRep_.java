package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.logistica.SerieNotaFiscal;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoSaiRep.class)
public class DoctoSaiRep_ { 

    public static volatile SingularAttribute<DoctoSaiRep, BigDecimal> perccomis;
    public static volatile SingularAttribute<DoctoSaiRep, Representante> representante;
    public static volatile SingularAttribute<DoctoSaiRep, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoSaiRep, DoctoSai> doctosai;
    public static volatile SingularAttribute<DoctoSaiRep, SerieNotaFiscal> serie;
    public static volatile SingularAttribute<DoctoSaiRep, Integer> id;
    public static volatile SingularAttribute<DoctoSaiRep, Empresa> empresa;
    public static volatile SingularAttribute<DoctoSaiRep, BigDecimal> valorcomis;
    public static volatile SingularAttribute<DoctoSaiRep, String> nrodocto;

}