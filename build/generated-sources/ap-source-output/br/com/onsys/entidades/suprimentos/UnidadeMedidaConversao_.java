package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.UnidadeMedida;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(UnidadeMedidaConversao.class)
public class UnidadeMedidaConversao_ { 

    public static volatile SingularAttribute<UnidadeMedidaConversao, UnidadeMedida> unidademedidadest;
    public static volatile SingularAttribute<UnidadeMedidaConversao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<UnidadeMedidaConversao, UnidadeMedida> unidademedidaorig;
    public static volatile SingularAttribute<UnidadeMedidaConversao, Integer> id;
    public static volatile SingularAttribute<UnidadeMedidaConversao, Empresa> empresa;
    public static volatile SingularAttribute<UnidadeMedidaConversao, BigDecimal> fatorConversao;

}