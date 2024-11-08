package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.sac.Ocorrencia;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OcorrenciaRastrea.class)
public class OcorrenciaRastrea_ { 

    public static volatile SingularAttribute<OcorrenciaRastrea, String> data;
    public static volatile SingularAttribute<OcorrenciaRastrea, Ocorrencia> ocorrencia;
    public static volatile SingularAttribute<OcorrenciaRastrea, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OcorrenciaRastrea, Usuario> usuario;
    public static volatile SingularAttribute<OcorrenciaRastrea, Integer> id;
    public static volatile SingularAttribute<OcorrenciaRastrea, Empresa> empresa;
    public static volatile SingularAttribute<OcorrenciaRastrea, String> descricao;

}