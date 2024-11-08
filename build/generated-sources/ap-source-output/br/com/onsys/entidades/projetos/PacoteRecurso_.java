package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PacoteRecurso.class)
public class PacoteRecurso_ { 

    public static volatile SingularAttribute<PacoteRecurso, BigDecimal> vlexecutorhh;
    public static volatile SingularAttribute<PacoteRecurso, Integer> recurso_id;
    public static volatile SingularAttribute<PacoteRecurso, BigDecimal> vldespesa;
    public static volatile SingularAttribute<PacoteRecurso, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PacoteRecurso, BigDecimal> vlexecutor;
    public static volatile SingularAttribute<PacoteRecurso, Integer> id;
    public static volatile SingularAttribute<PacoteRecurso, Integer> pacote_id;
    public static volatile SingularAttribute<PacoteRecurso, Empresa> empresa;

}