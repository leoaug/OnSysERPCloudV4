
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="representante")
@Cacheable(false)
public class Representante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(length=60)
    private String nome;
    
    @Column(length=20)
    private String apelido;    
    
    @Column(length=3)
    private String prefixoPedido;    
    
    @Email(message="E-mail inválido")
    @Column(length=60)
    private String email;    
    
    @Column()
    private boolean recebeEmail = true;
    
    @Column()    
    private boolean marketplace = false;
    
    @Column(length=200)
    private String tokenMarketplace;

    @Column(length=200)
    private String codigomeli;

    @Column()    
    private boolean sincronizar = false;  // INDICA QUE A SINCRONIZACAO AUTOMATICA COM O MARKETPLACE ESTA ATIVA 

//  @NotEmpty(message="O código não pode ser branco")
    @Column(length=20)
    private String codigo;
    
    @Column(length=20)
    private String lojaMarketplace;
    
    @Column()
    private String usuarioAPI;
    
    @Column()
    private String senhaAPI;

    @Column(precision=12, scale=2)
    private BigDecimal descontomax;
    
    @Column(precision=12, scale=2)
    private BigDecimal descontoadicional;    
    
    @Column(precision=12, scale=2)
    private BigDecimal comissao;

    @Column(precision=12, scale=2)
    private BigDecimal comissao2;

    @Column(precision=12, scale=2)
    private BigDecimal comissaoMarketplace;
    
    @Column(precision=12, scale=2)
    private BigDecimal comissaoGestorMarketplace;
    
    @Column(precision=12, scale=2)
    private BigDecimal saldoDespesa;
    
    @Column(precision=12, scale=2)
    private BigDecimal metavalor;
    
    @Column(precision=12, scale=2)
    private BigDecimal comissaoEmissaoPedido; // % da comissão na emissão do pedido de vendas 
    
    @Column(precision=12, scale=2)
    private BigDecimal comissaoFaturamento; // % da comissão no faturamento do pedido 

    @Column(precision=12, scale=2)
    private BigDecimal comissaoTituloAR; // % da comissão na quitação do titulo AR    
    
    @Column(precision=12, scale=6)
    private BigDecimal vlkm;      

    @Column()
    private Integer metapedido;
    
    @Column()
    private Boolean alteratabela;

    @Column()
    private Boolean alteracondpagto;

    @Column()
    private Boolean alteratransporte;
    
    @Column(length=20)
    private String fone;

    @Column(length=20)
    private String idLojaOficial; //ID LOJA OFICIAL MELI  
    
    @Column(length=20)
    private String codigoClienteMarketplace; //CODIGO DA EMPRESA NO SISTEMA DE MARKETPLACE  

    @Column(length=60)
    private String codigoAplicativoMarketplace; //CODIGO DO SISTEMA NO SISTEMA DE MARKETPLACE  
    
    @Column(length=60)
    private String refreshToken; //REFRESH TOKEN
    
    @Column(length=60)
    private String urlMarketplace; //URL PARA CONEXÃO DA API  

    @Column(length=60)
    private String urlImagem; //UTILIZADO NA INTEGRAÇÃO COM WOOCOMMERCE  
    
    @Column(precision=12, scale=6)
    private BigDecimal vlminfaturamento; 

    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datacadastro;        
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date modificacao;
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    @OneToMany(mappedBy="representante")
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private MetaPremio metapremio;        

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuariorep;        

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Representante gerente;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabelaPreco tabelapreco;    

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabelaPreco tabelaPrecoMarketplace;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Regiao regiao;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabRentabilidade tabrentabilidade;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TabDescontoComis tabdescontocomis;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDePedido tipodepedido;

    public TabDescontoComis getTabdescontocomis() {
        return tabdescontocomis;
    }

    public void setTabdescontocomis(TabDescontoComis tabdescontocomis) {
        this.tabdescontocomis = tabdescontocomis;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
    
    public BigDecimal getComissao2() {
        return comissao2;
    }

    public void setComissao2(BigDecimal comissao2) {
        this.comissao2 = comissao2;
    }    

    public TabelaPreco getTabelaPrecoMarketplace() {
        return tabelaPrecoMarketplace;
    }

    public void setTabelaPrecoMarketplace(TabelaPreco tabelaPrecoMarketplace) {
        this.tabelaPrecoMarketplace = tabelaPrecoMarketplace;
    }

    public String getLojaMarketplace() {
        return lojaMarketplace;
    }

    public void setLojaMarketplace(String lojaMarketplace) {
        this.lojaMarketplace = lojaMarketplace;
    }

    public String getCodigomeli() {
        return codigomeli;
    }

    public void setCodigomeli(String codigomeli) {
        this.codigomeli = codigomeli;
    }
    
    public Representante getGerente() {
        return gerente;
    }

    public void setGerente(Representante gerente) {
        this.gerente = gerente;
    }

    public BigDecimal getVlkm() {
        return vlkm;
    }

    public void setVlkm(BigDecimal vlkm) {
        this.vlkm = vlkm;
    }

    public String getPrefixoPedido() {
        return prefixoPedido;
    }

    public void setPrefixoPedido(String prefixoPedido) {
        this.prefixoPedido = prefixoPedido;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public boolean isSincronizar() {
        return sincronizar;
    }

    public void setSincronizar(boolean sincronizar) {
        this.sincronizar = sincronizar;
    }

    public BigDecimal getDescontoadicional() {
        return descontoadicional;
    }

    public void setDescontoadicional(BigDecimal descontoadicional) {
        this.descontoadicional = descontoadicional;
    }

    public String getCodigoClienteMarketplace() {
        return codigoClienteMarketplace;
    }

    public void setCodigoClienteMarketplace(String codigoClienteMarketplace) {
        this.codigoClienteMarketplace = codigoClienteMarketplace;
    }

    public String getCodigoAplicativoMarketplace() {
        return codigoAplicativoMarketplace;
    }

    public void setCodigoAplicativoMarketplace(String codigoAplicativoMarketplace) {
        this.codigoAplicativoMarketplace = codigoAplicativoMarketplace;
    }

    public String getUrlMarketplace() {
        return urlMarketplace;
    }

    public void setUrlMarketplace(String urlMarketplace) {
        this.urlMarketplace = urlMarketplace;
    }

    public BigDecimal getComissaoMarketplace() {
        return comissaoMarketplace;
    }

    public void setComissaoMarketplace(BigDecimal comissaoMarketplace) {
        this.comissaoMarketplace = comissaoMarketplace;
    }

    public BigDecimal getComissaoEmissaoPedido() {
        return comissaoEmissaoPedido;
    }

    public void setComissaoEmissaoPedido(BigDecimal comissaoEmissaoPedido) {
        this.comissaoEmissaoPedido = comissaoEmissaoPedido;
    }

    public BigDecimal getComissaoFaturamento() {
        return comissaoFaturamento;
    }

    public void setComissaoFaturamento(BigDecimal comissaoFaturamento) {
        this.comissaoFaturamento = comissaoFaturamento;
    }

    public BigDecimal getComissaoTituloAR() {
        return comissaoTituloAR;
    }

    public void setComissaoTituloAR(BigDecimal comissaoTituloAR) {
        this.comissaoTituloAR = comissaoTituloAR;
    }

    public BigDecimal getComissaoGestorMarketplace() {
        return comissaoGestorMarketplace;
    }

    public void setComissaoGestorMarketplace(BigDecimal comissaoGestorMarketplace) {
        this.comissaoGestorMarketplace = comissaoGestorMarketplace;
    }

    public boolean isMarketplace() {
        return marketplace;
    }

    public void setMarketplace(boolean marketplace) {
        this.marketplace = marketplace;
    }
    
    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public TipoDePedido getTipodepedido() {
        return tipodepedido;
    }

    public void setTipodepedido(TipoDePedido tipodepedido) {
        this.tipodepedido = tipodepedido;
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
    
    public BigDecimal getVlminfaturamento() {
        return vlminfaturamento;
    }

    public void setVlminfaturamento(BigDecimal vlminfaturamento) {
        this.vlminfaturamento = vlminfaturamento;
    }

    public BigDecimal getSaldoDespesa() {
        return saldoDespesa;
    }

    public void setSaldoDespesa(BigDecimal saldoDespesa) {
        this.saldoDespesa = saldoDespesa;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isRecebeEmail() {
        return recebeEmail;
    }

    public void setRecebeEmail(boolean recebeEmail) {
        this.recebeEmail = recebeEmail;
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

    public MetaPremio getMetapremio() {
        return metapremio;
    }

    public void setMetapremio(MetaPremio metapremio) {
        this.metapremio = metapremio;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTokenMarketplace() {
        return tokenMarketplace;
    }

    public void setTokenMarketplace(String tokenMarketplace) {
        this.tokenMarketplace = tokenMarketplace;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    public String getIdLojaOficial() {
        return idLojaOficial;
    }

    public void setIdLojaOficial(String idLojaOficial) {
        this.idLojaOficial = idLojaOficial;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getDescontomax() {
        return descontomax;
    }

    public void setDescontomax(BigDecimal descontomax) {
        this.descontomax = descontomax;
    }

    public Regiao getRegiao() {
        return regiao;
    }

    public void setRegiao(Regiao regiao) {
        this.regiao = regiao;
    }

    public Boolean getAlteracondpagto() {
        return alteracondpagto;
    }

    public void setAlteracondpagto(Boolean alteracondpagto) {
        this.alteracondpagto = alteracondpagto;
    }

    public Boolean getAlteratabela() {
        return alteratabela;
    }

    public void setAlteratabela(Boolean alteratabela) {
        this.alteratabela = alteratabela;
    }

    public BigDecimal getMetavalor() {
        return metavalor;
    }

    public void setMetavalor(BigDecimal metavalor) {
        this.metavalor = metavalor;
    }

    public Integer getMetapedido() {
        return metapedido;
    }

    public void setMetapedido(Integer metapedido) {
        this.metapedido = metapedido;
    }

    public Boolean getAlteratransporte() {
        return alteratransporte;
    }

    public void setAlteratransporte(Boolean alteratransporte) {
        this.alteratransporte = alteratransporte;
    }

    public Usuario getUsuariorep() {
        return usuariorep;
    }

    public void setUsuariorep(Usuario usuariorep) {
        this.usuariorep = usuariorep;
    }

    public TabelaPreco getTabelapreco() {
        return tabelapreco;
    }

    public void setTabelapreco(TabelaPreco tabelapreco) {
        this.tabelapreco = tabelapreco;
    }

    public TabRentabilidade getTabrentabilidade() {
        return tabrentabilidade;
    }

    public void setTabrentabilidade(TabRentabilidade tabrentabilidade) {
        this.tabrentabilidade = tabrentabilidade;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public Date getModificacao() {
        return modificacao;
    }

    public void setModificacao(Date modificacao) {
        this.modificacao = modificacao;
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
        if (!(object instanceof Representante)) {
            return false;
        }
        Representante other = (Representante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.Representante[id=" + id + "]";
    }

}