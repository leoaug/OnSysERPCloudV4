package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TituloAR;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TituloARParcela.class)
public class TituloARParcela_ { 

    public static volatile SingularAttribute<TituloARParcela, Boolean> Status;
    public static volatile SingularAttribute<TituloARParcela, String> obs;
    public static volatile SingularAttribute<TituloARParcela, String> nossonumero;
    public static volatile SingularAttribute<TituloARParcela, Date> datadesconto;
    public static volatile SingularAttribute<TituloARParcela, String> codbarras;
    public static volatile SingularAttribute<TituloARParcela, TituloAR> tituloar;
    public static volatile SingularAttribute<TituloARParcela, Date> dataestorno;
    public static volatile SingularAttribute<TituloARParcela, Integer> ind_status;
    public static volatile SingularAttribute<TituloARParcela, String> linhadigitavel;
    public static volatile SingularAttribute<TituloARParcela, Integer> parcela;
    public static volatile SingularAttribute<TituloARParcela, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TituloARParcela, Portador> portador;
    public static volatile SingularAttribute<TituloARParcela, BigDecimal> valorparcela;
    public static volatile SingularAttribute<TituloARParcela, Date> datavencimento;
    public static volatile SingularAttribute<TituloARParcela, Date> datapagto;
    public static volatile SingularAttribute<TituloARParcela, String> vencimentoGerencial;
    public static volatile SingularAttribute<TituloARParcela, Integer> id;
    public static volatile SingularAttribute<TituloARParcela, Empresa> empresa;
    public static volatile SingularAttribute<TituloARParcela, BigDecimal> vlsaldo;

}