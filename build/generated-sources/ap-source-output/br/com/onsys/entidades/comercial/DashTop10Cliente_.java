package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DashTop10Cliente.class)
public class DashTop10Cliente_ { 

    public static volatile SingularAttribute<DashTop10Cliente, String> cliente;
    public static volatile SingularAttribute<DashTop10Cliente, String> codigo;
    public static volatile SingularAttribute<DashTop10Cliente, BigDecimal> realizado;
    public static volatile SingularAttribute<DashTop10Cliente, BigDecimal> meta;
    public static volatile SingularAttribute<DashTop10Cliente, BigDecimal> variacao;
    public static volatile SingularAttribute<DashTop10Cliente, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<DashTop10Cliente, Usuario> usuario;
    public static volatile SingularAttribute<DashTop10Cliente, Integer> id;
    public static volatile SingularAttribute<DashTop10Cliente, Empresa> empresa;

}