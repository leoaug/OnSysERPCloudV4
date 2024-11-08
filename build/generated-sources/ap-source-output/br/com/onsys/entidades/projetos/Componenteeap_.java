package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.projetos.Componenteeap;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.tipos.StatusProjeto;
import br.com.onsys.entidades.tipos.TipoComponenteEAP;
import br.com.onsys.entidades.tipos.TipoPacote;
import br.com.onsys.entidades.tipos.TipoProjeto;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Componenteeap.class)
public class Componenteeap_ { 

    public static volatile SingularAttribute<Componenteeap, String> obs;
    public static volatile SingularAttribute<Componenteeap, TipoProjeto> tipo;
    public static volatile SingularAttribute<Componenteeap, String> escopo;
    public static volatile SingularAttribute<Componenteeap, Date> dtfimpl;
    public static volatile SingularAttribute<Componenteeap, Date> datainativo;
    public static volatile SingularAttribute<Componenteeap, String> objetivo;
    public static volatile SingularAttribute<Componenteeap, BigDecimal> vlcliente;
    public static volatile SingularAttribute<Componenteeap, StatusProjeto> statusProjeto;
    public static volatile SingularAttribute<Componenteeap, TipoPacote> tipopacote;
    public static volatile SingularAttribute<Componenteeap, BigDecimal> vlreal;
    public static volatile SingularAttribute<Componenteeap, TipoComponenteEAP> tipoComponente;
    public static volatile SingularAttribute<Componenteeap, Integer> id;
    public static volatile SingularAttribute<Componenteeap, BigDecimal> hrreal;
    public static volatile SingularAttribute<Componenteeap, String> naoescopo;
    public static volatile SingularAttribute<Componenteeap, BigDecimal> vlplanejado;
    public static volatile SingularAttribute<Componenteeap, String> codigo;
    public static volatile SingularAttribute<Componenteeap, Boolean> repassaImposto;
    public static volatile SingularAttribute<Componenteeap, String> deletado;
    public static volatile SingularAttribute<Componenteeap, BigDecimal> hrplanejado;
    public static volatile SingularAttribute<Componenteeap, Usuario> gestor;
    public static volatile SingularAttribute<Componenteeap, String> revisao;
    public static volatile SingularAttribute<Componenteeap, BigDecimal> vlclientehh;
    public static volatile SingularAttribute<Componenteeap, Componenteeap> componentepai;
    public static volatile SingularAttribute<Componenteeap, Participante> participante;
    public static volatile SingularAttribute<Componenteeap, String> descricao;
    public static volatile SingularAttribute<Componenteeap, Boolean> projetofechado;
    public static volatile SingularAttribute<Componenteeap, String> escopodetalhe;
    public static volatile SingularAttribute<Componenteeap, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Componenteeap, Date> dtfimreal;
    public static volatile SingularAttribute<Componenteeap, String> inativo;
    public static volatile SingularAttribute<Componenteeap, Date> dtinicioreal;
    public static volatile SingularAttribute<Componenteeap, Empresa> empresa;
    public static volatile SingularAttribute<Componenteeap, Date> dtiniciopl;

}