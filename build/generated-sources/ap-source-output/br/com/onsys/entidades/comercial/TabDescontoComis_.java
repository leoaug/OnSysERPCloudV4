package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TabDescontoComis.class)
public class TabDescontoComis_ { 

    public static volatile SingularAttribute<TabDescontoComis, String> obs;
    public static volatile SingularAttribute<TabDescontoComis, String> codigo;
    public static volatile SingularAttribute<TabDescontoComis, Date> datavalini;
    public static volatile SingularAttribute<TabDescontoComis, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TabDescontoComis, String> deletado;
    public static volatile SingularAttribute<TabDescontoComis, String> modificado;
    public static volatile SingularAttribute<TabDescontoComis, String> inativo;
    public static volatile SingularAttribute<TabDescontoComis, Integer> id;
    public static volatile SingularAttribute<TabDescontoComis, Date> datavalfim;
    public static volatile SingularAttribute<TabDescontoComis, Empresa> empresa;
    public static volatile SingularAttribute<TabDescontoComis, Date> datainativo;
    public static volatile SingularAttribute<TabDescontoComis, String> descricao;

}