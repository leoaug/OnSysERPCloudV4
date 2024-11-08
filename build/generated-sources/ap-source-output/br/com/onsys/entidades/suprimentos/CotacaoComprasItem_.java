package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.suprimentos.CotacaoCompras;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CotacaoComprasItem.class)
public class CotacaoComprasItem_ { 

    public static volatile SingularAttribute<CotacaoComprasItem, Item> item;
    public static volatile SingularAttribute<CotacaoComprasItem, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CotacaoComprasItem, Integer> id;
    public static volatile SingularAttribute<CotacaoComprasItem, Empresa> empresa;
    public static volatile SingularAttribute<CotacaoComprasItem, CotacaoCompras> cotacaoCompras;

}