package br.com.onsys.entidades.financeiro;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.seguranca.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class Portador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    //@NotNull(message="O nome não pode ser nulo.")
    //@NotEmpty(message="O nome não pode ser branco.")
    //@Length(max=60, message="Tamanho máximo da descrição é 60.")
    @Column(nullable=false,length=60)
    private String descricao;

    //@NotEmpty(message="O código não pode ser branco")
    //@Length(max=20, message="Tamanho máximo da descrição é 20.")
    @Column(nullable=false,length=20)
    private String codigo;
    
//    @NotEmpty()
    @Column(length=20)
    private String codigocedente;
    
//    @NotEmpty()
    @Column(length=3)
    private String digitocedente;

    @Column(length=10)
    private String carteira;    

    @Column(length=10)
    private String especiedoc;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private BcoFebraban banco;    

    @Column(length=10)
    private String agencia;

    @Column(length=20)
    private String conta;

    @Column(precision=12, scale=6)
    private BigDecimal saldo = BigDecimal.ZERO;

    @OneToMany(mappedBy="portador")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario operadorpdv;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas contaativo;    

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;
    
    @Column(length=1)
    private String deletado;    
    
    @Column(length=60)
    private String chavePix;    
    
    @Column(length=10)
    private String statusPDV = "Fechado";    
    
    @Column(length=1)
    private String modificado;    
    
    // Registrada(1,"Registrada"),Simples(2,"Simples"),Descontada(3,"Descontada"),PDV(4,"PDV"),NBanco(5,"Não bancário");
    @Column(length=20)
    private String modalidade = "Nao bancario";    
    
    //@Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Moeda moeda;
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public BcoFebraban getBanco() {
        return banco;
    }

    public void setBanco(BcoFebraban banco) {
        this.banco = banco;
    }

    public String getStatusPDV() {
        return statusPDV;
    }

    public void setStatusPDV(String statusPDV) {
        this.statusPDV = statusPDV;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public Usuario getOperadorpdv() {
        return operadorpdv;
    }

    public void setOperadorpdv(Usuario operadorpdv) {
        this.operadorpdv = operadorpdv;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
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

    public String getCarteira() {
        return carteira;
    }

    public void setCarteira(String carteira) {
        this.carteira = carteira;
    }

    public String getEspeciedoc() {
        return especiedoc;
    }

    public void setEspeciedoc(String especiedoc) {
        this.especiedoc = especiedoc;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getCodigocedente() {
        return codigocedente;
    }

    public void setCodigocedente(String codigocedente) {
        this.codigocedente = codigocedente;
    }

    public String getDigitocedente() {
        return digitocedente;
    }

    public void setDigitocedente(String digitocedente) {
        this.digitocedente = digitocedente;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
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
        if (!(object instanceof Portador)) {
            return false;
        }
        Portador other = (Portador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.financeiro.Portador[id=" + id + "]";
    }

}