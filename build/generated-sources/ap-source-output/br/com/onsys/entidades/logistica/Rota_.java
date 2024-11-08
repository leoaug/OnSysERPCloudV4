package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Motoristas;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.logistica.Veiculos;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Rota.class)
public class Rota_ { 

    public static volatile SingularAttribute<Rota, Veiculos> veiculo;
    public static volatile SingularAttribute<Rota, String> obs;
    public static volatile SingularAttribute<Rota, Usuario> usrCriacao;
    public static volatile SingularAttribute<Rota, Date> dtSaida;
    public static volatile SingularAttribute<Rota, Usuario> usrConferente;
    public static volatile SingularAttribute<Rota, Date> dtSaidaPrevista;
    public static volatile SingularAttribute<Rota, String> nroRota;
    public static volatile SingularAttribute<Rota, Transportadora> transportadora;
    public static volatile SingularAttribute<Rota, Date> dtEmissao;
    public static volatile SingularAttribute<Rota, Motoristas> motorista;
    public static volatile SingularAttribute<Rota, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Rota, Integer> id;
    public static volatile SingularAttribute<Rota, Empresa> empresa;

}