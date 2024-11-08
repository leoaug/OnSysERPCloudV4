package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.comercial.TabelaPauta;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EstadoEmpresa.class)
public class EstadoEmpresa_ { 

    public static volatile SingularAttribute<EstadoEmpresa, String> st;
    public static volatile SingularAttribute<EstadoEmpresa, String> obs;
    public static volatile SingularAttribute<EstadoEmpresa, Estado> estado;
    public static volatile SingularAttribute<EstadoEmpresa, BigDecimal> aliqfcp;
    public static volatile SingularAttribute<EstadoEmpresa, BigDecimal> icmsinterno;
    public static volatile SingularAttribute<EstadoEmpresa, String> deletado;
    public static volatile SingularAttribute<EstadoEmpresa, String> modificado;
    public static volatile SingularAttribute<EstadoEmpresa, BigDecimal> mvast;
    public static volatile SingularAttribute<EstadoEmpresa, Date> datainativo;
    public static volatile SingularAttribute<EstadoEmpresa, TabelaPauta> tabelapauta;
    public static volatile SingularAttribute<EstadoEmpresa, BigDecimal> icmsst;
    public static volatile SingularAttribute<EstadoEmpresa, BigDecimal> icmsinterest;
    public static volatile SingularAttribute<EstadoEmpresa, String> inativo;
    public static volatile SingularAttribute<EstadoEmpresa, Integer> id;
    public static volatile SingularAttribute<EstadoEmpresa, BigDecimal> aliqfcpst;
    public static volatile SingularAttribute<EstadoEmpresa, Empresa> empresa;
    public static volatile SingularAttribute<EstadoEmpresa, BigDecimal> descicms;

}