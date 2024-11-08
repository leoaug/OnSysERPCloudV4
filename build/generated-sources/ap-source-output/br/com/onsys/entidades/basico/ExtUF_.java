package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.comercial.ClasFiscal;
import br.com.onsys.entidades.comercial.NaturezaOperacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ExtUF.class)
public class ExtUF_ { 

    public static volatile SingularAttribute<ExtUF, Participante> cliente;
    public static volatile SingularAttribute<ExtUF, Estado> estado;
    public static volatile SingularAttribute<ExtUF, String> cidade;
    public static volatile SingularAttribute<ExtUF, NaturezaOperacao> cfopVenda;
    public static volatile SingularAttribute<ExtUF, Integer> id;
    public static volatile SingularAttribute<ExtUF, Empresa> empresa;
    public static volatile SingularAttribute<ExtUF, ClasFiscal> clasFiscal;
    public static volatile SingularAttribute<ExtUF, NaturezaOperacao> cfopBoni;

}