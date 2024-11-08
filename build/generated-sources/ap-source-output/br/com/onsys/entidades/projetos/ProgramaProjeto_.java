package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.projetos.Portfolio;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ProgramaProjeto.class)
public class ProgramaProjeto_ { 

    public static volatile SingularAttribute<ProgramaProjeto, String> obs;
    public static volatile SingularAttribute<ProgramaProjeto, String> codigo;
    public static volatile SingularAttribute<ProgramaProjeto, String> escopo;
    public static volatile SingularAttribute<ProgramaProjeto, Date> dtfimpl;
    public static volatile SingularAttribute<ProgramaProjeto, Usuario> gestor;
    public static volatile SingularAttribute<ProgramaProjeto, String> revisao;
    public static volatile SingularAttribute<ProgramaProjeto, String> descricao;
    public static volatile SingularAttribute<ProgramaProjeto, String> objetivo;
    public static volatile SingularAttribute<ProgramaProjeto, Portfolio> portfolio;
    public static volatile SingularAttribute<ProgramaProjeto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ProgramaProjeto, Date> dtfimreal;
    public static volatile SingularAttribute<ProgramaProjeto, Integer> id;
    public static volatile SingularAttribute<ProgramaProjeto, Date> dtinicioreal;
    public static volatile SingularAttribute<ProgramaProjeto, Empresa> empresa;
    public static volatile SingularAttribute<ProgramaProjeto, Date> dtiniciopl;

}