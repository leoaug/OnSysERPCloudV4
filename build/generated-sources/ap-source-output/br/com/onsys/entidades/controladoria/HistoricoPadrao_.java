package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(HistoricoPadrao.class)
public class HistoricoPadrao_ { 

    public static volatile SingularAttribute<HistoricoPadrao, String> obs;
    public static volatile SingularAttribute<HistoricoPadrao, String> codigo;
    public static volatile SingularAttribute<HistoricoPadrao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<HistoricoPadrao, String> deletado;
    public static volatile SingularAttribute<HistoricoPadrao, String> inativo;
    public static volatile SingularAttribute<HistoricoPadrao, String> modificado;
    public static volatile SingularAttribute<HistoricoPadrao, Integer> id;
    public static volatile SingularAttribute<HistoricoPadrao, Empresa> empresa;
    public static volatile SingularAttribute<HistoricoPadrao, Date> datainativo;
    public static volatile SingularAttribute<HistoricoPadrao, String> descricao;

}