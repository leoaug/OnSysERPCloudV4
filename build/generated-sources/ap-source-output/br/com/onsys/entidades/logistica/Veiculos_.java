package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Veiculos.class)
public class Veiculos_ { 

    public static volatile SingularAttribute<Veiculos, String> tipoVeiculo;
    public static volatile SingularAttribute<Veiculos, String> antt;
    public static volatile SingularAttribute<Veiculos, String> modeloVeiculo;
    public static volatile SingularAttribute<Veiculos, String> obs;
    public static volatile SingularAttribute<Veiculos, String> situacao;
    public static volatile SingularAttribute<Veiculos, String> marcaVeiculo;
    public static volatile SingularAttribute<Veiculos, String> modificado;
    public static volatile SingularAttribute<Veiculos, BigDecimal> capacidadeVeiculoKG;
    public static volatile SingularAttribute<Veiculos, Integer> kmAtual;
    public static volatile SingularAttribute<Veiculos, Date> datainativo;
    public static volatile SingularAttribute<Veiculos, String> tipoCarroceria;
    public static volatile SingularAttribute<Veiculos, BigDecimal> capacidadeVeiculoM3;
    public static volatile SingularAttribute<Veiculos, String> anoFabricacao;
    public static volatile SingularAttribute<Veiculos, Integer> trocaOleoKM;
    public static volatile SingularAttribute<Veiculos, Integer> id;
    public static volatile SingularAttribute<Veiculos, String> anoModelo;
    public static volatile SingularAttribute<Veiculos, String> rntc;
    public static volatile SingularAttribute<Veiculos, String> placa;
    public static volatile SingularAttribute<Veiculos, String> codigo;
    public static volatile SingularAttribute<Veiculos, String> combustivel;
    public static volatile SingularAttribute<Veiculos, String> codOperacaoTransporte;
    public static volatile SingularAttribute<Veiculos, Integer> nrEixos;
    public static volatile SingularAttribute<Veiculos, String> renavam;
    public static volatile SingularAttribute<Veiculos, String> proprioTerceiro;
    public static volatile SingularAttribute<Veiculos, String> deletado;
    public static volatile SingularAttribute<Veiculos, BigDecimal> consumo;
    public static volatile SingularAttribute<Veiculos, String> tipoRodado;
    public static volatile SingularAttribute<Veiculos, Estado> ufplaca;
    public static volatile SingularAttribute<Veiculos, String> chassi;
    public static volatile SingularAttribute<Veiculos, String> inativo;
    public static volatile SingularAttribute<Veiculos, BigDecimal> taraVeiculo;
    public static volatile SingularAttribute<Veiculos, Empresa> empresa;

}