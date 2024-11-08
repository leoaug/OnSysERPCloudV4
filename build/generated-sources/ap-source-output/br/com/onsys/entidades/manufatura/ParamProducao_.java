package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.manufatura.CatItem;
import br.com.onsys.entidades.manufatura.SubcatItem;
import br.com.onsys.entidades.manufatura.TipoItem;
import br.com.onsys.entidades.manufatura.UnidadeMedida;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ParamProducao.class)
public class ParamProducao_ { 

    public static volatile SingularAttribute<ParamProducao, String> obs;
    public static volatile SingularAttribute<ParamProducao, CatItem> catItemPadrao;
    public static volatile SingularAttribute<ParamProducao, UnidadeMedida> unidadeMedidaPadrao;
    public static volatile SingularAttribute<ParamProducao, String> deletado;
    public static volatile SingularAttribute<ParamProducao, String> modificado;
    public static volatile SingularAttribute<ParamProducao, Date> datainativo;
    public static volatile SingularAttribute<ParamProducao, TipoItem> tipoitemPAdrao;
    public static volatile SingularAttribute<ParamProducao, Date> periniaberto;
    public static volatile SingularAttribute<ParamProducao, Localizacao> localizacaoPadraoProducao;
    public static volatile SingularAttribute<ParamProducao, Integer> ultimaop;
    public static volatile SingularAttribute<ParamProducao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ParamProducao, String> inativo;
    public static volatile SingularAttribute<ParamProducao, SubcatItem> subCatItemPadrao;
    public static volatile SingularAttribute<ParamProducao, Deposito> depositoPadraoProducao;
    public static volatile SingularAttribute<ParamProducao, Integer> id;
    public static volatile SingularAttribute<ParamProducao, Empresa> empresa;
    public static volatile SingularAttribute<ParamProducao, Date> perfimaberto;

}