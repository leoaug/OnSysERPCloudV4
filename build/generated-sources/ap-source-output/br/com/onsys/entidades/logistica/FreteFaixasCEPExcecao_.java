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
@StaticMetamodel(FreteFaixasCEPExcecao.class)
public class FreteFaixasCEPExcecao_ { 

    public static volatile SingularAttribute<FreteFaixasCEPExcecao, Estado> estado;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, Date> dataInativo;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, Frete> frete;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, String> deletado;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, String> inativo;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, String> modificado;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, Integer> id;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, String> cepInicial;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, String> cepFinal;
    public static volatile SingularAttribute<FreteFaixasCEPExcecao, Empresa> empresa;

}