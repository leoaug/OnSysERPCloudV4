package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.MetaPremio;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MetaPremioRepres.class)
public class MetaPremioRepres_ { 

    public static volatile SingularAttribute<MetaPremioRepres, BigDecimal> metavalor;
    public static volatile SingularAttribute<MetaPremioRepres, String> obs;
    public static volatile SingularAttribute<MetaPremioRepres, Item> item;
    public static volatile SingularAttribute<MetaPremioRepres, String> ano;
    public static volatile SingularAttribute<MetaPremioRepres, String> deletado;
    public static volatile SingularAttribute<MetaPremioRepres, MetaPremio> metapremio;
    public static volatile SingularAttribute<MetaPremioRepres, Integer> metapedido;
    public static volatile SingularAttribute<MetaPremioRepres, Date> datainativo;
    public static volatile SingularAttribute<MetaPremioRepres, Representante> representante;
    public static volatile SingularAttribute<MetaPremioRepres, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MetaPremioRepres, String> mes;
    public static volatile SingularAttribute<MetaPremioRepres, Integer> id;
    public static volatile SingularAttribute<MetaPremioRepres, Empresa> empresa;

}