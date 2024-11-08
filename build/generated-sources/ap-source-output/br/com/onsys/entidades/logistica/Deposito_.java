package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Deposito.class)
public class Deposito_ { 

    public static volatile SingularAttribute<Deposito, String> obs;
    public static volatile SingularAttribute<Deposito, String> codigo;
    public static volatile SingularAttribute<Deposito, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Deposito, Date> dataInativo;
    public static volatile SingularAttribute<Deposito, String> deletado;
    public static volatile SingularAttribute<Deposito, String> inativo;
    public static volatile SingularAttribute<Deposito, String> modificado;
    public static volatile SingularAttribute<Deposito, Integer> id;
    public static volatile SingularAttribute<Deposito, Empresa> empresa;
    public static volatile SingularAttribute<Deposito, String> descricao;

}