package br.com.onsys.entidades.marketplace;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.marketplace.Anuncios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-07-21T23:44:23")
@StaticMetamodel(AnuncioPerguntas.class)
public class AnuncioPerguntas_ { 

    public static volatile SingularAttribute<AnuncioPerguntas, String> texto;
    public static volatile SingularAttribute<AnuncioPerguntas, String> cliente;
    public static volatile SingularAttribute<AnuncioPerguntas, String> itemId;
    public static volatile SingularAttribute<AnuncioPerguntas, String> resposta;
    public static volatile SingularAttribute<AnuncioPerguntas, Anuncios> anuncio;
    public static volatile SingularAttribute<AnuncioPerguntas, Integer> id;
    public static volatile SingularAttribute<AnuncioPerguntas, Empresa> empresa;
    public static volatile SingularAttribute<AnuncioPerguntas, Date> dataCriacao;
    public static volatile SingularAttribute<AnuncioPerguntas, String> status;

}