package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.logistica.Manifesto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ManifestoPercurso.class)
public class ManifestoPercurso_ { 

    public static volatile SingularAttribute<ManifestoPercurso, Integer> sequencia;
    public static volatile SingularAttribute<ManifestoPercurso, Estado> estado;
    public static volatile SingularAttribute<ManifestoPercurso, Integer> id;
    public static volatile SingularAttribute<ManifestoPercurso, Manifesto> manifesto;

}