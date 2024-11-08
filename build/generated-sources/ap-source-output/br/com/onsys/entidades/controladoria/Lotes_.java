package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Lotes.class)
public class Lotes_ { 

    public static volatile SingularAttribute<Lotes, String> obs;
    public static volatile SingularAttribute<Lotes, String> situacao;
    public static volatile SingularAttribute<Lotes, String> lote;
    public static volatile SingularAttribute<Lotes, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Lotes, String> deletado;
    public static volatile SingularAttribute<Lotes, String> inativo;
    public static volatile SingularAttribute<Lotes, Integer> id;
    public static volatile SingularAttribute<Lotes, Date> dtlancto;
    public static volatile SingularAttribute<Lotes, Empresa> empresa;
    public static volatile SingularAttribute<Lotes, String> referencia;
    public static volatile SingularAttribute<Lotes, Date> datainativo;

}