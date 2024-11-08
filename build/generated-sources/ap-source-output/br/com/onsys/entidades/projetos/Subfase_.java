package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.projetos.Fase;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Subfase.class)
public class Subfase_ { 

    public static volatile SingularAttribute<Subfase, String> obs;
    public static volatile SingularAttribute<Subfase, String> codigo;
    public static volatile SingularAttribute<Subfase, Fase> fase;
    public static volatile SingularAttribute<Subfase, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Subfase, String> deletado;
    public static volatile SingularAttribute<Subfase, String> inativo;
    public static volatile SingularAttribute<Subfase, Integer> id;
    public static volatile SingularAttribute<Subfase, Empresa> empresa;
    public static volatile SingularAttribute<Subfase, Date> datainativo;
    public static volatile SingularAttribute<Subfase, String> descricao;

}