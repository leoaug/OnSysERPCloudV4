
package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table
public class BorderoAR implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Length(max=20, message="Tamanho máximo do número do documento é 20.")
    @Column(length=20)
    @NotNull(message="Número do documento não pode ser nulo")
    @NotEmpty(message="Número do documento não pode ser branco")
    private String nrodocto;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataemissao;    
    
    @Column(precision=12, scale=6)
    private BigDecimal ftoper;        
    
    @Column(precision=12, scale=6)
    private Integer dias;        
    
    @Column(precision=12, scale=6)
    private BigDecimal vltotdocto;        
    
    @Column(precision=12, scale=6)
    private BigDecimal vldesconto; 

    @Column(precision=12, scale=6)
    private BigDecimal vlservico; 
    
    @Column(precision=12, scale=6)
    private BigDecimal vliof; 
    
    @Column(precision=12, scale=6)
    private BigDecimal vldespbancaria; 
    
    @Column(length=200)
    private String historico;    
    
    @OneToMany(mappedBy="borderoar")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDoctoFinanceiro tipodocto;     // SEMPRE BORAR

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Portador portador;
    
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

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public BigDecimal getFtoper() {
        return ftoper;
    }

    public void setFtoper(BigDecimal ftoper) {
        this.ftoper = ftoper;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public BigDecimal getVltotdocto() {
        return vltotdocto;
    }

    public void setVltotdocto(BigDecimal vltotdocto) {
        this.vltotdocto = vltotdocto;
    }

    public BigDecimal getVldesconto() {
        return vldesconto;
    }

    public void setVldesconto(BigDecimal vldesconto) {
        this.vldesconto = vldesconto;
    }

    public BigDecimal getVlservico() {
        return vlservico;
    }

    public void setVlservico(BigDecimal vlservico) {
        this.vlservico = vlservico;
    }

    public BigDecimal getVliof() {
        return vliof;
    }

    public void setVliof(BigDecimal vliof) {
        this.vliof = vliof;
    }

    public BigDecimal getVldespbancaria() {
        return vldespbancaria;
    }

    public void setVldespbancaria(BigDecimal vldespbancaria) {
        this.vldespbancaria = vldespbancaria;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public TipoDoctoFinanceiro getTipodocto() {
        return tipodocto;
    }

    public void setTipodocto(TipoDoctoFinanceiro tipodocto) {
        this.tipodocto = tipodocto;
    }

    public Portador getPortador() {
        return portador;
    }

    public void setPortador(Portador portador) {
        this.portador = portador;
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
        if (!(object instanceof BorderoAR)) {
            return false;
        }
        BorderoAR other = (BorderoAR) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.financeiro.BorderoAR[id=" + id + "]";
    }

}