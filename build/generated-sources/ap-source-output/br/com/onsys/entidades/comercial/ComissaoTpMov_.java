package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ComissaoTpMov.class)
public class ComissaoTpMov_ { 

    public static volatile SingularAttribute<ComissaoTpMov, String> obs;
    public static volatile SingularAttribute<ComissaoTpMov, String> codigo;
    public static volatile SingularAttribute<ComissaoTpMov, String> tipo;
    public static volatile SingularAttribute<ComissaoTpMov, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ComissaoTpMov, String> deletado;
    public static volatile SingularAttribute<ComissaoTpMov, String> inativo;
    public static volatile SingularAttribute<ComissaoTpMov, String> modificado;
    public static volatile SingularAttribute<ComissaoTpMov, Integer> id;
    public static volatile SingularAttribute<ComissaoTpMov, Empresa> empresa;
    public static volatile SingularAttribute<ComissaoTpMov, Date> datainativo;
    public static volatile SingularAttribute<ComissaoTpMov, String> descricao;

}