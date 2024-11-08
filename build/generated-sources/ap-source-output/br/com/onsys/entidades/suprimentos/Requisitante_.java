package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Requisitante.class)
public class Requisitante_ { 

    public static volatile SingularAttribute<Requisitante, String> obs;
    public static volatile SingularAttribute<Requisitante, String> codigo;
    public static volatile SingularAttribute<Requisitante, String> apelido;
    public static volatile SingularAttribute<Requisitante, Usuario> usuarioreq;
    public static volatile SingularAttribute<Requisitante, String> deletado;
    public static volatile SingularAttribute<Requisitante, String> nome;
    public static volatile SingularAttribute<Requisitante, Date> datainativo;
    public static volatile SingularAttribute<Requisitante, String> fone;
    public static volatile SingularAttribute<Requisitante, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Requisitante, String> inativo;
    public static volatile SingularAttribute<Requisitante, Integer> id;
    public static volatile SingularAttribute<Requisitante, Empresa> empresa;
    public static volatile SingularAttribute<Requisitante, String> email;
    public static volatile SingularAttribute<Requisitante, Boolean> recebeEmail;

}