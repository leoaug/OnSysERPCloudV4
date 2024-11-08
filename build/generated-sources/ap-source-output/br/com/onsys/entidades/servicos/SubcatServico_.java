package br.com.onsys.entidades.servicos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SubcatServico.class)
public class SubcatServico_ { 

    public static volatile SingularAttribute<SubcatServico, String> obs;
    public static volatile SingularAttribute<SubcatServico, String> codigo;
    public static volatile SingularAttribute<SubcatServico, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SubcatServico, String> deletado;
    public static volatile SingularAttribute<SubcatServico, String> inativo;
    public static volatile SingularAttribute<SubcatServico, String> modificado;
    public static volatile SingularAttribute<SubcatServico, Integer> id;
    public static volatile SingularAttribute<SubcatServico, Empresa> empresa;
    public static volatile SingularAttribute<SubcatServico, Date> datainativo;
    public static volatile SingularAttribute<SubcatServico, String> descricao;

}