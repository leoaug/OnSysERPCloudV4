package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.logistica.Coleta;
import br.com.onsys.entidades.logistica.Fatura;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(FaturaColeta.class)
public class FaturaColeta_ { 

    public static volatile SingularAttribute<FaturaColeta, Fatura> fatura;
    public static volatile SingularAttribute<FaturaColeta, Integer> id;
    public static volatile SingularAttribute<FaturaColeta, Coleta> coleta;
    public static volatile SingularAttribute<FaturaColeta, Empresa> empresa;

}