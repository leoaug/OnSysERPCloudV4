
package br.com.onsys.entidades.projetos;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.tipos.SituacaoFA;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class FichaAprop implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(name="numfa")
    private Integer numfa;

    @Column(nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataemissao;

    @Length(max=20, message="Tamanho máximo do código da FA é 20.")    
    @Column(nullable=false,length=20)
    private String codigo;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private SituacaoFA situacao = SituacaoFA.Aberta;    

//  @NotNull
    @OneToMany(mappedBy="fichaaprop")

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Usuario usuario;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public Integer getNumfa() {
        return numfa;
    }

    public void setNumfa(Integer numfa) {
        this.numfa = numfa;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public SituacaoFA getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoFA situacao) {
        this.situacao = situacao;
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
        if (!(object instanceof FichaAprop)) {
            return false;
        }
        FichaAprop other = (FichaAprop) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.projetos.FichaAprop[id=" + id + "]";
    }

}