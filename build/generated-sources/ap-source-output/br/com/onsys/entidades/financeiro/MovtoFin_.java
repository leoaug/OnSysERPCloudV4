package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TipoDoctoFinanceiro;
import br.com.onsys.entidades.financeiro.TituloAP;
import br.com.onsys.entidades.financeiro.TituloAPParcela;
import br.com.onsys.entidades.financeiro.TituloAR;
import br.com.onsys.entidades.financeiro.TituloARParcela;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MovtoFin.class)
public class MovtoFin_ { 

    public static volatile SingularAttribute<MovtoFin, TituloARParcela> tituloarparcela;
    public static volatile SingularAttribute<MovtoFin, TituloAP> tituloap;
    public static volatile SingularAttribute<MovtoFin, TituloAR> tituloar;
    public static volatile SingularAttribute<MovtoFin, BigDecimal> vlmovto;
    public static volatile SingularAttribute<MovtoFin, String> historico;
    public static volatile SingularAttribute<MovtoFin, String> origem;
    public static volatile SingularAttribute<MovtoFin, TipoDoctoFinanceiro> tipodocto;
    public static volatile SingularAttribute<MovtoFin, Date> dtmovto;
    public static volatile SingularAttribute<MovtoFin, Participante> participante;
    public static volatile SingularAttribute<MovtoFin, String> nrodocto;
    public static volatile SingularAttribute<MovtoFin, Integer> tpmovto;
    public static volatile SingularAttribute<MovtoFin, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MovtoFin, CondPagamento> condPagamento;
    public static volatile SingularAttribute<MovtoFin, Portador> portador;
    public static volatile SingularAttribute<MovtoFin, String> serie;
    public static volatile SingularAttribute<MovtoFin, Integer> id;
    public static volatile SingularAttribute<MovtoFin, Empresa> empresa;
    public static volatile SingularAttribute<MovtoFin, TituloAPParcela> tituloapparcela;

}