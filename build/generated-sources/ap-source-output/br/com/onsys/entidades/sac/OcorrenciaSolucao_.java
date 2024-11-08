package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.sac.CatOcorrencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OcorrenciaSolucao.class)
public class OcorrenciaSolucao_ { 

    public static volatile SingularAttribute<OcorrenciaSolucao, String> obs;
    public static volatile SingularAttribute<OcorrenciaSolucao, String> codigo;
    public static volatile SingularAttribute<OcorrenciaSolucao, String> tipo;
    public static volatile SingularAttribute<OcorrenciaSolucao, CatOcorrencia> catocorrencia;
    public static volatile SingularAttribute<OcorrenciaSolucao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OcorrenciaSolucao, String> deletado;
    public static volatile SingularAttribute<OcorrenciaSolucao, String> modificado;
    public static volatile SingularAttribute<OcorrenciaSolucao, String> inativo;
    public static volatile SingularAttribute<OcorrenciaSolucao, Integer> id;
    public static volatile SingularAttribute<OcorrenciaSolucao, Empresa> empresa;
    public static volatile SingularAttribute<OcorrenciaSolucao, Date> datainativo;
    public static volatile SingularAttribute<OcorrenciaSolucao, String> descricao;

}