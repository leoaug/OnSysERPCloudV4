
package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class AplicacaoEmprestimo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Length(max=20, message="Tamanho máximo do número do documento é 20.")
    @Column(length=20)
    private String nrodocto;
    
    @Length(max=60, message="Tamanho máximo do número do documento é 60.")
    @Column(length=60)
    private String historico;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Portador portador;      
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas conta;        

    @Column()
    private Integer tptrans; /*Tipo de transação 1-Aplicação e 2-Empréstimo */
    
    @Column()
    private Integer tpmovto; /*Tipo de movimento 1-Libera��o e 2-Pagamento  */    

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtmovto;
    
    @Column(precision=12, scale=6)
    private BigDecimal vlmovto;    
        
    @OneToMany(mappedBy="aplicacaoemprestimo")
    
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

    public String getNrodocto() {
        return nrodocto;
    }

    public void setNrodocto(String nrodocto) {
        this.nrodocto = nrodocto;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Portador getPortador() {
        return portador;
    }

    public void setPortador(Portador portador) {
        this.portador = portador;
    }

    public PlanoContas getConta() {
        return conta;
    }

    public void setConta(PlanoContas conta) {
        this.conta = conta;
    }

    public Date getDtmovto() {
        return dtmovto;
    }

    public void setDtmovto(Date dtmovto) {
        this.dtmovto = dtmovto;
    }

    public BigDecimal getVlmovto() {
        return vlmovto;
    }

    public void setVlmovto(BigDecimal vlmovto) {
        this.vlmovto = vlmovto;
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

    public Integer getTptrans() {
        return tptrans;
    }

    public void setTptrans(Integer tptrans) {
        this.tptrans = tptrans;
    }

    public Integer getTpmovto() {
        return tpmovto;
    }

    public void setTpmovto(Integer tpmovto) {
        this.tpmovto = tpmovto;
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
        if (!(object instanceof AplicacaoEmprestimo)) {
            return false;
        }
        AplicacaoEmprestimo other = (AplicacaoEmprestimo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.financeiro.AplicacaoEmprestimo[id=" + id + "]";
    }

}