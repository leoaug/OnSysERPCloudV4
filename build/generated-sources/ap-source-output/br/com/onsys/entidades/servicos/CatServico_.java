package br.com.onsys.entidades.servicos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatServico.class)
public class CatServico_ { 

    public static volatile SingularAttribute<CatServico, String> obs;
    public static volatile SingularAttribute<CatServico, String> codigo;
    public static volatile SingularAttribute<CatServico, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatServico, String> deletado;
    public static volatile SingularAttribute<CatServico, String> inativo;
    public static volatile SingularAttribute<CatServico, String> modificado;
    public static volatile SingularAttribute<CatServico, Integer> id;
    public static volatile SingularAttribute<CatServico, Empresa> empresa;
    public static volatile SingularAttribute<CatServico, Date> datainativo;
    public static volatile SingularAttribute<CatServico, String> descricao;

}