
package br.com.onsys.entidades.comercial;

import br.com.onsys.entidades.basico.Empresa;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Rel_MetaPremio_Sintetico implements Serializable {
    private static final long serialVersionUID = 1L;    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;    
    
    @Column(length=20)
    private String supervisor;
    
    @Column(length=20)
    private String subCategoria;    
    
    @Column()
    private int quantidadeMeta;    
    
    @Column()
    private int quantidadeVendida;    
    
    @ManyToOne()
    @JoinColumn(referencedColumnName="id",columnDefinition="integer")
    private Empresa empresa;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
    
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }    

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public int getQuantidadeMeta() {
        return quantidadeMeta;
    }

    public void setQuantidadeMeta(int quantidadeMeta) {
        this.quantidadeMeta = quantidadeMeta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((supervisor   == null) ? 0 : supervisor.hashCode());
        result = prime * result + ((subCategoria == null) ? 0 : subCategoria.hashCode());        
        return result;
    }        
    
    @Override
    public boolean equals(Object obj) {
        /*
        Rel_MetaPremio_Sintetico other = (Rel_MetaPremio_Sintetico) obj;
        // verifica se o nome e cidade são iguais
        return this.supervisor.equals(other.supervisor);        
        */        
        //se nao forem objetos da mesma classe sao objetos diferentes
        if(!(obj instanceof Rel_MetaPremio_Sintetico)) return false; 

        //se forem o mesmo objeto, retorna true
        if(obj == this) return true;

        // aqui o cast é seguro por causa do teste feito acima
        Rel_MetaPremio_Sintetico meta = (Rel_MetaPremio_Sintetico) obj; 

        //aqui você compara a seu gosto, o ideal é comparar atributo por atributo
        //return this.supervisor.equals(meta.getSupervisor());        
        
        return this.supervisor.equals(meta.getSupervisor()) &&
               this.subCategoria.equals(meta.getSubCategoria());        
        
    }

}