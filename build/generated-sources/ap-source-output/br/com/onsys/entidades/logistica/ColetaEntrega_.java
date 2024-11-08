package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Participante;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ColetaEntrega.class)
public class ColetaEntrega_ { 

    public static volatile SingularAttribute<ColetaEntrega, String> obs;
    public static volatile SingularAttribute<ColetaEntrega, Double> pesoCubado;
    public static volatile SingularAttribute<ColetaEntrega, String> tipoDocto;
    public static volatile SingularAttribute<ColetaEntrega, Participante> destinatario;
    public static volatile SingularAttribute<ColetaEntrega, Integer> volume;
    public static volatile SingularAttribute<ColetaEntrega, String> chaveNFE;
    public static volatile SingularAttribute<ColetaEntrega, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ColetaEntrega, Double> valorMercadoria;
    public static volatile SingularAttribute<ColetaEntrega, Double> pesoBruto;
    public static volatile SingularAttribute<ColetaEntrega, Integer> id;
    public static volatile SingularAttribute<ColetaEntrega, Participante> rementente;
    public static volatile SingularAttribute<ColetaEntrega, Empresa> empresa;
    public static volatile SingularAttribute<ColetaEntrega, Double> pesoLiquido;

}