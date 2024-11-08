package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatItem.class)
public class CatItem_ { 

    public static volatile SingularAttribute<CatItem, String> obs;
    public static volatile SingularAttribute<CatItem, String> codigo;
    public static volatile SingularAttribute<CatItem, BigDecimal> descontocompra;
    public static volatile SingularAttribute<CatItem, PlanoContas> conta;
    public static volatile SingularAttribute<CatItem, String> deletado;
    public static volatile SingularAttribute<CatItem, String> modificado;
    public static volatile SingularAttribute<CatItem, String> comissaovenda;
    public static volatile SingularAttribute<CatItem, Date> datainativo;
    public static volatile SingularAttribute<CatItem, String> descricao;
    public static volatile SingularAttribute<CatItem, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatItem, String> inativo;
    public static volatile SingularAttribute<CatItem, Integer> id;
    public static volatile SingularAttribute<CatItem, Empresa> empresa;

}