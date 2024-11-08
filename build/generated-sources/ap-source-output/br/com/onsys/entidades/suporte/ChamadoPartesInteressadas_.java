package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.suporte.Chamado;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ChamadoPartesInteressadas.class)
public class ChamadoPartesInteressadas_ { 

    public static volatile SingularAttribute<ChamadoPartesInteressadas, Chamado> chamado;
    public static volatile SingularAttribute<ChamadoPartesInteressadas, String> partesInteressadas;
    public static volatile SingularAttribute<ChamadoPartesInteressadas, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ChamadoPartesInteressadas, Integer> id;
    public static volatile SingularAttribute<ChamadoPartesInteressadas, Empresa> empresa;

}