package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;

import br.com.onsys.entidades.controladoria.CentroCusto;
import br.com.onsys.entidades.controladoria.UnidNegocio;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    
    @OneToMany(mappedBy="usuario")
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    //@NotNull(message="O nome não pode ser nulo")
    //@NotEmpty(message="O nome não pode ser branco")
    @Column(nullable=false,length=60)
    private String nome;

    //@NotNull(message="O apelido não pode ser nulo")
    //@NotEmpty(message="O apelido não pode ser branco")
    @Column(length=30)
    private String apelido;
    
    @Column(length=200)
    private String mensagemLogin;    
    
    @Column(length=200)
    private String token;    

    @Column(length=16)
    private String  senha;
    
    @Column(length=30)
    private String idiomaPadrao;
    
    @Column(length=3)
    private String prefixoPedido;        

//    @Enumerated(EnumType.STRING)
//    @Column(nullable=false, length=20)
//    private TipoUsuario tipo = TipoUsuario.Consultor;

    @Column(nullable=false,unique=true,length=60)
    private String tipo;
    
    @Email(message="E-mail inválido")
    @Column(nullable=false,unique=true,length=60)
    private String email;

    @Column(precision=12, scale=6)
    private BigDecimal comisini;      
    
    @Column(precision=12, scale=6)
    private BigDecimal comisfim;   

    @Column(precision=12, scale=6)
    private BigDecimal percDescIni;      
    
    @Column(precision=12, scale=6)
    private BigDecimal percDescfim;   
    
    @Column()
    private boolean condPagtoPF = false;    
    
    @Column()
    private boolean recebeEmail = false;
    
    @Column()
    private boolean copiarPedido = false;
    
    @Column()                        
    private boolean validaDesconto = false;  // PERMITE QUE O USUARIO DIGITE UM PEDIDO SEM INFORMAR DESCONTO    
    
    @Column()                     // ALTERAR AS VALIDACOES PARA O CAMPO VerTodosRepres
    private boolean aprovaPDV;    // SE O USUÁRIO TEM ACESSO A TODOS OS REPRESENTANTES 

    @Column()                       
    private boolean vertodosrepres;     // NOVO CAMPO SE O USUÁRIO TEM ACESSO A TODOS OS REPRESENTANTES 
    
    @Column()                       
    private boolean verTodasTabelas;    // SE O USUÁRIO TEM ACESSO A TODAS AS TABELAS DE PREÇO

    @Column()                       
    private boolean descontoItem;    // SE O USUÁRIO PODE INFORMAR PERCENTUAL DE DESCONTO NO ITEM
    
    @Column()                       
    private boolean verTodasCondicoes;  // SE O USUÁRIO TEM ACESSO A TODAS AS CONDICOES DE PAGAMENTO
    
    @Column()                       
    private boolean validaMultiploDeVendas; //SE VERDADEIRO, PERMITE QUE O USUARIO INFORME UMA QUANTIDADE QUE NAO SEJA MULTIPLA DA QUANTIDADE MULTIPLA DE VENDAS 
    
    @Column()                       
    private boolean vertodoscompradores; // SE O USUÁRIO TEM ACESSO A TODOS OS COMPRADORES 

    @Column()                       
    private boolean aberturapdv; // SE O USUÁRIO TEM ACESSO PARA ABERTURA DE CAIXA

    @Column()
    private boolean fechamentopdv; // SE O USUÁRIO TEM ACESSO PARA FECHAMENTO DE CAIXA
    
    @Column()
    private boolean tipoFrete; // SE O USUÁRIO PODE ALTERAR O TIPO DE FRETE NA DIGITAÇÃO DE PEDIDO DE VENDAS

    @Column()                       
    private boolean sangriapdv; // SE O USUÁRIO TEM ACESSO PARA EFETUAR SANGRIA NO CAIXA

    @Column()                       
    private boolean suprimentopdv; // SE O USUÁRIO TEM ACESSO PARA EFETUAR SUPRIMENTOS(TROCO) NO CAIXA
    
    @Column()                           
    private boolean alteraVlUnitPedido; // SE O USUÁRIO PODE ALTERAR O VALOR UNITÁRIO NO PEDIDO DE VENDAS 

    @Column()                           
    private boolean usatabelapreco = false; // SE O USUÁRIO UTILIZA TABELA DE PRECO NO PEDIDO DE VENDAS
    
    @Column()                           
    private boolean marketplace = false; // SE O USUÁRIO UTILIZA AS FUNCIONALIDADES DE MARKETPLACE
    
    @Column()                           
    private boolean recebeNFSemPedido = false; // SE O USUÁRIO PODE RECEBER NOTA DE ENTRADA SEM PEDIDO DE COMPRAS
    
    @Column()                           
    private boolean admSuporte = false; // SE O USUARIO E ADMINISTRADOR NO MODULO DE SUPORTE  
    
    @Column()                           
    private boolean aprovarProspect = false; // SE MARCADO O PROSPECT CADASTRADO PELO USUARIO, PASSARA PELA APROVACAO DE PROSPECT

    @Column()                           
    private boolean alterarTransportadora = false; // SE MARCADO COMO TRUE O USUARIO PODERA ALTERAR A TRANSPORTADORA NO PEDIDO DE VENDAS 
    
    //@NotNull(message="Caminho não pode ser nulo")       
    @Column(nullable=false,length=200)
    private String dashboard;

    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtUltimoAcesso;    
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String modificado;    

    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;     

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;    
    
