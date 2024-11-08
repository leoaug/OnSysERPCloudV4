
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;


/* ENTIDADE NÃO UTILIZADA - SUBSTITUIDA PELAS FRETEFAIXASCEP E FRETEFAIXASPESO */
@Entity
@Table
public class FreteFaixas implements Serializable {
    
   @OneToMany(mappedBy="freteFaixas")    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column()
    private String cepInicial;

    @Column()
    private String cepFinal;

    @Column(precision=12, scale=6)
    private BigDecimal pesoInicial;

    @Column(precision=12, scale=6)
    private BigDecimal pesoFinal;

    @Column(precision=12, scale=6)
    private BigDecimal valor;

    @Column(precision=12, scale=6)
    private BigDecimal indice;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Frete frete;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCepInicial() {
        return cepInicial;
    }

    public void setCepInicial(String cepInicial) {
        this.cepInicial = cepInicial;
    }

    public String getCepFinal() {
        return cepFinal;
    }

    public void setCepFinal(String cepFinal) {
        this.cepFinal = cepFinal;
    }

    public BigDecimal getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(BigDecimal pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public BigDecimal getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(BigDecimal pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getIndice() {
        return indice;
    }

    public void setIndice(BigDecimal indice) {
        this.indice = indice;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FreteFaixas)) {
            return false;
        }
        FreteFaixas other = (FreteFaixas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.FreteFaixas[id=" + id + "]";
    }

}