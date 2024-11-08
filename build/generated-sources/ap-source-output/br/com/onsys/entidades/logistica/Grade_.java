package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.GradeColuna;
import br.com.onsys.entidades.logistica.GradeLinha;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Grade.class)
public class Grade_ { 

    public static volatile SingularAttribute<Grade, String> obs;
    public static volatile SingularAttribute<Grade, String> codigo;
    public static volatile SingularAttribute<Grade, GradeLinha> gradeLinha;
    public static volatile SingularAttribute<Grade, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Grade, String> deletado;
    public static volatile SingularAttribute<Grade, GradeColuna> gradeColuna;
    public static volatile SingularAttribute<Grade, String> modificado;
    public static volatile SingularAttribute<Grade, String> inativo;
    public static volatile SingularAttribute<Grade, Integer> id;
    public static volatile SingularAttribute<Grade, Empresa> empresa;
    public static volatile SingularAttribute<Grade, Date> datainativo;
    public static volatile SingularAttribute<Grade, String> descricao;

}