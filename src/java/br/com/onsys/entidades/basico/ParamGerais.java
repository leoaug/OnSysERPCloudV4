
package br.com.onsys.entidades.basico;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="paramgerais")
public class ParamGerais implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date periniaberto;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date perfimaberto;

    @Column()
    private boolean usacodigobarras;
    
    @Column()
    private boolean validacep;
    
    @Column(length=20)
    private String versao;    
    
    @Column(length=20)
    private String execucaoOrcamentaria;  // indica se utiliza execução orcamentaria
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column(length=1)
    private String cadastroRapidoCliente;    
    
    @Column(length=1)
    private String cadastroRapidoFornecedor;    
    
    @Column(length=1)
    private String cadastroRapidoItem;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  

    @OneToMany(mappedBy="paramgerais")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public String getCadastroRapidoCliente() {
        return cadastroRapidoCliente;
    }

    public void setCadastroRapidoCliente(String cadastroRapidoCliente) {
        this.cadastroRapidoCliente = cadastroRapidoCliente;
    }

    public String getCadastroRapidoFornecedor() {
        return cadastroRapidoFornecedor;
    }

    public void setCadastroRapidoFornecedor(String cadastroRapidoFornecedor) {
        this.cadastroRapidoFornecedor = cadastroRapidoFornecedor;
    }

    public String getCadastroRapidoItem() {
        return cadastroRapidoItem;
    }

    public void setCadastroRapidoItem(String cadastroRapidoItem) {
        this.cadastroRapidoItem = cadastroRapidoItem;
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

    public String getExecucaoOrcamentaria() {
        return execucaoOrcamentaria;
    }

    public void setExecucaoOrcamentaria(String execucaoOrcamentaria) {
        this.execucaoOrcamentaria = execucaoOrcamentaria;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPeriniaberto() {
        return periniaberto;
    }

    public void setPeriniaberto(Date periniaberto) {
        this.periniaberto = periniaberto;
    }

    public Date getPerfimaberto() {
        return perfimaberto;
    }

    public void setPerfimaberto(Date perfimaberto) {
        this.perfimaberto = perfimaberto;
    }

    public boolean isUsacodigobarras() {
        return usacodigobarras;
    }

    public void setUsacodigobarras(boolean usacodigobarras) {
        this.usacodigobarras = usacodigobarras;
    }

    public boolean isValidacep() {
        return validacep;
    }

    public void setValidacep(boolean validacep) {
        this.validacep = validacep;
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
        if (!(object instanceof ParamGerais)) {
            return false;
        }
        ParamGerais other = (ParamGerais) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.basico.ParamGerais[id=" + id + "]";
    }

}