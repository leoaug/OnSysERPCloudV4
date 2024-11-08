package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.comercial.Campanha;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CampanhaEstado.class)
public class CampanhaEstado_ { 

    public static volatile SingularAttribute<CampanhaEstado, Estado> estado;
    public static volatile SingularAttribute<CampanhaEstado, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CampanhaEstado, Integer> id;
    public static volatile SingularAttribute<CampanhaEstado, Empresa> empresa;
    public static volatile SingularAttribute<CampanhaEstado, Campanha> campanha;

}