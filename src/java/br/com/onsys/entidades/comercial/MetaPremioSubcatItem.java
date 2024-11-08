
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.manufatura.SubcatItem;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table
public class MetaPremioSubcatItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column(precision=12, scale=6)
    private BigDecimal metaAbaixo80;
    
    @Column(precision=12, scale=6)
    private BigDecimal metaDe80Ate90;
    
    @Column(precision=12, scale=6)
    private BigDecimal metaDe90Ate100;

    @Column(precision=12, scale=6)
    private BigDecimal bonusAcima105;
    
    @Column(precision=12, scale=6)
    private BigDecimal premiacao;
    
    @Column()
    private Integer unidadeVendida; 
    
    @OneToMany(mappedBy="metapremiosubcatitem")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SubcatItem subcatitem;        
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Representante representante;        

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    //@Valid
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    //@Valid
    private Estabelecimento estabelecimento;

    public SubcatItem getSubcatitem() {
        return subcatitem;
    }

    public void setSubcatitem(SubcatItem subcatitem) {
        this.subcatitem = subcatitem;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getMetaAbaixo80() {
        return metaAbaixo80;
    }

    public void setMetaAbaixo80(BigDecimal metaAbaixo80) {
        this.metaAbaixo80 = metaAbaixo80;
    }

    public BigDecimal getMetaDe80Ate90() {
        return metaDe80Ate90;
    }

    public void setMetaDe80Ate90(BigDecimal metaDe80Ate90) {
        this.metaDe80Ate90 = metaDe80Ate90;
    }

    public BigDecimal getMetaDe90Ate100() {
        return metaDe90Ate100;
    }

    public void setMetaDe90Ate100(BigDecimal metaDe90Ate100) {
        this.metaDe90Ate100 = metaDe90Ate100;
    }

    public BigDecimal getBonusAcima105() {
        return bonusAcima105;
    }

    public void setBonusAcima105(BigDecimal bonusAcima105) {
        this.bonusAcima105 = bonusAcima105;
    }

    public BigDecimal getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(BigDecimal premiacao) {
        this.premiacao = premiacao;
    }

    public Integer getUnidadeVendida() {
        return unidadeVendida;
    }

    public void setUnidadeVendida(Integer unidadeVendida) {
        this.unidadeVendida = unidadeVendida;
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
        if (!(object instanceof MetaPremioSubcatItem)) {
            return false;
        }
        MetaPremioSubcatItem other = (MetaPremioSubcatItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.MetaPremioSubcatItem[id=" + id + "]";
    }

}