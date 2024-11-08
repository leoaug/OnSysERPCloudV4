
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="regiao")
public class Regiao implements Serializable {
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
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String inativo;

    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal percfrete;    
    
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal custocontratual;        
    
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal perccomis;        
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;
    
    @Column(length=1)
    private String modificado;    
    
    @Column(precision=12, scale=6)
    private BigDecimal vlminpedido; 
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  

    @OneToMany(mappedBy="regiao")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

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

    public BigDecimal getCustocontratual() {
        return custocontratual;
    }

    public void setCustocontratual(BigDecimal custocontratual) {
        this.custocontratual = custocontratual;
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

    public BigDecimal getPercfrete() {
        return percfrete;
    }

    public void setPercfrete(BigDecimal percfrete) {
        this.percfrete = percfrete;
    }

    public BigDecimal getPerccomis() {
        return perccomis;
    }

    public void setPerccomis(BigDecimal perccomis) {
        this.perccomis = perccomis;
    }
    
    public String getDeletado() {
        return deletado;
    }

    public void setDeletado(String deletado) {
        this.deletado = deletado;
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

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getVlminpedido() {
        return vlminpedido;
    }

    public void setVlminpedido(BigDecimal vlminpedido) {
        this.vlminpedido = vlminpedido;
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
        if (!(object instanceof Regiao)) {
            return false;
        }
        Regiao other = (Regiao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.Regiao[id=" + id + "]";
    }

}