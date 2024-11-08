package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.tipos.SituacaoFA;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FichaAprop.class)
public class FichaAprop_ { 

    public static volatile SingularAttribute<FichaAprop, String> codigo;
    public static volatile SingularAttribute<FichaAprop, SituacaoFA> situacao;
    public static volatile SingularAttribute<FichaAprop, Date> dataemissao;
    public static volatile SingularAttribute<FichaAprop, Integer> numfa;
    public static volatile SingularAttribute<FichaAprop, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<FichaAprop, Usuario> usuario;
    public static volatile SingularAttribute<FichaAprop, Integer> id;
    public static volatile SingularAttribute<FichaAprop, Empresa> empresa;

}