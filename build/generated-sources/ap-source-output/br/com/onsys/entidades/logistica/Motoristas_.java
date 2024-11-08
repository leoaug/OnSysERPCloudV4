package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Motoristas.class)
public class Motoristas_ { 

    public static volatile SingularAttribute<Motoristas, String> obs;
    public static volatile SingularAttribute<Motoristas, String> apelido;
    public static volatile SingularAttribute<Motoristas, Date> dtPrimeiraHabilit;
    public static volatile SingularAttribute<Motoristas, String> orgaoEmissorRg;
    public static volatile SingularAttribute<Motoristas, String> categoria;
    public static volatile SingularAttribute<Motoristas, Date> dtEmissaoRg;
    public static volatile SingularAttribute<Motoristas, String> deletado;
    public static volatile SingularAttribute<Motoristas, String> nome;
    public static volatile SingularAttribute<Motoristas, String> modificado;
    public static volatile SingularAttribute<Motoristas, Date> datainativo;
    public static volatile SingularAttribute<Motoristas, String> habilitacao;
    public static volatile SingularAttribute<Motoristas, String> eMail;
    public static volatile SingularAttribute<Motoristas, String> tipoCartao;
    public static volatile SingularAttribute<Motoristas, String> rg;
    public static volatile SingularAttribute<Motoristas, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Motoristas, String> cpf;
    public static volatile SingularAttribute<Motoristas, Date> validadeHabilit;
    public static volatile SingularAttribute<Motoristas, String> nrCartao;
    public static volatile SingularAttribute<Motoristas, String> inativo;
    public static volatile SingularAttribute<Motoristas, Integer> id;
    public static volatile SingularAttribute<Motoristas, Empresa> empresa;

}