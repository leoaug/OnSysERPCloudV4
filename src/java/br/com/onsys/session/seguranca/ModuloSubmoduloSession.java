package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Modulo;
import br.com.onsys.entidades.seguranca.ModuloSubmodulo;
import br.com.onsys.entidades.seguranca.Submodulo;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ModuloSubmoduloSession extends BasicSessionBean {
    
    public List<ModuloSubmodulo> getAll(int idEmpresa) {
        return getList(ModuloSubmodulo.class,"select a "
                + "from ModuloSubmodulo a, Empresa b, Modulo c, Submodulo d "
                + "where a.empresa      = b "
                + "  and a.modulo       = c "
                + "  and a.submodulo    = d "
                + "  and b.id           = ?1 ",idEmpresa);
    }

    public List<ModuloSubmodulo> getAllByModulo(int idEmpresa, Modulo modulo) {
        return getList(ModuloSubmodulo.class,"select a "
                + "from ModuloSubmodulo a, Empresa b, Modulo c, Submodulo d "
                + "where a.empresa      = b  "
                + "  and a.modulo       = c  "
                + "  and a.modulo       = ?2 "
                + "  and a.submodulo    = d  "
                + "  and b.id           = ?1 ",idEmpresa, modulo);
    }
    
    public List<ModuloSubmodulo> getListModuloSubmodulo(int idEmpresa, Modulo modulo, Submodulo submodulo) {
        return getList(ModuloSubmodulo.class,"select a "
                + "from ModuloSubmodulo a, Empresa b, Modulo c, Submodulo d "
                + "where a.empresa      = b  "
                + "  and a.modulo       = c  "
                + "  and a.submodulo    = d  "                
                + "  and a.modulo       = ?2 "
                + "  and a.submodulo    = ?3 "
                + "  and b.id           = ?1 ",idEmpresa, modulo, submodulo);
    }
    
    public ModuloSubmodulo getModuloSubmoduloById(int id) {
        return getPojo(ModuloSubmodulo.class,id);
    }
    /*
    public AtividadeExecutor getAtividadeExecutorByUsrAtiv(int idUsr, int idAtiv) {
        return getPojo(AtividadeExecutor.class,"select ativexec "
                + "from AtividadeExecutor ativexec, Usuario usr, Atividade atv "
                + "where ativexec.executor = usr and ativexec.atividade = atv and usr.id  = ?1 and  atv.id = ?2", idUsr, idAtiv);
    }
    */    
    public ModuloSubmodulo getModuloSubmoduloByDescricao(String descricao) {
        return getPojo(ModuloSubmodulo.class,"select modulosubmodulo "
                + "from ModuloSubmodulo modulosubmodulo "
                + "where modulosubmodulo.descricao = ?1",descricao);
    }
    /*

    public List<ModuloSubmodulo> getModuloSubmoduloByUsuario (int id) {
        return getList(ModuloSubmodulo.class,"select ativexec from AtividadeExecutor ativexec,  "
                + "Usuario usr where ativexec.executor = usr and usr.id  = ?1", id);
    }
  
    */      
    public ModuloSubmodulo saveModuloSubmodulo(ModuloSubmodulo emp) {
        getEm().persist(emp);
        return emp;
    }

    public ModuloSubmodulo setModuloSubmodulo(ModuloSubmodulo emp) {
        getEm().merge(emp);
        return emp;
    }

    public void removeModuloSubmodulo(ModuloSubmodulo emp) {
        ModuloSubmodulo empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}