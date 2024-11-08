package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.logistica.DoctoEnt;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoEntContabil.class)
public class DoctoEntContabil_ { 

    public static volatile SingularAttribute<DoctoEntContabil, BigDecimal> vldebito;
    public static volatile SingularAttribute<DoctoEntContabil, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoEntContabil, DoctoEnt> doctologistica;
    public static volatile SingularAttribute<DoctoEntContabil, BigDecimal> vlcredito;
    public static volatile SingularAttribute<DoctoEntContabil, Integer> id;
    public static volatile SingularAttribute<DoctoEntContabil, PlanoContas> ctacredito;
    public static volatile SingularAttribute<DoctoEntContabil, Empresa> empresa;
    public static volatile SingularAttribute<DoctoEntContabil, PlanoContas> ctadebito;

}