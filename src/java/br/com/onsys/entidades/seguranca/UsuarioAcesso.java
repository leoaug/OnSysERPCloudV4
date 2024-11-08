
package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class UsuarioAcesso implements Serializable {
    
    @OneToMany(mappedBy="usuarioAcesso")
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataUltimoAcesso;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresaAcessada; // ultima empresa que o usuário logou
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuario;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    public void setDataUltimoAcesso(Date dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    public Empresa getEmpresaAcessada() {
        return empresaAcessada;
    }

    public void setEmpresaAcessada(Empresa empresaAcessada) {
        this.empresaAcessada = empresaAcessada;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        if (!(object instanceof UsuarioAcesso)) {
            return false;
        }
        UsuarioAcesso other = (UsuarioAcesso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.seguranca.UsuarioAcesso[id=" + id + "]";
    }

}