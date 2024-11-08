package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.sac.Objetivos;
import br.com.onsys.entidades.sac.Ocorrencia;
import br.com.onsys.entidades.sac.Origens;
import br.com.onsys.entidades.sac.Resultados;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Agenda.class)
public class Agenda_ { 

    public static volatile SingularAttribute<Agenda, String> obs;
    public static volatile SingularAttribute<Agenda, String> modificado;
    public static volatile SingularAttribute<Agenda, Boolean> tiporemota;
    public static volatile SingularAttribute<Agenda, Date> datainativo;
    public static volatile SingularAttribute<Agenda, String> resultobs;
    public static volatile SingularAttribute<Agenda, Resultados> resultados;
    public static volatile SingularAttribute<Agenda, Objetivos> objetivos;
    public static volatile SingularAttribute<Agenda, String> visitaobs;
    public static volatile SingularAttribute<Agenda, Integer> id;
    public static volatile SingularAttribute<Agenda, String> statusvisita;
    public static volatile SingularAttribute<Agenda, Date> datavisita;
    public static volatile SingularAttribute<Agenda, Date> dataconfirmacao;
    public static volatile SingularAttribute<Agenda, Origens> origens;
    public static volatile SingularAttribute<Agenda, Boolean> visitaplan;
    public static volatile SingularAttribute<Agenda, Boolean> exigeconf;
    public static volatile SingularAttribute<Agenda, String> deletado;
    public static volatile SingularAttribute<Agenda, Participante> participante;
    public static volatile SingularAttribute<Agenda, BigDecimal> horavisita;
    public static volatile SingularAttribute<Agenda, BigDecimal> resulhorain;
    public static volatile SingularAttribute<Agenda, Ocorrencia> ocorrencia;
    public static volatile SingularAttribute<Agenda, Representante> representante;
    public static volatile SingularAttribute<Agenda, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Agenda, String> inativo;
    public static volatile SingularAttribute<Agenda, Usuario> usuario;
    public static volatile SingularAttribute<Agenda, Empresa> empresa;
    public static volatile SingularAttribute<Agenda, BigDecimal> resulhoraout;

}