package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Cep;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.tipos.TipoAtivEFD;
import br.com.onsys.entidades.tipos.TipoNatPJ;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Estabelecimento.class)
public class Estabelecimento_ { 

    public static volatile SingularAttribute<Estabelecimento, String> perfilefd;
    public static volatile SingularAttribute<Estabelecimento, String> obs;
    public static volatile SingularAttribute<Estabelecimento, String> numero;
    public static volatile SingularAttribute<Estabelecimento, String> lefd;
    public static volatile SingularAttribute<Estabelecimento, PlanoContas> IPIRecolher;
    public static volatile SingularAttribute<Estabelecimento, String> modificado;
    public static volatile SingularAttribute<Estabelecimento, String> cnpj;
    public static volatile SingularAttribute<Estabelecimento, String> codCEP;
    public static volatile SingularAttribute<Estabelecimento, Date> datainativo;
    public static volatile SingularAttribute<Estabelecimento, Cep> cep;
    public static volatile SingularAttribute<Estabelecimento, String> uf;
    public static volatile SingularAttribute<Estabelecimento, String> complemento;
    public static volatile SingularAttribute<Estabelecimento, PlanoContas> ICMSRecolher;
    public static volatile SingularAttribute<Estabelecimento, String> ambientenfe;
    public static volatile SingularAttribute<Estabelecimento, String> nomefantasia;
    public static volatile SingularAttribute<Estabelecimento, Integer> id;
    public static volatile SingularAttribute<Estabelecimento, String> ie;
    public static volatile SingularAttribute<Estabelecimento, String> fax;
    public static volatile SingularAttribute<Estabelecimento, String> nire;
    public static volatile SingularAttribute<Estabelecimento, String> email;
    public static volatile SingularAttribute<Estabelecimento, String> cnae;
    public static volatile SingularAttribute<Estabelecimento, String> suframa;
    public static volatile SingularAttribute<Estabelecimento, String> codigo;
    public static volatile SingularAttribute<Estabelecimento, String> im;
    public static volatile SingularAttribute<Estabelecimento, String> bairro;
    public static volatile SingularAttribute<Estabelecimento, String> municipio;
    public static volatile SingularAttribute<Estabelecimento, String> lecd;
    public static volatile SingularAttribute<Estabelecimento, PlanoContas> fornecedores;
    public static volatile SingularAttribute<Estabelecimento, String> deletado;
    public static volatile SingularAttribute<Estabelecimento, PlanoContas> ICMSRecuperar;
    public static volatile SingularAttribute<Estabelecimento, TipoAtivEFD> ativefd;
    public static volatile SingularAttribute<Estabelecimento, String> descricao;
    public static volatile SingularAttribute<Estabelecimento, String> fone;
    public static volatile SingularAttribute<Estabelecimento, Boolean> consolidaResultado;
    public static volatile SingularAttribute<Estabelecimento, String> lnfe;
    public static volatile SingularAttribute<Estabelecimento, TipoNatPJ> indnatpj;
    public static volatile SingularAttribute<Estabelecimento, String> logradouro;
    public static volatile SingularAttribute<Estabelecimento, PlanoContas> receitas;
    public static volatile SingularAttribute<Estabelecimento, String> inativo;
    public static volatile SingularAttribute<Estabelecimento, PlanoContas> IPIRecuperar;
    public static volatile SingularAttribute<Estabelecimento, Empresa> empresa;
    public static volatile SingularAttribute<Estabelecimento, String> indsitesp;

}