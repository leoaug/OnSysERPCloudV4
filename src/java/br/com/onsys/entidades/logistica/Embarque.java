
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Estado;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class Embarque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Length(max=20, message="Tamanho máximo do número do documento é 20.")
    @Column(length=20)
    private String nroembarque;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Transportadora transportadora;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtemissao;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(message="Data de lançamento, deve ser informada.")
    private Date dtlancamento;    

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(message="Data de saída, deve ser informada.")
    private Date dtsaida;    

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estado ufplaca;
    
    @Length(max=10)
    @Column(length=10)
    private String placa;
    
    @Column(length=50)
    private String motorista;    
    
    @Column(length=20)
    private String situacao;        
    
    @Column(precision=12, scale=6)
    private BigDecimal pesobruto;    

    @Column(precision=12, scale=6)
    private BigDecimal pesoliquido;
    
    @Column()
    private Integer volumes;
    
    @OneToMany(mappedBy="embarque")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNroembarque() {
        return nroembarque;
    }

    public void setNroembarque(String nroembarque) {
        this.nroembarque = nroembarque;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public Date getDtemissao() {
        return dtemissao;
    }

    public void setDtemissao(Date dtemissao) {
        this.dtemissao = dtemissao;
    }

    public Date getDtlancamento() {
        return dtlancamento;
    }

    public void setDtlancamento(Date dtlancamento) {
        this.dtlancamento = dtlancamento;
    }

    public Date getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(Date dtsaida) {
        this.dtsaida = dtsaida;
    }

    public Estado getUfplaca() {
        return ufplaca;
    }

    public void setUfplaca(Estado ufplaca) {
        this.ufplaca = ufplaca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public BigDecimal getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(BigDecimal pesobruto) {
        this.pesobruto = pesobruto;
    }

    public BigDecimal getPesoliquido() {
        return pesoliquido;
    }

    public void setPesoliquido(BigDecimal pesoliquido) {
        this.pesoliquido = pesoliquido;
    }

    public Integer getVolumes() {
        return volumes;
    }

    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
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
        if (!(object instanceof Embarque)) {
            return false;
        }
        Embarque other = (Embarque) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.Embarque[id=" + id + "]";
    }

}