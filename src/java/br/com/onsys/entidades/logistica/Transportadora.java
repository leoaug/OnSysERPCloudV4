
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Cep;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Email;

@Entity
@Table
public class Transportadora implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    //@NotNull(message="A razão social não pode ser nula")
    //@NotEmpty(message="A razão social não pode ser branco")
    @Column(nullable=false,unique=true,length=60)
    private String razaosocial;

    //@NotNull(message="O código não pode ser nulo")
    //@NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;
    
    //@NotNull(message="O nome fantasia não pode ser nula")
    //@NotEmpty(message="O nome fantasia não pode ser branco")
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
    private String  uf;
    
    @Column(length=20)
    private String im;
    
    @Column(length=10)
    private String numero;    
    
    @Column(length=20)
    private String complemento;
    
    @Column(length=10)
    private String suframa;
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String inativo;
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInativo;

    @Column(length=1)
    private String modificado;    
    
    //@Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;      
    
    @Column(unique=true,length=30)
    private String usuarioAPI;
    
    @Column(unique=true,length=30)
    private String senhaAPI;
    
    @Column(unique=true,length=100)
    private String urlAPI;

    @Column(unique=true,length=100)
    private String urlRastreio;    
    
    @Column(unique=true,length=15)
    private String cepInicial = "00.000-000";

    @Column(unique=true,length=15)
    private String cepFinal = "99.999-999";

    @Column()
    private int volumeInicial = 0;
    
    @Column()
    private int volumeFinal = 9999;
    
    @Column(precision=12, scale=6)
    private BigDecimal pesoInicial = BigDecimal.ZERO;;  
    
    @Column(precision=12, scale=6)
    private BigDecimal pesoFinal = BigDecimal.valueOf(9999.99);
    
    @Column(precision=12, scale=6)
    private BigDecimal alturaInicial = BigDecimal.ZERO;;  
    
    @Column(precision=12, scale=6)
    private BigDecimal alturaFinal = BigDecimal.valueOf(9999.99);
    
    @Column(precision=12, scale=6)
    private BigDecimal valorInicial = BigDecimal.ZERO;;  
    
    @Column(precision=12, scale=6)
    private BigDecimal valorFinal = BigDecimal.valueOf(9999.99);

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    //@Valid
    private Cep cep;
    
    @Column(length=20)
    private String fone;
    
    @Column(length=20)
    private String Fax;    
    
    @Email(message="E-mail inválido")
    @Column(length=60)
    private String email;
    
    @Column(precision=12, scale=6)
    private BigDecimal percfrete;  /* % de frete padrão da transportadora */ 
    
    @OneToMany(mappedBy="transportadora")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public String getFax() {
        return Fax;
    }

    public BigDecimal getPercfrete() {
        return percfrete;
    }

    public void setPercfrete(BigDecimal percfrete) {
        this.percfrete = percfrete;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public Date getDataInativo() {
        return dataInativo;
    }

    public void setDataInativo(Date dataInativo) {
        this.dataInativo = dataInativo;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
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

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuarioAPI() {
        return usuarioAPI;
    }

    public void setUsuarioAPI(String usuarioAPI) {
        this.usuarioAPI = usuarioAPI;
    }

    public String getSenhaAPI() {
        return senhaAPI;
    }

    public void setSenhaAPI(String senhaAPI) {
        this.senhaAPI = senhaAPI;
    }

    public String getUrlAPI() {
        return urlAPI;
    }

    public void setUrlAPI(String urlAPI) {
        this.urlAPI = urlAPI;
    }

    public String getCepInicial() {
        return cepInicial;
    }

    public void setCepInicial(String cepInicial) {
        this.cepInicial = cepInicial;
    }

    public String getCepFinal() {
        return cepFinal;
    }

    public void setCepFinal(String cepFinal) {
        this.cepFinal = cepFinal;
    }

    public int getVolumeInicial() {
        return volumeInicial;
    }

    public void setVolumeInicial(int volumeInicial) {
        this.volumeInicial = volumeInicial;
    }

    public int getVolumeFinal() {
        return volumeFinal;
    }

    public void setVolumeFinal(int volumeFinal) {
        this.volumeFinal = volumeFinal;
    }

    public BigDecimal getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(BigDecimal pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public BigDecimal getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(BigDecimal pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public BigDecimal getAlturaInicial() {
        return alturaInicial;
    }

    public void setAlturaInicial(BigDecimal alturaInicial) {
        this.alturaInicial = alturaInicial;
    }

    public BigDecimal getAlturaFinal() {
        return alturaFinal;
    }

    public void setAlturaFinal(BigDecimal alturaFinal) {
        this.alturaFinal = alturaFinal;
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(BigDecimal valorInicial) {
        this.valorInicial = valorInicial;
    }

    public BigDecimal getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(BigDecimal valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getUrlRastreio() {
        return urlRastreio;
    }

    public void setUrlRastreio(String urlRastreio) {
        this.urlRastreio = urlRastreio;
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
        if (!(object instanceof Transportadora)) {
            return false;
        }
        Transportadora other = (Transportadora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return id.toString();
    }

}