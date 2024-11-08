
package br.com.onsys.entidades.comercial;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

public class Representantews implements Serializable {
    private static final long serialVersionUID = 9L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false,length=60)
    private String nome;
    
    @Column(nullable=false,length=20)
    private String apelido;    
    
    @Column(nullable=false,length=60)
    private String email;    
    
    private boolean recebeEmail = true;

    @Column(nullable=false,length=20)
    private String codigo;

    @Column(precision=12, scale=2)
    private BigDecimal descontomax;
    
    @Column(precision=12, scale=2)
    private BigDecimal comissao;

    @Column(precision=12, scale=2)
    private BigDecimal comissao2;

    @Column(precision=12, scale=2)
    private BigDecimal saldoDespesa;
    
    @Column(precision=12, scale=2)
    private BigDecimal metavalor;

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
    
    @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    
    private Integer metapremioId;        

    private Integer usuariorepId;        

    private Integer gerenteId;
    
    private Integer tabelaprecoId;    

    private Integer regiaoId;

    private Integer empresaId;

    private Integer estabelecimentoId;
    
    private Integer tabrentabilidadeId;
    
    private Integer tabdescontocomisId;

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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRecebeEmail() {
        return recebeEmail;
    }

    public void setRecebeEmail(boolean recebeEmail) {
        this.recebeEmail = recebeEmail;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public BigDecimal getDescontomax() {
        return descontomax;
    }

    public void setDescontomax(BigDecimal descontomax) {
        this.descontomax = descontomax;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    public BigDecimal getComissao2() {
        return comissao2;
    }

    public void setComissao2(BigDecimal comissao2) {
        this.comissao2 = comissao2;
    }

    public BigDecimal getSaldoDespesa() {
        return saldoDespesa;
    }

    public void setSaldoDespesa(BigDecimal saldoDespesa) {
        this.saldoDespesa = saldoDespesa;
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

    public Boolean getAlteratabela() {
        return alteratabela;
    }

    public void setAlteratabela(Boolean alteratabela) {
        this.alteratabela = alteratabela;
    }

    public Boolean getAlteracondpagto() {
        return alteracondpagto;
    }

    public void setAlteracondpagto(Boolean alteracondpagto) {
        this.alteracondpagto = alteracondpagto;
    }

    public Boolean getAlteratransporte() {
        return alteratransporte;
    }

    public void setAlteratransporte(Boolean alteratransporte) {
        this.alteratransporte = alteratransporte;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public BigDecimal getVlminfaturamento() {
        return vlminfaturamento;
    }

    public void setVlminfaturamento(BigDecimal vlminfaturamento) {
        this.vlminfaturamento = vlminfaturamento;
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

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
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

    public Integer getMetapremioId() {
        return metapremioId;
    }

    public void setMetapremioId(Integer metapremioId) {
        this.metapremioId = metapremioId;
    }

    public Integer getUsuariorepId() {
        return usuariorepId;
    }

    public void setUsuariorepId(Integer usuariorepId) {
        this.usuariorepId = usuariorepId;
    }

    public Integer getGerenteId() {
        return gerenteId;
    }

    public void setGerenteId(Integer gerenteId) {
        this.gerenteId = gerenteId;
    }

    public Integer getTabelaprecoId() {
        return tabelaprecoId;
    }

    public void setTabelaprecoId(Integer tabelaprecoId) {
        this.tabelaprecoId = tabelaprecoId;
    }

    public Integer getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(Integer regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public Integer getEstabelecimentoId() {
        return estabelecimentoId;
    }

    public void setEstabelecimentoId(Integer estabelecimentoId) {
        this.estabelecimentoId = estabelecimentoId;
    }

    public Integer getTabrentabilidadeId() {
        return tabrentabilidadeId;
    }

    public void setTabrentabilidadeId(Integer tabrentabilidadeId) {
        this.tabrentabilidadeId = tabrentabilidadeId;
    }

    public Integer getTabdescontocomisId() {
        return tabdescontocomisId;
    }

    public void setTabdescontocomisId(Integer tabdescontocomisId) {
        this.tabdescontocomisId = tabdescontocomisId;
    }
    
}