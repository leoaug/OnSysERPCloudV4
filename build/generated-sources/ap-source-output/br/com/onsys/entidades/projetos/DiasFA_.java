package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.projetos.Componenteeap;
import br.com.onsys.entidades.projetos.FichaAprop;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(DiasFA.class)
public class DiasFA_ { 

    public static volatile SingularAttribute<DiasFA, String> hrintervalorelogio;
    public static volatile SingularAttribute<DiasFA, BigDecimal> vlfaturamento;
    public static volatile SingularAttribute<DiasFA, String> hrfinalrelogio;
    public static volatile SingularAttribute<DiasFA, BigDecimal> hrinicial;
    public static volatile SingularAttribute<DiasFA, String> hrtotalrelogio;
    public static volatile SingularAttribute<DiasFA, BigDecimal> vlrepasse;
    public static volatile SingularAttribute<DiasFA, FichaAprop> fichaaprop;
    public static volatile SingularAttribute<DiasFA, Componenteeap> pacote;
    public static volatile SingularAttribute<DiasFA, String> descricao;
    public static volatile SingularAttribute<DiasFA, String> hrinicialrelogio;
    public static volatile SingularAttribute<DiasFA, Date> modificacao;
    public static volatile SingularAttribute<DiasFA, BigDecimal> hrfinal;
    public static volatile SingularAttribute<DiasFA, BigDecimal> hrintervalo;
    public static volatile SingularAttribute<DiasFA, Integer> id;
    public static volatile SingularAttribute<DiasFA, BigDecimal> hrtotal;
    public static volatile SingularAttribute<DiasFA, Date> datamovto;

}