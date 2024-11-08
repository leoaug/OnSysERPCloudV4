package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.suporte.Chamado;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ChamadoHistorico.class)
public class ChamadoHistorico_ { 

    public static volatile SingularAttribute<ChamadoHistorico, Chamado> chamado;
    public static volatile SingularAttribute<ChamadoHistorico, String> data;
    public static volatile SingularAttribute<ChamadoHistorico, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ChamadoHistorico, String> historico;
    public static volatile SingularAttribute<ChamadoHistorico, Integer> id;
    public static volatile SingularAttribute<ChamadoHistorico, Empresa> empresa;
    public static volatile SingularAttribute<ChamadoHistorico, Date> dataHora;

}