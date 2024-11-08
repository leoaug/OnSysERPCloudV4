package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class DescontoCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column(length=12)
    private String participante;
    
    @Column(length=5)
    private String condPagto;
    
    @Column(length=20)
    private String item;
    
    @Column(length=10)
    private String usuarioRep;
    
    @Column()
    private Integer situacao;
    
    @Column(precision=10, scale=0)
    private BigDecimal vlDesconto;
    
    @Column(precision=10, scale=0)
    private BigDecimal percDesconto;
    
    @Column(length=10)
    private String codCanalVenda;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicioValidade; 
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFimValidade; 
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getCondPagto() {
        return condPagto;
    }

    public void setCondPagto(String condPagto) {
        this.condPagto = condPagto;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getUsuarioRep() {
        return usuarioRep;
    }

    public void setUsuarioRep(String usuarioRep) {
        this.usuarioRep = usuarioRep;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public BigDecimal getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(BigDecimal vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public BigDecimal getPercDesconto() {
        return percDesconto;
    }

    public void setPercDesconto(BigDecimal percDesconto) {
        this.percDesconto = percDesconto;
    }

    public String getCodCanalVenda() {
        return codCanalVenda;
    }

    public void setCodCanalVenda(String codCanalVenda) {
        this.codCanalVenda = codCanalVenda;
    }

    public Date getDataInicioValidade() {
        return dataInicioValidade;
    }

    public void setDataInicioValidade(Date dataInicioValidade) {
        this.dataInicioValidade = dataInicioValidade;
    }

    public Date getDataFimValidade() {
        return dataFimValidade;
    }

    public void setDataFimValidade(Date dataFimValidade) {
        this.dataFimValidade = dataFimValidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
        if (!(object instanceof DescontoCliente)) {
            return false;
        }
        DescontoCliente other = (DescontoCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.DescontoCliente[ id=" + id + " ]";
    }
    
}
