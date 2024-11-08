/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.comercial;

import java.io.Serializable;
import javax.persistence.*;

public class WS_Lead implements Serializable {

    private static final long serialVersionUID = 10L;
 
    @Id
    @Column(name="id")
    private Integer id;    

    @Column()
    private String  natureza; /* física ou jurídica */
    
    @Column() 
    private String  cnpjcpf;
    
    @Column()
    private String situacao = "Em edição";     
    
    @Column()
    private String razaoSocial;

    @Column(unique=true,length=12)    
    private String nomeFantasia;
    
    @Column()    
    private String  ie;
    
    @Column()    
    private String  obs;
    
    @Column(length=20)
    private String fone;
 
    @Column()
    private String contato;    

    @Column()
    private String email;    

    @Column()
    private String cep;

    @Column()
    private String logradouro;
    
    @Column()
    private String numero;    
    
    @Column()
    private String cidade;       

    @Column()
    private String bairro;

    @Column()
    private String uf;    

    @Column()
    private String complemento;
    
    private Integer empresaId;

    private Integer estabelecimento;    
    
    private Integer representante;    

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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public Integer getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Integer estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Integer getRepresentante() {
        return representante;
    }

    public void setRepresentante(Integer representante) {
        this.representante = representante;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
}