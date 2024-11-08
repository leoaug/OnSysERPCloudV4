package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.UsuarioProgramaEmail;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioProgramaEmailSession extends BasicSessionBean {
    
    public List<UsuarioProgramaEmail> getAll(int idEmpresa) {
        return getList(UsuarioProgramaEmail.class,""
                + "select a "
                + "from UsuarioProgramaEmail a, Empresa e "
                + "where a.empresa = e "
                + "  and e.id      = ?1 ",idEmpresa);
    }
    
    public List<UsuarioProgramaEmail> getAllByPrograma(Empresa empresa, Programa programa) {
        return getList(UsuarioProgramaEmail.class,""
                + "select a "
                + "from   UsuarioProgramaEmail a, Programa p    "
                + " where  p                = a.programa    "
                + "   and  a.empresa        = ?1 "
                + "   and  a.programa       = ?2 "
                + "   and (p.inativo        = ' ' or p.inativo is null or "
                + "        p.inativo        = 'N') ", empresa, programa);
    }

    // UTILIZADO NA CRIAÇÃO DOS DUALLIST 
    public List<UsuarioProgramaEmail> getByUsrPrograma(int idEmpresa, int idUsuario, int idPrograma) {
        return getList(UsuarioProgramaEmail.class,""
                + "select a "
                + "from   Programa p, UsuarioProgramaEmail a, Usuario u, Empresa e "
                + "where  a.programa      = p     "
                + "  and  a.usuario       = u     "
                + "  and  a.empresa       = e     "                
                + "  and  e.id            = ?1    "
                + "  and  u.id            = ?2    "
                + "  and  p.id            = ?3    ", idEmpresa, idUsuario, idPrograma);
    }    

    public UsuarioProgramaEmail getById(int id) {
        return getPojo(UsuarioProgramaEmail.class,id);
    }
    
    public UsuarioProgramaEmail save(UsuarioProgramaEmail emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsuarioProgramaEmail set(UsuarioProgramaEmail emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsuarioProgramaEmail emp) {
        UsuarioProgramaEmail empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}