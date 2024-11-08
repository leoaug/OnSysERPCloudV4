package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatCliente.class)
public class CatCliente_ { 

    public static volatile SingularAttribute<CatCliente, BigDecimal> perccomis;
    public static volatile SingularAttribute<CatCliente, String> obs;
    public static volatile SingularAttribute<CatCliente, String> codigo;
    public static volatile SingularAttribute<CatCliente, String> deletado;
    public static volatile SingularAttribute<CatCliente, String> modificado;
    public static volatile SingularAttribute<CatCliente, Date> datainativo;
    public static volatile SingularAttribute<CatCliente, String> descricao;
    public static volatile SingularAttribute<CatCliente, BigDecimal> custocontratual;
    public static volatile SingularAttribute<CatCliente, BigDecimal> percfrete;
    public static volatile SingularAttribute<CatCliente, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatCliente, BigDecimal> descontomax;
    public static volatile SingularAttribute<CatCliente, String> inativo;
    public static volatile SingularAttribute<CatCliente, PlanoContas> contaativo;
    public static volatile SingularAttribute<CatCliente, Integer> id;
    public static volatile SingularAttribute<CatCliente, Empresa> empresa;

}