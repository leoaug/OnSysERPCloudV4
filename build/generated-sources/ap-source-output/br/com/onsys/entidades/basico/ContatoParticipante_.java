package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ContatoParticipante.class)
public class ContatoParticipante_ { 

    public static volatile SingularAttribute<ContatoParticipante, String> setor;
    public static volatile SingularAttribute<ContatoParticipante, String> obs;
    public static volatile SingularAttribute<ContatoParticipante, String> obscontato;
    public static volatile SingularAttribute<ContatoParticipante, String> deletado;
    public static volatile SingularAttribute<ContatoParticipante, String> nome;
    public static volatile SingularAttribute<ContatoParticipante, String> modificado;
    public static volatile SingularAttribute<ContatoParticipante, Participante> participante;
    public static volatile SingularAttribute<ContatoParticipante, Date> datainativo;
    public static volatile SingularAttribute<ContatoParticipante, String> fone;
    public static volatile SingularAttribute<ContatoParticipante, Date> aniversario;
    public static volatile SingularAttribute<ContatoParticipante, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ContatoParticipante, String> celular;
    public static volatile SingularAttribute<ContatoParticipante, String> inativo;
    public static volatile SingularAttribute<ContatoParticipante, Integer> id;
    public static volatile SingularAttribute<ContatoParticipante, String> cargo;
    public static volatile SingularAttribute<ContatoParticipante, Empresa> empresa;
    public static volatile SingularAttribute<ContatoParticipante, String> ramal;
    public static volatile SingularAttribute<ContatoParticipante, String> email;

}