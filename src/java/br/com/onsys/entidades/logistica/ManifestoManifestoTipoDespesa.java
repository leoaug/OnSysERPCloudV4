package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class ManifestoManifestoTipoDespesa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;   
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;

    @Column(length=200)
    private String obs;

    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal valorReal;

    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal valorPrevisto;
    
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal valorDiferenca;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Manifesto manifesto;  
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private ManifestoTipoDespesa manifestoTipoDespesa;  
    
    @OneToMany(mappedBy="manifestoManifestoTipoDespesa")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Manifesto getManifesto() {
        return manifesto;
    }

    public void setManifesto(Manifesto manifesto) {
        this.manifesto = manifesto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }

    public BigDecimal getValorDiferenca() {
        return valorDiferenca;
    }

    public void setValorDiferenca(BigDecimal valorDiferenca) {
        this.valorDiferenca = valorDiferenca;
    }
    
    public BigDecimal getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(BigDecimal valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public ManifestoTipoDespesa getManifestoTipoDespesa() {
        return manifestoTipoDespesa;
    }

    public void setManifestoTipoDespesa(ManifestoTipoDespesa manifestoTipoDespesa) {
        this.manifestoTipoDespesa = manifestoTipoDespesa;
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
        if (!(object instanceof ManifestoManifestoTipoDespesa)) {
            return false;
        }
        ManifestoManifestoTipoDespesa other = (ManifestoManifestoTipoDespesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.ManifestoManifestoTipoDespesa[id=" + id + "]";
    }
    
}