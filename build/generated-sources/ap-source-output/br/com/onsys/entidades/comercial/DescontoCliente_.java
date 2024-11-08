package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DescontoCliente.class)
public class DescontoCliente_ { 

    public static volatile SingularAttribute<DescontoCliente, String> item;
    public static volatile SingularAttribute<DescontoCliente, Integer> situacao;
    public static volatile SingularAttribute<DescontoCliente, BigDecimal> vlDesconto;
    public static volatile SingularAttribute<DescontoCliente, BigDecimal> percDesconto;
    public static volatile SingularAttribute<DescontoCliente, String> usuarioRep;
    public static volatile SingularAttribute<DescontoCliente, Date> dataInicioValidade;
    public static volatile SingularAttribute<DescontoCliente, String> codCanalVenda;
    public static volatile SingularAttribute<DescontoCliente, Date> dataFimValidade;
    public static volatile SingularAttribute<DescontoCliente, Integer> id;
    public static volatile SingularAttribute<DescontoCliente, Empresa> empresa;
    public static volatile SingularAttribute<DescontoCliente, String> participante;
    public static volatile SingularAttribute<DescontoCliente, String> condPagto;

}