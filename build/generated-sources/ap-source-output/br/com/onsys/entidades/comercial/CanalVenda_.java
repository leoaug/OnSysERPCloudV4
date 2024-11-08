package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CanalVenda.class)
public class CanalVenda_ { 

    public static volatile SingularAttribute<CanalVenda, String> obs;
    public static volatile SingularAttribute<CanalVenda, String> codigo;
    public static volatile SingularAttribute<CanalVenda, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CanalVenda, String> deletado;
    public static volatile SingularAttribute<CanalVenda, String> inativo;
    public static volatile SingularAttribute<CanalVenda, String> modificado;
    public static volatile SingularAttribute<CanalVenda, Integer> id;
    public static volatile SingularAttribute<CanalVenda, Empresa> empresa;
    public static volatile SingularAttribute<CanalVenda, Date> datainativo;
    public static volatile SingularAttribute<CanalVenda, String> descricao;

}