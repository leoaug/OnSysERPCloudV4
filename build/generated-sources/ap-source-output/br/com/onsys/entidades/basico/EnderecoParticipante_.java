package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.basico.Cep;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EnderecoParticipante.class)
public class EnderecoParticipante_ { 

    public static volatile SingularAttribute<EnderecoParticipante, String> obs;
    public static volatile SingularAttribute<EnderecoParticipante, String> suframa;
    public static volatile SingularAttribute<EnderecoParticipante, String> tipo;
    public static volatile SingularAttribute<EnderecoParticipante, String> cidade;
    public static volatile SingularAttribute<EnderecoParticipante, String> codigo;
    public static volatile SingularAttribute<EnderecoParticipante, String> numero;
    public static volatile SingularAttribute<EnderecoParticipante, String> im;
    public static volatile SingularAttribute<EnderecoParticipante, String> bairro;
    public static volatile SingularAttribute<EnderecoParticipante, String> cod_cep;
    public static volatile SingularAttribute<EnderecoParticipante, String> deletado;
    public static volatile SingularAttribute<EnderecoParticipante, String> modificado;
    public static volatile SingularAttribute<EnderecoParticipante, String> cnpj;
    public static volatile SingularAttribute<EnderecoParticipante, Participante> participante;
    public static volatile SingularAttribute<EnderecoParticipante, Date> datainativo;
    public static volatile SingularAttribute<EnderecoParticipante, Cep> cep;
    public static volatile SingularAttribute<EnderecoParticipante, String> uf;
    public static volatile SingularAttribute<EnderecoParticipante, String> complemento;
    public static volatile SingularAttribute<EnderecoParticipante, String> logradouro;
    public static volatile SingularAttribute<EnderecoParticipante, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<EnderecoParticipante, String> inativo;
    public static volatile SingularAttribute<EnderecoParticipante, Integer> id;
    public static volatile SingularAttribute<EnderecoParticipante, String> obsendereco;
    public static volatile SingularAttribute<EnderecoParticipante, String> ie;
    public static volatile SingularAttribute<EnderecoParticipante, Empresa> empresa;

}