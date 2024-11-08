package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SPEDContribERP.class)
public class SPEDContribERP_ { 

    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> qtd;
    public static volatile SingularAttribute<SPEDContribERP, String> cod_part;
    public static volatile SingularAttribute<SPEDContribERP, String> ser;
    public static volatile SingularAttribute<SPEDContribERP, String> cod_item;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_pis_item;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_bc_cofins_item;
    public static volatile SingularAttribute<SPEDContribERP, String> cfop;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_item;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_merc;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_pis;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_cofins;
    public static volatile SingularAttribute<SPEDContribERP, String> ind_oper;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl__bc_pis_item;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_doc;
    public static volatile SingularAttribute<SPEDContribERP, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SPEDContribERP, BigDecimal> vl_cofins_item;
    public static volatile SingularAttribute<SPEDContribERP, Integer> id;
    public static volatile SingularAttribute<SPEDContribERP, Empresa> empresa;
    public static volatile SingularAttribute<SPEDContribERP, String> num_doc;

}