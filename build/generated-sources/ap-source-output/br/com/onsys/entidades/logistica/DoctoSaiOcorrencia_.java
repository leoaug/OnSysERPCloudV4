package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoSaiOcorrencia.class)
public class DoctoSaiOcorrencia_ { 

    public static volatile SingularAttribute<DoctoSaiOcorrencia, String> obs;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, String> codigo;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, String> deletado;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, String> inativo;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, String> modificado;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, Integer> id;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, Empresa> empresa;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, Date> datainativo;
    public static volatile SingularAttribute<DoctoSaiOcorrencia, String> descricao;

}