package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Transportadora;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(AreaTransporte.class)
public class AreaTransporte_ { 

    public static volatile SingularAttribute<AreaTransporte, String> codigo;
    public static volatile SingularAttribute<AreaTransporte, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<AreaTransporte, String> nome;
    public static volatile SingularAttribute<AreaTransporte, Integer> id;
    public static volatile SingularAttribute<AreaTransporte, Empresa> empresa;
    public static volatile SingularAttribute<AreaTransporte, Transportadora> transportadora;

}