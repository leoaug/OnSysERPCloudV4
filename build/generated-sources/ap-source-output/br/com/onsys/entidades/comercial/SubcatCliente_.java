package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SubcatCliente.class)
public class SubcatCliente_ { 

    public static volatile SingularAttribute<SubcatCliente, String> obs;
    public static volatile SingularAttribute<SubcatCliente, String> codigo;
    public static volatile SingularAttribute<SubcatCliente, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SubcatCliente, String> deletado;
    public static volatile SingularAttribute<SubcatCliente, String> inativo;
    public static volatile SingularAttribute<SubcatCliente, String> modificado;
    public static volatile SingularAttribute<SubcatCliente, Integer> id;
    public static volatile SingularAttribute<SubcatCliente, Empresa> empresa;
    public static volatile SingularAttribute<SubcatCliente, Date> datainativo;
    public static volatile SingularAttribute<SubcatCliente, String> descricao;

}