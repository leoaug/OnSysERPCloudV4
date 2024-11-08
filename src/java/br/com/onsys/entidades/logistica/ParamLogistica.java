/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
/**
 *
 * @author alrocha
 */
@Entity
@Table
@Cacheable(false)
public class ParamLogistica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(name="ultpedidocompras")
    private Integer ultpedidocompras;
    
    @Column(name="ultManifesto")
    private Integer ultManifesto;
    
    @Column(name="ultimaColeta")
    private Integer ultimaColeta;
    
    @Column()    
    private boolean cadastraItem;    
    
    @Column()    
    private boolean saldoNegativo;    
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periniaberto;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date perfimaberto;
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=200)
    private String obs;  
    
    @OneToMany(mappedBy="paramlogistica")    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDoctoLogistica tipoDoctoLog;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelPadrao;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Deposito depositoPadraoEstoque;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Localizacao localizacaoPadraoEstoque;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SerieMDFe serieMDFe;    // serie padrão para o manifesto de entrada  
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SerieMDFe serieMDFeSaida;  // serie padrão para o manifesto de saída 

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SerieNotaFiscal serieNF;   // serie padrão para a nota fiscal de saída  

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SerieNotaFiscal serieNFEntrada;   // serie padrão para a nota fiscal de entrada

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SerieNotaFiscal seriePDV;     // serie padrão para o PDV
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public boolean isCadastraItem() {
        return cadastraItem;
    }

    public void setCadastraItem(boolean cadastraItem) {
        this.cadastraItem = cadastraItem;
    }

    public Integer getUltManifesto() {
        return ultManifesto;
    }

    public void setUltManifesto(Integer ultManifesto) {
        this.ultManifesto = ultManifesto;
    }

    public boolean isSaldoNegativo() {
        return saldoNegativo;
    }

    public void setSaldoNegativo(boolean saldoNegativo) {
        this.saldoNegativo = saldoNegativo;
    }

    public SerieMDFe getSerieMDFe() {
        return serieMDFe;
    }

    public void setSerieMDFe(SerieMDFe serieMDFe) {
        this.serieMDFe = serieMDFe;
    }

    public Deposito getDepositoPadraoEstoque() {
        return depositoPadraoEstoque;
    }

    public void setDepositoPadraoEstoque(Deposito depositoPadraoEstoque) {
        this.depositoPadraoEstoque = depositoPadraoEstoque;
    }

    public Localizacao getLocalizacaoPadraoEstoque() {
        return localizacaoPadraoEstoque;
    }

    public void setLocalizacaoPadraoEstoque(Localizacao localizacaoPadraoEstoque) {
        this.localizacaoPadraoEstoque = localizacaoPadraoEstoque;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public TipoDoctoLogistica getTipoDoctoLog() {
        return tipoDoctoLog;
    }

    public void setTipoDoctoLog(TipoDoctoLogistica tipoDoctoLog) {
        this.tipoDoctoLog = tipoDoctoLog;
    }

    public SerieNotaFiscal getSerieNF() {
        return serieNF;
    }

    public void setSerieNF(SerieNotaFiscal serieNF) {
        this.serieNF = serieNF;
    }

    public SerieNotaFiscal getSerieNFEntrada() {
        return serieNFEntrada;
    }

    public void setSerieNFEntrada(SerieNotaFiscal serieNFEntrada) {
        this.serieNFEntrada = serieNFEntrada;
    }

    public SerieNotaFiscal getSeriePDV() {
        return seriePDV;
    }

    public void setSeriePDV(SerieNotaFiscal seriePDV) {
        this.seriePDV = seriePDV;
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

    public Integer getUltimaColeta() {
        return ultimaColeta;
    }

    public void setUltimaColeta(Integer ultimaColeta) {
        this.ultimaColeta = ultimaColeta;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getPeriniaberto() {
        return periniaberto;
    }

    public void setPeriniaberto(Date periniaberto) {
        this.periniaberto = periniaberto;
    }

    public Date getPerfimaberto() {
        return perfimaberto;
    }

    public void setPerfimaberto(Date perfimaberto) {
        this.perfimaberto = perfimaberto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estabelecimento getEstabelPadrao() {
        return estabelPadrao;
    }

    public void setEstabelPadrao(Estabelecimento estabelPadrao) {
        this.estabelPadrao = estabelPadrao;
    }

    public Integer getUltpedidocompras() {
        return ultpedidocompras;
    }

    public void setUltpedidocompras(Integer ultpedidocompras) {
        this.ultpedidocompras = ultpedidocompras;
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

    public SerieMDFe getSerieMDFeSaida() {
        return serieMDFeSaida;
    }

    public void setSerieMDFeSaida(SerieMDFe serieMDFeSaida) {
        this.serieMDFeSaida = serieMDFeSaida;
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
        if (!(object instanceof ParamLogistica)) {
            return false;
        }
        ParamLogistica other = (ParamLogistica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.ParamLogistica[ id=" + id + " ]";
    }
    
}