package br.com.onsys.entidades.basico;

import br.com.onsys.entidades.tipos.CEPGenerico;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="cep")
public class Cep implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    @Column(name="id")
    //@Basic(optional=false)
    private Integer id;
    
//  @NotNull(message="O logradouro não pode ser nulo")
//  @NotEmpty(message="O logradouro não pode ser branco")
    @Column(length=60)
    @Length(max=60, message="Tamanho máximo do logradouro é 60.")
    private String logradouro;

//  @NotNull(message="O bairro não pode ser nulo")
//  @NotEmpty(message="O bairro não pode ser branco")
    @Length(max=30, message="Tamanho máximo do bairro é 30.")    
    @Column(length=30)
    private String bairro;

//  @NotEmpty(message="O CEP não pode ser branco")
    @Column(length=10)
    private String cep;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=5)
    private CEPGenerico generico = CEPGenerico.Não;
    
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

    @OneToMany(mappedBy="cep")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estado estado;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Municipio municipio;

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
    
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public CEPGenerico getGenerico() {
        return generico;
    }

    public void setGenerico(CEPGenerico generico) {
        this.generico = generico;
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

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
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
        if (!(object instanceof Cep)) {
            return false;
        }
        Cep other = (Cep) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.basico.Cep[id=" + id + "]";
    }
}