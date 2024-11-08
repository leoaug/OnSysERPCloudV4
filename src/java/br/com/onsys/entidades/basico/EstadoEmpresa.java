
package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.comercial.TabelaPauta;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="estadoempresa")
public class EstadoEmpresa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(length=1)
    private String st;    

    @Column(precision=12, scale=6)
    private BigDecimal descicms;

    @Column(precision=12, scale=6)
    private BigDecimal icmsinterno;

    @Column(precision=12, scale=6)
    private BigDecimal icmsinterest;

    @Column(precision=12, scale=6)
    private BigDecimal icmsst;

    @Column(precision=12, scale=6)
    private BigDecimal mvast;
    
    @Column(precision=12, scale=6)
    private BigDecimal aliqfcp;

    @Column(precision=12, scale=6)
    private BigDecimal aliqfcpst;
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    @OneToMany(mappedBy="estadoempresa")    
    
    @ManyToOne()    
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private Estado estado;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabelaPauta tabelapauta;
    
    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public Date getDatainativo() {
        return datainativo;
    }

    public void setDatainativo(Date datainativo) {
        this.datainativo = datainativo;
    }

    public String getDeletado() {
        return deletado;
    }

    public void setDeletado(String deletado) {
        this.deletado = deletado;
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
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public BigDecimal getDescicms() {
        return descicms;
    }

    public void setDescicms(BigDecimal descicms) {
        this.descicms = descicms;
    }

    public BigDecimal getIcmsinterno() {
        return icmsinterno;
    }

    public void setIcmsinterno(BigDecimal icmsinterno) {
        this.icmsinterno = icmsinterno;
    }

    public BigDecimal getIcmsinterest() {
        return icmsinterest;
    }

    public void setIcmsinterest(BigDecimal icmsinterest) {
        this.icmsinterest = icmsinterest;
    }

    public BigDecimal getIcmsst() {
        return icmsst;
    }

    public void setIcmsst(BigDecimal icmsst) {
        this.icmsst = icmsst;
    }

    public BigDecimal getMvast() {
        return mvast;
    }

    public void setMvast(BigDecimal mvast) {
        this.mvast = mvast;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public TabelaPauta getTabelapauta() {
        return tabelapauta;
    }

    public void setTabelapauta(TabelaPauta tabelapauta) {
        this.tabelapauta = tabelapauta;
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
        if (!(object instanceof EstadoEmpresa)) {
            return false;
        }
        EstadoEmpresa other = (EstadoEmpresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.basico.EstadoEmpresa[id=" + id + "]";
    }

}