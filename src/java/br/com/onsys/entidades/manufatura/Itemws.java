
package br.com.onsys.entidades.manufatura;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

public class Itemws implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    private String descricao;
    private String codigo;   
//    private String codigobarras;   
    private String urlImagem;   
//    private BigDecimal lotemultiplo;
    private BigDecimal preco;
//    private BigDecimal percipi;
//    private BigDecimal percdesconto;
//    private BigDecimal desconto;
//    private BigDecimal estoqseguranca;
//    private BigDecimal pesobruto;
//    private BigDecimal pesoliq;
//    private String obsitem;    
//    private String inativo;    
//    private String modificado;    
//    private Date datainativo;    
//    private String deletado;  
//    private boolean repassaImposto; // UTILIZADO NOS ITENS DE SERVI�O PARA REPASSE DE IMPOSTO
//    private Integer tipoitem_id;
//    private Integer subcatitem_id;
//    private Integer subcatservico_id;   
//    private Integer unidademedida_id;
//    private Integer deposito_id;
//    private Integer localizacao_id;
//    private Integer empresa_id;
//    private Integer estabelecimento_id;
//    private Integer clasfiscal_id;
//    private String origem;    
    //private boolean itemfaturavel;   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
}