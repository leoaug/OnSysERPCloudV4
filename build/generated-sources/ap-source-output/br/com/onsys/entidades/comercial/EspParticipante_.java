package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Participante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EspParticipante.class)
public class EspParticipante_ { 

    public static volatile SingularAttribute<EspParticipante, Integer> codigo;
    public static volatile SingularAttribute<EspParticipante, String> compraProdControl;
    public static volatile SingularAttribute<EspParticipante, Date> dataValidade;
    public static volatile SingularAttribute<EspParticipante, Integer> id;
    public static volatile SingularAttribute<EspParticipante, Empresa> empresa;
    public static volatile SingularAttribute<EspParticipante, Participante> participante;
    public static volatile SingularAttribute<EspParticipante, String> descricao;

}