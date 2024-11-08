
package br.com.onsys.entidades.sac;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class ParamSAC implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periniaberto;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date perfimaberto;

    @Column(name="ultimaocorrencia")
    private Integer ultimaocorrencia;

    @Column(name="ultimaocorrenciaSAC")
    private Integer ultimaocorrenciaSAC;

    @Column(name="ultimaocorrenciaEcommerce")
    private Integer ultimaocorrenciaEcommerce;
    
    @Column(name="ultimaocorLogistica")
    private Integer ultimaocorLogistica;
    
    @OneToMany(mappedBy="paramsac")

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

    public Date getPeriniaberto() {
        return periniaberto;
    }

    public void setPeriniaberto(Date periniaberto) {
        this.periniaberto = periniaberto;
    }

    public Date getPerfimaberto() {
        return perfimaberto;
    }

    public void setPerfimaberto(Date perfimaberto) {
        this.perfimaberto = perfimaberto;
    }

    public Integer getUltimaocorrencia() {
        return ultimaocorrencia;
    }

    public void setUltimaocorrencia(Integer ultimaocorrencia) {
        this.ultimaocorrencia = ultimaocorrencia;
    }

    public Integer getUltimaocorrenciaSAC() {
        return ultimaocorrenciaSAC;
    }

    public void setUltimaocorrenciaSAC(Integer ultimaocorrenciaSAC) {
        this.ultimaocorrenciaSAC = ultimaocorrenciaSAC;
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

    public Integer getUltimaocorrenciaEcommerce() {
        return ultimaocorrenciaEcommerce;
    }

    public void setUltimaocorrenciaEcommerce(Integer ultimaocorrenciaEcommerce) {
        this.ultimaocorrenciaEcommerce = ultimaocorrenciaEcommerce;
    }

    public Integer getUltimaocorLogistica() {
        return ultimaocorLogistica;
    }

    public void setUltimaocorLogistica(Integer ultimaocorLogistica) {
        this.ultimaocorLogistica = ultimaocorLogistica;
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
        if (!(object instanceof ParamSAC)) {
            return false;
        }
        ParamSAC other = (ParamSAC) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.sac.ParamSAC[id=" + id + "]";
    }

}