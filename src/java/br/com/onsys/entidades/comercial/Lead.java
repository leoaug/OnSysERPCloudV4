/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="lead")
@Cacheable(false)
public class Lead implements Serializable {

    private static final long serialVersionUID = 1L;
    @OneToMany(mappedBy="lead")    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;    

    @Column()
    private String  natureza; /* física ou jurídica */
    
    @Column() 
    private String  cnpjcpf;
    
    @Column()
    private String situacao = "Em edição";     
    
    @Length(max=60, message="Tamanho máximo da razão social na tela de dados gerais é de 60 posições.") 
    @Column()
    private String razaosocial;

    @Length(message="Nome fantasia não pode ser maior que 12 dígitos.")
    @Column(unique=true,length=12)    
    private String nomefantasia;
    
    @Length(message="Tamanho máximo da IE é 20.")    
    @Column()    
    private String  ie;
    
    @Column()    
    private String  obs;
    
    @Length(message="Tamanho máximo do telefone na tela de dados gerais é de 20 posições.")
    @Column(length=20)
    private String fone;
 
    @Length(message="Tamanho máximo do contato na tela de dados gerais é 60 posições.")             
    @Column()
    private String contato;    

    @Length(message="Tamanho máximo do e-mail na tela de dados gerais é de 60 posições.")         
    @Column()
    private String email;    

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datacadastro;

    @Length(message="Tamanho máximo do CEP é 10.")             
    @Column()
    private String cep;

    @Column()
    @Length(message="Tamanho máximo do logradouro é 60.")     
    private String logradouro;
    
    @Column()
    @Length(message="Tamanho máximo do número é 10.")     
    private String numero;    
    
    
    @Length(message="Tamanho máximo da cidade é 40.")
    @Column()
    private String cidade;       

    @Length(message="Tamanho máximo do bairro é 40.")
    @Column()
    private String bairro;

    @Length(message="Tamanho máximo da UF é 2.")         
    @Column()
    private String uf;    

    @Column()
    @Length(message="Tamanho máximo do complemento é 30.")     
    private String complemento;

    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Representante representante;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getCnpjcpf() {
        return cnpjcpf;
    }

    public void setCnpjcpf(String cnpjcpf) {
        this.cnpjcpf = cnpjcpf;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lead other = (Lead) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Lead{" + "id=" + id + '}';
    }
    
}