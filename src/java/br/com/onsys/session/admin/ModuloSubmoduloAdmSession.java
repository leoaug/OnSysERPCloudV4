package br.com.onsys.session.admin;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Modulo;
import br.com.onsys.entidades.seguranca.ModuloSubmodulo;
import br.com.onsys.entidades.seguranca.Submodulo;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ModuloSubmoduloAdmSession extends BasicSessionBean {
    
    public List<ModuloSubmodulo> getAll() {
        return getList(ModuloSubmodulo.class,"select a "
                + "from ModuloSubmodulo a, Modulo c, Submodulo d "
                + "where a.modulo       = c  "
                + "  and a.submodulo    = d  ");
    }

    public List<ModuloSubmodulo> getAllByModulo(Modulo modulo) {
        return getList(ModuloSubmodulo.class,"select a "
                + "from ModuloSubmodulo a, Modulo c, Submodulo d "
                + "where a.modulo       = c  "
                + "  and a.modulo       = ?1 "
                + "  and a.submodulo    = d  ",modulo);
    }
    
    public List<ModuloSubmodulo> getListModuloSubmodulo(Modulo modulo, Submodulo submodulo) {
        return getList(ModuloSubmodulo.class,"select a "
                + "from ModuloSubmodulo a, Modulo c, Submodulo d "
                + "where a.modulo       = c  "
                + "  and a.submodulo    = d  "                
                + "  and a.modulo       = ?1 "
                + "  and a.submodulo    = ?2 ",modulo, submodulo);
    }
    
    public ModuloSubmodulo getByUltimoModuloSubmodulo(int empresa, int modulo, int submodulo) {
        return getUltPojo(ModuloSubmodulo.class,""
                + "select a "
                + "from   Modulo m, ModuloSubmodulo a, Submodulo s, Empresa e "
                + "where  a.modulo      = m     "
                + "  and  a.submodulo   = s     "
                + "  and  a.empresa     = e     "                
                + "  and  e.id          = ?1    "
                + "  and  m.id          = ?2    "
                + "  and  s.id          = ?3    ",1, empresa, modulo, submodulo);
    }        
    
    public ModuloSubmodulo getModuloSubmoduloById(int id) {
        return getPojo(ModuloSubmodulo.class,id);
    }
    
    public ModuloSubmodulo getModuloSubmoduloByDescricao(String descricao) {
        return getPojo(ModuloSubmodulo.class,"select modulosubmodulo "
                + "from ModuloSubmodulo modulosubmodulo "
                + "where modulosubmodulo.descricao = ?1",descricao);
    }
    
    public ModuloSubmodulo save(ModuloSubmodulo emp) {
        getEm().persist(emp);
        return emp;
    }

    public ModuloSubmodulo set(ModuloSubmodulo emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(ModuloSubmodulo emp) {
        ModuloSubmodulo empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}