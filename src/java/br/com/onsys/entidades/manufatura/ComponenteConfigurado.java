package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class ComponenteConfigurado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false,length=60)
    private String componente;
    
    @Column(length=1)
    private String inativo;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;
    
    @Column(length=1)
    private String deletado;   

    @Column(nullable=false, length=20)
    private String tipoComponente = "Pai";
    
    @Column()    
    private boolean informaPreco; // SE NO COMPONENTE E INFORMADO O PRECO DE VENDA
    
    //@Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    
    @Column(precision=12, scale=6)
    private BigDecimal adicionalPercentual = BigDecimal.ZERO;
    
    @Column(precision=12, scale=6)
    private BigDecimal adicionalValor = BigDecimal.ZERO;
    
    @OneToMany(mappedBy="componenteConfigurado")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private ComponenteConfigurado componentePai;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public String getComponente() {
        return componente;
    }

    public void setComponente(String componente) {
        this.componente = componente;
    }

    public BigDecimal getAdicionalPercentual() {
        return adicionalPercentual;
    }

    public void setAdicionalPercentual(BigDecimal adicionalPercentual) {
        this.adicionalPercentual = adicionalPercentual;
    }

    public BigDecimal getAdicionalValor() {
        return adicionalValor;
    }

    public void setAdicionalValor(BigDecimal adicionalValor) {
        this.adicionalValor = adicionalValor;
    }
    
    public String getTipoComponente() {
        return tipoComponente;
    }

    public void setTipoComponente(String tipoComponente) {
        this.tipoComponente = tipoComponente;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public boolean isInformaPreco() {
        return informaPreco;
    }

    public void setInformaPreco(boolean informaPreco) {
        this.informaPreco = informaPreco;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public ComponenteConfigurado getComponentePai() {
        return componentePai;
    }

    public void setComponentePai(ComponenteConfigurado componentePai) {
        this.componentePai = componentePai;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof ComponenteConfigurado)) {
            return false;
        }
        ComponenteConfigurado other = (ComponenteConfigurado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "br.com.onsys.entidades.controladoria.PlanoContas[id=" + id + "]";
        return id.toString();
    }

}