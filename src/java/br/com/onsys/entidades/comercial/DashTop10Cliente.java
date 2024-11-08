
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
public class DashTop10Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy="dashtipodepedido")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false,length=30)
    private String cliente;    

    @Length(max=20, message="Tamanho máximo do código é 20.")    
    @Column(nullable=false,length=20)
    private String codigo;
    
    @Column(precision=12, scale=2)
    private BigDecimal meta = BigDecimal.ZERO;    
    
    @Column(precision=12, scale=2)
    private BigDecimal realizado = BigDecimal.ZERO;    
    
    @Column(precision=12, scale=2)
    private BigDecimal variacao = BigDecimal.ZERO;    

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuario;


    
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DashTop10Cliente)) {
            return false;
        }
        DashTop10Cliente other = (DashTop10Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.DashTop10Cliente[id=" + id + "]";
    }
}