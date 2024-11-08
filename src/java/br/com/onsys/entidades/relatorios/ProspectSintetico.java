
package br.com.onsys.entidades.relatorios;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Cacheable(false)
public class ProspectSintetico implements Serializable {
    private static final long serialVersionUID = 100L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;    

    @Column()
    private String mes;
    
    @Column()
    private String ano;
    
    @Column()    
    private String situacao;
    
    @Column()    
    private int quantidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}