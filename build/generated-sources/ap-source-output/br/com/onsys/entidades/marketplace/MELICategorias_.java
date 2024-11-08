package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.marketplace.MELICategorias;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MELICategorias.class)
public class MELICategorias_ { 

    public static volatile SingularAttribute<MELICategorias, String> obs;
    public static volatile SingularAttribute<MELICategorias, String> codigo;
    public static volatile SingularAttribute<MELICategorias, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MELICategorias, String> deletado;
    public static volatile SingularAttribute<MELICategorias, String> inativo;
    public static volatile SingularAttribute<MELICategorias, String> modificado;
    public static volatile SingularAttribute<MELICategorias, Integer> id;
    public static volatile SingularAttribute<MELICategorias, Empresa> empresa;
    public static volatile SingularAttribute<MELICategorias, Date> datainativo;
    public static volatile SingularAttribute<MELICategorias, MELICategorias> categoriaPai;
    public static volatile SingularAttribute<MELICategorias, String> descricao;

}