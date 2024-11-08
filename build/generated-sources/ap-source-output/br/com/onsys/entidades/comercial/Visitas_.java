package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Visitas.class)
public class Visitas_ { 

    public static volatile SingularAttribute<Visitas, String> tipo;
    public static volatile SingularAttribute<Visitas, Usuario> usuarioCriacao;
    public static volatile SingularAttribute<Visitas, String> horaFimRealizada;
    public static volatile SingularAttribute<Visitas, String> historico;
    public static volatile SingularAttribute<Visitas, Usuario> usuarioVisita;
    public static volatile SingularAttribute<Visitas, Participante> participante;
    public static volatile SingularAttribute<Visitas, String> horaFimPrevista;
    public static volatile SingularAttribute<Visitas, String> horaInicioPrevista;
    public static volatile SingularAttribute<Visitas, String> horaInicioRealizada;
    public static volatile SingularAttribute<Visitas, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Visitas, Date> dataRealizada;
    public static volatile SingularAttribute<Visitas, Integer> id;
    public static volatile SingularAttribute<Visitas, Date> dataPrevista;
    public static volatile SingularAttribute<Visitas, Date> dataProximaVisita;
    public static volatile SingularAttribute<Visitas, Empresa> empresa;
    public static volatile SingularAttribute<Visitas, String> status;

}