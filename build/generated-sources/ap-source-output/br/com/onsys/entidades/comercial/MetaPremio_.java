package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MetaPremio.class)
public class MetaPremio_ { 

    public static volatile SingularAttribute<MetaPremio, String> obs;
    public static volatile SingularAttribute<MetaPremio, String> codigo;
    public static volatile SingularAttribute<MetaPremio, Date> datavalini;
    public static volatile SingularAttribute<MetaPremio, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MetaPremio, String> deletado;
    public static volatile SingularAttribute<MetaPremio, String> modificado;
    public static volatile SingularAttribute<MetaPremio, String> inativo;
    public static volatile SingularAttribute<MetaPremio, Integer> id;
    public static volatile SingularAttribute<MetaPremio, Date> datavalfim;
    public static volatile SingularAttribute<MetaPremio, Empresa> empresa;
    public static volatile SingularAttribute<MetaPremio, Date> datainativo;
    public static volatile SingularAttribute<MetaPremio, String> descricao;

}