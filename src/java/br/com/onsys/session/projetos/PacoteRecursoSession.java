package br.com.onsys.session.projetos;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.projetos.PacoteRecurso;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class PacoteRecursoSession extends BasicSessionBean {
    
    public List<PacoteRecurso> getAll(int idEmpresa) {
        return getList(PacoteRecurso.class,"select a "
                + "from PacoteRecurso a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 ",idEmpresa);
    }
    
    public List<PacoteRecurso> getRecursoByPacote(int idEmpresa, int idPacote) {
        return getList(PacoteRecurso.class,"select a "
                + "from PacoteRecurso a,  Empresa emp "
                + "where a.empresa      = emp "
                + "  and emp.id         = ?1  "
                + "  and a.pacote_id    = ?2  ",idEmpresa, idPacote);
    }

    public List<PacoteRecurso> getPacoteByRecurso (int id, int idEmpresa) {
        return getList(PacoteRecurso.class,"select distinct b "
                + "from Componenteeap pacote, PacoteRecurso b, Empresa e "
                + " where b.pacote_id   = pacote.id "
                + "   and pacote.empresa   = e      "
                + "   and b.recurso_id     = ?1     "
                + "   and e.id             = ?2     ", id, idEmpresa);
    }    
    
    public PacoteRecurso getById(int id) {
        return getPojo(PacoteRecurso.class,id);
    }
    
    public PacoteRecurso getByUsrPacote(int idRecurso, int idPacote) {
        return getPojo(PacoteRecurso.class,"select a "
                + "from PacoteRecurso a "
                + "where a.recurso_id   = ?1  "
                + "  and a.pacote_id    = ?2  ", idRecurso, idPacote);
    }
    
    public PacoteRecurso getByDescricao(String descricao) {
        return getPojo(PacoteRecurso.class,"select a "
                + " from PacoteRecurso a "
                + "where a.descricao = ?1",descricao);
    }

    public List<PacoteRecurso> getByUsuario (int id) {
        return getList(PacoteRecurso.class,"select a "
                + "from PacoteRecurso a, Usuario usr "
                + " where a.recurso = usr "
                + "   and usr.id    = ?1", id);
    }
    
    public PacoteRecurso save(PacoteRecurso emp) {
        getEm().persist(emp);
        return emp;
    }

    public PacoteRecurso set(PacoteRecurso emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(PacoteRecurso emp) {
        PacoteRecurso empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}