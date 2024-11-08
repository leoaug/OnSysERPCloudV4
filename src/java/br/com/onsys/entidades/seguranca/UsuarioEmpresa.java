
package br.com.onsys.entidades.seguranca;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="usuarioempresa")
@Cacheable(false)
public class UsuarioEmpresa implements Serializable {
    
    @OneToMany(mappedBy="usuarioEmpresa")
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    //@NotNull(message="Caminho não pode ser nulo")       
    @Column(nullable=false,length=200)
    private String dashboard;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;    
    
    @Column(length=200)
    private String mensagemLogin;    
    
    @Column()                        
    private boolean validaDesconto = true;  // PERMITE QUE O USUARIO DIGITE UM PEDIDO SEM INFORMAR DESCONTO    

    @Column()
    private boolean copiarPedido = false;
    
    @Column()
    private boolean difal = false;    
    
    @Column()                     // ALTERAR AS VALIDACOES PARA O CAMPO VerTodosRepres
    private boolean aprovaPDV;    // SE O USUÁRIO TEM ACESSO A TODOS OS REPRESENTANTES 
    
    @Column()                           
    private boolean admSuporte = false; // SE O USUARIO E ADMINISTRADOR NO MODULO DE SUPORTE      
    
    @Column()                       
    private boolean verTodasTabelas;    // SE O USUÁRIO TEM ACESSO A TODAS AS TABELAS DE PREÇO

    @Column()                       
    private boolean verTodasCondicoes;  // SE O USUÁRIO TEM ACESSO A TODAS AS CONDICOES DE PAGAMENTO

    @Column()
    private boolean condPagtoPF = false;    

    @Column()                           
    private boolean alteraVlUnitPedido; // SE O USUÁRIO PODE ALTERAR O VALOR UNITÁRIO NO PEDIDO DE VENDAS 
    
    @Column()                       
    private boolean descontoItem;    // SE O USUÁRIO PODE INFORMAR PERCENTUAL DE DESCONTO NO ITEM

    @Column()                           
    private boolean usaTabelaPreco = true; // SE O USUÁRIO UTILIZA TABELA DE PRECO NO PEDIDO DE VENDAS

    @Column()                           
    private boolean marketplace = true; // SE O USUÁRIO UTILIZA AS FUNCIONALIDADES DE MARKETPLACE
    
    @Column()                       
    private boolean validaMultiploDeVendas; //SE VERDADEIRO, PERMITE QUE O USUARIO INFORME UMA QUANTIDADE QUE NAO SEJA MULTIPLA DA QUANTIDADE MULTIPLA DE VENDAS 

    @Column()                           
    private boolean aprovarProspect = true; // SE MARCADO O PROSPECT CADASTRADO PELO USUARIO, PASSARA PELA APROVACAO DE PROSPECT

    @Column()                           
    private boolean alterarTransportadora = false; // SE MARCADO COMO TRUE O USUARIO PODERA ALTERAR A TRANSPORTADORA NO PEDIDO DE VENDAS 
    
    @Column()
    private boolean tipoFrete; // SE O USUÁRIO PODE ALTERAR O TIPO DE FRETE NA DIGITAÇÃO DE PEDIDO DE VENDAS
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa; // Empresa que o usuário tem permissão de acesso
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuario;

    @Column(name = "ultimo")
    private boolean ultimo;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getDashboard() {
        return dashboard;
    }

    public void setDashboard(String dashboard) {
        this.dashboard = dashboard;
    }

    public boolean isAdmSuporte() {
        return admSuporte;
    }

    public void setAdmSuporte(boolean admSuporte) {
        this.admSuporte = admSuporte;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getMensagemLogin() {
        return mensagemLogin;
    }

    public void setMensagemLogin(String mensagemLogin) {
        this.mensagemLogin = mensagemLogin;
    }

    public boolean isValidaDesconto() {
        return validaDesconto;
    }

    public void setValidaDesconto(boolean validaDesconto) {
        this.validaDesconto = validaDesconto;
    }

    public boolean isCopiarPedido() {
        return copiarPedido;
    }

    public void setCopiarPedido(boolean copiarPedido) {
        this.copiarPedido = copiarPedido;
    }

    public boolean isAprovaPDV() {
        return aprovaPDV;
    }

    public void setAprovaPDV(boolean aprovaPDV) {
        this.aprovaPDV = aprovaPDV;
    }

    public boolean isVerTodasTabelas() {
        return verTodasTabelas;
    }

    public void setVerTodasTabelas(boolean verTodasTabelas) {
        this.verTodasTabelas = verTodasTabelas;
    }

    public boolean isDifal() {
        return difal;
    }

    public void setDifal(boolean difal) {
        this.difal = difal;
    }

    public boolean isVerTodasCondicoes() {
        return verTodasCondicoes;
    }

    public void setVerTodasCondicoes(boolean verTodasCondicoes) {
        this.verTodasCondicoes = verTodasCondicoes;
    }

    public boolean isCondPagtoPF() {
        return condPagtoPF;
    }

    public void setCondPagtoPF(boolean condPagtoPF) {
        this.condPagtoPF = condPagtoPF;
    }

    public boolean isAlteraVlUnitPedido() {
        return alteraVlUnitPedido;
    }

    public void setAlteraVlUnitPedido(boolean alteraVlUnitPedido) {
        this.alteraVlUnitPedido = alteraVlUnitPedido;
    }

    public boolean isDescontoItem() {
        return descontoItem;
    }

    public void setDescontoItem(boolean descontoItem) {
        this.descontoItem = descontoItem;
    }

    public boolean isUsaTabelaPreco() {
        return usaTabelaPreco;
    }

    public void setUsaTabelaPreco(boolean usaTabelaPreco) {
        this.usaTabelaPreco = usaTabelaPreco;
    }

    public boolean isMarketplace() {
        return marketplace;
    }

    public void setMarketplace(boolean marketplace) {
        this.marketplace = marketplace;
    }

    public boolean isValidaMultiploDeVendas() {
        return validaMultiploDeVendas;
    }

    public void setValidaMultiploDeVendas(boolean validaMultiploDeVendas) {
        this.validaMultiploDeVendas = validaMultiploDeVendas;
    }

    public boolean isAprovarProspect() {
        return aprovarProspect;
    }

    public void setAprovarProspect(boolean aprovarProspect) {
        this.aprovarProspect = aprovarProspect;
    }

    public boolean isAlterarTransportadora() {
        return alterarTransportadora;
    }

    public void setAlterarTransportadora(boolean alterarTransportadora) {
        this.alterarTransportadora = alterarTransportadora;
    }

    public boolean isTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(boolean tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean isUltimo() {
        return ultimo;
    }

    public void setUltimo(boolean ultimo) {
        this.ultimo = ultimo;
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
        if (!(object instanceof UsuarioEmpresa)) {
            return false;
        }
        UsuarioEmpresa other = (UsuarioEmpresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.seguranca.UsuarioEmpresa[id=" + id + "]";
    }

}