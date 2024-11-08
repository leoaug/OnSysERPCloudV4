
package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.tipos.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

public class Participantews implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    
    private String razaosocial;
    
    private String codigo;
    
    private String nomefantasia;

    @Column(length=18)
    private String  cnpjcpf;    
    
    @Column(length=20)
    private String  rg;    
    
    @Column(length=1)
    private String  natureza; /* física ou jurídica */
    
    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private TipoParticipante tipo = TipoParticipante.Cliente;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=20)
    private SitCreditoParticipante situacaocredito = SitCreditoParticipante.Normal;    

    @Column(length=100)
    private String logradouro;
    
    @Column(length=20)
    private String fone;
    
    @Column(length=20)
    private String suframa;
    
    @Column(length=30)
    private String bairro;
    
    @Column(length=30)
    private String municipio;    

    @Column(length=20)
    private String ie;

    @Column(length=20)
    private String numero;
    
    @Column(length=30)
    private String complemento;
    
    @Column(length=2)
    private String uf;    
    
    @Column(length=20)
    private String Fax;    
    
    @Column(length=8)
    private String CEP;    
    
    @Column(length=3)
    private String TipoFrete;        
   
    @Column(length=3)
    private String  categoria;      
    
    @Column(precision=12, scale=2)
    private BigDecimal limitecredito;    
    
    @Email(message="E-mail inválido")
    @Column(length=60)
    private String email;    
    
    @Column
    private boolean recebeEmail = true;
        
    @Length(max=60, message="Tamanho máximo da url do site é 60.")     
    @Column(length=60)
    private String site;

    @Enumerated(EnumType.STRING)
    @Column(length=5)
    private TipoSimNao maladireta = TipoSimNao.Não;   

    @Enumerated(EnumType.STRING)
    @Column(length=10)
    private ConceitoCRM conceitocrm = ConceitoCRM.Regular;   
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ultimavisita;
    
    @Column(nullable=false)
    @NotNull(message="A data de cadatro não pode ser nula")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datacadastro;
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obsparticipante;  

    @Length(max=200, message="Tamanho máximo da observação crm é 200.")     
    @Column(length=200)
    private String obsCRM;  
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  

    @OneToMany(mappedBy="participantews")

    private Integer matriz_id;

    private Integer microregiao_id;

    private Integer representante_id;

    private Integer tabelapreco_id;

    private Integer empresa_id;

    private Integer estabelecimento_id;

    private Integer subcatcliente_id; // CANAL DE VENDAS NO MOBILE

    private Integer catcliente_id;

    private Integer condpagamento_id;
    
    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public TipoParticipante getTipo() {
        return tipo;
    }

    public void setTipo(TipoParticipante tipo) {
        this.tipo = tipo;
    }    

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public String getObsparticipante() {
        return obsparticipante;
    }

    public void setObsparticipante(String obsparticipante) {
        this.obsparticipante = obsparticipante;
    }

    public ConceitoCRM getConceitocrm() {
        return conceitocrm;
    }

    public void setConceitocrm(ConceitoCRM conceitocrm) {
        this.conceitocrm = conceitocrm;
    }

    public TipoSimNao getMaladireta() {
        return maladireta;
    }

    public void setMaladireta(TipoSimNao maladireta) {
        this.maladireta = maladireta;
    }

    public String getObsCRM() {
        return obsCRM;
    }

    public void setObsCRM(String obsCRM) {
        this.obsCRM = obsCRM;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Date getUltimavisita() {
        return ultimavisita;
    }

    public void setUltimavisita(Date ultimavisita) {
        this.ultimavisita = ultimavisita;
    }

    public BigDecimal getLimitecredito() {
        return limitecredito;
    }

    public void setLimitecredito(BigDecimal limitecredito) {
        this.limitecredito = limitecredito;
    }

    public SitCreditoParticipante getSituacaocredito() {
        return situacaocredito;
    }

    public void setSituacaocredito(SitCreditoParticipante situacaocredito) {
        this.situacaocredito = situacaocredito;
    }

    public String getTipoFrete() {
        return TipoFrete;
    }

    public void setTipoFrete(String TipoFrete) {
        this.TipoFrete = TipoFrete;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCnpjcpf() {
        return cnpjcpf;
    }

    public void setCnpjcpf(String cnpjcpf) {
        this.cnpjcpf = cnpjcpf;
    }

    public boolean isRecebeEmail() {
        return recebeEmail;
    }

    public void setRecebeEmail(boolean recebeEmail) {
        this.recebeEmail = recebeEmail;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Integer getMatriz_id() {
        return matriz_id;
    }

    public void setMatriz_id(Integer matriz_id) {
        this.matriz_id = matriz_id;
    }

    public Integer getMicroregiao_id() {
        return microregiao_id;
    }

    public void setMicroregiao_id(Integer microregiao_id) {
        this.microregiao_id = microregiao_id;
    }

    public Integer getRepresentante_id() {
        return representante_id;
    }

    public void setRepresentante_id(Integer representante_id) {
        this.representante_id = representante_id;
    }

    public Integer getTabelapreco_id() {
        return tabelapreco_id;
    }

    public void setTabelapreco_id(Integer tabelapreco_id) {
        this.tabelapreco_id = tabelapreco_id;
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

    public Integer getSubcatcliente_id() {
        return subcatcliente_id;
    }

    public void setSubcatcliente_id(Integer subcatcliente_id) {
        this.subcatcliente_id = subcatcliente_id;
    }

    public Integer getCatcliente_id() {
        return catcliente_id;
    }

    public void setCatcliente_id(Integer catcliente_id) {
        this.catcliente_id = catcliente_id;
    }

    public Integer getCondpagamento_id() {
        return condpagamento_id;
    }

    public void setCondpagamento_id(Integer condpagamento_id) {
        this.condpagamento_id = condpagamento_id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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
        if (!(object instanceof Participantews)) {
            return false;
        }
        Participantews other = (Participantews) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.basico.Participantews[id=" + id + "]";
    }

}