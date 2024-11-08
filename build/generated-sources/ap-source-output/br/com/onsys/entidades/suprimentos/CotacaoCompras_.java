package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.suprimentos.OrdemCompras;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CotacaoCompras.class)
public class CotacaoCompras_ { 

    public static volatile SingularAttribute<CotacaoCompras, String> obs;
    public static volatile ListAttribute<CotacaoCompras, Item> itens;
    public static volatile SingularAttribute<CotacaoCompras, OrdemCompras> oc;
    public static volatile SingularAttribute<CotacaoCompras, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CotacaoCompras, Date> dataEntrega;
    public static volatile ListAttribute<CotacaoCompras, Participante> fornecedores;
    public static volatile SingularAttribute<CotacaoCompras, Integer> id;
    public static volatile SingularAttribute<CotacaoCompras, Date> dataEmissao;
    public static volatile SingularAttribute<CotacaoCompras, Empresa> empresa;

}