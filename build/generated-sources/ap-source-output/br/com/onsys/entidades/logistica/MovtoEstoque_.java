package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.Localizacao;
import br.com.onsys.entidades.logistica.TipoDoctoLogistica;
import br.com.onsys.entidades.manufatura.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(MovtoEstoque.class)
public class MovtoEstoque_ { 

    public static volatile SingularAttribute<MovtoEstoque, Double> vlggf;
    public static volatile SingularAttribute<MovtoEstoque, Item> item;
    public static volatile SingularAttribute<MovtoEstoque, Localizacao> localizacao;
    public static volatile SingularAttribute<MovtoEstoque, Double> vlmovto;
    public static volatile SingularAttribute<MovtoEstoque, String> origem;
    public static volatile SingularAttribute<MovtoEstoque, Date> dtmovto;
    public static volatile SingularAttribute<MovtoEstoque, Deposito> deposito;
    public static volatile SingularAttribute<MovtoEstoque, Double> vlUnit;
    public static volatile SingularAttribute<MovtoEstoque, Participante> participante;
    public static volatile SingularAttribute<MovtoEstoque, String> nrodocto;
    public static volatile SingularAttribute<MovtoEstoque, String> tipomovto;
    public static volatile SingularAttribute<MovtoEstoque, Double> vlunitmat;
    public static volatile SingularAttribute<MovtoEstoque, Double> vlunitmob;
    public static volatile SingularAttribute<MovtoEstoque, String> tipoval;
    public static volatile SingularAttribute<MovtoEstoque, TipoDoctoLogistica> tipodoctologistica;
    public static volatile SingularAttribute<MovtoEstoque, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<MovtoEstoque, String> serie;
    public static volatile SingularAttribute<MovtoEstoque, Integer> doctoorigem_id;
    public static volatile SingularAttribute<MovtoEstoque, Double> vlunitggf;
    public static volatile SingularAttribute<MovtoEstoque, Integer> id;
    public static volatile SingularAttribute<MovtoEstoque, Double> vlmat;
    public static volatile SingularAttribute<MovtoEstoque, Double> vlmob;
    public static volatile SingularAttribute<MovtoEstoque, Empresa> empresa;
    public static volatile SingularAttribute<MovtoEstoque, Double> qtdmovto;

}