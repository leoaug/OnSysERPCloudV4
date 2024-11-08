
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="naturezaoperacao")
public class NaturezaOperacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    //@NotNull(message="O nome não pode ser nulo")
    //@NotEmpty(message="O nome não pode ser branco")
    @Column(nullable=false,length=60)
    private String descricao;

    //@NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;

    @NotEmpty()
    @Column(nullable=false,length=6)
    private String cfop;

//  @Enumerated(EnumType.STRING)  //foi incluido tambem no tipo de documento, pois alguns documentos não tem natureza/cfop
    @Column(nullable=false, length=10)
    private String tpentsai;

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private String atuestoq;

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private String atucr;    // CONTAS A RECEBER

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private String atuap;    // CONTAS A PAGAR 

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private String atuof;   // OBRIGAÇÕES FISCAIS  

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private String atuaf;   // ATIVO FIXO  
    
    @Column(nullable=false,length=2)
    private String codtribicms;
    
    @Column()    
    private boolean contribICMS;    // VERIFICAR SE O CORRETO DESSE CAMPO É SER NO PARTICIPANTE 

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private String tptribicms;

    @Column(precision=12, scale=2)
    private BigDecimal aliqicms;    
    
    @Column(precision=12, scale=2)
    private BigDecimal aliqFCP;    
    
    @Column(precision=12, scale=2)
    private BigDecimal aliqFCPST;    

    @Column(precision=12, scale=2)
    private BigDecimal percDescontoICMS;    
    
    @Column(precision=12, scale=2)
    private BigDecimal percReducaoICMS;    
    
    @Column(precision=12, scale=2)
    private BigDecimal percDescontoICMSZF;    
    
//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private String tptribipi;

    @Column(precision=12, scale=2)
    private BigDecimal aliqipi;    

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private String tptribpis;

    @Column(precision=12, scale=2)
    private BigDecimal aliqpis;    
    
//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private String tptribcofins;

    @Column(precision=12, scale=2)
    private BigDecimal aliqcofins;    
    
//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private String tptribcsll;

    @Column(precision=12, scale=2)
    private BigDecimal aliqcsll;    

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private String tptribirrf;

    @Column(precision=12, scale=2)
    private BigDecimal aliqirrf;

