package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.sac.Ocorrencia;
import br.com.onsys.entidades.seguranca.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OcorrenciaUsuario.class)
public class OcorrenciaUsuario_ { 

    public static volatile SingularAttribute<OcorrenciaUsuario, Ocorrencia> ocorrencia;
    public static volatile SingularAttribute<OcorrenciaUsuario, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OcorrenciaUsuario, Usuario> usuario;
    public static volatile SingularAttribute<OcorrenciaUsuario, Integer> id;
    public static volatile SingularAttribute<OcorrenciaUsuario, Empresa> empresa;

}