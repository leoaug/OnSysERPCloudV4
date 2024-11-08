
package br.com.onsys.entidades.basico;
//
import br.com.onsys.entidades.controladoria.PlanoContas;
import br.com.onsys.entidades.tipos.TipoAtivEFD;
import br.com.onsys.entidades.tipos.TipoNatPJ;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="estabelecimento")
public class Estabelecimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    //@NotNull(message="A razão social não  pode ser nula")       
    @Column(nullable=false,length=60)
    private String descricao;
    
    //@NotNull(message="A razão social não  pode ser nula")       
    @Column(nullable=false,length=60)
    private String codCEP;    

    //@NotNull(message="O código não pode ser  nulo")
    //@NotEmpty(message="O cádigo não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;

    @Column(length=5)
    private String lecd;

    @Column(length=7)
    private String cnae;

    //@NotNull(message="O nome fantasia não pode ser nula")
    //@NotEmpty(message="O nome fantasia não pode ser branco")
    @Column(nullable=false,unique=true,length=30)
    private String nomefantasia;

    //@NotNull(message="CNPJ não pode ser nulo")    
    @Column(nullable=false,length=18)
    private String  cnpj;
    
    @Column()
    private boolean consolidaResultado;    

    @Column(length=20)
    private String  ie;

    @Column(length=20)
    private String im;

    @Column(length=1)
    private String  indsitesp;

    @Column(length=20)
    private String  nire;

    @Column(length=10)
    private String numero;

    @Column(length=20)
    private String complemento;
    
    @Column(nullable=false,length=60)
    private String logradouro;    
    
    @Column(nullable=false,length=45)
    private String bairro;    
    
    @Column(nullable=false,length=45)
    private String municipio;    
    
    @Column(nullable=false,length=10)
    private String uf;    

    @Column(length=10)
    private String suframa;

    @Column(length=5)
    private String lefd;    

    @Column(length=2)
    private String perfilefd;
    
    @Column(length=1)
    private String  ambientenfe; /* H-homologacao ou P-producao */
    
    @Column(length=20)
    private TipoNatPJ indnatpj = TipoNatPJ.Empresa; /* indicador da natureza da pessoa juridica */ 
    
    @Column(length=20)    
    private TipoAtivEFD ativefd = TipoAtivEFD.Industria; /* indicador de tipo de atividade preponderante */ 

    //@NotNull(message="O CEP não pode ser nulo")    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    //@Valid
    private Cep cep;

    @Column(length=20)
    private String fone;

    @Column(length=20)
    private String fax;

    @Email(message="E-mail inválido")
    @Column(length=60)
    private String email;

    @Column(length=5)
    private String lnfe; /*layout da NF-E */
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  

    @OneToMany(mappedBy="estabelecimento")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas receitas;        

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas fornecedores;        
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas IPIRecuperar;        

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas ICMSRecuperar;        
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas IPIRecolher;        

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private PlanoContas ICMSRecolher;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    //@Valid
    private Empresa empresa;

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public Date getDatainativo() {
        return datainativo;
    }

    public void setDatainativo(Date datainativo) {
        this.datainativo = datainativo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
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

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public boolean isConsolidaResultado() {
        return consolidaResultado;
    }

    public void setConsolidaResultado(boolean consolidaResultado) {
        this.consolidaResultado = consolidaResultado;
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

    public String getIndsitesp() {
        return indsitesp;
    }

    public void setIndsitesp(String indsitesp) {
        this.indsitesp = indsitesp;
    }

    public String getLecd() {
        return lecd;
    }

    public void setLecd(String lecd) {
        this.lecd = lecd;
    }

    public String getLefd() {
        return lefd;
    }

    public void setLefd(String lefd) {
        this.lefd = lefd;
    }

    public String getLnfe() {
        return lnfe;
    }

    public void setLnfe(String lnfe) {
        this.lnfe = lnfe;
    }

    public String getNire() {
        return nire;
    }

    public void setNire(String nire) {
        this.nire = nire;
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

    public String getPerfilefd() {
        return perfilefd;
    }

    public void setPerfilefd(String perfilefd) {
        this.perfilefd = perfilefd;
    }

    public String getSuframa() {
        return suframa;
    }

    public void setSuframa(String suframa) {
        this.suframa = suframa;
    }

    public TipoAtivEFD getAtivefd() {
        return ativefd;
    }

    public void setAtivefd(TipoAtivEFD ativefd) {
        this.ativefd = ativefd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoNatPJ getIndnatpj() {
        return indnatpj;
    }

    public void setIndnatpj(TipoNatPJ indnatpj) {
        this.indnatpj = indnatpj;
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

    public String getAmbientenfe() {
        return ambientenfe;
    }

    public void setAmbientenfe(String ambientenfe) {
        this.ambientenfe = ambientenfe;
    }

    public PlanoContas getReceitas() {
        return receitas;
    }

    public void setReceitas(PlanoContas receitas) {
        this.receitas = receitas;
    }

    public PlanoContas getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(PlanoContas fornecedores) {
        this.fornecedores = fornecedores;
    }

    public PlanoContas getIPIRecuperar() {
        return IPIRecuperar;
    }

    public void setIPIRecuperar(PlanoContas IPIRecuperar) {
        this.IPIRecuperar = IPIRecuperar;
    }

    public String getCodCEP() {
        return codCEP;
    }

    public void setCodCEP(String codCEP) {
        this.codCEP = codCEP;
    }

    public PlanoContas getICMSRecuperar() {
        return ICMSRecuperar;
    }

    public void setICMSRecuperar(PlanoContas ICMSRecuperar) {
        this.ICMSRecuperar = ICMSRecuperar;
    }

    public PlanoContas getIPIRecolher() {
        return IPIRecolher;
    }

    public void setIPIRecolher(PlanoContas IPIRecolher) {
        this.IPIRecolher = IPIRecolher;
    }

    public PlanoContas getICMSRecolher() {
        return ICMSRecolher;
    }

    public void setICMSRecolher(PlanoContas ICMSRecolher) {
        this.ICMSRecolher = ICMSRecolher;
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
        if (!(object instanceof Estabelecimento)) {
            return false;
        }
        Estabelecimento other = (Estabelecimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.basico.Estabelecimento[id=" + id + "]";
    }

}