
package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.tipos.TipoCondPagamento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class FormaDePagamento implements Serializable {
    private static final long serialVersionUID = 19L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false,length=60)
    private String descricao;

    @Column(nullable=false,length=20)
    private String codigo;

    @Column()
    private int diasParaCompensar;    
    
    @Column(precision=12, scale=6)
    private double taxa;

    @Column(precision=12, scale=6)
    private double taxaAntecipacao;
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    @Column(precision=12, scale=6)
    private BigDecimal valorMinimoDeFaturamento; 
    
    @Column(precision=12, scale=6)
    private BigDecimal descontoMaximo;     

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private TipoCondPagamento tipo = TipoCondPagamento.Vendas;    

    @OneToMany(mappedBy="formadepagamento")

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public int getDiasParaCompensar() {
        return diasParaCompensar;
    }

    public void setDiasParaCompensar(int diasParaCompensar) {
        this.diasParaCompensar = diasParaCompensar;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxaAntecipacao() {
        return taxaAntecipacao;
    }

    public void setTaxaAntecipacao(double taxaAntecipacao) {
        this.taxaAntecipacao = taxaAntecipacao;
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

    public BigDecimal getValorMinimoDeFaturamento() {
        return valorMinimoDeFaturamento;
    }

    public void setValorMinimoDeFaturamento(BigDecimal valorMinimoDeFaturamento) {
        this.valorMinimoDeFaturamento = valorMinimoDeFaturamento;
    }

    public BigDecimal getDescontoMaximo() {
        return descontoMaximo;
    }

    public void setDescontoMaximo(BigDecimal descontoMaximo) {
        this.descontoMaximo = descontoMaximo;
    }

    public TipoCondPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoCondPagamento tipo) {
        this.tipo = tipo;
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
        if (!(object instanceof FormaDePagamento)) {
            return false;
        }
        FormaDePagamento other = (FormaDePagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.financeiro.FormaDePagamento[id=" + id + "]";
    }

}