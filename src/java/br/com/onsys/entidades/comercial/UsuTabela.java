package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Usuario;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table
public class UsuTabela implements Serializable {
    
    @OneToMany(mappedBy="usuTabela")
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;   
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuario;  
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabelaPreco tabelaPreco;  

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
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
        if (!(object instanceof UsuTabela)) {
            return false;
        }
        UsuTabela other = (UsuTabela) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.UsuTabela[id=" + id + "]";
    }
    
}