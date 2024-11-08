package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Manifesto;
import br.com.onsys.entidades.logistica.ManifestoTipoDespesa;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(ManifestoManifestoTipoDespesa.class)
public class ManifestoManifestoTipoDespesa_ { 

    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, String> obs;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, ManifestoTipoDespesa> manifestoTipoDespesa;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, BigDecimal> valorPrevisto;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, Date> data;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, BigDecimal> valorDiferenca;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, BigDecimal> valorReal;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, Integer> id;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, Empresa> empresa;
    public static volatile SingularAttribute<ManifestoManifestoTipoDespesa, Manifesto> manifesto;

}