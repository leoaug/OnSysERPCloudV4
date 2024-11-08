package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table
public class UsuarioComercial implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;    
    
    @OneToMany(mappedBy="usuariocomercial")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuario;    
    
    /*SE O USUÁRIO TEM PERMISSÃO PARA ALTERAR LOTE MULTIPLO NO PEDIDO E/OU NOTA FISCAL */
    @Column()    
    private boolean alteraLoteMultiplo;        
    
    /*SE O USUÁRIO TEM PERMISSÃO PARA ALTERAR PREÇO DE VENDA NO PEDIDO E/OU NOTA FISCAL */
    @Column()    
    private boolean alteraPrecoVenda;        
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

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

    public boolean isAlteraLoteMultiplo() {
        return alteraLoteMultiplo;
    }

    public void setAlteraLoteMultiplo(boolean alteraLoteMultiplo) {
        this.alteraLoteMultiplo = alteraLoteMultiplo;
    }

    public boolean isAlteraPrecoVenda() {
        return alteraPrecoVenda;
    }

    public void setAlteraPrecoVenda(boolean alteraPrecoVenda) {
        this.alteraPrecoVenda = alteraPrecoVenda;
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioComercial)) {
            return false;
        }
        UsuarioComercial other = (UsuarioComercial) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.UsuarioComercial[id=" + id + "]";
    }

}