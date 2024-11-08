package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.GradeColuna;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(GradeColuna.class)
public class GradeColuna_ { 

    public static volatile SingularAttribute<GradeColuna, String> obs;
    public static volatile SingularAttribute<GradeColuna, String> codigo;
    public static volatile SingularAttribute<GradeColuna, String> tipo;
    public static volatile SingularAttribute<GradeColuna, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<GradeColuna, String> deletado;
    public static volatile SingularAttribute<GradeColuna, String> modificado;
    public static volatile SingularAttribute<GradeColuna, GradeColuna> gradeColunaPai;
    public static volatile SingularAttribute<GradeColuna, String> inativo;
    public static volatile SingularAttribute<GradeColuna, Integer> id;
    public static volatile SingularAttribute<GradeColuna, Empresa> empresa;
    public static volatile SingularAttribute<GradeColuna, Date> datainativo;
    public static volatile SingularAttribute<GradeColuna, String> descricao;

}