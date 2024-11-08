package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.manufatura.Item;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(OrdProd.class)
public class OrdProd_ { 

    public static volatile SingularAttribute<OrdProd, Double> qtdeop;
    public static volatile SingularAttribute<OrdProd, String> obs;
    public static volatile SingularAttribute<OrdProd, String> situacao;
    public static volatile SingularAttribute<OrdProd, Item> item;
    public static volatile SingularAttribute<OrdProd, String> lote;
    public static volatile SingularAttribute<OrdProd, Usuario> usrcriacao;
    public static volatile SingularAttribute<OrdProd, Date> dataentrega;
    public static volatile SingularAttribute<OrdProd, Usuario> usrreporte;
    public static volatile SingularAttribute<OrdProd, String> nrpedcli;
    public static volatile SingularAttribute<OrdProd, Participante> cliente;
    public static volatile SingularAttribute<OrdProd, Date> dataemissao;
    public static volatile SingularAttribute<OrdProd, Integer> nrop;
    public static volatile SingularAttribute<OrdProd, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<OrdProd, Double> pesobruto;
    public static volatile SingularAttribute<OrdProd, Date> datafabricacao;
    public static volatile SingularAttribute<OrdProd, Double> saldoOP;
    public static volatile SingularAttribute<OrdProd, Date> datavalidade;
    public static volatile SingularAttribute<OrdProd, Double> qtdeproduzida;
    public static volatile SingularAttribute<OrdProd, Integer> id;
    public static volatile SingularAttribute<OrdProd, Empresa> empresa;
    public static volatile SingularAttribute<OrdProd, Double> pesoliq;

}