//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private String tptribiss;

    @Column(precision=12, scale=2)
    private BigDecimal aliqiss;    
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    

    @Column(length=1)
    private String obs;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Column()    
    private boolean consumidorFinal;    
    
    @OneToMany(mappedBy="naturezaoperacao")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private ModDoctoFiscal moddoctofiscal;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public BigDecimal getAliqcofins() {
        return aliqcofins;
    }

    public void setAliqcofins(BigDecimal aliqcofins) {
        this.aliqcofins = aliqcofins;
    }

    public BigDecimal getAliqcsll() {
        return aliqcsll;
    }

    public void setAliqcsll(BigDecimal aliqcsll) {
        this.aliqcsll = aliqcsll;
    }

    public BigDecimal getAliqicms() {
        return aliqicms;
    }

    public void setAliqicms(BigDecimal aliqicms) {
        this.aliqicms = aliqicms;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public BigDecimal getAliqFCP() {
        return aliqFCP;
    }

    public void setAliqFCP(BigDecimal aliqFCP) {
        this.aliqFCP = aliqFCP;
    }

    public BigDecimal getAliqFCPST() {
        return aliqFCPST;
    }

    public void setAliqFCPST(BigDecimal aliqFCPST) {
        this.aliqFCPST = aliqFCPST;
    }
    
    public BigDecimal getPercDescontoICMS() {
        return percDescontoICMS;
    }

    public void setPercDescontoICMS(BigDecimal percDescontoICMS) {
        this.percDescontoICMS = percDescontoICMS;
    }

    public BigDecimal getPercReducaoICMS() {
        return percReducaoICMS;
    }

    public void setPercReducaoICMS(BigDecimal percReducaoICMS) {
        this.percReducaoICMS = percReducaoICMS;
    }

    public BigDecimal getPercDescontoICMSZF() {
        return percDescontoICMSZF;
    }

    public void setPercDescontoICMSZF(BigDecimal percDescontoICMSZF) {
        this.percDescontoICMSZF = percDescontoICMSZF;
    }
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getTpentsai() {
        return tpentsai;
    }

    public void setTpentsai(String tpentsai) {
        this.tpentsai = tpentsai;
    }

    public String getAtuestoq() {
        return atuestoq;
    }

    public void setAtuestoq(String atuestoq) {
        this.atuestoq = atuestoq;
    }

    public String getAtucr() {
        return atucr;
    }

    public void setAtucr(String atucr) {
        this.atucr = atucr;
    }

    public String getAtuap() {
        return atuap;
    }

    public void setAtuap(String atuap) {
        this.atuap = atuap;
    }

    public String getAtuaf() {
        return atuaf;
    }

    public void setAtuaf(String atuaf) {
        this.atuaf = atuaf;
    }

    public String getAtuof() {
        return atuof;
    }

    public void setAtuof(String atuof) {
        this.atuof = atuof;
    }

    public String getTptribicms() {
        return tptribicms;
    }

    public void setTptribicms(String tptribicms) {
        this.tptribicms = tptribicms;
    }

    public String getTptribipi() {
        return tptribipi;
    }

    public void setTptribipi(String tptribipi) {
        this.tptribipi = tptribipi;
    }

    public String getTptribpis() {
        return tptribpis;
    }

    public void setTptribpis(String tptribpis) {
        this.tptribpis = tptribpis;
    }

    public String getTptribcofins() {
        return tptribcofins;
    }

    public void setTptribcofins(String tptribcofins) {
        this.tptribcofins = tptribcofins;
    }

    public String getTptribcsll() {
        return tptribcsll;
    }

    public void setTptribcsll(String tptribcsll) {
        this.tptribcsll = tptribcsll;
    }

    public String getTptribirrf() {
        return tptribirrf;
    }

    public void setTptribirrf(String tptribirrf) {
        this.tptribirrf = tptribirrf;
    }

    public String getTptribiss() {
        return tptribiss;
    }

    public void setTptribiss(String tptribiss) {
        this.tptribiss = tptribiss;
    }

    public BigDecimal getAliqipi() {
        return aliqipi;
    }

    public void setAliqipi(BigDecimal aliqipi) {
        this.aliqipi = aliqipi;
    }

    public BigDecimal getAliqirrf() {
        return aliqirrf;
    }

    public void setAliqirrf(BigDecimal aliqirrf) {
        this.aliqirrf = aliqirrf;
    }

    public BigDecimal getAliqiss() {
        return aliqiss;
    }

    public void setAliqiss(BigDecimal aliqiss) {
        this.aliqiss = aliqiss;
    }

    public BigDecimal getAliqpis() {
        return aliqpis;
    }

    public void setAliqpis(BigDecimal aliqpis) {
        this.aliqpis = aliqpis;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public boolean isContribICMS() {
        return contribICMS;
    }

    public void setContribICMS(boolean contribICMS) {
        this.contribICMS = contribICMS;
    }

    public boolean isConsumidorFinal() {
        return consumidorFinal;
    }

    public void setConsumidorFinal(boolean consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public String getCodtribicms() {
        return codtribicms;
    }

    public void setCodtribicms(String codtribicms) {
        this.codtribicms = codtribicms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ModDoctoFiscal getModdoctofiscal() {
        return moddoctofiscal;
    }

    public void setModdoctofiscal(ModDoctoFiscal moddoctofiscal) {
        this.moddoctofiscal = moddoctofiscal;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NaturezaOperacao)) {
            return false;
        }
        NaturezaOperacao other = (NaturezaOperacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.NaturezaOperacao[id=" + id + "]";
    }

}