
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class Motoristas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(length=20)
    private String cpf;
    
    @Column(length=20)
    private String habilitacao;

    @Column(length=20)
    private String apelido;
    
    @Column(length=60)
    private String nome;
    
    @Column(length=60)
    private String eMail;
    
    @Column(length=20)
    private String rg;
    
    @Column(length=10)
    private String  categoria;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date validadeHabilit;

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtPrimeiraHabilit;
    
    @Column(length=20)
    private String orgaoEmissorRg;
    
    @Column(length=20)
    private String tipoCartao;
    
    @Column(length=20)
    private String nrCartao;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtEmissaoRg;     
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String inativo;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;

    @Column(length=1)
    private String modificado;    
    
    @Length(max=200, message="Tamanho máximo da observação crm é 200.")     
    @Column(length=200)
    private String obs;      
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;
    
    @OneToMany(mappedBy="motoristas")
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getValidadeHabilit() {
        return validadeHabilit;
    }

    public void setValidadeHabilit(Date validadeHabilit) {
        this.validadeHabilit = validadeHabilit;
    }

    public Date getDtPrimeiraHabilit() {
        return dtPrimeiraHabilit;
    }

    public void setDtPrimeiraHabilit(Date dtPrimeiraHabilit) {
        this.dtPrimeiraHabilit = dtPrimeiraHabilit;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(String habilitacao) {
        this.habilitacao = habilitacao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getOrgaoEmissorRg() {
        return orgaoEmissorRg;
    }

    public void setOrgaoEmissorRg(String orgaoEmissorRg) {
        this.orgaoEmissorRg = orgaoEmissorRg;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getNrCartao() {
        return nrCartao;
    }

    public void setNrCartao(String nrCartao) {
        this.nrCartao = nrCartao;
    }

    public Date getDtEmissaoRg() {
        return dtEmissaoRg;
    }

    public void setDtEmissaoRg(Date dtEmissaoRg) {
        this.dtEmissaoRg = dtEmissaoRg;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
        if (!(object instanceof Motoristas)) {
            return false;
        }
        Motoristas other = (Motoristas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.Motoristas[id=" + id + "]";
    }

}