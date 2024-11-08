
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table
public class SerieNotaFiscal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

//  @NotNull(message="O descrição não pode ser nula")
//  @NotEmpty(message="O descrição não pode ser branco")
    @Column(nullable=false,length=60)
    private String descricao;

//  @NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=3)
    private String codigo;

    @Column(length=3)
    private String serie;
    
    @Column(name="ultnf")
    private Integer ultnf;    
    
//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private String seriepadrao = "Sim";    
    
    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
//  @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  

    @OneToMany(mappedBy="serienf")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
//  @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=10)
    private String tpentsai = "Saida";
    
/*  Falta incluir data do faturamento da serie
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datadofaturamento; 
 */    

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

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    public Integer getUltnf() {
        return ultnf;
    }

    public void setUltnf(Integer ultnf) {
        this.ultnf = ultnf;
    }

    public String getSeriepadrao() {
        return seriepadrao;
    }

    public void setSeriepadrao(String seriepadrao) {
        this.seriepadrao = seriepadrao;
    }

    public String getTpentsai() {
        return tpentsai;
    }

    public void setTpentsai(String tpentsai) {
        this.tpentsai = tpentsai;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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
        if (!(object instanceof SerieNotaFiscal)) {
            return false;
        }
        SerieNotaFiscal other = (SerieNotaFiscal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.SerieNotaFiscal[id=" + id + "]";
    }

}