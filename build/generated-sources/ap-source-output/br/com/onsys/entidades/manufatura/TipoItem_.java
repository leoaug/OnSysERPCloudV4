package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TipoItem.class)
public class TipoItem_ { 

    public static volatile SingularAttribute<TipoItem, String> obs;
    public static volatile SingularAttribute<TipoItem, String> codigo;
    public static volatile SingularAttribute<TipoItem, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TipoItem, String> deletado;
    public static volatile SingularAttribute<TipoItem, String> inativo;
    public static volatile SingularAttribute<TipoItem, String> modificado;
    public static volatile SingularAttribute<TipoItem, Integer> id;
    public static volatile SingularAttribute<TipoItem, Empresa> empresa;
    public static volatile SingularAttribute<TipoItem, Date> datainativo;
    public static volatile SingularAttribute<TipoItem, String> descricao;

}