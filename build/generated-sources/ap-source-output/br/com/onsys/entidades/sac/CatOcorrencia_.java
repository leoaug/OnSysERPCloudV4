package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatOcorrencia.class)
public class CatOcorrencia_ { 

    public static volatile SingularAttribute<CatOcorrencia, String> codigo;
    public static volatile SingularAttribute<CatOcorrencia, Boolean> geraFinanceiro;
    public static volatile SingularAttribute<CatOcorrencia, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatOcorrencia, String> origem;
    public static volatile SingularAttribute<CatOcorrencia, String> deletado;
    public static volatile SingularAttribute<CatOcorrencia, String> inativo;
    public static volatile SingularAttribute<CatOcorrencia, String> modificado;
    public static volatile SingularAttribute<CatOcorrencia, Integer> id;
    public static volatile SingularAttribute<CatOcorrencia, Empresa> empresa;
    public static volatile SingularAttribute<CatOcorrencia, Date> datainativo;
    public static volatile SingularAttribute<CatOcorrencia, String> descricao;

}