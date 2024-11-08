package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.UsuarioPrograma;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioProgramaSession extends BasicSessionBean {
    
    public List<UsuarioPrograma> getAllUsrPrograma(int idEmpresa) {
        return getList(UsuarioPrograma.class,"select usrmodulo "
                + "from UsuarioModulo usrmodulo, Empresa emp, Usuario usr, Modulo modulo "
                + "where usrmodulo.empresa = emp "
                + "and usrmodulo.usuario = usr "
                + "and usrmodulo.modulo = modulo "
                + "and emp.id = ?1 "
                + "order by usr.apelido",idEmpresa);
    }

    public UsuarioPrograma getUsrProgramaById(int id) {
        return getPojo(UsuarioPrograma.class,id);
    }
    
    public UsuarioPrograma getUsrProgramaByPrograma(int idEmpresa, int idUsr, String urlPrograma) {
        return getPojo(UsuarioPrograma.class,"select usrprog "
                + "from UsuarioPrograma usrprog, Empresa emp, Programa prg, Usuario usr "
                + "where usrprog.empresa = emp and usrprog.programa = prg and "
                + "usrprog.usuario = usr and emp.id = ?1 and usr.id = ?2 "
                + "and prg.caminho = ?3" , idEmpresa, idUsr, urlPrograma);
    }    
    
    public UsuarioPrograma save(UsuarioPrograma emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsuarioPrograma set(UsuarioPrograma emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsuarioPrograma emp) {
        UsuarioPrograma empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}