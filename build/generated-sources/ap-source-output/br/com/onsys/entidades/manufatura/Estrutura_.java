package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Estrutura.class)
public class Estrutura_ { 

    public static volatile SingularAttribute<Estrutura, String> obs;
    public static volatile SingularAttribute<Estrutura, Item> itemFilho;
    public static volatile SingularAttribute<Estrutura, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Estrutura, Item> itemPai;
    public static volatile SingularAttribute<Estrutura, String> deletado;
    public static volatile SingularAttribute<Estrutura, String> inativo;
    public static volatile SingularAttribute<Estrutura, Integer> id;
    public static volatile SingularAttribute<Estrutura, Double> quantidadeComponente;
    public static volatile SingularAttribute<Estrutura, Empresa> empresa;
    public static volatile SingularAttribute<Estrutura, Date> datainativo;

}