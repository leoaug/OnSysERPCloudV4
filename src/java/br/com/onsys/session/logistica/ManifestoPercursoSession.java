package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Estado;
import br.com.onsys.entidades.logistica.Manifesto;
import br.com.onsys.entidades.logistica.ManifestoPercurso;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ManifestoPercursoSession extends BasicSessionBean {
    
    private String jpqlCount = " ";    
    
    public List<ManifestoPercurso> getAll(Manifesto manifesto) {
        return getList(ManifestoPercurso.class,""
                + "select a "
                + "from ManifestoPercurso a "
                + "where a.manifesto      = ?1  "
                + " order by a.sequencia        " , manifesto);
    }
    
    public ManifestoPercurso getByManifesto(Estado estado, Manifesto manifesto) {
        return getPojo(ManifestoPercurso.class,"select a "
                + "from ManifestoPercurso a "
                + "where a.estado         = ?1  "
                + "  and a.manifesto      = ?2  ",estado, manifesto);
    }
    
    public ManifestoPercurso getById(int id) {
        return getPojo(ManifestoPercurso.class,id);
    }
    
    public ManifestoPercurso save(ManifestoPercurso emp) {
        getEm().persist(emp);
        return emp;
    }

    public ManifestoPercurso set(ManifestoPercurso emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ManifestoPercurso emp) {
        ManifestoPercurso empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}