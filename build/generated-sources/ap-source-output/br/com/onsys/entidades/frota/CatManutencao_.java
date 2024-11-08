package br.com.onsys.entidades.frota;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatManutencao.class)
public class CatManutencao_ { 

    public static volatile SingularAttribute<CatManutencao, String> obs;
    public static volatile SingularAttribute<CatManutencao, String> codigo;
    public static volatile SingularAttribute<CatManutencao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatManutencao, String> deletado;
    public static volatile SingularAttribute<CatManutencao, String> inativo;
    public static volatile SingularAttribute<CatManutencao, String> modificado;
    public static volatile SingularAttribute<CatManutencao, PlanoContas> contaativo;
    public static volatile SingularAttribute<CatManutencao, Integer> id;
    public static volatile SingularAttribute<CatManutencao, Empresa> empresa;
    public static volatile SingularAttribute<CatManutencao, Date> datainativo;
    public static volatile SingularAttribute<CatManutencao, String> descricao;

}