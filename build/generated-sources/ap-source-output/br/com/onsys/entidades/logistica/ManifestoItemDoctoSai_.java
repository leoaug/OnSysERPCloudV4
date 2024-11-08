package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.logistica.DoctoSai;
import br.com.onsys.entidades.logistica.Manifesto;
import br.com.onsys.entidades.manufatura.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ManifestoItemDoctoSai.class)
public class ManifestoItemDoctoSai_ { 

    public static volatile SingularAttribute<ManifestoItemDoctoSai, Integer> quantidadeNF;
    public static volatile SingularAttribute<ManifestoItemDoctoSai, Integer> quantidadeLida;
    public static volatile SingularAttribute<ManifestoItemDoctoSai, Item> item;
    public static volatile SingularAttribute<ManifestoItemDoctoSai, DoctoSai> doctoSai;
    public static volatile SingularAttribute<ManifestoItemDoctoSai, Integer> id;
    public static volatile SingularAttribute<ManifestoItemDoctoSai, Manifesto> manifesto;
    public static volatile SingularAttribute<ManifestoItemDoctoSai, Empresa> empresa;
    public static volatile SingularAttribute<ManifestoItemDoctoSai, String> status;

}