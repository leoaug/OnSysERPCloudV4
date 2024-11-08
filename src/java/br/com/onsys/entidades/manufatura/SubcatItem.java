
package br.com.onsys.entidades.manufatura;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class SubcatItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    //@NotNull(message="O nome não pode ser nulo")
    //@NotEmpty(message="O nome não pode ser branco")
    //@Length(max=60, message="Tamanho máximo da descrição é 60.")    
    @Column(nullable=false,length=60)
    private String descricao;

    //@NotEmpty(message="O código não pode ser branco")
    //@Length(max=20, message="Tamanho máximo do código é 20.")    
    @Column(nullable=false,length=20)
    private String codigo;
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String deletado;    
    
    @Column(length=45)
    private String fontColor;      
    
    @Column(length=45)
    private String backgroundColor;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;
    
    @Column(length=1)
    private String modificado;    
    
    //@Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    @Column(precision=12, scale=6)
    private BigDecimal metaAbaixo80;
    
    @Column(precision=12, scale=6)
    private BigDecimal metaDe80Ate90;
    
    @Column(precision=12, scale=6)
    private BigDecimal metaDe90Ate100;

    @Column(precision=12, scale=6)
    private BigDecimal bonusAcima105;
    
    @Column(precision=12, scale=6)
    private BigDecimal premiacao;
    
    @Column()
    private Integer unidadeVendida; 
    
    @OneToMany(mappedBy="subcatitem")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    //@Valid
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    //@Valid
    private Estabelecimento estabelecimento;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getDeletado() {
        return deletado;
    }

    public void setDeletado(String deletado) {
        this.deletado = deletado;
    }

    public Date getDatainativo() {
        return datainativo;
    }

    public void setDatainativo(Date datainativo) {
        this.datainativo = datainativo;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getMetaAbaixo80() {
        return metaAbaixo80;
    }

    public void setMetaAbaixo80(BigDecimal metaAbaixo80) {
        this.metaAbaixo80 = metaAbaixo80;
    }

    public BigDecimal getMetaDe80Ate90() {
        return metaDe80Ate90;
    }

    public void setMetaDe80Ate90(BigDecimal metaDe80Ate90) {
        this.metaDe80Ate90 = metaDe80Ate90;
    }

    public BigDecimal getMetaDe90Ate100() {
        return metaDe90Ate100;
    }

    public void setMetaDe90Ate100(BigDecimal metaDe90Ate100) {
        this.metaDe90Ate100 = metaDe90Ate100;
    }

    public BigDecimal getBonusAcima105() {
        return bonusAcima105;
    }

    public void setBonusAcima105(BigDecimal bonusAcima105) {
        this.bonusAcima105 = bonusAcima105;
    }

    public BigDecimal getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(BigDecimal premiacao) {
        this.premiacao = premiacao;
    }

    public Integer getUnidadeVendida() {
        return unidadeVendida;
    }

    public void setUnidadeVendida(Integer unidadeVendida) {
        this.unidadeVendida = unidadeVendida;
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
        if (!(object instanceof SubcatItem)) {
            return false;
        }
        SubcatItem other = (SubcatItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.manufatura.SubcatItem[id=" + id + "]";
    }

}