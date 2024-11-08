
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table
public class ParcelaCondPagto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column()
    private Integer dias;

    @Column()
    private int parcela;    
    
    @Column(precision=12, scale=6)
    private BigDecimal percparcela;

    @OneToMany(mappedBy="parcelacondpagto")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private CondPagamento condpagamento;
    
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

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public BigDecimal getPercparcela() {
        return percparcela;
    }

    public void setPercparcela(BigDecimal percparcela) {
        this.percparcela = percparcela;
    }

    public CondPagamento getCondpagamento() {
        return condpagamento;
    }

    public void setCondpagamento(CondPagamento condpagamento) {
        this.condpagamento = condpagamento;
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
        if (!(object instanceof ParcelaCondPagto)) {
            return false;
        }
        ParcelaCondPagto other = (ParcelaCondPagto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.ParcelaCondPagto[id=" + id + "]";
    }

}