package br.com.onsys.entidades.servicos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TabServicos.class)
public class TabServicos_ { 

    public static volatile SingularAttribute<TabServicos, String> obs;
    public static volatile SingularAttribute<TabServicos, String> codigo;
    public static volatile SingularAttribute<TabServicos, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TabServicos, String> deletado;
    public static volatile SingularAttribute<TabServicos, String> inativo;
    public static volatile SingularAttribute<TabServicos, String> modificado;
    public static volatile SingularAttribute<TabServicos, Integer> id;
    public static volatile SingularAttribute<TabServicos, Empresa> empresa;
    public static volatile SingularAttribute<TabServicos, Date> datainativo;
    public static volatile SingularAttribute<TabServicos, String> descricao;

}