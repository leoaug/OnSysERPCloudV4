package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TituloAP;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TituloAPParcela.class)
public class TituloAPParcela_ { 

    public static volatile SingularAttribute<TituloAPParcela, String> obs;
    public static volatile SingularAttribute<TituloAPParcela, String> nossonumero;
    public static volatile SingularAttribute<TituloAPParcela, TituloAP> tituloap;
    public static volatile SingularAttribute<TituloAPParcela, String> codbarras;
    public static volatile SingularAttribute<TituloAPParcela, Date> dataestorno;
    public static volatile SingularAttribute<TituloAPParcela, String> linhadigitavel;
    public static volatile SingularAttribute<TituloAPParcela, Integer> parcela;
    public static volatile SingularAttribute<TituloAPParcela, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TituloAPParcela, Portador> portador;
    public static volatile SingularAttribute<TituloAPParcela, BigDecimal> valorparcela;
    public static volatile SingularAttribute<TituloAPParcela, Date> datavencimento;
    public static volatile SingularAttribute<TituloAPParcela, Date> datapagto;
    public static volatile SingularAttribute<TituloAPParcela, String> vencimentoGerencial;
    public static volatile SingularAttribute<TituloAPParcela, Integer> id;
    public static volatile SingularAttribute<TituloAPParcela, Empresa> empresa;
    public static volatile SingularAttribute<TituloAPParcela, BigDecimal> vlsaldo;

}