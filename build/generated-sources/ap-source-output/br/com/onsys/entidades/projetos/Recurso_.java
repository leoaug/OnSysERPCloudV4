package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Recurso.class)
public class Recurso_ { 

    public static volatile SingularAttribute<Recurso, String> obs;
    public static volatile SingularAttribute<Recurso, String> apelido;
    public static volatile SingularAttribute<Recurso, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Recurso, String> deletado;
    public static volatile SingularAttribute<Recurso, String> nome;
    public static volatile SingularAttribute<Recurso, String> modificado;
    public static volatile SingularAttribute<Recurso, Usuario> usuario;
    public static volatile SingularAttribute<Recurso, String> inativo;
    public static volatile SingularAttribute<Recurso, Integer> id;
    public static volatile SingularAttribute<Recurso, Empresa> empresa;
    public static volatile SingularAttribute<Recurso, Date> datainativo;
    public static volatile SingularAttribute<Recurso, BigDecimal> valorhh;

}