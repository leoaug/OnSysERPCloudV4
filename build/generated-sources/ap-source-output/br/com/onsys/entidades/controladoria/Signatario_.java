package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.tipos.QualificacaoAssinante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Signatario.class)
public class Signatario_ { 

    public static volatile SingularAttribute<Signatario, String> obs;
    public static volatile SingularAttribute<Signatario, String> crc;
    public static volatile SingularAttribute<Signatario, QualificacaoAssinante> qualificacaoAssinante;
    public static volatile SingularAttribute<Signatario, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Signatario, String> cpf;
    public static volatile SingularAttribute<Signatario, String> deletado;
    public static volatile SingularAttribute<Signatario, String> nome;
    public static volatile SingularAttribute<Signatario, String> inativo;
    public static volatile SingularAttribute<Signatario, Integer> id;
    public static volatile SingularAttribute<Signatario, Empresa> empresa;
    public static volatile SingularAttribute<Signatario, Date> datainativo;

}