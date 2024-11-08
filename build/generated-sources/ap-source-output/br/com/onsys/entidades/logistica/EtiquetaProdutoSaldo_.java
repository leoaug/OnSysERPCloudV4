package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.manufatura.Item;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(EtiquetaProdutoSaldo.class)
public class EtiquetaProdutoSaldo_ { 

    public static volatile SingularAttribute<EtiquetaProdutoSaldo, Date> dtEmissao;
    public static volatile SingularAttribute<EtiquetaProdutoSaldo, String> codigoBarra;
    public static volatile SingularAttribute<EtiquetaProdutoSaldo, Item> item;
    public static volatile SingularAttribute<EtiquetaProdutoSaldo, Integer> id;
    public static volatile SingularAttribute<EtiquetaProdutoSaldo, Empresa> empresa;

}