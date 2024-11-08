package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PlanoVenda.class)
public class PlanoVenda_ { 

    public static volatile SingularAttribute<PlanoVenda, String> obs;
    public static volatile SingularAttribute<PlanoVenda, String> codigo;
    public static volatile SingularAttribute<PlanoVenda, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PlanoVenda, String> deletado;
    public static volatile SingularAttribute<PlanoVenda, String> inativo;
    public static volatile SingularAttribute<PlanoVenda, String> modificado;
    public static volatile SingularAttribute<PlanoVenda, Integer> id;
    public static volatile SingularAttribute<PlanoVenda, Empresa> empresa;
    public static volatile SingularAttribute<PlanoVenda, Date> datainativo;
    public static volatile SingularAttribute<PlanoVenda, String> descricao;

}