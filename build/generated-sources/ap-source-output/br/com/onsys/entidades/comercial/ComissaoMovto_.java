package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.ComissaoTpMov;
import br.com.onsys.entidades.comercial.PedidoVendas;
import br.com.onsys.entidades.comercial.Representante;
import br.com.onsys.entidades.logistica.DoctoSai;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ComissaoMovto.class)
public class ComissaoMovto_ { 

    public static volatile SingularAttribute<ComissaoMovto, Representante> representante;
    public static volatile SingularAttribute<ComissaoMovto, Integer> tpmovto;
    public static volatile SingularAttribute<ComissaoMovto, ComissaoTpMov> comissaotpmov;
    public static volatile SingularAttribute<ComissaoMovto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ComissaoMovto, BigDecimal> vlmovto;
    public static volatile SingularAttribute<ComissaoMovto, DoctoSai> doctoSai;
    public static volatile SingularAttribute<ComissaoMovto, String> historico;
    public static volatile SingularAttribute<ComissaoMovto, String> origem;
    public static volatile SingularAttribute<ComissaoMovto, Date> dtmovto;
    public static volatile SingularAttribute<ComissaoMovto, Integer> id;
    public static volatile SingularAttribute<ComissaoMovto, Empresa> empresa;
    public static volatile SingularAttribute<ComissaoMovto, PedidoVendas> pedidoVendas;

}