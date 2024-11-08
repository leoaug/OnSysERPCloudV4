
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.basico.Municipio;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class DespesasRep implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @OneToMany(mappedBy="despesasrep")    
    
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    //@Basic(optional=false)
    private Integer id;    

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datamovto;

    @Column(length=30)
    private String tipo = "Alimentação";

    @Length(max=100, message="Tamanho máximo da observação é 100.")    
    @Column(length=100)
    private String obs;

    @Column(length=30)
    private String status;    
    
    @Column(length=60)
    private String arquivo;    
    
    @NotNull(message="Quantidade inválida.")
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal qtd;
    
    @NotNull(message="Valor inválido.")
    @Column(nullable=false,precision=12, scale=2)
    private BigDecimal valor;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] comprovante;        
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estado  estadoini; 
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estado  estadofin; 
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Municipio  municipioini; 
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Municipio municipiofin; 
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private TipoDespesa tipodespesa; 
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Representante representante;
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;  

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatamovto() {
        return datamovto;
    }

    public void setDatamovto(Date datamovto) {
        this.datamovto = datamovto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getQtd() {
        return qtd;
    }

    public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoDespesa getTipodespesa() {
        return tipodespesa;
    }

    public void setTipodespesa(TipoDespesa tipodespesa) {
        this.tipodespesa = tipodespesa;
    }
    
    public byte[] getComprovante() {
        return comprovante;
    }

    public void setComprovante(byte[] comprovante) {
        this.comprovante = comprovante;
    }

    public Representante getRepresentante() {
        return representante;
    }

    public void setRepresentante(Representante representante) {
        this.representante = representante;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Estado getEstadoini() {
        return estadoini;
    }

    public void setEstadoini(Estado estadoini) {
        this.estadoini = estadoini;
    }

    public Estado getEstadofin() {
        return estadofin;
    }

    public void setEstadofin(Estado estadofin) {
        this.estadofin = estadofin;
    }

    public Municipio getMunicipioini() {
        return municipioini;
    }

    public void setMunicipioini(Municipio municipioini) {
        this.municipioini = municipioini;
    }

    public Municipio getMunicipiofin() {
        return municipiofin;
    }

    public void setMunicipiofin(Municipio municipiofin) {
        this.municipiofin = municipiofin;
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
        if (!(object instanceof DespesasRep)) {
            return false;
        }
        DespesasRep other = (DespesasRep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.DespesasRep[id=" + id + "]";
    }

}