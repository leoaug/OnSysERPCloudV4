package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UnidadeMedida.class)
public class UnidadeMedida_ { 

    public static volatile SingularAttribute<UnidadeMedida, String> obs;
    public static volatile SingularAttribute<UnidadeMedida, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<UnidadeMedida, String> un;
    public static volatile SingularAttribute<UnidadeMedida, String> deletado;
    public static volatile SingularAttribute<UnidadeMedida, String> inativo;
    public static volatile SingularAttribute<UnidadeMedida, String> modificado;
    public static volatile SingularAttribute<UnidadeMedida, Integer> id;
    public static volatile SingularAttribute<UnidadeMedida, Empresa> empresa;
    public static volatile SingularAttribute<UnidadeMedida, Date> datainativo;
    public static volatile SingularAttribute<UnidadeMedida, String> descricao;

}