package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.manufatura.OrdProd;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OrdProdReservas.class)
public class OrdProdReservas_ { 

    public static volatile SingularAttribute<OrdProdReservas, String> situacao;
    public static volatile SingularAttribute<OrdProdReservas, Localizacao> localizacao;
    public static volatile SingularAttribute<OrdProdReservas, Item> itemReserva;
    public static volatile SingularAttribute<OrdProdReservas, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OrdProdReservas, Deposito> deposito;
    public static volatile SingularAttribute<OrdProdReservas, Integer> id;
    public static volatile SingularAttribute<OrdProdReservas, OrdProd> ordProd;
    public static volatile SingularAttribute<OrdProdReservas, Empresa> empresa;
    public static volatile SingularAttribute<OrdProdReservas, Double> quantidade;

}