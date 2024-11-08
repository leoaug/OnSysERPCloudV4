package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Fatura.class)
public class Fatura_ { 

    public static volatile SingularAttribute<Fatura, String> obs;
    public static volatile SingularAttribute<Fatura, String> numero;
    public static volatile SingularAttribute<Fatura, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Fatura, Date> dataVencimento;
    public static volatile SingularAttribute<Fatura, BigDecimal> valor;
    public static volatile SingularAttribute<Fatura, Integer> id;
    public static volatile SingularAttribute<Fatura, Date> dataEmissao;
    public static volatile SingularAttribute<Fatura, Empresa> empresa;
    public static volatile SingularAttribute<Fatura, Participante> participante;
    public static volatile SingularAttribute<Fatura, String> descricao;
    public static volatile SingularAttribute<Fatura, String> status;

}