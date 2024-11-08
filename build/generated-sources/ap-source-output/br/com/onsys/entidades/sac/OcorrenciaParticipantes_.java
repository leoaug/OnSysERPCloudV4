package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.sac.Ocorrencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OcorrenciaParticipantes.class)
public class OcorrenciaParticipantes_ { 

    public static volatile SingularAttribute<OcorrenciaParticipantes, Ocorrencia> ocorrencia;
    public static volatile SingularAttribute<OcorrenciaParticipantes, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OcorrenciaParticipantes, Integer> id;
    public static volatile SingularAttribute<OcorrenciaParticipantes, Empresa> empresa;
    public static volatile SingularAttribute<OcorrenciaParticipantes, Participante> participante;

}