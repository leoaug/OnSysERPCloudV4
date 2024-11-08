package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.FreteFaixas;
import br.com.onsys.entidades.logistica.Transportadora;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Frete.class)
public class Frete_ { 

    public static volatile SingularAttribute<Frete, Double> seguro;
    public static volatile SingularAttribute<Frete, Double> outrosPercentual;
    public static volatile SingularAttribute<Frete, Double> outrosValor;
    public static volatile SingularAttribute<Frete, String> obs;
    public static volatile SingularAttribute<Frete, String> codigo;
    public static volatile SingularAttribute<Frete, Double> gris;
    public static volatile SingularAttribute<Frete, Date> datavalini;
    public static volatile SingularAttribute<Frete, Double> fatorCubagem;
    public static volatile SingularAttribute<Frete, String> deletado;
    public static volatile SingularAttribute<Frete, String> modificado;
    public static volatile SingularAttribute<Frete, Double> adValorem;
    public static volatile SingularAttribute<Frete, Date> datainativo;
    public static volatile SingularAttribute<Frete, Transportadora> transportadora;
    public static volatile SingularAttribute<Frete, String> descricao;
    public static volatile ListAttribute<Frete, FreteFaixas> listFreteFaixas;
    public static volatile SingularAttribute<Frete, String> tipoTabela;
    public static volatile SingularAttribute<Frete, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Frete, String> inativo;
    public static volatile SingularAttribute<Frete, Integer> id;
    public static volatile SingularAttribute<Frete, Date> datavalfim;
    public static volatile SingularAttribute<Frete, Empresa> empresa;

}