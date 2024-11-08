package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.comercial.CatCliente;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatClienteUF.class)
public class CatClienteUF_ { 

    public static volatile SingularAttribute<CatClienteUF, Estado> estado;
    public static volatile SingularAttribute<CatClienteUF, BigDecimal> percfrete;
    public static volatile SingularAttribute<CatClienteUF, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatClienteUF, String> deletado;
    public static volatile SingularAttribute<CatClienteUF, String> inativo;
    public static volatile SingularAttribute<CatClienteUF, Integer> id;
    public static volatile SingularAttribute<CatClienteUF, CatCliente> catcliente;
    public static volatile SingularAttribute<CatClienteUF, Empresa> empresa;
    public static volatile SingularAttribute<CatClienteUF, BigDecimal> vlfreteminimo;
    public static volatile SingularAttribute<CatClienteUF, Date> datainativo;

}