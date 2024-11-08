package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.sac.Acao;
import br.com.onsys.entidades.sac.Agenda;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(AcoesVisita.class)
public class AcoesVisita_ { 

    public static volatile SingularAttribute<AcoesVisita, String> obs;
    public static volatile SingularAttribute<AcoesVisita, Integer> prazoIdeal;
    public static volatile SingularAttribute<AcoesVisita, String> deletado;
    public static volatile SingularAttribute<AcoesVisita, String> modificado;
    public static volatile SingularAttribute<AcoesVisita, String> acvisDesc;
    public static volatile SingularAttribute<AcoesVisita, Agenda> agenda;
    public static volatile SingularAttribute<AcoesVisita, Date> datainativo;
    public static volatile SingularAttribute<AcoesVisita, Boolean> tipoRemota;
    public static volatile SingularAttribute<AcoesVisita, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<AcoesVisita, String> inativo;
    public static volatile SingularAttribute<AcoesVisita, Integer> id;
    public static volatile SingularAttribute<AcoesVisita, Empresa> empresa;
    public static volatile SingularAttribute<AcoesVisita, Acao> acao;

}