
package br.com.onsys.entidades.projetos;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Projetows implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @Basic(optional=false)
    private Integer id;

    @NotNull(message="A descrião não pode ser nula")
    @NotEmpty(message="A descricao não pode ser branco")
    @Column(nullable=false,length=60)
    private String descricao;

    @NotEmpty(message="O código não pode ser branco")
    @Column(nullable=false,length=20)
    private String codigo;

    private Integer gestorId;

    private Integer empresaId;

    private Integer estabelecimento;
    
    private Integer  participante;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getGestorId() {
        return gestorId;
    }

    public void setGestorId(Integer gestorId) {
        this.gestorId = gestorId;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public Integer getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Integer estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Integer getParticipante() {
        return participante;
    }

    public void setParticipante(Integer participante) {
        this.participante = participante;
    }

}