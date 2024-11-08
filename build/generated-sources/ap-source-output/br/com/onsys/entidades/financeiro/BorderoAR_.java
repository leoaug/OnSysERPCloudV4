package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.financeiro.Portador;
import br.com.onsys.entidades.financeiro.TipoDoctoFinanceiro;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(BorderoAR.class)
public class BorderoAR_ { 

    public static volatile SingularAttribute<BorderoAR, BigDecimal> vlservico;
    public static volatile SingularAttribute<BorderoAR, BigDecimal> vldespbancaria;
    public static volatile SingularAttribute<BorderoAR, String> historico;
    public static volatile SingularAttribute<BorderoAR, BigDecimal> vldesconto;
    public static volatile SingularAttribute<BorderoAR, TipoDoctoFinanceiro> tipodocto;
    public static volatile SingularAttribute<BorderoAR, BigDecimal> vltotdocto;
    public static volatile SingularAttribute<BorderoAR, String> nrodocto;
    public static volatile SingularAttribute<BorderoAR, Date> dataemissao;
    public static volatile SingularAttribute<BorderoAR, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<BorderoAR, Portador> portador;
    public static volatile SingularAttribute<BorderoAR, Integer> dias;
    public static volatile SingularAttribute<BorderoAR, BigDecimal> ftoper;
    public static volatile SingularAttribute<BorderoAR, Integer> id;
    public static volatile SingularAttribute<BorderoAR, BigDecimal> vliof;
    public static volatile SingularAttribute<BorderoAR, Empresa> empresa;

}