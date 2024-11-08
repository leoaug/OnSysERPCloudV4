package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.comercial.TipoDespesa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DespesasRep.class)
public class DespesasRep_ { 

    public static volatile SingularAttribute<DespesasRep, BigDecimal> qtd;
    public static volatile SingularAttribute<DespesasRep, String> obs;
    public static volatile SingularAttribute<DespesasRep, String> tipo;
    public static volatile SingularAttribute<DespesasRep, byte[]> comprovante;
    public static volatile SingularAttribute<DespesasRep, TipoDespesa> tipodespesa;
    public static volatile SingularAttribute<DespesasRep, BigDecimal> valor;
    public static volatile SingularAttribute<DespesasRep, Estado> estadoini;
    public static volatile SingularAttribute<DespesasRep, Estado> estadofin;
    public static volatile SingularAttribute<DespesasRep, Municipio> municipioini;
    public static volatile SingularAttribute<DespesasRep, Representante> representante;
    public static volatile SingularAttribute<DespesasRep, Municipio> municipiofin;
    public static volatile SingularAttribute<DespesasRep, String> arquivo;
    public static volatile SingularAttribute<DespesasRep, Integer> id;
    public static volatile SingularAttribute<DespesasRep, Empresa> empresa;
    public static volatile SingularAttribute<DespesasRep, Date> datamovto;
    public static volatile SingularAttribute<DespesasRep, String> status;

}