package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.logistica.DoctoEntTitAP;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoEntTitAPParcela.class)
public class DoctoEntTitAPParcela_ { 

    public static volatile SingularAttribute<DoctoEntTitAPParcela, String> obs;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, String> nossonumero;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, String> codbarras;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Date> dataestorno;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, String> linhadigitavel;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Integer> parcela;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, DoctoEntTitAP> doctoenttitap;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Portador> portador;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, BigDecimal> valorparcela;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Date> datavencimento;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Date> datapagto;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, String> vencimentoGerencial;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Integer> id;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, Empresa> empresa;
    public static volatile SingularAttribute<DoctoEntTitAPParcela, BigDecimal> vlsaldo;

}