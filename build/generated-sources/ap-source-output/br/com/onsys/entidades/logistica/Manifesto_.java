package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import br.com.onsys.entidades.logistica.Conferente;
import br.com.onsys.entidades.logistica.Motoristas;
import br.com.onsys.entidades.logistica.Rota;
import br.com.onsys.entidades.logistica.SerieMDFe;
import br.com.onsys.entidades.logistica.Transportadora;
import br.com.onsys.entidades.logistica.Veiculos;
import br.com.onsys.entidades.seguranca.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(Manifesto.class)
public class Manifesto_ { 

    public static volatile SingularAttribute<Manifesto, String> antt;
    public static volatile SingularAttribute<Manifesto, String> modeloVeiculo;
    public static volatile SingularAttribute<Manifesto, String> obs;
    public static volatile SingularAttribute<Manifesto, String> situacao;
    public static volatile SingularAttribute<Manifesto, String> lacres;
    public static volatile SingularAttribute<Manifesto, String> cpfMotorista;
    public static volatile SingularAttribute<Manifesto, SerieMDFe> serieMDFe;
    public static volatile SingularAttribute<Manifesto, BigDecimal> pesobruto;
    public static volatile SingularAttribute<Manifesto, Integer> id;
    public static volatile SingularAttribute<Manifesto, String> placa;
    public static volatile SingularAttribute<Manifesto, Rota> rota;
    public static volatile SingularAttribute<Manifesto, Veiculos> veiculo;
    public static volatile SingularAttribute<Manifesto, String> ciot;
    public static volatile SingularAttribute<Manifesto, Date> dtlancamento;
    public static volatile SingularAttribute<Manifesto, Usuario> usrCriacao;
    public static volatile SingularAttribute<Manifesto, BigDecimal> pesoliquido;
    public static volatile SingularAttribute<Manifesto, Usuario> usrConferente;
    public static volatile SingularAttribute<Manifesto, Integer> volumes;
    public static volatile SingularAttribute<Manifesto, Date> dtemissao;
    public static volatile SingularAttribute<Manifesto, BigDecimal> valorTotalCarga;
    public static volatile SingularAttribute<Manifesto, Date> dtsaida;
    public static volatile SingularAttribute<Manifesto, Municipio> MunicipioCarregamento;
    public static volatile SingularAttribute<Manifesto, Transportadora> transportadora;
    public static volatile SingularAttribute<Manifesto, BigDecimal> capacidadeM3;
    public static volatile SingularAttribute<Manifesto, Municipio> MunicipioDescarregamento;
    public static volatile SingularAttribute<Manifesto, String> nromanifesto;
    public static volatile SingularAttribute<Manifesto, Conferente> conferente;
    public static volatile SingularAttribute<Manifesto, BigDecimal> capacidadeVeiculo;
    public static volatile SingularAttribute<Manifesto, Estado> UFDescarregamento;
    public static volatile SingularAttribute<Manifesto, Estado> ufplaca;
    public static volatile SingularAttribute<Manifesto, Motoristas> motorista;
    public static volatile SingularAttribute<Manifesto, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<Manifesto, Estado> UFCarregamento;
    public static volatile SingularAttribute<Manifesto, String> roteiro;
    public static volatile SingularAttribute<Manifesto, BigDecimal> taraVeiculo;
    public static volatile SingularAttribute<Manifesto, Empresa> empresa;

}