
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="catcliente")
public class CatCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
 
    //@NotNull(message="O descrção não pode ser nula")
    //@NotEmpty(message="O descrção não pode ser branco")
    //@Length(max=60, message="Tamanho máximo da descrção é 60.")    
    @Column(nullable=false,length=60)
    private String descricao;

    //@NotEmpty(message="O código não pode ser branco")
    //@Length(max=20, message="Tamanho máximo do código é 20.")    
    @Column(nullable=false,length=20)
    private String codigo;
    
    @Column(precision=12, scale=6)
    private BigDecimal descontomax;    
    
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal percfrete;    
    
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal custocontratual;        
    
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal perccomis;        
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String inativo;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;
    
    @Column(length=1)
    private String modificado;    
    
    //@Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  

    @OneToMany(mappedBy="catcliente")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas contaativo;
    
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

    public PlanoContas getContaativo() {
        return contaativo;
    }

    public void setContaativo(PlanoContas contaativo) {
        this.contaativo = contaativo;
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

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public BigDecimal getDescontomax() {
        return descontomax;
    }

    public void setDescontomax(BigDecimal descontomax) {
        this.descontomax = descontomax;
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

    public BigDecimal getPercfrete() {
        return percfrete;
    }

    public void setPercfrete(BigDecimal percfrete) {
        this.percfrete = percfrete;
    }

    public BigDecimal getCustocontratual() {
        return custocontratual;
    }

    public void setCustocontratual(BigDecimal custocontratual) {
        this.custocontratual = custocontratual;
    }
    
    public BigDecimal getPerccomis() {
        return perccomis;
    }

    public void setPerccomis(BigDecimal perccomis) {
        this.perccomis = perccomis;
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
        if (!(object instanceof CatCliente)) {
            return false;
        }
        CatCliente other = (CatCliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.CatCliente[id=" + id + "]";
    }

}