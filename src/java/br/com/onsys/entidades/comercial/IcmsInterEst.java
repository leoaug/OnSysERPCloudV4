
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;

@Entity
@Table
//TABELA DE EXCEÇÕES(UF DE DESTINO X ICMS) DE ICMS INTERESTADUAL
public class IcmsInterEst implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(precision=12, scale=6)
    private BigDecimal icmsinterest;

    @Column(precision=12, scale=6)
    private BigDecimal descicms;
    
    @Column(precision=12, scale=6)
    private BigDecimal aliqfcp;

    @Column(precision=12, scale=6)
    private BigDecimal aliqfcpst;

    @OneToMany(mappedBy="icmsinterest")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private Estado estadoorigem;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private Estado estadodestino;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public BigDecimal getDescicms() {
        return descicms;
    }

    public void setDescicms(BigDecimal descicms) {
        this.descicms = descicms;
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

    public Estado getEstadodestino() {
        return estadodestino;
    }

    public void setEstadodestino(Estado estadodestino) {
        this.estadodestino = estadodestino;
    }

    public Estado getEstadoorigem() {
        return estadoorigem;
    }

    public void setEstadoorigem(Estado estadoorigem) {
        this.estadoorigem = estadoorigem;
    }

    public BigDecimal getIcmsinterest() {
        return icmsinterest;
    }

    public void setIcmsinterest(BigDecimal icmsinterest) {
        this.icmsinterest = icmsinterest;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAliqfcp() {
        return aliqfcp;
    }

    public void setAliqfcp(BigDecimal aliqfcp) {
        this.aliqfcp = aliqfcp;
    }

    public BigDecimal getAliqfcpst() {
        return aliqfcpst;
    }

    public void setAliqfcpst(BigDecimal aliqfcpst) {
        this.aliqfcpst = aliqfcpst;
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
        if (!(object instanceof IcmsInterEst)) {
            return false;
        }
        IcmsInterEst other = (IcmsInterEst) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.IcmsInterEst[id=" + id + "]";
    }

}