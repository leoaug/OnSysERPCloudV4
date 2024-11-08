package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.seguranca.UsuarioEmpresa;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioEmpresaSession extends BasicSessionBean {
    
    public List<UsuarioEmpresa> getAll(int idEmpresa) {
        return getList(UsuarioEmpresa.class,"select a "
                + "from UsuarioEmpresa a, Empresa emp, Usuario u "
                + "where a.empresa = emp "
                + "  and a.usuario = u   "
                + "  and emp.id    = ?1  "
                + " order by u.email     ",idEmpresa);
    }

    public List<UsuarioEmpresa> getAllByUsuario(Empresa empresa, Usuario usuario) {
        return getList(UsuarioEmpresa.class,"select a "
                + "from UsuarioEmpresa a "
                + "where a.empresa = ?1 "
                + "  and a.usuario = ?2 ",empresa, usuario);
    }

    //LISTA AS EMPRESAS QUE O USUARIO TEM ACESSO
    public List<UsuarioEmpresa> getAllByUsuario(Usuario usuario) {
        return getList(UsuarioEmpresa.class,"select a "
                + "from UsuarioEmpresa a "
                + "where a.usuario = ?1 ", usuario);
    }

    //alrc - inicio
    public UsuarioEmpresa getByUltimaEmpresa(Usuario usuario) {
        return getPojo(UsuarioEmpresa.class,"select a "
                + "from UsuarioEmpresa a "
                + "where a.usuario = ?1 "
                + "and a.ultimo = TRUE", usuario);
    }
    //alrc - fim
    public UsuarioEmpresa getById(int id) {
        return getPojo(UsuarioEmpresa.class,id);
    }
    
    public UsuarioEmpresa getUsuarioEmpresa(int idEmpresa, int idUsr) {
        return getPojo(UsuarioEmpresa.class,"select a "
                + "from UsuarioEmpresa a, Empresa e, Usuario u "
                + "where a.empresa = e "
                + "  and a.usuario = u "
                + "  and e.id = ?1 and u.id = ?2 ",idEmpresa, idUsr);
    }

    public List<UsuarioEmpresa> getListaUsuarioEmpresa(int idEmpresa, int idUsr) {
        return getList(UsuarioEmpresa.class,"select a "
                + "from UsuarioEmpresa a, Empresa emp, Usuario usr "
                + "where a.empresa  = emp    "
                + "and a.usuario    = usr    "
                + "and emp.id       = ?1 "
                + "and usr.id       = ?2 ",idEmpresa, idUsr);
    }
    
    /*
    public AtividadeExecutor getAtividadeExecutorByUsrAtiv(int idUsr, int idAtiv) {
        return getPojo(AtividadeExecutor.class,"select ativexec "
                + "from AtividadeExecutor ativexec, Usuario usr, Atividade atv "
                + "where ativexec.executor = usr and ativexec.atividade = atv and usr.id  = ?1 and  atv.id = ?2", idUsr, idAtiv);
    }
    
    public AtividadeExecutor getAtividadeExecutorByDescricao(String descricao) {
        return getPojo(AtividadeExecutor.class,"select ativexec from AtividadeExecutor ativexec "
                + "where ativexec.descricao = ?1",descricao);
    }

    public List<ModuloSubmodulo> getModuloSubmoduloByUsuario (int id) {
        return getList(ModuloSubmodulo.class,"select ativexec from AtividadeExecutor ativexec,  "
                + "Usuario usr where ativexec.executor = usr and usr.id  = ?1", id);
    }
    * 
    */
    
    public UsuarioEmpresa save(UsuarioEmpresa emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsuarioEmpresa set(UsuarioEmpresa emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsuarioEmpresa emp) {
        UsuarioEmpresa empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}