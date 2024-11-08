package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.UsuarioProgramaEmail;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Programa.class)
public class Programa_ { 

    public static volatile SingularAttribute<Programa, String> descatalho;
    public static volatile SingularAttribute<Programa, String> obs;
    public static volatile SingularAttribute<Programa, String> codigo;
    public static volatile ListAttribute<Programa, UsuarioProgramaEmail> listUsuarioProgramaEmail;
    public static volatile SingularAttribute<Programa, String> deletado;
    public static volatile SingularAttribute<Programa, String> modificado;
    public static volatile SingularAttribute<Programa, Date> datainativo;
    public static volatile SingularAttribute<Programa, String> descricao;
    public static volatile SingularAttribute<Programa, Boolean> vermenu;
    public static volatile SingularAttribute<Programa, String> descricaomenu;
    public static volatile SingularAttribute<Programa, String> inativo;
    public static volatile SingularAttribute<Programa, Integer> id;
    public static volatile SingularAttribute<Programa, String> caminho;
    public static volatile SingularAttribute<Programa, Empresa> empresa;

}