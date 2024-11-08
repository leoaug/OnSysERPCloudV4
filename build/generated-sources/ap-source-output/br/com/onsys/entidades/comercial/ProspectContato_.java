package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Prospect;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ProspectContato.class)
public class ProspectContato_ { 

    public static volatile SingularAttribute<ProspectContato, String> setor;
    public static volatile SingularAttribute<ProspectContato, String> obscontato;
    public static volatile SingularAttribute<ProspectContato, String> nome;
    public static volatile SingularAttribute<ProspectContato, String> fone;
    public static volatile SingularAttribute<ProspectContato, Prospect> prospect;
    public static volatile SingularAttribute<ProspectContato, Date> aniversario;
    public static volatile SingularAttribute<ProspectContato, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ProspectContato, String> celular;
    public static volatile SingularAttribute<ProspectContato, Integer> id;
    public static volatile SingularAttribute<ProspectContato, String> cargo;
    public static volatile SingularAttribute<ProspectContato, Empresa> empresa;
    public static volatile SingularAttribute<ProspectContato, String> ramal;
    public static volatile SingularAttribute<ProspectContato, String> email;

}