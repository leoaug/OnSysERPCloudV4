
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.tipos.TipoCor;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table
public class FaixaTabRentabil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(precision=12, scale=6)
    private BigDecimal rentabini;
    
    @Column(precision=12, scale=6)
    private BigDecimal rentabfim;

    @Column(precision=12, scale=6)
    private BigDecimal comissao;    
    
    @OneToMany(mappedBy="faixatabrentabil")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabRentabilidade tabrentabilidade;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=10)
    private TipoCor cor = TipoCor.red;    

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

    public BigDecimal getRentabfim() {
        return rentabfim;
    }

    public void setRentabfim(BigDecimal rentabfim) {
        this.rentabfim = rentabfim;
    }

    public BigDecimal getRentabini() {
        return rentabini;
    }

    public void setRentabini(BigDecimal rentabini) {
        this.rentabini = rentabini;
    }

    public TipoCor getCor() {
        return cor;
    }

    public void setCor(TipoCor cor) {
        this.cor = cor;
    }

    public TabRentabilidade getTabrentabilidade() {
        return tabrentabilidade;
    }

    public void setTabrentabilidade(TabRentabilidade tabrentabilidade) {
        this.tabrentabilidade = tabrentabilidade;
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
        if (!(object instanceof FaixaTabRentabil)) {
            return false;
        }
        FaixaTabRentabil other = (FaixaTabRentabil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.FaixaTabRentabil[id=" + id + "]";
    }

}