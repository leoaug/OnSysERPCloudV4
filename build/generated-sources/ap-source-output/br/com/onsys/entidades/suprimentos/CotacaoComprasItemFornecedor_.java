package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.manufatura.UnidadeMedida;
import br.com.onsys.entidades.suprimentos.CotacaoCompras;
import br.com.onsys.entidades.suprimentos.OrdemCompras;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CotacaoComprasItemFornecedor.class)
public class CotacaoComprasItemFornecedor_ { 

    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, String> obs;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, Item> item;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> percicms;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> ipi;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> percst;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> desconto;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, UnidadeMedida> unidademedida;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> vlicmssubstitu;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> vlicms;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> vlunitliq;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, CotacaoCompras> cotacaoCompras;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> outdespesas;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> percfrete;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> percdesc;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> percipi;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, OrdemCompras> oc;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> frete;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, Integer> id;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, Participante> fornecedor;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, Empresa> empresa;
    public static volatile SingularAttribute<CotacaoComprasItemFornecedor, BigDecimal> vlunit;

}