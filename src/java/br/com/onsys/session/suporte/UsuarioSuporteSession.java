package br.com.onsys.session.suporte;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.suporte.UsuarioSuporte;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioSuporteSession extends BasicSessionBean {
    
    public UsuarioSuporte getByUsuario(int idUsuario, int idEmpresa ) {
        return getPojo(UsuarioSuporte.class,""
                + "select a "  
                + "from UsuarioSuporte a, Usuario b, Empresa e "
                + "where a.usuario = b "
                + "  and a.empresa = e "
                + "  and b.id      = ?1 "
                + "  and e.id      = ?2 ", idUsuario, idEmpresa);
    }

    public List<UsuarioSuporte> getAllAdmSuporte(int idEmpresa) {
        return getList(UsuarioSuporte.class,""
                + "select a "
                + "from UsuarioSuporte a, Empresa e "
                + "where  a.empresa    = e      "
                + "  and  e.id         = ?1     "
                + "  and  a.admSuporte = 1      ", idEmpresa);
    }    
   
    public UsuarioSuporte getById(int id) {
        return getPojo(UsuarioSuporte.class,id);
    }
    
    public UsuarioSuporte save(UsuarioSuporte emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsuarioSuporte set(UsuarioSuporte emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsuarioSuporte emp) {
        UsuarioSuporte empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}