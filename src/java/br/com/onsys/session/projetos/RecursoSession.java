package br.com.onsys.session.projetos;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.projetos.Recurso;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RecursoSession extends BasicSessionBean {

    public List<Recurso> getAll(int idEmpresa) {
        return getList(Recurso.class,""
                + "select a "
                + "from Recurso a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = ?1 "
                + "order by a.apelido", idEmpresa);
    }
    
    public Recurso getById(int id) {
        return getPojo(Recurso.class,id);
    }

    public Recurso getByNome(int idEmpresa, String nome) {
        return getPojo(Recurso.class,"select a "
                + "from Recurso a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id     = ?1  "
                + "  and a.nome     = ?2 ", idEmpresa, nome);
    } 
    
    public Recurso getByApelido(int idEmpresa, String apelido) {
        return getPojo(Recurso.class,"select a "
                + "from Recurso a, Empresa b "
                + "where a.empresa = b "
                + "  and a.apelido = ?2 "
                + "  and b.id      = ?1 ", idEmpresa, apelido);
    }
    
    public Recurso getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Recurso.class,"select a "
                + "from Recurso a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "  and a.codigo   = ?2",idEmpresa, codigo);
    }

    public Recurso getByIdUsuario(int idEmpresa, int idUsuario) {
        return getPojo(Recurso.class,"select a "
                + "from Recurso a, Empresa emp, Usuario usr "
                + "where a.empresa  = emp "
                + "  and a.usuario  = usr "
                + "  and emp.id     = ?1  "
                + "  and usr.id     = ?2 ",idEmpresa, idUsuario);
    }
    
    public Recurso save(Recurso emp) {
        getEm().persist(emp);
        return emp;
    }

    public Recurso set(Recurso emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Recurso emp) {
        Recurso empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}