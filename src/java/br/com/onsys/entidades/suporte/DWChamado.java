
package br.com.onsys.entidades.suporte;

import br.com.onsys.entidades.basico.Empresa;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table
public class DWChamado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    //@Basic(optional=false)
    private Integer id;

    @Column()
    private Integer nrochamado;      

    @Column(precision=12, scale=6)
    private BigDecimal horasaplicadas;      
    
    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataemissao;

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtrecebocor;

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtiniatend;    

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtfimatend;   

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtiniatendplan; //inicio planejado    

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtfimatendplan; //fim planejado
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date followup;    // iniciar com 1 dia ou 24 horas  

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datalimite;
    
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] anexo;       
    
    @Column(length=60)
    private String arquivo;      
   
    @Column()    
    private boolean tiporemota; // se o atendimento será remoto ou presencial      

    @Column(length=200)
    private String descricao;    

    @Column(length=200)
    private String diagnostico;    

    @Column(length=200)
    private String solucao;    
    
    @Column()
    private String status = "Pendente";
   
    @Column(length=400)
    private String obs;    
    
    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length = 1)
    private String modificado;
    
    @Column(length=30)
    private String usuario;

    @Column(length=30)
    private String solicitante;
    
    @Column(length=10)
    private String estabelecimento;

    @Column(length=30)
    private String participante;

    @Column(length=40)
    private String catChamado;

    @Column(length=40)
    private String subcatchamado;

    @Column(length=40)
    private String usrcriacao;    // usuário que criou a ocorrencia

    @Column(length=40)
    private String executor;    
    
    @Column(length=40)
    private String centroCusto;    
    
    @Column(length=40)
    private String pacote;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @OneToMany(mappedBy="dwchamado")
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNrochamado() {
        return nrochamado;
    }

    public void setNrochamado(Integer nrochamado) {
        this.nrochamado = nrochamado;
    }

    public BigDecimal getHorasaplicadas() {
        return horasaplicadas;
    }

    public void setHorasaplicadas(BigDecimal horasaplicadas) {
        this.horasaplicadas = horasaplicadas;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Date getDtrecebocor() {
        return dtrecebocor;
    }

    public void setDtrecebocor(Date dtrecebocor) {
        this.dtrecebocor = dtrecebocor;
    }

    public Date getDtiniatend() {
        return dtiniatend;
    }

    public void setDtiniatend(Date dtiniatend) {
        this.dtiniatend = dtiniatend;
    }

    public Date getDtfimatend() {
        return dtfimatend;
    }

    public void setDtfimatend(Date dtfimatend) {
        this.dtfimatend = dtfimatend;
    }

    public Date getDtiniatendplan() {
        return dtiniatendplan;
    }

    public void setDtiniatendplan(Date dtiniatendplan) {
        this.dtiniatendplan = dtiniatendplan;
    }

    public Date getDtfimatendplan() {
        return dtfimatendplan;
    }

    public void setDtfimatendplan(Date dtfimatendplan) {
        this.dtfimatendplan = dtfimatendplan;
    }

    public Date getFollowup() {
        return followup;
    }

    public void setFollowup(Date followup) {
        this.followup = followup;
    }

    public Date getDatalimite() {
        return datalimite;
    }

    public void setDatalimite(Date datalimite) {
        this.datalimite = datalimite;
    }

    public byte[] getAnexo() {
        return anexo;
    }

    public void setAnexo(byte[] anexo) {
        this.anexo = anexo;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public boolean isTiporemota() {
        return tiporemota;
    }

    public void setTiporemota(boolean tiporemota) {
        this.tiporemota = tiporemota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    public String getCatChamado() {
        return catChamado;
    }

    public void setCatChamado(String catChamado) {
        this.catChamado = catChamado;
    }

    public String getSubcatchamado() {
        return subcatchamado;
    }

    public void setSubcatchamado(String subcatchamado) {
        this.subcatchamado = subcatchamado;
    }

    public String getUsrcriacao() {
        return usrcriacao;
    }

    public void setUsrcriacao(String usrcriacao) {
        this.usrcriacao = usrcriacao;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(String centroCusto) {
        this.centroCusto = centroCusto;
    }

    public String getPacote() {
        return pacote;
    }

    public void setPacote(String pacote) {
        this.pacote = pacote;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
        if (!(object instanceof DWChamado)) {
            return false;
        }
        DWChamado other = (DWChamado) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.suporte.DWChamado[id=" + id + "]";
    }
    
}