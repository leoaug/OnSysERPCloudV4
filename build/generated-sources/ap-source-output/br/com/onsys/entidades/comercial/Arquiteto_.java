package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Arquiteto.class)
public class Arquiteto_ { 

    public static volatile SingularAttribute<Arquiteto, String> obs;
    public static volatile SingularAttribute<Arquiteto, String> codigo;
    public static volatile SingularAttribute<Arquiteto, Date> datacadastro;
    public static volatile SingularAttribute<Arquiteto, String> deletado;
    public static volatile SingularAttribute<Arquiteto, String> modificado;
    public static volatile SingularAttribute<Arquiteto, Participante> participante;
    public static volatile SingularAttribute<Arquiteto, Date> datainativo;
    public static volatile SingularAttribute<Arquiteto, Date> modificacao;
    public static volatile SingularAttribute<Arquiteto, BigDecimal> comissao;
    public static volatile SingularAttribute<Arquiteto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Arquiteto, String> inativo;
    public static volatile SingularAttribute<Arquiteto, Integer> id;
    public static volatile SingularAttribute<Arquiteto, Empresa> empresa;

}