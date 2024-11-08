package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.UsuUsuMestre;
import br.com.onsys.entidades.seguranca.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuUsuMestreSession extends BasicSessionBean {
    
    public List<UsuUsuMestre> getAll(int idEmpresa) {
        return getList(UsuUsuMestre.class,""
                + "select a "
                + "from UsuUsuMestre a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = ?1 ",idEmpresa);
    }
    
    //CONFIRMAR SE PODE DELETAR ESSE METODO
    //public List<UsuUsuMestre> getUsuariosDoUsuarioMestre(Empresa empresa, Usuario usuario) {
    //    return getList(UsuUsuMestre.class,"  "
    //            + "select a               "
    //            + "from   UsuUsuMestre a     "
    //            + " where  a.empresa = ?1 "
    //            + "   and  a.usuario = ?2 ", empresa, usuario);
    //}
    
    
    //RETORNA OS USUARIOS DO USUARIOMESTRE
    public List<UsuUsuMestre> getAllByUsrMestre(int empresaId, int usuarioId) {
        return getList(UsuUsuMestre.class,""
                + "select a "
                + "from   UsuUsuMestre a, Usuario r, Empresa e "
                + " where  a.usuarioMestre = r  "
                + "   and  a.empresa = e  "
                + "   and  e.id      = ?1 "
                + "   and  r.id      = ?2 "
                + "   and (r.inativo = ' ' or r.inativo is null or "
                + "        r.inativo = 'N') ", empresaId, usuarioId);
    }
    
    //RETORNA OS USUARIOS DO USUARIOMESTRE
//    public List<Usuario> getAllUsrByUsrMestre(int empresaId, int usuarioId) {
//        return getList(Usuario.class,""
//                + "select r "
//                + "from   UsuUsuMestre a, Usuario r, Empresa e "
//                + " where  a.usuarioMestre = r  "
//                + "   and  a.empresa = e  "
//                + "   and  e.id      = ?1 "
//                + "   and  r.id      = ?2 "
//                + "   and (r.inativo = ' ' or r.inativo is null or "
//                + "        r.inativo = 'N') ", empresaId, usuarioId);
//    }    
    
    
/*
    public List<UsuUsuMestre> getAllByUsrRepres(int empresa, int usuario) {
        return getList(UsuUsuMestre.class,""
                + "select a "
                + "from   Representante r, UsuRepres a "
                + "where  r.id = a.representante "
                + "  and  a.empresa = ?1 "
                + "  and  a.usuario = ?2 "
                + " order by r.apelido ", empresa, usuario);
    }    
*/
    
    // UTILIZADO NA CRIAÇÃO DOS DUALLIST 
    public List<UsuUsuMestre> getByUsr(int empresa, int usuario) {
        return getList(UsuUsuMestre.class,""
                + "select a "
                + "from   UsuUsuMestre a, Usuario u, Empresa e "
                + "where  a.usuario         = u     "
                + "  and  a.empresa         = e     "                
                + "  and  e.id              = ?1    "
                + "  and  u.id              = ?2    ", empresa, usuario);
    }    
    
    // UTILIZADO NA CRIAÇÃO DOS DUALLIST DO USUARIO X MESTRE (USUARIO QUE TEM ACESSO AS INFORMACOES DE OUTROS USUARIOS)
    // USUARIO MESTRE E O USUARIO QUE TEM ACESSO A INFORMARIOS DE OUTROS USUARIOS 
    public List<UsuUsuMestre> getByUsrMestre(int empresa, int usuario, int usuarioMestre) {
        return getList(UsuUsuMestre.class,""
                + "select a "
                + "from   UsuUsuMestre a, Usuario u, Empresa e, Usuario m "
                + "where  a.usuarioMestre   = m     "
                + "  and  a.usuario         = u     " 
                + "  and  a.empresa         = e     "                
                + "  and  e.id              = ?1    "
                + "  and  u.id              = ?2    "
                + "  AND  m.id              = ?3    ", empresa, usuario, usuarioMestre);
    }  
    
    public UsuUsuMestre getByUsuarioRepres(int empresa, int usuario, int idRepres) {
        return getPojo(UsuUsuMestre.class,""
                + "select a "
                + "from   Representante r, UsuRepres a, Usuario u, Empresa e "
                + "where  a.representante   = r     "
                + "  and  a.usuario         = u     "
                + "  and  a.empresa         = e     "                
                + "  and  e.id              = ?1    "
                + "  and  u.id              = ?2    "
                + "  and  r.id              = ?3    ", empresa, usuario, idRepres);
    }    

    public UsuUsuMestre getById(int id) {
        return getPojo(UsuUsuMestre.class,id);
    }
    
    public UsuUsuMestre save(UsuUsuMestre emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsuUsuMestre set(UsuUsuMestre emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsuUsuMestre emp) {
        UsuUsuMestre empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}