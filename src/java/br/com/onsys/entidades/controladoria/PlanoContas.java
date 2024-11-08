package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.tipos.GrupoContaContabil;
import br.com.onsys.entidades.tipos.NaturezaContaContabil;
import br.com.onsys.entidades.tipos.TipoConta;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class PlanoContas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false,length=60)
    private String descricao;

    @Column(nullable=false,length=20)
    private String conta;
    
    @Column()
    private Integer reduzida;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private GrupoContaContabil grupo = GrupoContaContabil.Ativo;    

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private NaturezaContaContabil natureza = NaturezaContaContabil.Credora;    

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private TipoConta tipo = TipoConta.Sintetica;    

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataaltera;
    
    @Column(precision=12, scale=6)
    private BigDecimal valorOrcado = BigDecimal.ZERO;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datacadastro;
    
    @Column()    
    private boolean totalizadora;
    
    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    //@Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    @OneToMany(mappedBy="conta")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas contapai;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas contatotalizadora;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public BigDecimal getValorOrcado() {
        return valorOrcado;
    }

    public void setValorOrcado(BigDecimal valorOrcado) {
        this.valorOrcado = valorOrcado;
    }

    public Integer getReduzida() {
        return reduzida;
    }

    public void setReduzida(Integer reduzida) {
        this.reduzida = reduzida;
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

    public GrupoContaContabil getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoContaContabil grupo) {
        this.grupo = grupo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NaturezaContaContabil getNatureza() {
        return natureza;
    }

    public void setNatureza(NaturezaContaContabil natureza) {
        this.natureza = natureza;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    public PlanoContas getContapai() {
        return contapai;
    }

    public void setContapai(PlanoContas contapai) {
        this.contapai = contapai;
    }

    public boolean isTotalizadora() {
        return totalizadora;
    }

    public void setTotalizadora(boolean totalizadora) {
        this.totalizadora = totalizadora;
    }

    public Date getDataaltera() {
        return dataaltera;
    }

    public PlanoContas getContatotalizadora() {
        return contatotalizadora;
    }

    public void setContatotalizadora(PlanoContas contatotalizadora) {
        this.contatotalizadora = contatotalizadora;
    }
    
    public void setDataaltera(Date dataaltera) {
        this.dataaltera = dataaltera;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlanoContas)) {
            return false;
        }
        PlanoContas other = (PlanoContas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        //return "br.com.onsys.entidades.controladoria.PlanoContas[id=" + id + "]";
        return id.toString();
    }

}