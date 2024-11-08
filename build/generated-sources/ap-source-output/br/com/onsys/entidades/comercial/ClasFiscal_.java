package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ClasFiscal.class)
public class ClasFiscal_ { 

    public static volatile SingularAttribute<ClasFiscal, String> obs;
    public static volatile SingularAttribute<ClasFiscal, String> codigo;
    public static volatile SingularAttribute<ClasFiscal, BigDecimal> ipi;
    public static volatile SingularAttribute<ClasFiscal, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ClasFiscal, String> deletado;
    public static volatile SingularAttribute<ClasFiscal, String> ncm;
    public static volatile SingularAttribute<ClasFiscal, String> modificado;
    public static volatile SingularAttribute<ClasFiscal, String> inativo;
    public static volatile SingularAttribute<ClasFiscal, Integer> id;
    public static volatile SingularAttribute<ClasFiscal, Empresa> empresa;
    public static volatile SingularAttribute<ClasFiscal, Date> datainativo;
    public static volatile SingularAttribute<ClasFiscal, String> descricao;

}