package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.logistica.Frete;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteFaixasCEP.class)
public class FreteFaixasCEP_ { 

    public static volatile SingularAttribute<FreteFaixasCEP, Estado> estado;
    public static volatile SingularAttribute<FreteFaixasCEP, Integer> diasEntrega;
    public static volatile SingularAttribute<FreteFaixasCEP, Date> dataInativo;
    public static volatile SingularAttribute<FreteFaixasCEP, Double> iss;
    public static volatile SingularAttribute<FreteFaixasCEP, String> deletado;
    public static volatile SingularAttribute<FreteFaixasCEP, String> modificado;
    public static volatile SingularAttribute<FreteFaixasCEP, Double> icms;
    public static volatile SingularAttribute<FreteFaixasCEP, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteFaixasCEP, Frete> frete;
    public static volatile SingularAttribute<FreteFaixasCEP, String> inativo;
    public static volatile SingularAttribute<FreteFaixasCEP, Integer> id;
    public static volatile SingularAttribute<FreteFaixasCEP, String> cepInicial;
    public static volatile SingularAttribute<FreteFaixasCEP, String> cepFinal;
    public static volatile SingularAttribute<FreteFaixasCEP, Empresa> empresa;

}