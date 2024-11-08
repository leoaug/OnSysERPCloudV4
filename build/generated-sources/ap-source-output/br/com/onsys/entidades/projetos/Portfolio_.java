package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Portfolio.class)
public class Portfolio_ { 

    public static volatile SingularAttribute<Portfolio, String> obs;
    public static volatile SingularAttribute<Portfolio, String> codigo;
    public static volatile SingularAttribute<Portfolio, String> escopo;
    public static volatile SingularAttribute<Portfolio, Date> dtfimpl;
    public static volatile SingularAttribute<Portfolio, Usuario> gestor;
    public static volatile SingularAttribute<Portfolio, String> revisao;
    public static volatile SingularAttribute<Portfolio, Participante> participante;
    public static volatile SingularAttribute<Portfolio, String> descricao;
    public static volatile SingularAttribute<Portfolio, String> objetivo;
    public static volatile SingularAttribute<Portfolio, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Portfolio, Date> dtfimreal;
    public static volatile SingularAttribute<Portfolio, Integer> id;
    public static volatile SingularAttribute<Portfolio, Date> dtinicioreal;
    public static volatile SingularAttribute<Portfolio, Empresa> empresa;
    public static volatile SingularAttribute<Portfolio, Date> dtiniciopl;

}