
package br.com.onsys.entidades.controladoria;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
public class CentroCusto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

//    @NotNull(message="O descrição não pode ser nula")
//    @NotEmpty(message="O descrição não pode ser branco")
//    @Length(max=60, message="Tamanho máximo da descrição é 60.")    
    @Column(nullable=false,length=60)
    private String descricao;

//    @NotEmpty(message="O código não pode ser branco")
//    @Length(max=20, message="Tamanho máximo do código é 20.")    
    @Column(nullable=false,length=20)
    private String codigo;
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String inativo;

    @Column(length=60)
    private String emailDevolucao;
      
    @Column()    
    private boolean ocorrenciaDevolucao;    

    @Column(length=60)
    private String emailSAC;

    @Column()    
    private boolean ocorrenciaSAC;    

    @Column(length=60)
    private String emailEcommerce;

    @Column()    
    private boolean ocorrenciaEcommerce;  
    
    @Column()    
    private boolean ocorrenciaLogistica;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;
    
    @Column(length=1)
    private String modificado;        

    @OneToMany(mappedBy="centrocusto")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
//    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;          

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmailEcommerce() {
        return emailEcommerce;
    }

    public void setEmailEcommerce(String emailEcommerce) {
        this.emailEcommerce = emailEcommerce;
    }

    public boolean isOcorrenciaEcommerce() {
        return ocorrenciaEcommerce;
    }

    public void setOcorrenciaEcommerce(boolean ocorrenciaEcommerce) {
        this.ocorrenciaEcommerce = ocorrenciaEcommerce;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmailDevolucao() {
        return emailDevolucao;
    }

    public void setEmailDevolucao(String emailDevolucao) {
        this.emailDevolucao = emailDevolucao;
    }

    public boolean isOcorrenciaDevolucao() {
        return ocorrenciaDevolucao;
    }

    public void setOcorrenciaDevolucao(boolean ocorrenciaDevolucao) {
        this.ocorrenciaDevolucao = ocorrenciaDevolucao;
    }

    public String getEmailSAC() {
        return emailSAC;
    }

    public void setEmailSAC(String emailSAC) {
        this.emailSAC = emailSAC;
    }

    public boolean isOcorrenciaSAC() {
        return ocorrenciaSAC;
    }

    public void setOcorrenciaSAC(boolean ocorrenciaSAC) {
        this.ocorrenciaSAC = ocorrenciaSAC;
    }

    public boolean isOcorrenciaLogistica() {
        return ocorrenciaLogistica;
    }

    public void setOcorrenciaLogistica(boolean ocorrenciaLogistica) {
        this.ocorrenciaLogistica = ocorrenciaLogistica;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
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
        if (!(object instanceof CentroCusto)) {
            return false;
        }
        CentroCusto other = (CentroCusto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.controladoria.CentroCusto[id=" + id + "]";
    }

}