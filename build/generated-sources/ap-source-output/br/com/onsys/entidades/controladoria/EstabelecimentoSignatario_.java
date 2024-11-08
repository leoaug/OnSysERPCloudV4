package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.Signatario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EstabelecimentoSignatario.class)
public class EstabelecimentoSignatario_ { 

    public static volatile SingularAttribute<EstabelecimentoSignatario, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<EstabelecimentoSignatario, Integer> id;
    public static volatile SingularAttribute<EstabelecimentoSignatario, Signatario> signatario;
    public static volatile SingularAttribute<EstabelecimentoSignatario, Empresa> empresa;

}