package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemCliente.class)
public class ItemCliente_ { 

    public static volatile SingularAttribute<ItemCliente, String> obs;
    public static volatile SingularAttribute<ItemCliente, Boolean> ativo;
    public static volatile SingularAttribute<ItemCliente, Item> item;
    public static volatile SingularAttribute<ItemCliente, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemCliente, BigDecimal> ultimoPreco;
    public static volatile SingularAttribute<ItemCliente, BigDecimal> percICMSST;
    public static volatile SingularAttribute<ItemCliente, Participante> cliente;
    public static volatile SingularAttribute<ItemCliente, String> calcularIcmsST;
    public static volatile SingularAttribute<ItemCliente, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemCliente, Integer> id;
    public static volatile SingularAttribute<ItemCliente, Date> ultimaCompra;
    public static volatile SingularAttribute<ItemCliente, BigDecimal> percdesconto;
    public static volatile SingularAttribute<ItemCliente, Empresa> empresa;
    public static volatile SingularAttribute<ItemCliente, BigDecimal> quantidade;

}