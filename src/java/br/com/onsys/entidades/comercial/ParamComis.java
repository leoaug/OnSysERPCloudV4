
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table
@Cacheable(false)
public class ParamComis implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @OneToMany(mappedBy="paramcomis")    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtcomisini;

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dtcomisfim;

    @Column(length=4)
    private String ano;
    
    @Column(length=2)
    private String mes;
    
    @Column(length=20)
    private String basecomis; // define se a base da comissão é sobre valor líquido ou bruto 
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDtcomisini() {
        return dtcomisini;
    }

    public void setDtcomisini(Date dtcomisini) {
        this.dtcomisini = dtcomisini;
    }

    public String getBasecomis() {
        return basecomis;
    }

    public void setBasecomis(String basecomis) {
        this.basecomis = basecomis;
    }
    
    public Date getDtcomisfim() {
        return dtcomisfim;
    }

    public void setDtcomisfim(Date dtcomisfim) {
        this.dtcomisfim = dtcomisfim;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
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
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParamComis)) {
            return false;
        }
        ParamComis other = (ParamComis) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.comercial.ParamComis[id=" + id + "]";
    }

}