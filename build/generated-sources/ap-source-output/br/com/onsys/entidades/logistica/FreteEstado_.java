package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.logistica.Frete;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FreteEstado.class)
public class FreteEstado_ { 

    public static volatile SingularAttribute<FreteEstado, Estado> estado;
    public static volatile SingularAttribute<FreteEstado, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FreteEstado, Frete> frete;
    public static volatile SingularAttribute<FreteEstado, Integer> id;
    public static volatile SingularAttribute<FreteEstado, Empresa> empresa;

}