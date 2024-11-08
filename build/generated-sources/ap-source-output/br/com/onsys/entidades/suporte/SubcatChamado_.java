package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SubcatChamado.class)
public class SubcatChamado_ { 

    public static volatile SingularAttribute<SubcatChamado, String> obs;
    public static volatile SingularAttribute<SubcatChamado, String> codigo;
    public static volatile SingularAttribute<SubcatChamado, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SubcatChamado, String> deletado;
    public static volatile SingularAttribute<SubcatChamado, String> inativo;
    public static volatile SingularAttribute<SubcatChamado, String> modificado;
    public static volatile SingularAttribute<SubcatChamado, Integer> id;
    public static volatile SingularAttribute<SubcatChamado, Empresa> empresa;
    public static volatile SingularAttribute<SubcatChamado, Date> datainativo;
    public static volatile SingularAttribute<SubcatChamado, String> descricao;

}