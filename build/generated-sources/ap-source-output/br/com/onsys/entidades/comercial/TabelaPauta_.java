package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TabelaPauta.class)
public class TabelaPauta_ { 

    public static volatile SingularAttribute<TabelaPauta, String> codigo;
    public static volatile SingularAttribute<TabelaPauta, Date> datavalini;
    public static volatile SingularAttribute<TabelaPauta, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TabelaPauta, Integer> id;
    public static volatile SingularAttribute<TabelaPauta, Date> datavalfim;
    public static volatile SingularAttribute<TabelaPauta, Empresa> empresa;
    public static volatile SingularAttribute<TabelaPauta, String> descricao;

}