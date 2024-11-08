
package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class UsrParamProg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Programa programa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuario;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;
    
    @Column()
    private boolean boolean1;    

    @Column()
    private boolean boolean2;    

    //@Column()
    //private boolean boolean3;    
    
    //@Column()
    //private String string1;    
    
    //@Column(precision=12, scale=6)
    //private BigDecimal decimal1 = BigDecimal.ZERO;    
    
    //@Column()
    //private Integer int1;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ultimoAcesso; 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean isBoolean1() {
        return boolean1;
    }

    public void setBoolean1(boolean boolean1) {
        this.boolean1 = boolean1;
    }

    public boolean isBoolean2() {
        return boolean2;
    }

    public void setBoolean2(boolean boolean2) {
        this.boolean2 = boolean2;
    }

    //public boolean isBoolean3() {
    //    return boolean3;
    //}

    //public void setBoolean3(boolean boolean3) {
    //    this.boolean3 = boolean3;
    //}

    //public String getString1() {
    //    return string1;
    //}

    //public void setString1(String string1) {
    //    this.string1 = string1;
    //}

    //public BigDecimal getDecimal1() {
    //    return decimal1;
    //}

    //public void setDecimal1(BigDecimal decimal1) {
    //    this.decimal1 = decimal1;
    //}

    //public Integer getInt1() {
    //    return int1;
    //}

    //public void setInt1(Integer int1) {
    //    this.int1 = int1;
    //}

    public Date getUltimoAcesso() {
        return ultimoAcesso;
    }

    public void setUltimoAcesso(Date ultimoAcesso) {
        this.ultimoAcesso = ultimoAcesso;
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
        if (!(object instanceof UsrParamProg)) {
            return false;
        }
        UsrParamProg other = (UsrParamProg) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.seguranca.UsrParamProg[id=" + id + "]";
    }
    
}