//    @ManyToOne()
//    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
//    private Participante participante;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private CentroCusto centroCusto;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private UnidNegocio unidNegocio;
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public boolean isAlteraVlUnitPedido() {
        return alteraVlUnitPedido;
    }

    public void setAlteraVlUnitPedido(boolean alteraVlUnitPedido) {
        this.alteraVlUnitPedido = alteraVlUnitPedido;
    }

    public boolean isAprovarProspect() {
        return aprovarProspect;
    }

    public void setAprovarProspect(boolean aprovarProspect) {
        this.aprovarProspect = aprovarProspect;
    }
    
    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public boolean isDescontoItem() {
        return descontoItem;
    }

    public void setDescontoItem(boolean descontoItem) {
        this.descontoItem = descontoItem;
    }

    public boolean isAlterarTransportadora() {
        return alterarTransportadora;
    }

    public void setAlterarTransportadora(boolean alterarTransportadora) {
        this.alterarTransportadora = alterarTransportadora;
    }

    public String getMensagemLogin() {
        return mensagemLogin;
    }

    public void setMensagemLogin(String mensagemLogin) {
        this.mensagemLogin = mensagemLogin;
    }

    public boolean isTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(boolean tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public Date getDatainativo() {
        return datainativo;
    }

    public void setDatainativo(Date datainativo) {
        this.datainativo = datainativo;
    }

    public Date getDtUltimoAcesso() {
        return dtUltimoAcesso;
    }

    public void setDtUltimoAcesso(Date dtUltimoAcesso) {
        this.dtUltimoAcesso = dtUltimoAcesso;
    }

    public boolean isCopiarPedido() {
        return copiarPedido;
    }

    public void setCopiarPedido(boolean copiarPedido) {
        this.copiarPedido = copiarPedido;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPrefixoPedido() {
        return prefixoPedido;
    }

    public void setPrefixoPedido(String prefixoPedido) {
        this.prefixoPedido = prefixoPedido;
    }

    public boolean isVerTodasTabelas() {
        return verTodasTabelas;
    }

    public void setVerTodasTabelas(boolean verTodasTabelas) {
        this.verTodasTabelas = verTodasTabelas;
    }

    public boolean isVerTodasCondicoes() {
        return verTodasCondicoes;
    }

    public void setVerTodasCondicoes(boolean verTodasCondicoes) {
        this.verTodasCondicoes = verTodasCondicoes;
    }

    public boolean isValidaMultiploDeVendas() {
        return validaMultiploDeVendas;
    }

    public void setValidaMultiploDeVendas(boolean validaMultiploDeVendas) {
        this.validaMultiploDeVendas = validaMultiploDeVendas;
    }

    public boolean isUsatabelapreco() {
        return usatabelapreco;
    }

    public void setUsatabelapreco(boolean usatabelapreco) {
        this.usatabelapreco = usatabelapreco;
    }

    public String getDeletado() {
        return deletado;
    }

    public void setDeletado(String deletado) {
        this.deletado = deletado;
    }

    public boolean isAberturapdv() {
        return aberturapdv;
    }

    public void setAberturapdv(boolean aberturapdv) {
        this.aberturapdv = aberturapdv;
    }

    public boolean isFechamentopdv() {
        return fechamentopdv;
    }

    public boolean isRecebeEmail() {
        return recebeEmail;
    }

    public void setRecebeEmail(boolean recebeEmail) {
        this.recebeEmail = recebeEmail;
    }

    public boolean isAdmSuporte() {
        return admSuporte;
    }

    public void setAdmSuporte(boolean admSuporte) {
        this.admSuporte = admSuporte;
    }

    public BigDecimal getPercDescIni() {
        return percDescIni;
    }

    public void setPercDescIni(BigDecimal percDescIni) {
        this.percDescIni = percDescIni;
    }

    public BigDecimal getPercDescfim() {
        return percDescfim;
    }

    public void setPercDescfim(BigDecimal percDescfim) {
        this.percDescfim = percDescfim;
    }
    
    public boolean isValidaDesconto() {
        return validaDesconto;
    }

    public void setValidaDesconto(boolean validaDesconto) {
        this.validaDesconto = validaDesconto;
    }

    public void setFechamentopdv(boolean fechamentopdv) {
        this.fechamentopdv = fechamentopdv;
    }

    public boolean isSangriapdv() {
        return sangriapdv;
    }

    public void setSangriapdv(boolean sangriapdv) {
        this.sangriapdv = sangriapdv;
    }

    public String getIdiomaPadrao() {
        return idiomaPadrao;
    }

    public void setIdiomaPadrao(String idiomaPadrao) {
        this.idiomaPadrao = idiomaPadrao;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public boolean isSuprimentopdv() {
        return suprimentopdv;
    }

    public void setSuprimentopdv(boolean suprimentopdv) {
        this.suprimentopdv = suprimentopdv;
    }
    
    public String getDashboard() {
        return dashboard;
    }

    public void setDashboard(String dashboard) {
        this.dashboard = dashboard;
    }

    public boolean isRecebeNFSemPedido() {
        return recebeNFSemPedido;
    }

    public void setRecebeNFSemPedido(boolean recebeNFSemPedido) {
        this.recebeNFSemPedido = recebeNFSemPedido;
    }
    
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public boolean isMarketplace() {
        return marketplace;
    }

    public void setMarketplace(boolean marketplace) {
        this.marketplace = marketplace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public boolean isVertodoscompradores() {
        return vertodoscompradores;
    }

    public void setVertodoscompradores(boolean vertodoscompradores) {
        this.vertodoscompradores = vertodoscompradores;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getComisfim() {
        return comisfim;
    }

    public void setComisfim(BigDecimal comisfim) {
        this.comisfim = comisfim;
    }

    public BigDecimal getComisini() {
        return comisini;
    }

    public void setComisini(BigDecimal comisini) {
        this.comisini = comisini;
    }


    public CentroCusto getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(CentroCusto centroCusto) {
        this.centroCusto = centroCusto;
    }

    public UnidNegocio getUnidNegocio() {
        return unidNegocio;
    }

    public void setUnidNegocio(UnidNegocio unidNegocio) {
        this.unidNegocio = unidNegocio;
    }
    
    public boolean isAprovaPDV() {
        return aprovaPDV;
    }

    public void setAprovaPDV(boolean aprovaPDV) {
        this.aprovaPDV = aprovaPDV;
    }

    public boolean isVertodosrepres() {
        return vertodosrepres;
    }

    public void setVertodosrepres(boolean vertodosrepres) {
        this.vertodosrepres = vertodosrepres;
    }

    public boolean isVertodoscomprador() {
        return vertodoscompradores;
    }

    public void setVertodoscomprador(boolean vertodoscompradores) {
        this.vertodoscompradores = vertodoscompradores;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean isCondPagtoPF() {
        return condPagtoPF;
    }

    public void setCondPagtoPF(boolean condPagtoPF) {
        this.condPagtoPF = condPagtoPF;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.seguranca.Usuario[id=" + id + "]";
    }

}