
package br.com.onsys.entidades.seguranca;

import java.io.Serializable;
import javax.persistence.*;

public class Usuariows implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false,length=60)
    private String nome;
    
    @Column(nullable=false,length=60)
    private String apelido;    
    
    @Column(nullable=false)
    private String email;
    
    @Column(nullable=false)
    private String senha;

    @Column()
    private Integer empresaId;
    
    @Column(nullable=false,length=20)
    private String cnpj;    

    @Column(nullable=false,length=30)
    private String nomeFantasia;    
    
    @Column()
    private String usuarioRepresentante;
    
    @Column()
    private String token;
    
    @Column()
    private Integer estabelecimento;
    
    @Column()                              // ALTERAR AS VALIDACOES PARA O CAMPO VerTodosRepres
    private boolean aprovaPDV;    // SE O USUÁRIO TEM ACESSO A TODOS OS REPRESENTANTES 

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Integer getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Integer estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public boolean isAprovaPDV() {
        return aprovaPDV;
    }

    public void setAprovaPDV(boolean aprovaPDV) {
        this.aprovaPDV = aprovaPDV;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuarioRepresentante() {
        return usuarioRepresentante;
    }

    public void setUsuarioRepresentante(String usuarioRepresentante) {
        this.usuarioRepresentante = usuarioRepresentante;
    }
    
}