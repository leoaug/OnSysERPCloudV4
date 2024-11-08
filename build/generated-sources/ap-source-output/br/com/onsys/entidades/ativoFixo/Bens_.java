package br.com.onsys.entidades.ativoFixo;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import br.com.onsys.entidades.manufatura.Item;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Bens.class)
public class Bens_ { 

    public static volatile SingularAttribute<Bens, String> obs;
    public static volatile SingularAttribute<Bens, String> modificado;
    public static volatile SingularAttribute<Bens, BigDecimal> vlContabil;
    public static volatile SingularAttribute<Bens, byte[]> fotoDoBem;
    public static volatile SingularAttribute<Bens, Date> dataAquisicao;
    public static volatile SingularAttribute<Bens, Date> datainativo;
    public static volatile SingularAttribute<Bens, BigDecimal> vlCOFINS;
    public static volatile SingularAttribute<Bens, BigDecimal> vlUFIRAquisicao;
    public static volatile SingularAttribute<Bens, Date> modificacao;
    public static volatile SingularAttribute<Bens, String> apolice;
    public static volatile SingularAttribute<Bens, UnidNegocio> unidnegocio;
    public static volatile SingularAttribute<Bens, String> codigobarras;
    public static volatile SingularAttribute<Bens, Integer> id;
    public static volatile SingularAttribute<Bens, Date> dataBaixa;
    public static volatile SingularAttribute<Bens, String> codigo;
    public static volatile SingularAttribute<Bens, Item> item;
    public static volatile SingularAttribute<Bens, String> deletado;
    public static volatile SingularAttribute<Bens, String> serieNotaFiscal;
    public static volatile SingularAttribute<Bens, String> descricao;
    public static volatile SingularAttribute<Bens, BigDecimal> vlPIS;
    public static volatile SingularAttribute<Bens, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Bens, BigDecimal> vlAquisicao;
    public static volatile SingularAttribute<Bens, PlanoContas> contaDepreciacao;
    public static volatile SingularAttribute<Bens, String> inativo;
    public static volatile SingularAttribute<Bens, Participante> fornecedor;
    public static volatile SingularAttribute<Bens, String> notaFiscal;
    public static volatile SingularAttribute<Bens, Empresa> empresa;

}