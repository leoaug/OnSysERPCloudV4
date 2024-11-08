package br.com.onsys.entidades.comercial;

import java.io.Serializable;
import javax.persistence.*;

public class UsuRepresws implements Serializable {
    
    private static final long serialVersionUID = 5L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;   
    
    private Integer empresaId;    
    
    private Integer usuarioId;  
    
    private Integer representanteId;  
    
    private String representante;          

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Integer getRepresentanteId() {
        return representanteId;
    }

    public void setRepresentanteId(Integer representanteId) {
        this.representanteId = representanteId;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

}