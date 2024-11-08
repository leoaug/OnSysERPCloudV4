
package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table
public class LotesLancamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column()
    private String complemento;
    
    @Column()
    private Integer sequencia;

    @Column(length=2)
    private String DC;
    
    @Column(precision=12, scale=6)
    private BigDecimal valor;    
    
    @Column(length=200)
    private String historico;
        
    @OneToMany(mappedBy="loteslancamentos")    

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private HistoricoPadrao historicopadrao;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas conta;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Lotes lotes;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public HistoricoPadrao getHistoricopadrao() {
        return historicopadrao;
    }

    public void setHistoricopadrao(HistoricoPadrao historicopadrao) {
        this.historicopadrao = historicopadrao;
    }

    public PlanoContas getConta() {
        return conta;
    }

    public void setConta(PlanoContas conta) {
        this.conta = conta;
    }

    public Lotes getLotes() {
        return lotes;
    }

    public void setLotes(Lotes lotes) {
        this.lotes = lotes;
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

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
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
        if (!(object instanceof LotesLancamentos)) {
            return false;
        }
        LotesLancamentos other = (LotesLancamentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.controladoria.LotesLancamentos[id=" + id + "]";
    }

}