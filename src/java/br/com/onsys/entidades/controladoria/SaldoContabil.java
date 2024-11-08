
package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class SaldoContabil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Length(max=7)
    @Column(length=7)
    private String periodo; //MMAAAA
    
    @Column(precision=12, scale=6)
    private BigDecimal saldoini;    
    
    @Column(precision=12, scale=6)
    private BigDecimal vldebito;    
    
    @Column(precision=12, scale=6)
    private BigDecimal vlcredito;    
    
    @OneToMany(mappedBy="saldocontabil")        
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas conta;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private CentroCusto centrocusto;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private UnidNegocio unidnegocio;
    
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public BigDecimal getSaldoini() {
        return saldoini;
    }

    public void setSaldoini(BigDecimal saldoini) {
        this.saldoini = saldoini;
    }

    public BigDecimal getVldebito() {
        return vldebito;
    }

    public void setVldebito(BigDecimal vldebito) {
        this.vldebito = vldebito;
    }

    public BigDecimal getVlcredito() {
        return vlcredito;
    }

    public void setVlcredito(BigDecimal vlcredito) {
        this.vlcredito = vlcredito;
    }

    public PlanoContas getConta() {
        return conta;
    }

    public void setConta(PlanoContas conta) {
        this.conta = conta;
    }

    public CentroCusto getCentrocusto() {
        return centrocusto;
    }

    public void setCentrocusto(CentroCusto centrocusto) {
        this.centrocusto = centrocusto;
    }

    public UnidNegocio getUnidnegocio() {
        return unidnegocio;
    }

    public void setUnidnegocio(UnidNegocio unidnegocio) {
        this.unidnegocio = unidnegocio;
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
        if (!(object instanceof SaldoContabil)) {
            return false;
        }
        SaldoContabil other = (SaldoContabil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.controladoria.SaldoContabil[id=" + id + "]";
    }

}