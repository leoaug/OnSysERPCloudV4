
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class Veiculos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(length=20)
    private String codigo;
    
    @Column(length=20)
    private String tipoVeiculo;
    
    @Column(length=30)
    private String tipoCarroceria; // ABERTA, FECHADA/BAU, GRANELERA, PORTA CONTAINER, SIDER
    
    @Column(length=30)
    private String tipoRodado; // TRUCK, TOCO, VAN, UTILITARIO, CAVALO
    
    @Column()
    private int nrEixos;    
    
    @Column(length=20)
    private String rntc;
    
    @Column(length=20)
    private String proprioTerceiro;
    
    @Column(length=20)
    private String codOperacaoTransporte;

    @Column(length=20)
    private String placa;
    
    @Column(length=20)
    private String chassi;
    
    @Column(length=30)
    private String renavam;
    
    @Column()
    private int trocaOleoKM;    
    
    @Column()
    private int kmAtual;        

    @Column(length=20)
    private String anoFabricacao;
    
    @Column(length=20)
    private String anoModelo;

    @Column(length=20)
    private String combustivel;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estado ufplaca;
    
    @Column(length=20)
    private String situacao;        

    @Column(length=40)
    private String marcaVeiculo;        
    
    @Column(length=40)
    private String modeloVeiculo;        
    
    @Column(precision=12, scale=6)
    private BigDecimal consumo; 

    @Column(precision=12, scale=6)
    private BigDecimal capacidadeVeiculoKG; 
    
    @Column(precision=12, scale=6)
    private BigDecimal capacidadeVeiculoM3; 
      
    @Column(precision=12, scale=6)
    private BigDecimal taraVeiculo;    /* Tara é o peso do veículo sem sua carga */
    
    @Column(length=10)
    private String antt;   
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String inativo;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;

    @Column(length=1)
    private String modificado;    
    
    @Length(max=200, message="Tamanho máximo da observação crm é 200.")     
    @Column(length=200)
    private String obs;      
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;
    
    @OneToMany(mappedBy="veiculos")
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNrEixos() {
        return nrEixos;
    }

    public void setNrEixos(int nrEixos) {
        this.nrEixos = nrEixos;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoRodado() {
        return tipoRodado;
    }

    public void setTipoRodado(String tipoRodado) {
        this.tipoRodado = tipoRodado;
    }

    public String getRntc() {
        return rntc;
    }

    public void setRntc(String rntc) {
        this.rntc = rntc;
    }

    public int getKmAtual() {
        return kmAtual;
    }

    public void setKmAtual(int kmAtual) {
        this.kmAtual = kmAtual;
    }

    public String getDeletado() {
        return deletado;
    }

    public void setDeletado(String deletado) {
        this.deletado = deletado;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public Date getDatainativo() {
        return datainativo;
    }

    public void setDatainativo(Date datainativo) {
        this.datainativo = datainativo;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public int getTrocaOleoKM() {
        return trocaOleoKM;
    }

    public void setTrocaOleoKM(int trocaOleoKM) {
        this.trocaOleoKM = trocaOleoKM;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public String getProprioTerceiro() {
        return proprioTerceiro;
    }

    public void setProprioTerceiro(String proprioTerceiro) {
        this.proprioTerceiro = proprioTerceiro;
    }

    public String getCodOperacaoTransporte() {
        return codOperacaoTransporte;
    }

    public void setCodOperacaoTransporte(String codOperacaoTransporte) {
        this.codOperacaoTransporte = codOperacaoTransporte;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Estado getUfplaca() {
        return ufplaca;
    }

    public void setUfplaca(Estado ufplaca) {
        this.ufplaca = ufplaca;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModeloVeiculo() {
        return modeloVeiculo;
    }

    public void setModeloVeiculo(String modeloVeiculo) {
        this.modeloVeiculo = modeloVeiculo;
    }

    public BigDecimal getConsumo() {
        return consumo;
    }

    public void setConsumo(BigDecimal consumo) {
        this.consumo = consumo;
    }

    public BigDecimal getCapacidadeVeiculoKG() {
        return capacidadeVeiculoKG;
    }

    public void setCapacidadeVeiculoKG(BigDecimal capacidadeVeiculoKG) {
        this.capacidadeVeiculoKG = capacidadeVeiculoKG;
    }

    public BigDecimal getCapacidadeVeiculoM3() {
        return capacidadeVeiculoM3;
    }

    public void setCapacidadeVeiculoM3(BigDecimal capacidadeVeiculoM3) {
        this.capacidadeVeiculoM3 = capacidadeVeiculoM3;
    }

    public BigDecimal getTaraVeiculo() {
        return taraVeiculo;
    }

    public void setTaraVeiculo(BigDecimal taraVeiculo) {
        this.taraVeiculo = taraVeiculo;
    }

    public String getAntt() {
        return antt;
    }

    public void setAntt(String antt) {
        this.antt = antt;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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
        if (!(object instanceof Veiculos)) {
            return false;
        }
        Veiculos other = (Veiculos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.Veiculos[id=" + id + "]";
    }

}