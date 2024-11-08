package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.projetos.Projeto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ProjetoParticipantes.class)
public class ProjetoParticipantes_ { 

    public static volatile SingularAttribute<ProjetoParticipantes, Projeto> projeto;
    public static volatile SingularAttribute<ProjetoParticipantes, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ProjetoParticipantes, Boolean> recebeemail;
    public static volatile SingularAttribute<ProjetoParticipantes, Integer> id;
    public static volatile SingularAttribute<ProjetoParticipantes, Empresa> empresa;
    public static volatile SingularAttribute<ProjetoParticipantes, Participante> participante;

}