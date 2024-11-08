package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ModDoctoFiscal.class)
public class ModDoctoFiscal_ { 

    public static volatile SingularAttribute<ModDoctoFiscal, String> codigo;
    public static volatile SingularAttribute<ModDoctoFiscal, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ModDoctoFiscal, Integer> id;
    public static volatile SingularAttribute<ModDoctoFiscal, Empresa> empresa;
    public static volatile SingularAttribute<ModDoctoFiscal, String> modelo;
    public static volatile SingularAttribute<ModDoctoFiscal, String> descricao;

}