package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import br.com.onsys.entidades.comercial.NaturezaOperacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(NatOperacaoUFST.class)
public class NatOperacaoUFST_ { 

    public static volatile SingularAttribute<NatOperacaoUFST, Boolean> st;
    public static volatile SingularAttribute<NatOperacaoUFST, Estado> estado;
    public static volatile SingularAttribute<NatOperacaoUFST, NaturezaOperacao> naturezaOperacao;
    public static volatile SingularAttribute<NatOperacaoUFST, Municipio> municipio;
    public static volatile SingularAttribute<NatOperacaoUFST, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<NatOperacaoUFST, Integer> id;
    public static volatile SingularAttribute<NatOperacaoUFST, Empresa> empresa;

}