package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(SerieNotaFiscal.class)
public class SerieNotaFiscal_ { 

    public static volatile SingularAttribute<SerieNotaFiscal, String> obs;
    public static volatile SingularAttribute<SerieNotaFiscal, String> codigo;
    public static volatile SingularAttribute<SerieNotaFiscal, String> deletado;
    public static volatile SingularAttribute<SerieNotaFiscal, String> tpentsai;
    public static volatile SingularAttribute<SerieNotaFiscal, String> seriepadrao;
    public static volatile SingularAttribute<SerieNotaFiscal, Date> datainativo;
    public static volatile SingularAttribute<SerieNotaFiscal, String> descricao;
    public static volatile SingularAttribute<SerieNotaFiscal, Integer> ultnf;
    public static volatile SingularAttribute<SerieNotaFiscal, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<SerieNotaFiscal, String> serie;
    public static volatile SingularAttribute<SerieNotaFiscal, String> inativo;
    public static volatile SingularAttribute<SerieNotaFiscal, Integer> id;
    public static volatile SingularAttribute<SerieNotaFiscal, Empresa> empresa;

}