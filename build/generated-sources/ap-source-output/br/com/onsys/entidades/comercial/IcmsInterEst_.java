package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(IcmsInterEst.class)
public class IcmsInterEst_ { 

    public static volatile SingularAttribute<IcmsInterEst, BigDecimal> aliqfcp;
    public static volatile SingularAttribute<IcmsInterEst, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<IcmsInterEst, Estado> estadodestino;
    public static volatile SingularAttribute<IcmsInterEst, BigDecimal> icmsinterest;
    public static volatile SingularAttribute<IcmsInterEst, Integer> id;
    public static volatile SingularAttribute<IcmsInterEst, BigDecimal> aliqfcpst;
    public static volatile SingularAttribute<IcmsInterEst, Empresa> empresa;
    public static volatile SingularAttribute<IcmsInterEst, BigDecimal> descicms;
    public static volatile SingularAttribute<IcmsInterEst, Estado> estadoorigem;

}