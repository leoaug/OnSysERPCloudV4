package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.logistica.Manifesto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ManifestoDoctoSai.class)
public class ManifestoDoctoSai_ { 

    public static volatile SingularAttribute<ManifestoDoctoSai, Integer> ordemEntrega;
    public static volatile SingularAttribute<ManifestoDoctoSai, DoctoSai> doctoSai;
    public static volatile SingularAttribute<ManifestoDoctoSai, String> serie;
    public static volatile SingularAttribute<ManifestoDoctoSai, String> chave;
    public static volatile SingularAttribute<ManifestoDoctoSai, Integer> id;
    public static volatile SingularAttribute<ManifestoDoctoSai, String> nroDocto;
    public static volatile SingularAttribute<ManifestoDoctoSai, Manifesto> manifesto;
    public static volatile SingularAttribute<ManifestoDoctoSai, Empresa> empresa;
    public static volatile SingularAttribute<ManifestoDoctoSai, String> status;

}