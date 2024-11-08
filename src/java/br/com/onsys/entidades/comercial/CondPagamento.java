
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.tipos.TipoCondPagamento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="condpagamento")
public class CondPagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

//  @NotNull(message="A descrição não pode ser nula")
//  @NotEmpty(message="A descrição não pode ser branco")
    @Column(nullable=false,length=60)
    private String descricao;

//  @NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;

    @Column()
    private Integer diavencimento;    
    
    @Column()
    private Integer prazomedio;   
    
    @Column()    
    private boolean aprovacao;     

    @Column()
    private Integer dias1;

    @Column()
    private Integer dias2;

    @Column()
    private Integer dias3;

    @Column()
    private Integer dias4;

    @Column()
    private Integer dias5;

    @Column()
    private Integer dias6;

    @Column()
    private Integer dias7;

    @Column()
    private Integer dias8;

    @Column()
    private Integer dias9;

    @Column()
    private Integer dias10;

    @Column()
    private Integer dias11;

    @Column()
    private Integer dias12;
    /*
    @Column()
    private BigDecimal[] parcela;
*/
    @Column(precision=12, scale=6)
    private BigDecimal fatorfinanciamento;

    @Column(precision=12, scale=6)
    private BigDecimal parcela1;

    @Column(precision=12, scale=6)
    private BigDecimal parcela2;

    @Column(precision=12, scale=6)
    private BigDecimal parcela3;

    @Column(precision=12, scale=6)
    private BigDecimal parcela4;

    @Column(precision=12, scale=6)
    private BigDecimal parcela5;

    @Column(precision=12, scale=6)
    private BigDecimal parcela6;

    @Column(precision=12, scale=6)
    private BigDecimal parcela7;

    @Column(precision=12, scale=6)
    private BigDecimal parcela8;

    @Column(precision=12, scale=6)
    private BigDecimal parcela9;

    @Column(precision=12, scale=6)
    private BigDecimal parcela10;

    @Column(precision=12, scale=6)
    private BigDecimal parcela11;

    @Column(precision=12, scale=6)
    private BigDecimal parcela12;
    
    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    @Column(precision=12, scale=6)
    private BigDecimal vlminfaturamento; 
    
    @Column(precision=12, scale=6)
    private BigDecimal vlminparcela; 
    
    @Column(precision=12, scale=6)
    private BigDecimal desconto;     

    @Column(precision=12, scale=6)
    private BigDecimal custofinanceiro;     
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDePedido tipodepedido;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private TipoCondPagamento tipo = TipoCondPagamento.Vendas;    

    @OneToMany(mappedBy="condpagamento")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getFatorfinanciamento() {
        return fatorfinanciamento;
    }

    public void setFatorfinanciamento(BigDecimal fatorfinanciamento) {
        this.fatorfinanciamento = fatorfinanciamento;
    }

    public BigDecimal getCustofinanceiro() {
        return custofinanceiro;
    }

    public void setCustofinanceiro(BigDecimal custofinanceiro) {
        this.custofinanceiro = custofinanceiro;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(boolean aprovacao) {
        this.aprovacao = aprovacao;
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

    public TipoDePedido getTipodepedido() {
        return tipodepedido;
    }

    public void setTipodepedido(TipoDePedido tipodepedido) {
        this.tipodepedido = tipodepedido;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public BigDecimal getVlminfaturamento() {
        return vlminfaturamento;
    }

    public void setVlminfaturamento(BigDecimal vlminfaturamento) {
        this.vlminfaturamento = vlminfaturamento;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDias1() {
        return dias1;
    }

    public void setDias1(Integer dias1) {
        this.dias1 = dias1;
    }

    public Integer getDias10() {
        return dias10;
    }

    public void setDias10(Integer dias10) {
        this.dias10 = dias10;
    }

    public Integer getDias11() {
        return dias11;
    }

    public void setDias11(Integer dias11) {
        this.dias11 = dias11;
    }

    public Integer getDias12() {
        return dias12;
    }

    public void setDias12(Integer dias12) {
        this.dias12 = dias12;
    }

    public Integer getDias2() {
        return dias2;
    }

    public void setDias2(Integer dias2) {
        this.dias2 = dias2;
    }

    public Integer getDias3() {
        return dias3;
    }

    public void setDias3(Integer dias3) {
        this.dias3 = dias3;
    }

    public Integer getDias4() {
        return dias4;
    }

    public void setDias4(Integer dias4) {
        this.dias4 = dias4;
    }

    public Integer getDias5() {
        return dias5;
    }

    public void setDias5(Integer dias5) {
        this.dias5 = dias5;
    }

    public Integer getDias6() {
        return dias6;
    }

    public void setDias6(Integer dias6) {
        this.dias6 = dias6;
    }

    public Integer getDias7() {
        return dias7;
    }

    public void setDias7(Integer dias7) {
        this.dias7 = dias7;
    }

    public Integer getDias8() {
        return dias8;
    }

    public void setDias8(Integer dias8) {
        this.dias8 = dias8;
    }

    public Integer getDias9() {
        return dias9;
    }

    public void setDias9(Integer dias9) {
        this.dias9 = dias9;
    }

    public BigDecimal getParcela1() {
        return parcela1;
    }

    public void setParcela1(BigDecimal parcela1) {
        this.parcela1 = parcela1;
    }

    public BigDecimal getParcela10() {
        return parcela10;
    }

    public void setParcela10(BigDecimal parcela10) {
        this.parcela10 = parcela10;
    }

    public BigDecimal getParcela11() {
        return parcela11;
    }

    public void setParcela11(BigDecimal parcela11) {
        this.parcela11 = parcela11;
    }

    public BigDecimal getParcela12() {
        return parcela12;
    }

    public void setParcela12(BigDecimal parcela12) {
        this.parcela12 = parcela12;
    }

    public BigDecimal getParcela2() {
        return parcela2;
    }

    public void setParcela2(BigDecimal parcela2) {
        this.parcela2 = parcela2;
    }

    public BigDecimal getParcela3() {
        return parcela3;
    }

    public void setParcela3(BigDecimal parcela3) {
        this.parcela3 = parcela3;
    }

    public BigDecimal getParcela4() {
        return parcela4;
    }

    public void setParcela4(BigDecimal parcela4) {
        this.parcela4 = parcela4;
    }

    public BigDecimal getParcela5() {
        return parcela5;
    }

    public void setParcela5(BigDecimal parcela5) {
        this.parcela5 = parcela5;
    }

    public BigDecimal getParcela6() {
        return parcela6;
    }

    public void setParcela6(BigDecimal parcela6) {
        this.parcela6 = parcela6;
    }

    public BigDecimal getParcela7() {
        return parcela7;
    }

    public void setParcela7(BigDecimal parcela7) {
        this.parcela7 = parcela7;
    }

    public BigDecimal getParcela8() {
        return parcela8;
    }

    public void setParcela8(BigDecimal parcela8) {
        this.parcela8 = parcela8;
    }

    public BigDecimal getParcela9() {
        return parcela9;
    }

    public void setParcela9(BigDecimal parcela9) {
        this.parcela9 = parcela9;
    }

    public Integer getPrazomedio() {
        return prazomedio;
    }

    public void setPrazomedio(Integer prazomedio) {
        this.prazomedio = prazomedio;
    }

    public Integer getDiavencimento() {
        return diavencimento;
    }

    public void setDiavencimento(Integer diavencimento) {
        this.diavencimento = diavencimento;
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

    public TipoCondPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoCondPagamento tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getVlminparcela() {
        return vlminparcela;
    }

    public void setVlminparcela(BigDecimal vlminparcela) {
        this.vlminparcela = vlminparcela;
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
        if (!(object instanceof CondPagamento)) {
            return false;
        }
        CondPagamento other = (CondPagamento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.CondPagamento[id=" + id + "]";
    }

}