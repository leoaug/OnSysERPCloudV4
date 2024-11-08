
package br.com.onsys.entidades.seguranca;
//
import br.com.onsys.entidades.basico.Empresa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name="programa")
public class Programa implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy="programa")
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

//  @NotNull(message="Descrição não pode ser nula")       
    @Column(nullable=false,length=60)
    private String descricao;
    
//  @NotNull(message="Descrição não pode ser nula")       
    @Column(nullable=false,length=60)
    private String descricaomenu;    
    
//  @NotNull(message="Descrição não pode ser nula")       
    @Column(nullable=false,length=60)
    private String descatalho;    

//  @NotNull(message="O código não pode ser nulo")
//  @NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;
    
//  @NotNull(message="Caminho não pode ser nulo")       
//  @Column(nullable=false,length=200)
    @Column()    
    private String caminho;
    
    @Column()    
    private boolean vermenu;      

    @Column(length=1)
    private String inativo;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @Column(length=1)
    private String modificado;    
    
//  @Length(max=200, message="Tamanho máximo da observação é 200.")     
    @Column(length=200)
    private String obs;  
    

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    @Valid
    private Empresa empresa;
    
    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)    
    @JoinColumn(name = "Programa_id")
    private List<UsuarioProgramaEmail> listUsuarioProgramaEmail = new ArrayList<UsuarioProgramaEmail>();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<UsuarioProgramaEmail> getListUsuarioProgramaEmail() {
        return listUsuarioProgramaEmail;
    }

    public void setListUsuarioProgramaEmail(List<UsuarioProgramaEmail> listUsuarioProgramaEmail) {
        this.listUsuarioProgramaEmail = listUsuarioProgramaEmail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getDescricaomenu() {
        return descricaomenu;
    }

    public void setDescricaomenu(String descricaomenu) {
        this.descricaomenu = descricaomenu;
    }

    public boolean isVermenu() {
        return vermenu;
    }

    public void setVermenu(boolean vermenu) {
        this.vermenu = vermenu;
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

    public String getDescatalho() {
        return descatalho;
    }

    public void setDescatalho(String descatalho) {
        this.descatalho = descatalho;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
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
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
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