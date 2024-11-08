package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.logistica.Motoristas;
import br.com.onsys.entidades.logistica.Veiculos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Coleta.class)
public class Coleta_ { 

    public static volatile SingularAttribute<Coleta, String> obs;
    public static volatile SingularAttribute<Coleta, String> cidade;
    public static volatile SingularAttribute<Coleta, String> numero;
    public static volatile SingularAttribute<Coleta, Date> horaPrevColeta;
    public static volatile SingularAttribute<Coleta, String> modificado;
    public static volatile SingularAttribute<Coleta, Date> dataEmissao;
    public static volatile SingularAttribute<Coleta, BigDecimal> valor_cobranca;
    public static volatile SingularAttribute<Coleta, String> cep;
    public static volatile SingularAttribute<Coleta, Date> dataRealColeta;
    public static volatile SingularAttribute<Coleta, String> uf;
    public static volatile SingularAttribute<Coleta, String> complemento;
    public static volatile SingularAttribute<Coleta, BigDecimal> valor_iss;
    public static volatile SingularAttribute<Coleta, Date> dataPrevColeta;
    public static volatile SingularAttribute<Coleta, String> contatoTelefone;
    public static volatile SingularAttribute<Coleta, Integer> id;
    public static volatile SingularAttribute<Coleta, String> contato;
    public static volatile SingularAttribute<Coleta, String> nrColeta;
    public static volatile SingularAttribute<Coleta, BigDecimal> valor_apagar;
    public static volatile SingularAttribute<Coleta, String> bairro;
    public static volatile SingularAttribute<Coleta, Participante> participante;
    public static volatile SingularAttribute<Coleta, Date> horaRealColeta;
    public static volatile SingularAttribute<Coleta, String> descricao;
    public static volatile SingularAttribute<Coleta, Integer> volume;
    public static volatile SingularAttribute<Coleta, Veiculos> veiculos;
    public static volatile SingularAttribute<Coleta, Motoristas> motoristas;
    public static volatile SingularAttribute<Coleta, String> logradouro;
    public static volatile SingularAttribute<Coleta, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Coleta, Empresa> empresa;
    public static volatile SingularAttribute<Coleta, String> status;

}