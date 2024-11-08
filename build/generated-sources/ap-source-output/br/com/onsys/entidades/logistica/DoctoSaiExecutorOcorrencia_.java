package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DoctoSaiExecutorOcorrencia.class)
public class DoctoSaiExecutorOcorrencia_ { 

    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, String> obs;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, String> codigo;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, String> deletado;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, String> nome;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, String> inativo;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, String> modificado;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, Integer> id;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, Empresa> empresa;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, String> email;
    public static volatile SingularAttribute<DoctoSaiExecutorOcorrencia, Date> datainativo;

}