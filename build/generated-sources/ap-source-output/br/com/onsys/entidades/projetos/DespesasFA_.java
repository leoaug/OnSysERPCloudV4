package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.projetos.Componenteeap;
import br.com.onsys.entidades.projetos.FichaAprop;
import br.com.onsys.entidades.tipos.TipoDespesaFA;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DespesasFA.class)
public class DespesasFA_ { 

    public static volatile SingularAttribute<DespesasFA, String> obs;
    public static volatile SingularAttribute<DespesasFA, TipoDespesaFA> tipo;
    public static volatile SingularAttribute<DespesasFA, BigDecimal> valor;
    public static volatile SingularAttribute<DespesasFA, FichaAprop> fichaaprop;
    public static volatile SingularAttribute<DespesasFA, Componenteeap> pacote;
    public static volatile SingularAttribute<DespesasFA, Integer> id;
    public static volatile SingularAttribute<DespesasFA, Date> datamovto;

}