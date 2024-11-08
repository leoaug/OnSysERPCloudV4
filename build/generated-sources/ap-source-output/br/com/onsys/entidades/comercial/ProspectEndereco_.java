package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Cep;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.Prospect;
import br.com.onsys.entidades.tipos.TpEnderParticipante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ProspectEndereco.class)
public class ProspectEndereco_ { 

    public static volatile SingularAttribute<ProspectEndereco, String> suframa;
    public static volatile SingularAttribute<ProspectEndereco, String> codigo;
    public static volatile SingularAttribute<ProspectEndereco, TpEnderParticipante> tipo;
    public static volatile SingularAttribute<ProspectEndereco, String> im;
    public static volatile SingularAttribute<ProspectEndereco, String> numero;
    public static volatile SingularAttribute<ProspectEndereco, String> cnpj;
    public static volatile SingularAttribute<ProspectEndereco, Cep> cep;
    public static volatile SingularAttribute<ProspectEndereco, Prospect> prospect;
    public static volatile SingularAttribute<ProspectEndereco, String> complemento;
    public static volatile SingularAttribute<ProspectEndereco, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ProspectEndereco, Integer> id;
    public static volatile SingularAttribute<ProspectEndereco, String> obsendereco;
    public static volatile SingularAttribute<ProspectEndereco, String> ie;
    public static volatile SingularAttribute<ProspectEndereco, Empresa> empresa;

}