package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DWChamado.class)
public class DWChamado_ { 

    public static volatile SingularAttribute<DWChamado, Date> dtiniatend;
    public static volatile SingularAttribute<DWChamado, String> obs;
    public static volatile SingularAttribute<DWChamado, Integer> nrochamado;
    public static volatile SingularAttribute<DWChamado, byte[]> anexo;
    public static volatile SingularAttribute<DWChamado, String> modificado;
    public static volatile SingularAttribute<DWChamado, Boolean> tiporemota;
    public static volatile SingularAttribute<DWChamado, String> usrcriacao;
    public static volatile SingularAttribute<DWChamado, Date> datainativo;
    public static volatile SingularAttribute<DWChamado, String> executor;
    public static volatile SingularAttribute<DWChamado, String> arquivo;
    public static volatile SingularAttribute<DWChamado, Integer> id;
    public static volatile SingularAttribute<DWChamado, Date> datalimite;
    public static volatile SingularAttribute<DWChamado, BigDecimal> horasaplicadas;
    public static volatile SingularAttribute<DWChamado, Date> dtiniatendplan;
    public static volatile SingularAttribute<DWChamado, Date> dtfimatendplan;
    public static volatile SingularAttribute<DWChamado, String> catChamado;
    public static volatile SingularAttribute<DWChamado, String> subcatchamado;
    public static volatile SingularAttribute<DWChamado, String> centroCusto;
    public static volatile SingularAttribute<DWChamado, String> solicitante;
    public static volatile SingularAttribute<DWChamado, Date> dtfimatend;
    public static volatile SingularAttribute<DWChamado, String> deletado;
    public static volatile SingularAttribute<DWChamado, String> pacote;
    public static volatile SingularAttribute<DWChamado, String> participante;
    public static volatile SingularAttribute<DWChamado, String> descricao;
    public static volatile SingularAttribute<DWChamado, Date> followup;
    public static volatile SingularAttribute<DWChamado, String> solucao;
    public static volatile SingularAttribute<DWChamado, Date> dataemissao;
    public static volatile SingularAttribute<DWChamado, String> diagnostico;
    public static volatile SingularAttribute<DWChamado, String> estabelecimento;
    public static volatile SingularAttribute<DWChamado, String> inativo;
    public static volatile SingularAttribute<DWChamado, String> usuario;
    public static volatile SingularAttribute<DWChamado, Date> dtrecebocor;
    public static volatile SingularAttribute<DWChamado, Empresa> empresa;
    public static volatile SingularAttribute<DWChamado, String> status;

}