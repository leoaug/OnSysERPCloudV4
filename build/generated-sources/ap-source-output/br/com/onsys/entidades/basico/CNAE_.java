package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CNAE.class)
public class CNAE_ { 

    public static volatile SingularAttribute<CNAE, String> obs;
    public static volatile SingularAttribute<CNAE, String> codigo;
    public static volatile SingularAttribute<CNAE, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CNAE, String> deletado;
    public static volatile SingularAttribute<CNAE, String> inativo;
    public static volatile SingularAttribute<CNAE, String> modificado;
    public static volatile SingularAttribute<CNAE, Integer> id;
    public static volatile SingularAttribute<CNAE, Empresa> empresa;
    public static volatile SingularAttribute<CNAE, Date> datainativo;
    public static volatile SingularAttribute<CNAE, String> descricao;

}