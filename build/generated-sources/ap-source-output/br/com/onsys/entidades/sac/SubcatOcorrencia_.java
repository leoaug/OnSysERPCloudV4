package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SubcatOcorrencia.class)
public class SubcatOcorrencia_ { 

    public static volatile SingularAttribute<SubcatOcorrencia, String> codigo;
    public static volatile SingularAttribute<SubcatOcorrencia, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SubcatOcorrencia, String> deletado;
    public static volatile SingularAttribute<SubcatOcorrencia, String> inativo;
    public static volatile SingularAttribute<SubcatOcorrencia, String> modificado;
    public static volatile SingularAttribute<SubcatOcorrencia, Integer> id;
    public static volatile SingularAttribute<SubcatOcorrencia, Empresa> empresa;
    public static volatile SingularAttribute<SubcatOcorrencia, Date> datainativo;
    public static volatile SingularAttribute<SubcatOcorrencia, String> descricao;

}