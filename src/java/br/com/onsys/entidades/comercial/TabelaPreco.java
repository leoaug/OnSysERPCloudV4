
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="tabelapreco")
public class TabelaPreco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

//    @NotNull(message="O nome não pode ser nulo")
//    @NotEmpty(message="O nome não pode ser branco")
    @Column(nullable=false,length=60)
    private String descricao;

//    @NotEmpty(message="O código não pode ser branco")
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
    
    @Column()    
    private boolean ipi = true;     
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column(precision=12, scale=2)
    private BigDecimal comissao;
    
    @Column(precision=12, scale=2)
    private BigDecimal comissaoMinima;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  

    @OneToMany(mappedBy="tabelapreco")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDePedido tipodepedido;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

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

    public BigDecimal getComissaoMinima() {
        return comissaoMinima;
    }

    public void setComissaoMinima(BigDecimal comissaoMinima) {
        this.comissaoMinima = comissaoMinima;
    }

    public boolean isIpi() {
        return ipi;
    }

    public void setIpi(boolean ipi) {
        this.ipi = ipi;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
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

    public Date getDatavalfim() {
        return datavalfim;
    }

    public void setDatavalfim(Date datavalfim) {
        this.datavalfim = datavalfim;
    }

    public Date getDatavalini() {
        return datavalini;
    }

    public void setDatavalini(Date datavalini) {
        this.datavalini = datavalini;
    }

    public TipoDePedido getTipodepedido() {
        return tipodepedido;
    }

    public void setTipodepedido(TipoDePedido tipodepedido) {
        this.tipodepedido = tipodepedido;
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
        if (!(object instanceof TabelaPreco)) {
            return false;
        }
        TabelaPreco other = (TabelaPreco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.TabelaPreco[id=" + id + "]";
    }

}