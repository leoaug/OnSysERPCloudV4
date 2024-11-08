package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Representante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Lead.class)
public class Lead_ { 

    public static volatile SingularAttribute<Lead, String> obs;
    public static volatile SingularAttribute<Lead, String> situacao;
    public static volatile SingularAttribute<Lead, String> cidade;
    public static volatile SingularAttribute<Lead, String> numero;
    public static volatile SingularAttribute<Lead, String> bairro;
    public static volatile SingularAttribute<Lead, Date> datacadastro;
    public static volatile SingularAttribute<Lead, String> cnpjcpf;
    public static volatile SingularAttribute<Lead, String> cep;
    public static volatile SingularAttribute<Lead, String> razaosocial;
    public static volatile SingularAttribute<Lead, String> fone;
    public static volatile SingularAttribute<Lead, String> uf;
    public static volatile SingularAttribute<Lead, String> complemento;
    public static volatile SingularAttribute<Lead, Representante> representante;
    public static volatile SingularAttribute<Lead, String> logradouro;
    public static volatile SingularAttribute<Lead, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Lead, String> nomefantasia;
    public static volatile SingularAttribute<Lead, Integer> id;
    public static volatile SingularAttribute<Lead, String> natureza;
    public static volatile SingularAttribute<Lead, String> ie;
    public static volatile SingularAttribute<Lead, Empresa> empresa;
    public static volatile SingularAttribute<Lead, String> contato;
    public static volatile SingularAttribute<Lead, String> email;

}