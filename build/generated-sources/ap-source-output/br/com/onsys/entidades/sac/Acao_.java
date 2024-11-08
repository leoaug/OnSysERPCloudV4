package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.TiposAcao;
import br.com.onsys.entidades.sac.Objetivos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Acao.class)
public class Acao_ { 

    public static volatile SingularAttribute<Acao, String> obs;
    public static volatile SingularAttribute<Acao, String> codigo;
    public static volatile SingularAttribute<Acao, String> deletado;
    public static volatile SingularAttribute<Acao, String> modificado;
    public static volatile SingularAttribute<Acao, Integer> prazomax;
    public static volatile SingularAttribute<Acao, Date> datainativo;
    public static volatile SingularAttribute<Acao, String> descricao;
    public static volatile SingularAttribute<Acao, Objetivos> objetivos;
    public static volatile SingularAttribute<Acao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Acao, String> inativo;
    public static volatile SingularAttribute<Acao, TiposAcao> tiposAcao;
    public static volatile SingularAttribute<Acao, Integer> id;
    public static volatile SingularAttribute<Acao, String> subjemail;
    public static volatile SingularAttribute<Acao, Empresa> empresa;
    public static volatile SingularAttribute<Acao, String> email;

}