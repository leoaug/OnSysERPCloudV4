package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.UsrParamProg;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsrParamProgSession extends BasicSessionBean {

    public UsrParamProg getUsrProgramaById(int id) {
        return getPojo(UsrParamProg.class,id);
    }
    
    public UsrParamProg getUsrProgramaByPrograma(int idEmpresa, int idUsuario, int idPrograma) {
        return getPojo(UsrParamProg.class,"select a "
                + "from UsrParamProg a, Empresa e, Programa b, Usuario c "
                + "where a.empresa  = e "
                + "  and a.programa = b "
                + "  and a.usuario  = c "
                + "  and e.id       = ?1 "
                + "  and c.id       = ?2 "
                + "  and b.id       = ?3" , idEmpresa, idUsuario, idPrograma);
    }    
    
    public UsrParamProg save(UsrParamProg emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsrParamProg set(UsrParamProg emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsrParamProg emp) {
        UsrParamProg empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}