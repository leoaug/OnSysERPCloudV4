package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatCompras.class)
public class CatCompras_ { 

    public static volatile SingularAttribute<CatCompras, String> obs;
    public static volatile SingularAttribute<CatCompras, String> codigo;
    public static volatile SingularAttribute<CatCompras, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatCompras, String> deletado;
    public static volatile SingularAttribute<CatCompras, String> inativo;
    public static volatile SingularAttribute<CatCompras, Integer> id;
    public static volatile SingularAttribute<CatCompras, Empresa> empresa;
    public static volatile SingularAttribute<CatCompras, Date> datainativo;
    public static volatile SingularAttribute<CatCompras, String> descricao;

}