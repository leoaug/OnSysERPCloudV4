package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.financeiro.CatFluxoCaixa;
import br.com.onsys.entidades.tipos.TipoConta;
import br.com.onsys.entidades.tipos.TpReceitaDespesa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatFluxoCaixa.class)
public class CatFluxoCaixa_ { 

    public static volatile SingularAttribute<CatFluxoCaixa, String> codigo;
    public static volatile SingularAttribute<CatFluxoCaixa, TipoConta> tipo;
    public static volatile SingularAttribute<CatFluxoCaixa, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatFluxoCaixa, String> deletado;
    public static volatile SingularAttribute<CatFluxoCaixa, String> inativo;
    public static volatile SingularAttribute<CatFluxoCaixa, Integer> id;
    public static volatile SingularAttribute<CatFluxoCaixa, Empresa> empresa;
    public static volatile SingularAttribute<CatFluxoCaixa, Date> datainativo;
    public static volatile SingularAttribute<CatFluxoCaixa, CatFluxoCaixa> catfluxopai;
    public static volatile SingularAttribute<CatFluxoCaixa, String> descricao;
    public static volatile SingularAttribute<CatFluxoCaixa, TpReceitaDespesa> tpreceitadespesa;

}