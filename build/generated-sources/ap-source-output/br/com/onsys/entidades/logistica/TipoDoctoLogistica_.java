package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TipoDoctoLogistica.class)
public class TipoDoctoLogistica_ { 

    public static volatile SingularAttribute<TipoDoctoLogistica, String> obs;
    public static volatile SingularAttribute<TipoDoctoLogistica, String> codigo;
    public static volatile SingularAttribute<TipoDoctoLogistica, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TipoDoctoLogistica, String> deletado;
    public static volatile SingularAttribute<TipoDoctoLogistica, String> inativo;
    public static volatile SingularAttribute<TipoDoctoLogistica, String> modificado;
    public static volatile SingularAttribute<TipoDoctoLogistica, Integer> id;
    public static volatile SingularAttribute<TipoDoctoLogistica, String> tipoDocto;
    public static volatile SingularAttribute<TipoDoctoLogistica, Empresa> empresa;
    public static volatile SingularAttribute<TipoDoctoLogistica, Date> datainativo;
    public static volatile SingularAttribute<TipoDoctoLogistica, String> descricao;

}