
package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table
public class PacoteRecurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(precision=12, scale=2)
    private BigDecimal vlexecutor;
    
    @Column(precision=12, scale=2)
    private BigDecimal vlexecutorhh;

    @Min(0)
    @Column(precision=12, scale=2)
    private BigDecimal vldespesa;

    @Column()
    private Integer pacote_id;

    @Column()
    private Integer recurso_id;
    
    /*
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Componenteeap pacote;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Recurso recurso;
    */

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public Integer getPacote_id() {
        return pacote_id;
    }

    public void setPacote_id(Integer pacote_id) {
        this.pacote_id = pacote_id;
    }

    public Integer getRecurso_id() {
        return recurso_id;
    }

    public void setRecurso_id(Integer recurso_id) {
        this.recurso_id = recurso_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getVlexecutorhh() {
        return vlexecutorhh;
    }

    public void setVlexecutorhh(BigDecimal vlexecutorhh) {
        this.vlexecutorhh = vlexecutorhh;
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

    public BigDecimal getVlexecutor() {
        return vlexecutor;
    }

    public void setVlexecutor(BigDecimal vlexecutor) {
        this.vlexecutor = vlexecutor;
    }

    public BigDecimal getVldespesa() {
        return vldespesa;
    }

    public void setVldespesa(BigDecimal vldespesa) {
        this.vldespesa = vldespesa;
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
        if (!(object instanceof PacoteRecurso)) {
            return false;
        }
        PacoteRecurso other = (PacoteRecurso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.projetos.PacoteRecurso[id=" + id + "]";
    }
    
}