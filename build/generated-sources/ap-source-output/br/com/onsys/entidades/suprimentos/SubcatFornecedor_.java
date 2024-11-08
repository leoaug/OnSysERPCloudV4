package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SubcatFornecedor.class)
public class SubcatFornecedor_ { 

    public static volatile SingularAttribute<SubcatFornecedor, String> obs;
    public static volatile SingularAttribute<SubcatFornecedor, String> codigo;
    public static volatile SingularAttribute<SubcatFornecedor, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SubcatFornecedor, String> deletado;
    public static volatile SingularAttribute<SubcatFornecedor, String> inativo;
    public static volatile SingularAttribute<SubcatFornecedor, String> modificado;
    public static volatile SingularAttribute<SubcatFornecedor, Integer> id;
    public static volatile SingularAttribute<SubcatFornecedor, Empresa> empresa;
    public static volatile SingularAttribute<SubcatFornecedor, Date> datainativo;
    public static volatile SingularAttribute<SubcatFornecedor, String> descricao;

}