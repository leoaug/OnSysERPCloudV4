package br.com.onsys.entidades.frota;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import br.com.onsys.entidades.frota.CatManutencao;
import br.com.onsys.entidades.logistica.Veiculos;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Manutencao.class)
public class Manutencao_ { 

    public static volatile SingularAttribute<Manutencao, String> obs;
    public static volatile SingularAttribute<Manutencao, BigDecimal> km;
    public static volatile SingularAttribute<Manutencao, Veiculos> veiculos;
    public static volatile SingularAttribute<Manutencao, Date> data;
    public static volatile SingularAttribute<Manutencao, CatManutencao> catManutencao;
    public static volatile SingularAttribute<Manutencao, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Manutencao, BigDecimal> valor;
    public static volatile SingularAttribute<Manutencao, BigDecimal> kmProxima;
    public static volatile SingularAttribute<Manutencao, Integer> id;
    public static volatile SingularAttribute<Manutencao, Participante> fornecedor;
    public static volatile SingularAttribute<Manutencao, Empresa> empresa;
    public static volatile SingularAttribute<Manutencao, BigDecimal> quantidade;

}