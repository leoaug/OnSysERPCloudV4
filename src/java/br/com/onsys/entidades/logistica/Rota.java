
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class Rota implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Length(max=20, message="Tamanho máximo do número do documento é 20.")
    @Column(length=20)
    private String nroRota;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Transportadora transportadora;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtEmissao;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(message="Data de saída prevista.")
    private Date dtSaidaPrevista;    

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @NotNull(message="Data de saída real.")
    private Date dtSaida;    
    
    @Length(max=200, message="Tamanho máximo da observação crm é 200.")     
    @Column(length=200)
    private String obs;      
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Veiculos veiculo;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Motoristas motorista;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usrCriacao;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usrConferente;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;
    
    @OneToMany(mappedBy="rota")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNroRota() {
        return nroRota;
    }

    public void setNroRota(String nroRota) {
        this.nroRota = nroRota;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtSaidaPrevista() {
        return dtSaidaPrevista;
    }

    public void setDtSaidaPrevista(Date dtSaidaPrevista) {
        this.dtSaidaPrevista = dtSaidaPrevista;
    }

    public Date getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(Date dtSaida) {
        this.dtSaida = dtSaida;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }

    public Motoristas getMotorista() {
        return motorista;
    }

    public void setMotorista(Motoristas motorista) {
        this.motorista = motorista;
    }

    public Usuario getUsrCriacao() {
        return usrCriacao;
    }

    public void setUsrCriacao(Usuario usrCriacao) {
        this.usrCriacao = usrCriacao;
    }

    public Usuario getUsrConferente() {
        return usrConferente;
    }

    public void setUsrConferente(Usuario usrConferente) {
        this.usrConferente = usrConferente;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
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
        if (!(object instanceof Rota)) {
            return false;
        }
        Rota other = (Rota) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.Rota[id=" + id + "]";
    }

}