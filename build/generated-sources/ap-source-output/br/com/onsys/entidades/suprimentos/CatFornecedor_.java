package br.com.onsys.entidades.suprimentos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(CatFornecedor.class)
public class CatFornecedor_ { 

    public static volatile SingularAttribute<CatFornecedor, String> obs;
    public static volatile SingularAttribute<CatFornecedor, String> codigo;
    public static volatile SingularAttribute<CatFornecedor, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<CatFornecedor, String> deletado;
    public static volatile SingularAttribute<CatFornecedor, String> inativo;
    public static volatile SingularAttribute<CatFornecedor, String> modificado;
    public static volatile SingularAttribute<CatFornecedor, Integer> id;
    public static volatile SingularAttribute<CatFornecedor, PlanoContas> contapassivo;
    public static volatile SingularAttribute<CatFornecedor, Empresa> empresa;
    public static volatile SingularAttribute<CatFornecedor, Date> datainativo;
    public static volatile SingularAttribute<CatFornecedor, String> descricao;

}