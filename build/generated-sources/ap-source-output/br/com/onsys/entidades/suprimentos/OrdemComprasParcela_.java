package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.suprimentos.OrdemCompras;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OrdemComprasParcela.class)
public class OrdemComprasParcela_ { 

    public static volatile SingularAttribute<OrdemComprasParcela, String> obs;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> qtdrecebida;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> desconto;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vlicms;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vltotrecebido;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> qtdpedida;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vltot;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> outdespesas;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> frete;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> desconto2;
    public static volatile SingularAttribute<OrdemComprasParcela, OrdemCompras> ordemcompras;
    public static volatile SingularAttribute<OrdemComprasParcela, Integer> id;
    public static volatile SingularAttribute<OrdemComprasParcela, Item> item;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> percicms;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> ipi;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> percst;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<OrdemComprasParcela, String> deletado;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vlunitliq;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vltotitem;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> percfrete;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> percdesc;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> percipi;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vltotliqitem;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> qtdsaldo;
    public static volatile SingularAttribute<OrdemComprasParcela, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OrdemComprasParcela, Date> dataEntrega;
    public static volatile SingularAttribute<OrdemComprasParcela, String> inativo;
    public static volatile SingularAttribute<OrdemComprasParcela, Participante> fornecedor;
    public static volatile SingularAttribute<OrdemComprasParcela, Empresa> empresa;
    public static volatile SingularAttribute<OrdemComprasParcela, BigDecimal> vlunit;

}