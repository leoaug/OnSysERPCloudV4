package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoSaiResponsavelOcorrencia.class)
public class DoctoSaiResponsavelOcorrencia_ { 

    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, String> obs;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, String> codigo;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, String> deletado;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, String> nome;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, String> inativo;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, String> modificado;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, Integer> id;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, Empresa> empresa;
    public static volatile SingularAttribute<DoctoSaiResponsavelOcorrencia, Date> datainativo;

}