
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.tipos.TipoPagamento;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

public class PedidoVendasws implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;
    
    @Column()
    private Integer nrpedido;

    @Length(max=20, message="Tamanho máximo pedido do cliente é 20.")
    @Column(length=20)
    private String nrpedcli;

    @Length(max=20, message="Tamanho máximo pedido do representante é 20.")
    @Column(length=20)
    private String nrpedrepre;

    @Length(max=20, message="Tamanho máximo pedido bonificado é 20.")
    @Column(length=20)
    private String nrpedbonificado;    

    @Column(length=30)
    private String dataaprova;
    
    @Column(length=30)
    private String datafechamento;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataemissao;
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataentrega;
    
    @Column()    
    private boolean pedidofechado;    
    
    @Column()    
    private boolean cotacao;    
    
    @Column(precision=12, scale=6)
    private BigDecimal vltotpedido;

    @Column(precision=12, scale=6)
    private BigDecimal vltotliqpedido = BigDecimal.ZERO;
    
    @Column(precision=12, scale=6)
    private BigDecimal vltotbruto = BigDecimal.ZERO;
    
    @Column(precision=12, scale=6)
    private BigDecimal vlicmssubstitu = BigDecimal.ZERO;
    
    @Column(precision=12, scale=6)
    private BigDecimal descprod = BigDecimal.ZERO; 
    
    @Column(precision=12, scale=6)
    private BigDecimal percdesctotal = BigDecimal.ZERO; 

    @Column(precision=12, scale=6)
    private BigDecimal descfinanceiro = BigDecimal.ZERO;    

    @Column(precision=12, scale=6)
    private BigDecimal pesoliquido = BigDecimal.ZERO;    

    @Column(precision=12, scale=6)
    private BigDecimal pesobruto = BigDecimal.ZERO;    
    
    @Column()
    private Integer volumes = null;    
    
    @Column(precision=12, scale=6)
    private BigDecimal basecomissao;
    
    @Column(precision=12, scale=6)
    private BigDecimal perccomissao;    
    
    @Column(precision=12, scale=6)
    private BigDecimal vlcomissao = BigDecimal.ZERO;    
    
    @Column(precision=12, scale=6)
    private BigDecimal ipi = BigDecimal.ZERO;    
    
    // inicialmente para atender a comissao da boreda 
    @Column(precision=12, scale=6)
    private BigDecimal pontuacao;    
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")
    @Column(length=200)
    private String obspedido; /* OBSERVACAO PARA NF */

    @Length(max=200, message="Tamanho máximo da observação é 200.")
    @Column(length=200)
    private String obsintegra; /* OBSERVACAO INTEGRACAO ERP */
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")
    @Column(length=200)
    private String obslogistica;    

    @Length(max=200, message="Tamanho máximo da observação é 200.")
    @Column(length=200)
    private String obscredito;    
    
    @Length(max=100, message="Tamanho máximo da justificativa é 100.")
    @Column(length=100)
    private String obstrocacondpag;

    @Length(max=100, message="Tamanho máximo da justificativa é 100.")
    @Column(length=100)
    private String obstrocatabela;    
    
    // OBSERVACAO PARA BONIFICACAO 
    @Length(max=200, message="Tamanho máximo da justificativa é 100.")
    @Column(length=200)
    private String obsbonifica;    
    
    // OBSERVACAO GERAL 
    @Length(max=200, message="Tamanho máximo da justificativa é 100.")
    @Column(length=200)
    private String obs;    

    @OneToMany(mappedBy="pedidovendasws")
    
    private String situacao;
    
    @Column(length=40)
    private String freteemitente;        
    
    @Column(length=2)
    private String tipobloqueio;        
    
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private TipoPagamento formapagamento = TipoPagamento.Dinheiro;    

    @Column(precision=12, scale=6)
    private BigDecimal vlvenda = BigDecimal.ZERO;

    @Column(precision=12, scale=6)
    private BigDecimal vlbonificado = BigDecimal.ZERO;
    
    @Column(precision=12, scale=6)
    private BigDecimal qtdvendida = BigDecimal.ZERO;

    @Column(precision=12, scale=6)
    private BigDecimal qtdbonificada = BigDecimal.ZERO;

    @Column(precision=12, scale=6)
    private BigDecimal percbonificado = BigDecimal.ZERO;   

    @Column(length=40)
    private String style;        
    
    @Column(length=20)
    private String string1;        

    @Column(length=20)
    private String string2;            
    
    @Column(precision=12, scale=6)
    private BigDecimal bigdecimal1;   
    
    @Column(precision=12, scale=6)
    private BigDecimal bigdecimal2;   
    
    @Column()    
    private boolean boolean1;    
    
    @Column()    
    private boolean boolean2;    
    
    @Column(precision=12, scale=6)
    private BigDecimal percfrete;
    
    @Column(precision=12, scale=6)
    private BigDecimal frete;
    
    private Integer moeda_id;
    
    private Integer cliente_id;

    private Integer areatransporte_id;

    private Integer transportadora_id;
    
    private Integer transpredes_id;    
    
    private Integer condpagamento_id;

    private Integer tabelapreco_id;

    private Integer usuariorep_id;
    
    private Integer usrimplant_id;
    
    private Integer usraprova_id;
    
    private Integer empresa_id;

    private Integer estabelecimento_id;

    private Integer naturezaoperacao_id;

    private Integer enderecoparticipante_id;    
    
    private Integer tabfinanciamento_id;    

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNrpedido() {
        return nrpedido;
    }

    public void setNrpedido(Integer nrpedido) {
        this.nrpedido = nrpedido;
    }

    public String getNrpedcli() {
        return nrpedcli;
    }

    public void setNrpedcli(String nrpedcli) {
        this.nrpedcli = nrpedcli;
    }

    public String getNrpedrepre() {
        return nrpedrepre;
    }

    public void setNrpedrepre(String nrpedrepre) {
        this.nrpedrepre = nrpedrepre;
    }

    public String getNrpedbonificado() {
        return nrpedbonificado;
    }

    public void setNrpedbonificado(String nrpedbonificado) {
        this.nrpedbonificado = nrpedbonificado;
    }

    public String getDataaprova() {
        return dataaprova;
    }

    public void setDataaprova(String dataaprova) {
        this.dataaprova = dataaprova;
    }

    public String getDatafechamento() {
        return datafechamento;
    }

    public void setDatafechamento(String datafechamento) {
        this.datafechamento = datafechamento;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Date getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(Date dataentrega) {
        this.dataentrega = dataentrega;
    }

    public boolean isPedidofechado() {
        return pedidofechado;
    }

    public void setPedidofechado(boolean pedidofechado) {
        this.pedidofechado = pedidofechado;
    }

    public boolean isCotacao() {
        return cotacao;
    }

    public void setCotacao(boolean cotacao) {
        this.cotacao = cotacao;
    }

    public BigDecimal getVltotpedido() {
        return vltotpedido;
    }

    public void setVltotpedido(BigDecimal vltotpedido) {
        this.vltotpedido = vltotpedido;
    }

    public BigDecimal getVltotliqpedido() {
        return vltotliqpedido;
    }

    public void setVltotliqpedido(BigDecimal vltotliqpedido) {
        this.vltotliqpedido = vltotliqpedido;
    }

    public BigDecimal getVltotbruto() {
        return vltotbruto;
    }

    public void setVltotbruto(BigDecimal vltotbruto) {
        this.vltotbruto = vltotbruto;
    }

    public BigDecimal getVlicmssubstitu() {
        return vlicmssubstitu;
    }

    public void setVlicmssubstitu(BigDecimal vlicmssubstitu) {
        this.vlicmssubstitu = vlicmssubstitu;
    }

    public BigDecimal getDescprod() {
        return descprod;
    }

    public void setDescprod(BigDecimal descprod) {
        this.descprod = descprod;
    }

    public BigDecimal getPercdesctotal() {
        return percdesctotal;
    }

    public void setPercdesctotal(BigDecimal percdesctotal) {
        this.percdesctotal = percdesctotal;
    }

    public BigDecimal getDescfinanceiro() {
        return descfinanceiro;
    }

    public void setDescfinanceiro(BigDecimal descfinanceiro) {
        this.descfinanceiro = descfinanceiro;
    }

    public BigDecimal getPesoliquido() {
        return pesoliquido;
    }

    public void setPesoliquido(BigDecimal pesoliquido) {
        this.pesoliquido = pesoliquido;
    }

    public BigDecimal getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(BigDecimal pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Integer getVolumes() {
        return volumes;
    }

    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
    }

    public BigDecimal getBasecomissao() {
        return basecomissao;
    }

    public void setBasecomissao(BigDecimal basecomissao) {
        this.basecomissao = basecomissao;
    }

    public BigDecimal getPerccomissao() {
        return perccomissao;
    }

    public void setPerccomissao(BigDecimal perccomissao) {
        this.perccomissao = perccomissao;
    }

    public BigDecimal getVlcomissao() {
        return vlcomissao;
    }

    public void setVlcomissao(BigDecimal vlcomissao) {
        this.vlcomissao = vlcomissao;
    }

    public BigDecimal getIpi() {
        return ipi;
    }

    public void setIpi(BigDecimal ipi) {
        this.ipi = ipi;
    }

    public BigDecimal getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(BigDecimal pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getObspedido() {
        return obspedido;
    }

    public void setObspedido(String obspedido) {
        this.obspedido = obspedido;
    }

    public String getObsintegra() {
        return obsintegra;
    }

    public void setObsintegra(String obsintegra) {
        this.obsintegra = obsintegra;
    }

    public String getObslogistica() {
        return obslogistica;
    }

    public void setObslogistica(String obslogistica) {
        this.obslogistica = obslogistica;
    }

    public String getObscredito() {
        return obscredito;
    }

    public void setObscredito(String obscredito) {
        this.obscredito = obscredito;
    }

    public String getObstrocacondpag() {
        return obstrocacondpag;
    }

    public void setObstrocacondpag(String obstrocacondpag) {
        this.obstrocacondpag = obstrocacondpag;
    }

    public String getObstrocatabela() {
        return obstrocatabela;
    }

    public void setObstrocatabela(String obstrocatabela) {
        this.obstrocatabela = obstrocatabela;
    }

    public String getObsbonifica() {
        return obsbonifica;
    }

    public void setObsbonifica(String obsbonifica) {
        this.obsbonifica = obsbonifica;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFreteemitente() {
        return freteemitente;
    }

    public void setFreteemitente(String freteemitente) {
        this.freteemitente = freteemitente;
    }

    public String getTipobloqueio() {
        return tipobloqueio;
    }

    public void setTipobloqueio(String tipobloqueio) {
        this.tipobloqueio = tipobloqueio;
    }

    public TipoPagamento getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(TipoPagamento formapagamento) {
        this.formapagamento = formapagamento;
    }

    public BigDecimal getVlvenda() {
        return vlvenda;
    }

    public void setVlvenda(BigDecimal vlvenda) {
        this.vlvenda = vlvenda;
    }

    public BigDecimal getVlbonificado() {
        return vlbonificado;
    }

    public void setVlbonificado(BigDecimal vlbonificado) {
        this.vlbonificado = vlbonificado;
    }

    public BigDecimal getQtdvendida() {
        return qtdvendida;
    }

    public void setQtdvendida(BigDecimal qtdvendida) {
        this.qtdvendida = qtdvendida;
    }

    public BigDecimal getQtdbonificada() {
        return qtdbonificada;
    }

    public void setQtdbonificada(BigDecimal qtdbonificada) {
        this.qtdbonificada = qtdbonificada;
    }

    public BigDecimal getPercbonificado() {
        return percbonificado;
    }

    public void setPercbonificado(BigDecimal percbonificado) {
        this.percbonificado = percbonificado;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public BigDecimal getBigdecimal1() {
        return bigdecimal1;
    }

    public void setBigdecimal1(BigDecimal bigdecimal1) {
        this.bigdecimal1 = bigdecimal1;
    }

    public BigDecimal getBigdecimal2() {
        return bigdecimal2;
    }

    public void setBigdecimal2(BigDecimal bigdecimal2) {
        this.bigdecimal2 = bigdecimal2;
    }

    public boolean isBoolean1() {
        return boolean1;
    }

    public void setBoolean1(boolean boolean1) {
        this.boolean1 = boolean1;
    }

    public boolean isBoolean2() {
        return boolean2;
    }

    public void setBoolean2(boolean boolean2) {
        this.boolean2 = boolean2;
    }

    public BigDecimal getPercfrete() {
        return percfrete;
    }

    public void setPercfrete(BigDecimal percfrete) {
        this.percfrete = percfrete;
    }

    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }

    public Integer getMoeda_id() {
        return moeda_id;
    }

    public void setMoeda_id(Integer moeda_id) {
        this.moeda_id = moeda_id;
    }

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Integer getAreatransporte_id() {
        return areatransporte_id;
    }

    public void setAreatransporte_id(Integer areatransporte_id) {
        this.areatransporte_id = areatransporte_id;
    }

    public Integer getTransportadora_id() {
        return transportadora_id;
    }

    public void setTransportadora_id(Integer transportadora_id) {
        this.transportadora_id = transportadora_id;
    }

    public Integer getTranspredes_id() {
        return transpredes_id;
    }

    public void setTranspredes_id(Integer transpredes_id) {
        this.transpredes_id = transpredes_id;
    }

    public Integer getCondpagamento_id() {
        return condpagamento_id;
    }

    public void setCondpagamento_id(Integer condpagamento_id) {
        this.condpagamento_id = condpagamento_id;
    }

    public Integer getTabelapreco_id() {
        return tabelapreco_id;
    }

    public void setTabelapreco_id(Integer tabelapreco_id) {
        this.tabelapreco_id = tabelapreco_id;
    }

    public Integer getUsuariorep_id() {
        return usuariorep_id;
    }

    public void setUsuariorep_id(Integer usuariorep_id) {
        this.usuariorep_id = usuariorep_id;
    }

    public Integer getUsrimplant_id() {
        return usrimplant_id;
    }

    public void setUsrimplant_id(Integer usrimplant_id) {
        this.usrimplant_id = usrimplant_id;
    }

    public Integer getUsraprova_id() {
        return usraprova_id;
    }

    public void setUsraprova_id(Integer usraprova_id) {
        this.usraprova_id = usraprova_id;
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

    public Integer getNaturezaoperacao_id() {
        return naturezaoperacao_id;
    }

    public void setNaturezaoperacao_id(Integer naturezaoperacao_id) {
        this.naturezaoperacao_id = naturezaoperacao_id;
    }

    public Integer getEnderecoparticipante_id() {
        return enderecoparticipante_id;
    }

    public void setEnderecoparticipante_id(Integer enderecoparticipante_id) {
        this.enderecoparticipante_id = enderecoparticipante_id;
    }

    public Integer getTabfinanciamento_id() {
        return tabfinanciamento_id;
    }

    public void setTabfinanciamento_id(Integer tabfinanciamento_id) {
        this.tabfinanciamento_id = tabfinanciamento_id;
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
        if (!(object instanceof PedidoVendasws)) {
            return false;
        }
        PedidoVendasws other = (PedidoVendasws) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.PedidoVendasws[id=" + id + "]";
    }

}