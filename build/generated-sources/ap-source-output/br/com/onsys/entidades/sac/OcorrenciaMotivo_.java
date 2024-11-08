package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.sac.CatOcorrencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OcorrenciaMotivo.class)
public class OcorrenciaMotivo_ { 

    public static volatile SingularAttribute<OcorrenciaMotivo, String> obs;
    public static volatile SingularAttribute<OcorrenciaMotivo, String> codigo;
    public static volatile SingularAttribute<OcorrenciaMotivo, String> tipo;
    public static volatile SingularAttribute<OcorrenciaMotivo, CatOcorrencia> catocorrencia;
    public static volatile SingularAttribute<OcorrenciaMotivo, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OcorrenciaMotivo, String> deletado;
    public static volatile SingularAttribute<OcorrenciaMotivo, String> modificado;
    public static volatile SingularAttribute<OcorrenciaMotivo, String> inativo;
    public static volatile SingularAttribute<OcorrenciaMotivo, Integer> id;
    public static volatile SingularAttribute<OcorrenciaMotivo, Empresa> empresa;
    public static volatile SingularAttribute<OcorrenciaMotivo, Date> datainativo;
    public static volatile SingularAttribute<OcorrenciaMotivo, String> descricao;

}