
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class MovtoDespesa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column()
    private String historico;
    
    @Column(length=2)
    private String origem;
    
    @Column()
    private Integer tpmovto; /* tipo de movimento 1-entrada e 2-saida */

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtmovto;
    
    @Column(precision=12, scale=6)
    private BigDecimal vlmovto;    
        
    @OneToMany(mappedBy="movtodespesa")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Representante representante;      
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDespesa tipodespesa; 

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private DespesasRep despesaRep;    
    
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

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Integer getTpmovto() {
        return tpmovto;
    }

    public void setTpmovto(Integer tpmovto) {
        this.tpmovto = tpmovto;
    }

    public Date getDtmovto() {
        return dtmovto;
    }

    public void setDtmovto(Date dtmovto) {
        this.dtmovto = dtmovto;
    }

    public BigDecimal getVlmovto() {
        return vlmovto;
    }

    public void setVlmovto(BigDecimal vlmovto) {
        this.vlmovto = vlmovto;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public TipoDespesa getTipodespesa() {
        return tipodespesa;
    }

    public void setTipodespesa(TipoDespesa tipodespesa) {
        this.tipodespesa = tipodespesa;
    }
    
    public DespesasRep getDespesaRep() {
        return despesaRep;
    }

    public void setDespesaRep(DespesasRep despesaRep) {
        this.despesaRep = despesaRep;
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
        if (!(object instanceof MovtoDespesa)) {
            return false;
        }
        MovtoDespesa other = (MovtoDespesa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.MovtoDespesa[id=" + id + "]";
    }

}