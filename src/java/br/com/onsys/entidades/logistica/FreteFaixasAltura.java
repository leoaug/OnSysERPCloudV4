
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table
public class FreteFaixasAltura implements Comparable<FreteFaixasAltura>{
    
    @OneToMany(mappedBy="freteFaixasAltura")    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column(precision=12, scale=6)
    private BigDecimal alturaInicial;

    @Column(precision=12, scale=6)
    private BigDecimal alturaFinal;

    @Column(precision=12, scale=6)
    private BigDecimal valor;

    @Column(precision=12, scale=6)
    private BigDecimal indice;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private FreteFaixasCEP freteFaixasCEP;
    
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

    public FreteFaixasCEP getFreteFaixasCEP() {
        return freteFaixasCEP;
    }

    public void setFreteFaixasCEP(FreteFaixasCEP freteFaixasCEP) {
        this.freteFaixasCEP = freteFaixasCEP;
    }

    public BigDecimal getAlturaInicial() {
        return alturaInicial;
    }

    public void setAlturaInicial(BigDecimal alturaInicial) {
        this.alturaInicial = alturaInicial;
    }

    public BigDecimal getAlturaFinal() {
        return alturaFinal;
    }

    public void setAlturaFinal(BigDecimal alturaFinal) {
        this.alturaFinal = alturaFinal;
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
    public int compareTo(FreteFaixasAltura o) {
        if (this.valor.intValue() < o.valor.intValue()) {
            return -1;
        }
        if (this.valor.intValue() > o.valor.intValue()) {
            return 1;
        }
        return 0;
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
        if (!(object instanceof FreteFaixasAltura)) {
            return false;
        }
        FreteFaixasAltura other = (FreteFaixasAltura) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.FreteFaixasAltura[id=" + id + "]";
    }

}