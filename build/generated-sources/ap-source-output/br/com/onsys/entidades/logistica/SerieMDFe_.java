package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SerieMDFe.class)
public class SerieMDFe_ { 

    public static volatile SingularAttribute<SerieMDFe, String> modeloDocumento;
    public static volatile SingularAttribute<SerieMDFe, String> obs;
    public static volatile SingularAttribute<SerieMDFe, String> codigo;
    public static volatile SingularAttribute<SerieMDFe, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SerieMDFe, String> serie;
    public static volatile SingularAttribute<SerieMDFe, Integer> ultMDFe;
    public static volatile SingularAttribute<SerieMDFe, String> deletado;
    public static volatile SingularAttribute<SerieMDFe, String> inativo;
    public static volatile SingularAttribute<SerieMDFe, Integer> id;
    public static volatile SingularAttribute<SerieMDFe, Empresa> empresa;
    public static volatile SingularAttribute<SerieMDFe, Date> datainativo;
    public static volatile SingularAttribute<SerieMDFe, String> descricao;

}