
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table
public class MetaPremioFaixa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(precision=12, scale=6)
    private BigDecimal percini;
    
    @Column(precision=12, scale=6)
    private BigDecimal percfim;

    @Column(precision=12, scale=6)
    private BigDecimal premio;    
    
    @OneToMany(mappedBy="metapremiofaixa")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private MetaPremio metapremio;    
    
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

    public BigDecimal getPercini() {
        return percini;
    }

    public void setPercini(BigDecimal percini) {
        this.percini = percini;
    }

    public BigDecimal getPercfim() {
        return percfim;
    }

    public void setPercfim(BigDecimal percfim) {
        this.percfim = percfim;
    }

    public BigDecimal getPremio() {
        return premio;
    }

    public void setPremio(BigDecimal premio) {
        this.premio = premio;
    }

    public MetaPremio getMetapremio() {
        return metapremio;
    }

    public void setMetapremio(MetaPremio metapremio) {
        this.metapremio = metapremio;
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
        if (!(object instanceof MetaPremioFaixa)) {
            return false;
        }
        MetaPremioFaixa other = (MetaPremioFaixa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.MetaPremioFaixa[id=" + id + "]";
    }

}