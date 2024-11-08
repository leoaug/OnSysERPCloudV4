
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table
public class FaixaTabDescontoComis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(precision=12, scale=6)
    private BigDecimal descini;
    
    @Column(precision=12, scale=6)
    private BigDecimal descfim;

    @Column(precision=12, scale=6)
    private BigDecimal comissao;    
    
    @OneToMany(mappedBy="faixatabdescontocomis")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabDescontoComis tabDescontoComis;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
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

    public BigDecimal getDescini() {
        return descini;
    }

    public void setDescini(BigDecimal descini) {
        this.descini = descini;
    }

    public BigDecimal getDescfim() {
        return descfim;
    }

    public void setDescfim(BigDecimal descfim) {
        this.descfim = descfim;
    }

    public TabDescontoComis getTabDescontoComis() {
        return tabDescontoComis;
    }

    public void setTabDescontoComis(TabDescontoComis tabDescontoComis) {
        this.tabDescontoComis = tabDescontoComis;
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
        if (!(object instanceof FaixaTabDescontoComis)) {
            return false;
        }
        FaixaTabDescontoComis other = (FaixaTabDescontoComis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.FaixaTabDescontoComis[id=" + id + "]";
    }

}