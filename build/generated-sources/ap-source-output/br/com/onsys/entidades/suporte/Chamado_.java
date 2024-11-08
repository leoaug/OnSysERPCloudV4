package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.projetos.Pacote;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.suporte.CatChamado;
import br.com.onsys.entidades.suporte.SubcatChamado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Chamado.class)
public class Chamado_ { 

    public static volatile SingularAttribute<Chamado, Date> dtiniatend;
    public static volatile SingularAttribute<Chamado, byte[]> anexoSolucao;
    public static volatile SingularAttribute<Chamado, String> obs;
    public static volatile SingularAttribute<Chamado, CatChamado> catchamado;
    public static volatile SingularAttribute<Chamado, Integer> nrochamado;
    public static volatile SingularAttribute<Chamado, byte[]> anexo;
    public static volatile SingularAttribute<Chamado, String> motivoAprovar;
    public static volatile SingularAttribute<Chamado, String> modificado;
    public static volatile SingularAttribute<Chamado, Boolean> tiporemota;
    public static volatile SingularAttribute<Chamado, Usuario> usrcriacao;
    public static volatile SingularAttribute<Chamado, Date> datainativo;
    public static volatile SingularAttribute<Chamado, Usuario> executor;
    public static volatile SingularAttribute<Chamado, String> arquivo;
    public static volatile SingularAttribute<Chamado, Integer> id;
    public static volatile SingularAttribute<Chamado, Date> datalimite;
    public static volatile SingularAttribute<Chamado, String> motivoReprovar;
    public static volatile SingularAttribute<Chamado, byte[]> anexoDiagnostico;
    public static volatile SingularAttribute<Chamado, BigDecimal> horasaplicadas;
    public static volatile SingularAttribute<Chamado, Date> dtiniatendplan;
    public static volatile SingularAttribute<Chamado, Date> dtfimatendplan;
    public static volatile SingularAttribute<Chamado, SubcatChamado> subcatchamado;
    public static volatile SingularAttribute<Chamado, CentroCusto> centroCusto;
    public static volatile SingularAttribute<Chamado, Usuario> solicitante;
    public static volatile SingularAttribute<Chamado, Date> dtfimatend;
    public static volatile SingularAttribute<Chamado, String> deletado;
    public static volatile SingularAttribute<Chamado, Pacote> pacote;
    public static volatile SingularAttribute<Chamado, Participante> participante;
    public static volatile SingularAttribute<Chamado, String> descricao;
    public static volatile SingularAttribute<Chamado, Date> followup;
    public static volatile SingularAttribute<Chamado, String> solucao;
    public static volatile SingularAttribute<Chamado, Date> dataemissao;
    public static volatile SingularAttribute<Chamado, String> diagnostico;
    public static volatile SingularAttribute<Chamado, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Chamado, String> inativo;
    public static volatile SingularAttribute<Chamado, Usuario> usuario;
    public static volatile SingularAttribute<Chamado, Date> dtrecebocor;
    public static volatile SingularAttribute<Chamado, Empresa> empresa;
    public static volatile SingularAttribute<Chamado, String> status;

}