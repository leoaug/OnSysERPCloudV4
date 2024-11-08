package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import br.com.onsys.entidades.tipos.CEPGenerico;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Cep.class)
public class Cep_ { 

    public static volatile SingularAttribute<Cep, CEPGenerico> generico;
    public static volatile SingularAttribute<Cep, String> obs;
    public static volatile SingularAttribute<Cep, Estado> estado;
    public static volatile SingularAttribute<Cep, String> bairro;
    public static volatile SingularAttribute<Cep, Municipio> municipio;
    public static volatile SingularAttribute<Cep, String> logradouro;
    public static volatile SingularAttribute<Cep, String> deletado;
    public static volatile SingularAttribute<Cep, String> modificado;
    public static volatile SingularAttribute<Cep, String> inativo;
    public static volatile SingularAttribute<Cep, Integer> id;
    public static volatile SingularAttribute<Cep, Date> datainativo;
    public static volatile SingularAttribute<Cep, String> cep;

}