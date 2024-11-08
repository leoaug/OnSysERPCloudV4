package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Conferente.class)
public class Conferente_ { 

    public static volatile SingularAttribute<Conferente, String> obs;
    public static volatile SingularAttribute<Conferente, String> codigo;
    public static volatile SingularAttribute<Conferente, String> apelido;
    public static volatile SingularAttribute<Conferente, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Conferente, Date> dataInativo;
    public static volatile SingularAttribute<Conferente, String> deletado;
    public static volatile SingularAttribute<Conferente, String> inativo;
    public static volatile SingularAttribute<Conferente, String> modificado;
    public static volatile SingularAttribute<Conferente, Integer> id;
    public static volatile SingularAttribute<Conferente, Empresa> empresa;
    public static volatile SingularAttribute<Conferente, String> descricao;

}