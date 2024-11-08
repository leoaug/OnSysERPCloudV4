package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Cep;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Transportadora.class)
public class Transportadora_ { 

    public static volatile SingularAttribute<Transportadora, String> obs;
    public static volatile SingularAttribute<Transportadora, String> tipo;
    public static volatile SingularAttribute<Transportadora, String> numero;
    public static volatile SingularAttribute<Transportadora, String> modificado;
    public static volatile SingularAttribute<Transportadora, String> cnpj;
    public static volatile SingularAttribute<Transportadora, Integer> volumeFinal;
    public static volatile SingularAttribute<Transportadora, BigDecimal> pesoFinal;
    public static volatile SingularAttribute<Transportadora, Cep> cep;
    public static volatile SingularAttribute<Transportadora, String> uf;
    public static volatile SingularAttribute<Transportadora, String> complemento;
    public static volatile SingularAttribute<Transportadora, String> cpf;
    public static volatile SingularAttribute<Transportadora, BigDecimal> valorInicial;
    public static volatile SingularAttribute<Transportadora, String> nomefantasia;
    public static volatile SingularAttribute<Transportadora, Integer> id;
    public static volatile SingularAttribute<Transportadora, String> ie;
    public static volatile SingularAttribute<Transportadora, String> cepFinal;
    public static volatile SingularAttribute<Transportadora, String> senhaAPI;
    public static volatile SingularAttribute<Transportadora, BigDecimal> pesoInicial;
    public static volatile SingularAttribute<Transportadora, String> email;
    public static volatile SingularAttribute<Transportadora, String> suframa;
    public static volatile SingularAttribute<Transportadora, String> codigo;
    public static volatile SingularAttribute<Transportadora, String> im;
    public static volatile SingularAttribute<Transportadora, Date> dataInativo;
    public static volatile SingularAttribute<Transportadora, String> deletado;
    public static volatile SingularAttribute<Transportadora, String> razaosocial;
    public static volatile SingularAttribute<Transportadora, String> fone;
    public static volatile SingularAttribute<Transportadora, String> urlRastreio;
    public static volatile SingularAttribute<Transportadora, String> usuarioAPI;
    public static volatile SingularAttribute<Transportadora, String> urlAPI;
    public static volatile SingularAttribute<Transportadora, BigDecimal> percfrete;
    public static volatile SingularAttribute<Transportadora, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Transportadora, Integer> volumeInicial;
    public static volatile SingularAttribute<Transportadora, String> inativo;
    public static volatile SingularAttribute<Transportadora, String> cepInicial;
    public static volatile SingularAttribute<Transportadora, BigDecimal> alturaInicial;
    public static volatile SingularAttribute<Transportadora, BigDecimal> alturaFinal;
    public static volatile SingularAttribute<Transportadora, String> Fax;
    public static volatile SingularAttribute<Transportadora, Empresa> empresa;
    public static volatile SingularAttribute<Transportadora, BigDecimal> valorFinal;

}