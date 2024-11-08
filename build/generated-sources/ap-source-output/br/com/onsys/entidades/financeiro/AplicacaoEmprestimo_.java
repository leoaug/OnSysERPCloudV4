package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.financeiro.Portador;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(AplicacaoEmprestimo.class)
public class AplicacaoEmprestimo_ { 

    public static volatile SingularAttribute<AplicacaoEmprestimo, Integer> tptrans;
    public static volatile SingularAttribute<AplicacaoEmprestimo, Integer> tpmovto;
    public static volatile SingularAttribute<AplicacaoEmprestimo, Estabelecimento> estabelecimento;
    public static volatile SingularAttribute<AplicacaoEmprestimo, Portador> portador;
    public static volatile SingularAttribute<AplicacaoEmprestimo, BigDecimal> vlmovto;
    public static volatile SingularAttribute<AplicacaoEmprestimo, String> historico;
    public static volatile SingularAttribute<AplicacaoEmprestimo, PlanoContas> conta;
    public static volatile SingularAttribute<AplicacaoEmprestimo, Date> dtmovto;
    public static volatile SingularAttribute<AplicacaoEmprestimo, Integer> id;
    public static volatile SingularAttribute<AplicacaoEmprestimo, Empresa> empresa;
    public static volatile SingularAttribute<AplicacaoEmprestimo, String> nrodocto;

}