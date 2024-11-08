
package br.com.onsys.entidades.basico;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="municipio")
public class Municipio implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

//    @NotNull(message="O nome não pode ser nulo")
//    @NotEmpty(message="O nome não pode ser branco")
    @Column(nullable=false,length=60)
    @Length(max=60, message="Tamanho máximo da descrição é 60.") 
    private String descricao;

//    @NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,unique=true,length=20)
    @Length(min=7, max=7, message="Código do municipio deve ser com 7 dígitos.")    
    private String codigo;
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    private String faixaHabitantes;    
    
    @Column(precision=20, scale=6)
    private BigDecimal habitantes = BigDecimal.ZERO;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
//    @NotNull
    @OneToMany(mappedBy="municipio")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private Estado estado;
    
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getFaixaHabitantes() {
        return faixaHabitantes;
    }

    public void setFaixaHabitantes(String faixaHabitantes) {
        this.faixaHabitantes = faixaHabitantes;
    }

    public BigDecimal getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(BigDecimal habitantes) {
        this.habitantes = habitantes;
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
        if (!(object instanceof Municipio)) {
            return false;
        }
        Municipio other = (Municipio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.basico.Municipio[id=" + id + "]";
    }

}