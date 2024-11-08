package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.tipos.StatusProjeto;
import br.com.onsys.entidades.tipos.TipoProjeto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Projeto.class)
public class Projeto_ { 

    public static volatile SingularAttribute<Projeto, String> obs;
    public static volatile SingularAttribute<Projeto, TipoProjeto> tipo;
    public static volatile SingularAttribute<Projeto, String> escopo;
    public static volatile SingularAttribute<Projeto, Date> dtfimpl;
    public static volatile SingularAttribute<Projeto, Date> datainativo;
    public static volatile SingularAttribute<Projeto, String> objetivo;
    public static volatile SingularAttribute<Projeto, StatusProjeto> statusProjeto;
    public static volatile SingularAttribute<Projeto, BigDecimal> vlreal;
    public static volatile SingularAttribute<Projeto, Integer> id;
    public static volatile SingularAttribute<Projeto, BigDecimal> hrreal;
    public static volatile SingularAttribute<Projeto, String> naoescopo;
    public static volatile SingularAttribute<Projeto, BigDecimal> vlplanejado;
    public static volatile SingularAttribute<Projeto, String> codigo;
    public static volatile SingularAttribute<Projeto, String> deletado;
    public static volatile SingularAttribute<Projeto, BigDecimal> hrplanejado;
    public static volatile SingularAttribute<Projeto, Usuario> gestor;
    public static volatile SingularAttribute<Projeto, String> revisao;
    public static volatile SingularAttribute<Projeto, Participante> participante;
    public static volatile SingularAttribute<Projeto, String> descricao;
    public static volatile SingularAttribute<Projeto, Boolean> projetofechado;
    public static volatile SingularAttribute<Projeto, String> escopodetalhe;
    public static volatile SingularAttribute<Projeto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Projeto, Date> dtfimreal;
    public static volatile SingularAttribute<Projeto, String> inativo;
    public static volatile SingularAttribute<Projeto, Date> dtinicioreal;
    public static volatile SingularAttribute<Projeto, Empresa> empresa;
    public static volatile SingularAttribute<Projeto, Date> dtiniciopl;

}