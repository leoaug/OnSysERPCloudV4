package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.GradeLinha;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(GradeLinha.class)
public class GradeLinha_ { 

    public static volatile SingularAttribute<GradeLinha, String> obs;
    public static volatile SingularAttribute<GradeLinha, String> codigo;
    public static volatile SingularAttribute<GradeLinha, String> tipo;
    public static volatile SingularAttribute<GradeLinha, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<GradeLinha, String> deletado;
    public static volatile SingularAttribute<GradeLinha, String> modificado;
    public static volatile SingularAttribute<GradeLinha, String> inativo;
    public static volatile SingularAttribute<GradeLinha, GradeLinha> gradeLinhaPai;
    public static volatile SingularAttribute<GradeLinha, Integer> id;
    public static volatile SingularAttribute<GradeLinha, Empresa> empresa;
    public static volatile SingularAttribute<GradeLinha, Date> datainativo;
    public static volatile SingularAttribute<GradeLinha, String> descricao;

}