
package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.comercial.CondPagamento;
import br.com.onsys.entidades.logistica.TipoDoctoLogistica;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class ParamAP implements Serializable {
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

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Portador portador; /*portador padrão para pagamento/recebimento do título */ 

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private CondPagamento condpagamento;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDoctoLogistica tipodoctolog;        

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDoctoFinanceiro tipodoctofin;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Moeda moeda;    

    @OneToMany(mappedBy="paramap")

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

    public Portador getPortador() {
        return portador;
    }

    public void setPortador(Portador portador) {
        this.portador = portador;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public CondPagamento getCondpagamento() {
        return condpagamento;
    }

    public void setCondpagamento(CondPagamento condpagamento) {
        this.condpagamento = condpagamento;
    }

    public TipoDoctoLogistica getTipodoctolog() {
        return tipodoctolog;
    }

    public void setTipodoctolog(TipoDoctoLogistica tipodoctolog) {
        this.tipodoctolog = tipodoctolog;
    }

    public TipoDoctoFinanceiro getTipodoctofin() {
        return tipodoctofin;
    }

    public void setTipodoctofin(TipoDoctoFinanceiro tipodoctofin) {
        this.tipodoctofin = tipodoctofin;
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
   
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParamAP)) {
            return false;
        }
        ParamAP other = (ParamAP) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.financeiro.ParamAP[id=" + id + "]";
    }

}