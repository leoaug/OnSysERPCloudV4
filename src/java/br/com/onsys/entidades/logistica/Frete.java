
package br.com.onsys.entidades.logistica;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class Frete implements Serializable {
    
    @OneToMany(mappedBy="frete")
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @Column(nullable=false,length=60)
    private String descricao;

    @Column(nullable=false,length=20)
    private String codigo;

    @Column(nullable=false,length=20)
    private String tipoTabela;  // SE A TABELA É POR FRETE PESO OU POR PESO CUBADO
    
    @Column()
    private double gris;

    @Column()
    private double seguro;
    
    @Column()
    private double outrosPercentual;
    
    @Column()
    private double outrosValor;
    
    @Column()
    private double fatorCubagem;    

    @Column()
    private double adValorem;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datavalini;

    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datavalfim;
    
    @Length(max=200, message="Tamanho máximo da observação do item é 200.")    
    @Column(length=200)
    private String obs;    
    
    @Column(length=1)
    private String inativo;    
    
    @Column(length=1)
    private String modificado;    
    
    @Column()
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datainativo;    
    
    @Column(length=1)
    private String deletado;  
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Transportadora transportadora;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Estabelecimento estabelecimento;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)    
    @JoinColumn(name = "FreteFaixas_id")
    private List<FreteFaixas> listFreteFaixas = new ArrayList<FreteFaixas>();
    
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public double getGris() {
        return gris;
    }

    public void setGris(double gris) {
        this.gris = gris;
    }

    public String getTipoTabela() {
        return tipoTabela;
    }

    public void setTipoTabela(String tipoTabela) {
        this.tipoTabela = tipoTabela;
    }
    
    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public double getOutrosPercentual() {
        return outrosPercentual;
    }

    public void setOutrosPercentual(double outrosPercentual) {
        this.outrosPercentual = outrosPercentual;
    }

    public double getOutrosValor() {
        return outrosValor;
    }

    public void setOutrosValor(double outrosValor) {
        this.outrosValor = outrosValor;
    }
    
    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public double getFatorCubagem() {
        return fatorCubagem;
    }

    public void setFatorCubagem(double fatorCubagem) {
        this.fatorCubagem = fatorCubagem;
    }

    public double getAdValorem() {
        return adValorem;
    }

    public void setAdValorem(double adValorem) {
        this.adValorem = adValorem;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

    public String getModificado() {
        return modificado;
    }

    public void setModificado(String modificado) {
        this.modificado = modificado;
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

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatavalfim() {
        return datavalfim;
    }

    public void setDatavalfim(Date datavalfim) {
        this.datavalfim = datavalfim;
    }

    public Date getDatavalini() {
        return datavalini;
    }

    public void setDatavalini(Date datavalini) {
        this.datavalini = datavalini;
    }

    public List<FreteFaixas> getListFreteFaixas() {
        return listFreteFaixas;
    }

    public void setListFreteFaixas(List<FreteFaixas> listFreteFaixas) {
        this.listFreteFaixas = listFreteFaixas;
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
        if (!(object instanceof Frete)) {
            return false;
        }
        Frete other = (Frete) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.onsys.entidades.logistica.Frete[id=" + id + "]";
    }

}