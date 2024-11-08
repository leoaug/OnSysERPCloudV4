
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import br.com.onsys.entidades.seguranca.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class Manifesto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Length(max=20, message="Tamanho máximo do número do documento é 20.")
    @Column(length=20)
    private String nromanifesto;
    
    @Column(length=20)
    private String ciot;
    
    @Column(length=60)
    private String lacres;

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
    
    @Length(max=10)
    @Column(length=10)
    private String roteiro;    
    
    @Column(length=20)
    private String situacao;        

    @Column(length=20)
    private String cpfMotorista;        
    
    @Column(length=40)
    private String modeloVeiculo;        

    @Column(precision=12, scale=6)
    private BigDecimal capacidadeVeiculo;  /* É a medida que expressa a capacidade de carga útil. 
                                              Sendo assim, é o peso somado de tudo aquilo que o veículo pode carregar, 
                                              incluindo a sua carga máxima, mais o motorista e os passageiros. */   
    
    @Column(precision=12, scale=6)
    private BigDecimal taraVeiculo;    /* Tara é o peso do veículo sem sua carga */
    
    @Column(precision=12, scale=6)
    private BigDecimal pesobruto;  /*O peso bruto total é a capacidade máxima que um veículo de transporte pode suportar, 
                                     somando a tara (T) e a lotação (L). */    
    
    @Column(precision=12, scale=6)
    private BigDecimal valorTotalCarga; 
    
    @Column(precision=12, scale=6)
    private BigDecimal capacidadeM3;
    
    @Column(length=10)
    private String antt;            

    @Column(precision=12, scale=6)
    private BigDecimal pesoliquido;
    
    @Length(max=200, message="Tamanho máximo da observação crm é 200.")     
    @Column(length=200)
    private String obs;      

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Conferente  conferente;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Rota rota;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estado UFCarregamento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Municipio MunicipioCarregamento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estado UFDescarregamento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Municipio MunicipioDescarregamento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Veiculos veiculo;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Motoristas motorista;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SerieMDFe serieMDFe;
    
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
    
    @Column()
    private Integer volumes;
    
    @OneToMany(mappedBy="manifesto")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SerieMDFe getSerieMDFe() {
        return serieMDFe;
    }

    public void setSerieMDFe(SerieMDFe serieMDFe) {
        this.serieMDFe = serieMDFe;
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

    public String getCiot() {
        return ciot;
    }

    public void setCiot(String ciot) {
        this.ciot = ciot;
    }

    public BigDecimal getValorTotalCarga() {
        return valorTotalCarga;
    }

    public void setValorTotalCarga(BigDecimal valorTotalCarga) {
        this.valorTotalCarga = valorTotalCarga;
    }

    public String getLacres() {
        return lacres;
    }

    public void setLacres(String lacres) {
        this.lacres = lacres;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getNromanifesto() {
        return nromanifesto;
    }

    public void setNromanifesto(String nromanifesto) {
        this.nromanifesto = nromanifesto;
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

    public Estado getUFCarregamento() {
        return UFCarregamento;
    }

    public void setUFCarregamento(Estado UFCarregamento) {
        this.UFCarregamento = UFCarregamento;
    }

    public Municipio getMunicipioCarregamento() {
        return MunicipioCarregamento;
    }

    public void setMunicipioCarregamento(Municipio MunicipioCarregamento) {
        this.MunicipioCarregamento = MunicipioCarregamento;
    }

    public Estado getUFDescarregamento() {
        return UFDescarregamento;
    }

    public void setUFDescarregamento(Estado UFDescarregamento) {
        this.UFDescarregamento = UFDescarregamento;
    }

    public Municipio getMunicipioDescarregamento() {
        return MunicipioDescarregamento;
    }

    public void setMunicipioDescarregamento(Municipio MunicipioDescarregamento) {
        this.MunicipioDescarregamento = MunicipioDescarregamento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDtsaida() {
        return dtsaida;
    }

    public void setDtsaida(Date dtsaida) {
        this.dtsaida = dtsaida;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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

    public String getRoteiro() {
        return roteiro;
    }

    public void setRoteiro(String roteiro) {
        this.roteiro = roteiro;
    }

    public String getCpfMotorista() {
        return cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public BigDecimal getCapacidadeVeiculo() {
        return capacidadeVeiculo;
    }

    public void setCapacidadeVeiculo(BigDecimal capacidadeVeiculo) {
        this.capacidadeVeiculo = capacidadeVeiculo;
    }

    public BigDecimal getTaraVeiculo() {
        return taraVeiculo;
    }

    public void setTaraVeiculo(BigDecimal taraVeiculo) {
        this.taraVeiculo = taraVeiculo;
    }

    public BigDecimal getCapacidadeM3() {
        return capacidadeM3;
    }

    public void setCapacidadeM3(BigDecimal capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }

    public String getAntt() {
        return antt;
    }

    public void setAntt(String antt) {
        this.antt = antt;
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

    public Conferente getConferente() {
        return conferente;
    }

    public void setConferente(Conferente conferente) {
        this.conferente = conferente;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
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
        if (!(object instanceof Manifesto)) {
            return false;
        }
        Manifesto other = (Manifesto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.Manifesto[id=" + id + "]";
    }

}