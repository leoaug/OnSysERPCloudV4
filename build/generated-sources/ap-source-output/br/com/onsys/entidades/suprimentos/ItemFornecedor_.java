package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ItemFornecedor.class)
public class ItemFornecedor_ { 

    public static volatile SingularAttribute<ItemFornecedor, String> codigoFornecedor;
    public static volatile SingularAttribute<ItemFornecedor, String> obs;
    public static volatile SingularAttribute<ItemFornecedor, Item> item;
    public static volatile SingularAttribute<ItemFornecedor, BigDecimal> desconto;
    public static volatile SingularAttribute<ItemFornecedor, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ItemFornecedor, Integer> id;
    public static volatile SingularAttribute<ItemFornecedor, Participante> fornecedor;
    public static volatile SingularAttribute<ItemFornecedor, BigDecimal> percdesconto;
    public static volatile SingularAttribute<ItemFornecedor, Empresa> empresa;

}