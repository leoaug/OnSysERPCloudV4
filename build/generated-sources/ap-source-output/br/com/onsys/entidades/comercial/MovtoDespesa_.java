package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.DespesasRep;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.TipoDespesa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MovtoDespesa.class)
public class MovtoDespesa_ { 

    public static volatile SingularAttribute<MovtoDespesa, TipoDespesa> tipodespesa;
    public static volatile SingularAttribute<MovtoDespesa, DespesasRep> despesaRep;
    public static volatile SingularAttribute<MovtoDespesa, Representante> representante;
    public static volatile SingularAttribute<MovtoDespesa, Integer> tpmovto;
    public static volatile SingularAttribute<MovtoDespesa, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MovtoDespesa, BigDecimal> vlmovto;
    public static volatile SingularAttribute<MovtoDespesa, String> historico;
    public static volatile SingularAttribute<MovtoDespesa, String> origem;
    public static volatile SingularAttribute<MovtoDespesa, Date> dtmovto;
    public static volatile SingularAttribute<MovtoDespesa, Integer> id;
    public static volatile SingularAttribute<MovtoDespesa, Empresa> empresa;

}