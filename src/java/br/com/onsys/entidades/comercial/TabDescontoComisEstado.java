
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.*;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class TabDescontoComisEstado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column()
    private Integer estado_id;

    @Column()
    private Integer tabdescontocomis_id;
    
    @NotNull
    @OneToMany(mappedBy="tabdescontocomisestado")    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private Empresa empresa;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(Integer estado_id) {
        this.estado_id = estado_id;
    }

    public Integer getTabdescontocomis_id() {
        return tabdescontocomis_id;
    }

    public void setTabdescontocomis_id(Integer tabdescontocomis_id) {
        this.tabdescontocomis_id = tabdescontocomis_id;
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
        if (!(object instanceof TabDescontoComisEstado)) {
            return false;
        }
        TabDescontoComisEstado other = (TabDescontoComisEstado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.TabDescontoComisEstado[id=" + id + "]";
    }

}