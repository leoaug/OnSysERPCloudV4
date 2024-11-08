package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OrdemCompras.class)
public class OrdemCompras_ { 

    public static volatile SingularAttribute<OrdemCompras, String> obs;
    public static volatile SingularAttribute<OrdemCompras, String> codigo;
    public static volatile SingularAttribute<OrdemCompras, String> situacao;
    public static volatile SingularAttribute<OrdemCompras, Date> dataInativo;
    public static volatile SingularAttribute<OrdemCompras, String> deletado;
    public static volatile SingularAttribute<OrdemCompras, String> dataFechamento;
    public static volatile SingularAttribute<OrdemCompras, Usuario> usrImplant;
    public static volatile SingularAttribute<OrdemCompras, String> dataAprova;
    public static volatile SingularAttribute<OrdemCompras, Date> dataEmissao;
    public static volatile SingularAttribute<OrdemCompras, BigDecimal> vlFrete;
    public static volatile SingularAttribute<OrdemCompras, BigDecimal> vlTotal;
    public static volatile SingularAttribute<OrdemCompras, Integer> oc;
    public static volatile SingularAttribute<OrdemCompras, Usuario> usrAprova;
    public static volatile SingularAttribute<OrdemCompras, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OrdemCompras, Date> dataEntrega;
    public static volatile SingularAttribute<OrdemCompras, BigDecimal> vlImpostos;
    public static volatile SingularAttribute<OrdemCompras, String> inativo;
    public static volatile SingularAttribute<OrdemCompras, Integer> id;
    public static volatile SingularAttribute<OrdemCompras, Empresa> empresa;
    public static volatile SingularAttribute<OrdemCompras, BigDecimal> vlOutros;

}