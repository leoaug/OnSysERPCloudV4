package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Representante;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Comissao.class)
public class Comissao_ { 

    public static volatile SingularAttribute<Comissao, String> obs;
    public static volatile SingularAttribute<Comissao, Date> periodoinicio;
    public static volatile SingularAttribute<Comissao, Representante> representante;
    public static volatile SingularAttribute<Comissao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Comissao, String> deletado;
    public static volatile SingularAttribute<Comissao, String> inativo;
    public static volatile SingularAttribute<Comissao, String> modificado;
    public static volatile SingularAttribute<Comissao, Integer> id;
    public static volatile SingularAttribute<Comissao, Date> periodofinal;
    public static volatile SingularAttribute<Comissao, Empresa> empresa;
    public static volatile SingularAttribute<Comissao, BigDecimal> valorcomis;

}