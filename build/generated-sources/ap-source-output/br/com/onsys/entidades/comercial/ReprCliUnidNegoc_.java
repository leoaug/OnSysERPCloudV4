package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.Representante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ReprCliUnidNegoc.class)
public class ReprCliUnidNegoc_ { 

    public static volatile SingularAttribute<ReprCliUnidNegoc, Representante> usuariorep;
    public static volatile SingularAttribute<ReprCliUnidNegoc, Integer> id;
    public static volatile SingularAttribute<ReprCliUnidNegoc, Empresa> empresa;
    public static volatile SingularAttribute<ReprCliUnidNegoc, String> codUnidNegoc;
    public static volatile SingularAttribute<ReprCliUnidNegoc, Participante> participante;

}