package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(BcoFebraban.class)
public class BcoFebraban_ { 

    public static volatile SingularAttribute<BcoFebraban, String> codigo;
    public static volatile SingularAttribute<BcoFebraban, String> logo;
    public static volatile SingularAttribute<BcoFebraban, String> deletado;
    public static volatile SingularAttribute<BcoFebraban, String> inativo;
    public static volatile SingularAttribute<BcoFebraban, Integer> id;
    public static volatile SingularAttribute<BcoFebraban, Empresa> empresa;
    public static volatile SingularAttribute<BcoFebraban, Date> datainativo;
    public static volatile SingularAttribute<BcoFebraban, String> descricao;

}