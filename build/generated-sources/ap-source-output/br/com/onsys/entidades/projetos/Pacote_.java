package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.projetos.Subfase;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Pacote.class)
public class Pacote_ { 

    public static volatile SingularAttribute<Pacote, String> obs;
    public static volatile SingularAttribute<Pacote, String> codigo;
    public static volatile SingularAttribute<Pacote, Subfase> subfase;
    public static volatile SingularAttribute<Pacote, Boolean> repassaImposto;
    public static volatile SingularAttribute<Pacote, String> deletado;
    public static volatile SingularAttribute<Pacote, String> modificado;
    public static volatile SingularAttribute<Pacote, Date> datainativo;
    public static volatile SingularAttribute<Pacote, String> descricao;
    public static volatile SingularAttribute<Pacote, BigDecimal> vlcliente;
    public static volatile SingularAttribute<Pacote, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Pacote, String> inativo;
    public static volatile SingularAttribute<Pacote, Integer> id;
    public static volatile SingularAttribute<Pacote, Empresa> empresa;

}