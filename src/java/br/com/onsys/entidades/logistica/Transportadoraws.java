
package br.com.onsys.entidades.logistica;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Transportadoraws implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @NotNull(message="A razão social não pode ser nula")
    @NotEmpty(message="A razão social não pode ser branco")
    @Column(nullable=false,unique=true,length=60)
    private String razaosocial;

    @NotNull(message="O código não pode ser nulo")
    @NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;
    
    @NotNull(message="O nome fantasia não pode ser nula")
    @NotEmpty(message="O nome fantasia não pode ser branco")
    @Column(unique=true,length=30)
    private String nomefantasia;
    
    @Column(length=18)
    private String  cnpj;
    
    @Column(length=14) 
    private String  cpf;
    
    @Column(length=10)
    private String  tipo;
    
    @Column(length=20)
    private String  ie;
    
    @Column(length=20)
    private String im;
    
    @Column(length=10)
    private String numero;    
    
    @Column(length=20)
    private String complemento;
    
    @Column(length=10)
    private String suframa;
    
    private Integer cep_id;
    
    @Column(length=20)
    private String fone;
    
    @Column(length=20)
    private String Fax;    
    
    @Email(message="E-mail inválido")
    @Column(length=60)
    private String email;
    
    @Column(precision=12, scale=6)
    private BigDecimal percfrete;  /* % de frete padrão da transportadora */ 
    
    @OneToMany(mappedBy="transportadoraws")

    private Integer empresa_id;

    private Integer estabelecimento_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public Integer getCep_id() {
        return cep_id;
    }

    public void setCep_id(Integer cep_id) {
        this.cep_id = cep_id;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getPercfrete() {
        return percfrete;
    }

    public void setPercfrete(BigDecimal percfrete) {
        this.percfrete = percfrete;
    }

    public Integer getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(Integer empresa_id) {
        this.empresa_id = empresa_id;
    }

    public Integer getEstabelecimento_id() {
        return estabelecimento_id;
    }

    public void setEstabelecimento_id(Integer estabelecimento_id) {
        this.estabelecimento_id = estabelecimento_id;
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
        if (!(object instanceof Transportadoraws)) {
            return false;
        }
        Transportadoraws other = (Transportadoraws) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.Transportadoraws[id=" + id + "]";
    }

}