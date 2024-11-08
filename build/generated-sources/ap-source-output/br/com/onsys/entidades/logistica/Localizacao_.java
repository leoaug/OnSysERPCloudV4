package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Deposito;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Localizacao.class)
public class Localizacao_ { 

    public static volatile SingularAttribute<Localizacao, String> obs;
    public static volatile SingularAttribute<Localizacao, String> codigo;
    public static volatile SingularAttribute<Localizacao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Localizacao, String> deletado;
    public static volatile SingularAttribute<Localizacao, String> inativo;
    public static volatile SingularAttribute<Localizacao, String> modificado;
    public static volatile SingularAttribute<Localizacao, Deposito> deposito;
    public static volatile SingularAttribute<Localizacao, Integer> id;
    public static volatile SingularAttribute<Localizacao, Empresa> empresa;
    public static volatile SingularAttribute<Localizacao, Date> datainativo;
    public static volatile SingularAttribute<Localizacao, String> descricao;

}