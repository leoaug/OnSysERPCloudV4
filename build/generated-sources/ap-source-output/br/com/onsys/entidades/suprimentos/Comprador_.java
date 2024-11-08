package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Comprador.class)
public class Comprador_ { 

    public static volatile SingularAttribute<Comprador, String> obs;
    public static volatile SingularAttribute<Comprador, String> codigo;
    public static volatile SingularAttribute<Comprador, String> apelido;
    public static volatile SingularAttribute<Comprador, Usuario> usuariocompras;
    public static volatile SingularAttribute<Comprador, String> deletado;
    public static volatile SingularAttribute<Comprador, String> nome;
    public static volatile SingularAttribute<Comprador, String> modificado;
    public static volatile SingularAttribute<Comprador, Date> datainativo;
    public static volatile SingularAttribute<Comprador, String> fone;
    public static volatile SingularAttribute<Comprador, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Comprador, String> inativo;
    public static volatile SingularAttribute<Comprador, Integer> id;
    public static volatile SingularAttribute<Comprador, Empresa> empresa;
    public static volatile SingularAttribute<Comprador, String> email;
    public static volatile SingularAttribute<Comprador, Boolean> recebeEmail;

}