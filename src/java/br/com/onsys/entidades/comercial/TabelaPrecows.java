
package br.com.onsys.entidades.comercial;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class TabelaPrecows implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @NotNull(message="O nome não pode ser nulo")
    @NotEmpty(message="O nome não pode ser branco")
    @Column(nullable=false,length=60)
    private String descricao;

    @NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datavalini;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datavalfim;
    
    @Length(max=200, message="Tamanho máximo da observação do item é 200.")    
    @Column(length=200)
    private String obs;    
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  

    @OneToMany(mappedBy="tabelaprecows")

    private Integer empresa_id;

    private Integer estabelecimento_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getDatavalini() {
        return datavalini;
    }

    public void setDatavalini(Date datavalini) {
        this.datavalini = datavalini;
    }

    public Date getDatavalfim() {
        return datavalfim;
    }

    public void setDatavalfim(Date datavalfim) {
        this.datavalfim = datavalfim;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
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

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Integer getEstabelecimento_id() {
        return estabelecimento_id;
    }

    public void setEstabelecimento_id(Integer estabelecimento_id) {
        this.estabelecimento_id = estabelecimento_id;
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
        if (!(object instanceof TabelaPrecows)) {
            return false;
        }
        TabelaPrecows other = (TabelaPrecows) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.TabelaPrecows[id=" + id + "]";
    }

}