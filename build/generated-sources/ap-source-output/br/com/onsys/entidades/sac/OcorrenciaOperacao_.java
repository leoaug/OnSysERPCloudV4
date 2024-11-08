package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.sac.CatOcorrencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OcorrenciaOperacao.class)
public class OcorrenciaOperacao_ { 

    public static volatile SingularAttribute<OcorrenciaOperacao, String> obs;
    public static volatile SingularAttribute<OcorrenciaOperacao, String> codigo;
    public static volatile SingularAttribute<OcorrenciaOperacao, String> tipo;
    public static volatile SingularAttribute<OcorrenciaOperacao, CatOcorrencia> catocorrencia;
    public static volatile SingularAttribute<OcorrenciaOperacao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OcorrenciaOperacao, String> deletado;
    public static volatile SingularAttribute<OcorrenciaOperacao, String> modificado;
    public static volatile SingularAttribute<OcorrenciaOperacao, String> inativo;
    public static volatile SingularAttribute<OcorrenciaOperacao, Integer> id;
    public static volatile SingularAttribute<OcorrenciaOperacao, Empresa> empresa;
    public static volatile SingularAttribute<OcorrenciaOperacao, Date> datainativo;
    public static volatile SingularAttribute<OcorrenciaOperacao, String> descricao;

}