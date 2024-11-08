
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table
public class SPEDContribERP implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column(length=1)
    private String ind_oper;    
    
    @Column(length=60)
    private String cod_part;    

    @Column(length=3)
    private String ser;    
    
    @Column(length=9)
    private String num_doc;
    
    @Column(length=9)
    private String cfop;

    @Column(length=9)
    private String cod_item;
    
    @Column(precision=12, scale=6)
    private BigDecimal qtd;    

    @Column(precision=12, scale=6)
    private BigDecimal vl_item;    
    
    @Column(precision=12, scale=6)
    private BigDecimal vl_doc;    

    @Column(precision=12, scale=6)
    private BigDecimal vl_merc;    

    @Column(precision=12, scale=6)
    private BigDecimal vl__bc_pis_item;    

    @Column(precision=12, scale=6)
    private BigDecimal vl_bc_cofins_item;
    
    @Column(precision=12, scale=6)
    private BigDecimal vl_pis_item;    

    @Column(precision=12, scale=6)
    private BigDecimal vl_cofins_item;
    
    @Column(precision=12, scale=6)
    private BigDecimal vl_pis;    

    @Column(precision=12, scale=6)
    private BigDecimal vl_cofins;

    @OneToMany(mappedBy="efdcontribreceita")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

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

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCod_item() {
        return cod_item;
    }

    public void setCod_item(String cod_item) {
        this.cod_item = cod_item;
    }

    public String getCod_part() {
        return cod_part;
    }

    public void setCod_part(String cod_part) {
        this.cod_part = cod_part;
    }

    public String getInd_oper() {
        return ind_oper;
    }

    public void setInd_oper(String ind_oper) {
        this.ind_oper = ind_oper;
    }

    public String getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(String num_doc) {
        this.num_doc = num_doc;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public String getSer() {
        return ser;
    }

    public void setSer(String ser) {
        this.ser = ser;
    }

    public BigDecimal getVl__bc_pis_item() {
        return vl__bc_pis_item;
    }

    public void setVl__bc_pis_item(BigDecimal vl__bc_pis_item) {
        this.vl__bc_pis_item = vl__bc_pis_item;
    }

    public BigDecimal getVl_bc_cofins_item() {
        return vl_bc_cofins_item;
    }

    public void setVl_bc_cofins_item(BigDecimal vl_bc_cofins_item) {
        this.vl_bc_cofins_item = vl_bc_cofins_item;
    }

    public BigDecimal getVl_cofins() {
        return vl_cofins;
    }

    public void setVl_cofins(BigDecimal vl_cofins) {
        this.vl_cofins = vl_cofins;
    }

    public BigDecimal getVl_cofins_item() {
        return vl_cofins_item;
    }

    public void setVl_cofins_item(BigDecimal vl_cofins_item) {
        this.vl_cofins_item = vl_cofins_item;
    }

    public BigDecimal getVl_doc() {
        return vl_doc;
    }

    public void setVl_doc(BigDecimal vl_doc) {
        this.vl_doc = vl_doc;
    }

    public BigDecimal getVl_item() {
        return vl_item;
    }

    public void setVl_item(BigDecimal vl_item) {
        this.vl_item = vl_item;
    }

    public BigDecimal getVl_merc() {
        return vl_merc;
    }

    public void setVl_merc(BigDecimal vl_merc) {
        this.vl_merc = vl_merc;
    }

    public BigDecimal getVl_pis() {
        return vl_pis;
    }

    public void setVl_pis(BigDecimal vl_pis) {
        this.vl_pis = vl_pis;
    }

    public BigDecimal getVl_pis_item() {
        return vl_pis_item;
    }

    public void setVl_pis_item(BigDecimal vl_pis_item) {
        this.vl_pis_item = vl_pis_item;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SPEDContribERP)) {
            return false;
        }
        SPEDContribERP other = (SPEDContribERP) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.SPEDContribERP[id=" + id + "]";
    }

}