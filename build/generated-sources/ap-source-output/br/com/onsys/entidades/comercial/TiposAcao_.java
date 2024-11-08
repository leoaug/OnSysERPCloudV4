package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TiposAcao.class)
public class TiposAcao_ { 

    public static volatile SingularAttribute<TiposAcao, String> obs;
    public static volatile SingularAttribute<TiposAcao, String> codigo;
    public static volatile SingularAttribute<TiposAcao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TiposAcao, String> deletado;
    public static volatile SingularAttribute<TiposAcao, String> inativo;
    public static volatile SingularAttribute<TiposAcao, String> modificado;
    public static volatile SingularAttribute<TiposAcao, Integer> id;
    public static volatile SingularAttribute<TiposAcao, Empresa> empresa;
    public static volatile SingularAttribute<TiposAcao, Date> datainativo;
    public static volatile SingularAttribute<TiposAcao, String> descricao;

}