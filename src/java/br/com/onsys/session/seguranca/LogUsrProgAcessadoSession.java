package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.LogUsrProgAcessado;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class LogUsrProgAcessadoSession extends BasicSessionBean {
    
    public List<LogUsrProgAcessado> getAllUsrPrograma(int idEmpresa) {
        return getList(LogUsrProgAcessado.class,"select usrmodulo "
                + "from UsuarioModulo usrmodulo, Empresa emp, Usuario usr, Modulo modulo "
                + "where usrmodulo.empresa = emp "
                + "and usrmodulo.usuario = usr "
                + "and usrmodulo.modulo = modulo "
                + "and emp.id = ?1 "
                + "order by usr.apelido",idEmpresa);
    }

    public LogUsrProgAcessado getUsrProgramaById(int id) {
        return getPojo(LogUsrProgAcessado.class,id);
    }
    
    public LogUsrProgAcessado getUsrProgramaByPrograma(int idEmpresa, int idUsr, String urlPrograma) {
        return getPojo(LogUsrProgAcessado.class,"select usrprog "
                + "from UsuarioPrograma usrprog, Empresa emp, Programa prg, Usuario usr "
                + "where usrprog.empresa = emp and usrprog.programa = prg and "
                + "usrprog.usuario = usr and emp.id = ?1 and usr.id = ?2 "
                + "and prg.caminho = ?3" , idEmpresa, idUsr, urlPrograma);
    }    
    
    public LogUsrProgAcessado save(LogUsrProgAcessado emp) {
        getEm().persist(emp);
        return emp;
    }

    public LogUsrProgAcessado set(LogUsrProgAcessado emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(LogUsrProgAcessado emp) {
        LogUsrProgAcessado empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}