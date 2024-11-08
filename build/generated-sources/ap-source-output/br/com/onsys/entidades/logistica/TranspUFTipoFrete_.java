package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.tipos.TipoFrete;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(TranspUFTipoFrete.class)
public class TranspUFTipoFrete_ { 

    public static volatile SingularAttribute<TranspUFTipoFrete, Estado> estado;
    public static volatile SingularAttribute<TranspUFTipoFrete, BigDecimal> percfrete;
    public static volatile SingularAttribute<TranspUFTipoFrete, Municipio> municipio;
    public static volatile SingularAttribute<TranspUFTipoFrete, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<TranspUFTipoFrete, TipoFrete> tipoFrete;
    public static volatile SingularAttribute<TranspUFTipoFrete, Integer> id;
    public static volatile SingularAttribute<TranspUFTipoFrete, Empresa> empresa;
    public static volatile SingularAttribute<TranspUFTipoFrete, Transportadora> transportadora;

}