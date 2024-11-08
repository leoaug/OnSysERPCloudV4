package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatChamado.class)
public class CatChamado_ { 

    public static volatile SingularAttribute<CatChamado, String> obs;
    public static volatile SingularAttribute<CatChamado, String> codigo;
    public static volatile SingularAttribute<CatChamado, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatChamado, String> deletado;
    public static volatile SingularAttribute<CatChamado, String> inativo;
    public static volatile SingularAttribute<CatChamado, String> modificado;
    public static volatile SingularAttribute<CatChamado, Usuario> gestor;
    public static volatile SingularAttribute<CatChamado, Integer> id;
    public static volatile SingularAttribute<CatChamado, Empresa> empresa;
    public static volatile SingularAttribute<CatChamado, Date> datainativo;
    public static volatile SingularAttribute<CatChamado, String> descricao;

}