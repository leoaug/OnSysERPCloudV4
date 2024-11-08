
package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.logistica.Deposito;
import br.com.onsys.entidades.logistica.Localizacao;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class ParamProducao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periniaberto;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date perfimaberto;

    @Column(name="ultimaop")
    private Integer ultimaop;

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
    
    @OneToMany(mappedBy="paramproducao")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private SubcatItem subCatItemPadrao;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private CatItem catItemPadrao;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoItem tipoitemPAdrao;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private UnidadeMedida unidadeMedidaPadrao;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Deposito depositoPadraoProducao;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Localizacao localizacaoPadraoProducao;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

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

    public Localizacao getLocalizacaoPadraoProducao() {
        return localizacaoPadraoProducao;
    }

    public void setLocalizacaoPadraoProducao(Localizacao localizacaoPadraoProducao) {
        this.localizacaoPadraoProducao = localizacaoPadraoProducao;
    }

    public SubcatItem getSubCatItemPadrao() {
        return subCatItemPadrao;
    }

    public void setSubCatItemPadrao(SubcatItem subCatItemPadrao) {
        this.subCatItemPadrao = subCatItemPadrao;
    }

    public CatItem getCatItemPadrao() {
        return catItemPadrao;
    }

    public void setCatItemPadrao(CatItem catItemPadrao) {
        this.catItemPadrao = catItemPadrao;
    }

    public TipoItem getTipoitemPAdrao() {
        return tipoitemPAdrao;
    }

    public void setTipoitemPAdrao(TipoItem tipoitemPAdrao) {
        this.tipoitemPAdrao = tipoitemPAdrao;
    }

    public UnidadeMedida getUnidadeMedidaPadrao() {
        return unidadeMedidaPadrao;
    }

    public void setUnidadeMedidaPadrao(UnidadeMedida unidadeMedidaPadrao) {
        this.unidadeMedidaPadrao = unidadeMedidaPadrao;
    }

    public Date getDatainativo() {
        return datainativo;
    }

    public void setDatainativo(Date datainativo) {
        this.datainativo = datainativo;
    }

    public Deposito getDepositoPadraoProducao() {
        return depositoPadraoProducao;
    }

    public void setDepositoPadraoProducao(Deposito depositoPadraoProducao) {
        this.depositoPadraoProducao = depositoPadraoProducao;
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
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUltimaop() {
        return ultimaop;
    }

    public void setUltimaop(Integer ultimaop) {
        this.ultimaop = ultimaop;
    }

    public Date getPerfimaberto() {
        return perfimaberto;
    }

    public void setPerfimaberto(Date perfimaberto) {
        this.perfimaberto = perfimaberto;
    }

    public Date getPeriniaberto() {
        return periniaberto;
    }

    public void setPeriniaberto(Date periniaberto) {
        this.periniaberto = periniaberto;
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
        if (!(object instanceof ParamProducao)) {
            return false;
        }
        ParamProducao other = (ParamProducao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.servicos.ParamProducao[id=" + id + "]";
    }

}