package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.projetos.Projeto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Fase.class)
public class Fase_ { 

    public static volatile SingularAttribute<Fase, String> obs;
    public static volatile SingularAttribute<Fase, String> codigo;
    public static volatile SingularAttribute<Fase, Projeto> projeto;
    public static volatile SingularAttribute<Fase, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Fase, String> deletado;
    public static volatile SingularAttribute<Fase, String> inativo;
    public static volatile SingularAttribute<Fase, Integer> id;
    public static volatile SingularAttribute<Fase, Empresa> empresa;
    public static volatile SingularAttribute<Fase, Date> datainativo;
    public static volatile SingularAttribute<Fase, String> descricao;

}