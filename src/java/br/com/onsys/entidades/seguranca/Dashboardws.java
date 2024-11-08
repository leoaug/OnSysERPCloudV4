
package br.com.onsys.entidades.seguranca;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

public class Dashboardws implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtatualizacao;    
    
    @Column(precision=12, scale=6)
    private Double metaqtdped;          //META MENSAL EM QUANTIDADE  

    @Column(precision=12, scale=6)
    private Double metavlped;     //META MENSAL EM VALOR
    
    @Column(precision=12, scale=6)
    private Double metaqtdpedreal;   
    
    @Column(precision=12, scale=6)
    private Double metapercpedreal;   
    
    @Column(precision=12, scale=6)
    private Double metaqtdpedfalta;   
    
    @Column(precision=12, scale=6)
    private Double metapercpedfalta;   

    @Column(precision=12, scale=6)
    private Double metavlpedreal;   

    @Column(precision=12, scale=6)
    private Double metapercvlreal;   
    
    @Column(precision=12, scale=6)
    private Double metavlpedfalta;   
    
    @Column(precision=12, scale=6)
    private Double metapercvlfalta;   

    @Column(precision=12, scale=6)
    private Double resvendaano;   
    
    @Column(precision=12, scale=6)
    private Double resvendames;   

    @Column(precision=12, scale=6)
    private Double resvenda1t;   
    
    @Column(precision=12, scale=6)
    private Double resvenda2t;   
    
    @Column(precision=12, scale=6)
    private Double resvenda3t;   
    
    @Column(precision=12, scale=6)
    private Double resvenda4t;   

    @Column(precision=12, scale=6)
    private Double[] metaqtdpedano = new Double[12];   

    @Column(precision=12, scale=6)
    private Double[] metavlpedano = new Double[12];   
   
    @Column(precision=12, scale=6)
    private Double[] qtdpedidosano = new Double[12];   

    @Column(precision=12, scale=6)
    private Double[] valorpedidosano = new Double[12];   
    
    @Column(precision=12, scale=6)
    private Double prospectmes;   

    @Column(precision=12, scale=6)
    private Double prospectaprovado;   

    @Column(precision=12, scale=6)
    private Double prospectreprovado;
    
    @Column(precision=12, scale=6)
    private Double prospectaberto;   
    
    @Column(precision=12, scale=6)
    private Double prospectemavaliacao;
    
    @Column(precision=12, scale=6)
    private Double prospectliberado;

    @Column(precision=12, scale=6)
    private Double prospectpercaprovado;   

    @Column(precision=12, scale=6)
    private Double prospectpercreprovado;
    
    @Column(precision=12, scale=6)
    private Double prospectpercaberto;   
    
    @Column(precision=12, scale=6)
    private Double prospectpercemavaliacao;
    
    @Column(precision=12, scale=6)
    private Double prospectpercliberado;
    
    @Column(precision=12, scale=6)
    private Double qtdpedidomes;   
    
    @Column(precision=12, scale=6)
    private Double valorpedidomes;   
    
    @Column(precision=12, scale=6)
    private Double pdvtotal;   
    
    @Column(precision=12, scale=6)
    private Double pdvdia; 
    
    @Column(precision=12, scale=6)
    private Double pdvqtddia;
    
    @Column(precision=12, scale=6)
    private Double pdvontem;   
    
    @Column(precision=12, scale=6)
    private Double pdvqtdontem; 
    
    @Column(precision=12, scale=6)
    private Double pdvmes;   
    
    @Column(precision=12, scale=6)
    private Double pdvqtdmes;   
    
    @Column(precision=12, scale=6)
    private Double metaqtdpedori;   
    
    @Column(precision=12, scale=6)
    private Double metavlpedori;   
    
    @OneToMany(mappedBy="dashboardws")

    private Integer empresa_id;
    private Integer usuario_id;

    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String deletado;  

    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;     

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtatualizacao() {
        return dtatualizacao;
    }

    public void setDtatualizacao(Date dtatualizacao) {
        this.dtatualizacao = dtatualizacao;
    }

    public Double getMetaqtdped() {
        return metaqtdped;
    }

    public void setMetaqtdped(Double metaqtdped) {
        this.metaqtdped = metaqtdped;
    }

    public Double getMetavlped() {
        return metavlped;
    }

    public void setMetavlped(Double metavlped) {
        this.metavlped = metavlped;
    }

    public Double getMetaqtdpedreal() {
        return metaqtdpedreal;
    }

    public void setMetaqtdpedreal(Double metaqtdpedreal) {
        this.metaqtdpedreal = metaqtdpedreal;
    }

    public Double getMetapercpedreal() {
        return metapercpedreal;
    }

    public void setMetapercpedreal(Double metapercpedreal) {
        this.metapercpedreal = metapercpedreal;
    }

    public Double getProspectmes() {
        return prospectmes;
    }

    public void setProspectmes(Double prospectmes) {
        this.prospectmes = prospectmes;
    }

    public Double getProspectaprovado() {
        return prospectaprovado;
    }

    public void setProspectaprovado(Double prospectaprovado) {
        this.prospectaprovado = prospectaprovado;
    }

    public Double getProspectreprovado() {
        return prospectreprovado;
    }

    public void setProspectreprovado(Double prospectreprovado) {
        this.prospectreprovado = prospectreprovado;
    }

    public Double getProspectaberto() {
        return prospectaberto;
    }

    public void setProspectaberto(Double prospectaberto) {
        this.prospectaberto = prospectaberto;
    }

    public Double getProspectemavaliacao() {
        return prospectemavaliacao;
    }

    public void setProspectemavaliacao(Double prospectemavaliacao) {
        this.prospectemavaliacao = prospectemavaliacao;
    }

    public Double getProspectliberado() {
        return prospectliberado;
    }

    public void setProspectliberado(Double prospectliberado) {
        this.prospectliberado = prospectliberado;
    }

    public Double getProspectpercaprovado() {
        return prospectpercaprovado;
    }

    public void setProspectpercaprovado(Double prospectpercaprovado) {
        this.prospectpercaprovado = prospectpercaprovado;
    }

    public Double getProspectpercreprovado() {
        return prospectpercreprovado;
    }

    public void setProspectpercreprovado(Double prospectpercreprovado) {
        this.prospectpercreprovado = prospectpercreprovado;
    }

    public Double getProspectpercaberto() {
        return prospectpercaberto;
    }

    public void setProspectpercaberto(Double prospectpercaberto) {
        this.prospectpercaberto = prospectpercaberto;
    }

    public Double getProspectpercemavaliacao() {
        return prospectpercemavaliacao;
    }

    public void setProspectpercemavaliacao(Double prospectpercemavaliacao) {
        this.prospectpercemavaliacao = prospectpercemavaliacao;
    }

    public Double getProspectpercliberado() {
        return prospectpercliberado;
    }

    public void setProspectpercliberado(Double prospectpercliberado) {
        this.prospectpercliberado = prospectpercliberado;
    }

    public Double getMetaqtdpedfalta() {
        return metaqtdpedfalta;
    }

    public void setMetaqtdpedfalta(Double metaqtdpedfalta) {
        this.metaqtdpedfalta = metaqtdpedfalta;
    }

    public Double getMetapercpedfalta() {
        return metapercpedfalta;
    }

    public void setMetapercpedfalta(Double metapercpedfalta) {
        this.metapercpedfalta = metapercpedfalta;
    }

    public Double getMetavlpedreal() {
        return metavlpedreal;
    }

    public void setMetavlpedreal(Double metavlpedreal) {
        this.metavlpedreal = metavlpedreal;
    }

    public Double getMetapercvlreal() {
        return metapercvlreal;
    }

    public void setMetapercvlreal(Double metapercvlreal) {
        this.metapercvlreal = metapercvlreal;
    }

    public Double getMetavlpedfalta() {
        return metavlpedfalta;
    }

    public void setMetavlpedfalta(Double metavlpedfalta) {
        this.metavlpedfalta = metavlpedfalta;
    }

    public Double getMetapercvlfalta() {
        return metapercvlfalta;
    }

    public void setMetapercvlfalta(Double metapercvlfalta) {
        this.metapercvlfalta = metapercvlfalta;
    }

    public Double getResvendaano() {
        return resvendaano;
    }

    public void setResvendaano(Double resvendaano) {
        this.resvendaano = resvendaano;
    }

    public Double getResvendames() {
        return resvendames;
    }

    public void setResvendames(Double resvendames) {
        this.resvendames = resvendames;
    }

    public Double getResvenda1t() {
        return resvenda1t;
    }

    public void setResvenda1t(Double resvenda1t) {
        this.resvenda1t = resvenda1t;
    }

    public Double getResvenda2t() {
        return resvenda2t;
    }

    public void setResvenda2t(Double resvenda2t) {
        this.resvenda2t = resvenda2t;
    }

    public Double getResvenda3t() {
        return resvenda3t;
    }

    public void setResvenda3t(Double resvenda3t) {
        this.resvenda3t = resvenda3t;
    }

    public Double getResvenda4t() {
        return resvenda4t;
    }

    public void setResvenda4t(Double resvenda4t) {
        this.resvenda4t = resvenda4t;
    }

    public Double[] getQtdpedidosano() {
        return qtdpedidosano;
    }

    public void setQtdpedidosano(Double[] qtdpedidosano) {
        this.qtdpedidosano = qtdpedidosano;
    }

    public Double[] getValorpedidosano() {
        return valorpedidosano;
    }

    public void setValorpedidosano(Double[] valorpedidosano) {
        this.valorpedidosano = valorpedidosano;
    }

    public Double getQtdpedidomes() {
        return qtdpedidomes;
    }

    public void setQtdpedidomes(Double qtdpedidomes) {
        this.qtdpedidomes = qtdpedidomes;
    }

    public Double getValorpedidomes() {
        return valorpedidomes;
    }

    public void setValorpedidomes(Double valorpedidomes) {
        this.valorpedidomes = valorpedidomes;
    }

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
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

    public Double[] getMetaqtdpedano() {
        return metaqtdpedano;
    }

    public void setMetaqtdpedano(Double[] metaqtdpedano) {
        this.metaqtdpedano = metaqtdpedano;
    }

    public Double[] getMetavlpedano() {
        return metavlpedano;
    }

    public void setMetavlpedano(Double[] metavlpedano) {
        this.metavlpedano = metavlpedano;
    }

    public Double getPdvtotal() {
        return pdvtotal;
    }

    public void setPdvtotal(Double pdvtotal) {
        this.pdvtotal = pdvtotal;
    }

    public Double getPdvdia() {
        return pdvdia;
    }

    public void setPdvdia(Double pdvdia) {
        this.pdvdia = pdvdia;
    }

    public Double getPdvqtddia() {
        return pdvqtddia;
    }

    public void setPdvqtddia(Double pdvqtddia) {
        this.pdvqtddia = pdvqtddia;
    }

    public Double getPdvontem() {
        return pdvontem;
    }

    public void setPdvontem(Double pdvontem) {
        this.pdvontem = pdvontem;
    }

    public Double getPdvqtdontem() {
        return pdvqtdontem;
    }

    public void setPdvqtdontem(Double pdvqtdontem) {
        this.pdvqtdontem = pdvqtdontem;
    }

    public Double getPdvmes() {
        return pdvmes;
    }

    public void setPdvmes(Double pdvmes) {
        this.pdvmes = pdvmes;
    }

    public Double getPdvqtdmes() {
        return pdvqtdmes;
    }

    public void setPdvqtdmes(Double pdvqtdmes) {
        this.pdvqtdmes = pdvqtdmes;
    }

    public Double getMetaqtdpedori() {
        return metaqtdpedori;
    }

    public void setMetaqtdpedori(Double metaqtdpedori) {
        this.metaqtdpedori = metaqtdpedori;
    }

    public Double getMetavlpedori() {
        return metavlpedori;
    }

    public void setMetavlpedori(Double metavlpedori) {
        this.metavlpedori = metavlpedori;
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
        if (!(object instanceof Dashboardws)) {
            return false;
        }
        Dashboardws other = (Dashboardws) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.seguranca.Dashboardws[id=" + id + "]";
    }

}