package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(PrecosPortais.class)
public class PrecosPortais_ { 

    public static volatile SingularAttribute<PrecosPortais, String> obs;
    public static volatile SingularAttribute<PrecosPortais, Item> item;
    public static volatile SingularAttribute<PrecosPortais, String> marketplace;
    public static volatile SingularAttribute<PrecosPortais, Date> dataInativo;
    public static volatile SingularAttribute<PrecosPortais, String> loja;
    public static volatile SingularAttribute<PrecosPortais, String> deletado;
    public static volatile SingularAttribute<PrecosPortais, String> modificado;
    public static volatile SingularAttribute<PrecosPortais, Double> preco;
    public static volatile SingularAttribute<PrecosPortais, Date> dataAtivo;
    public static volatile SingularAttribute<PrecosPortais, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<PrecosPortais, String> inativo;
    public static volatile SingularAttribute<PrecosPortais, Integer> id;
    public static volatile SingularAttribute<PrecosPortais, Empresa> empresa;

}