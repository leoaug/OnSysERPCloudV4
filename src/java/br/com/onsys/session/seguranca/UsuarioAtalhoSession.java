package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.UsuarioAtalho;
import java.util.List;
import javax.ejb.*;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioAtalhoSession extends BasicSessionBean {
    
    public List<UsuarioAtalho> getAllUsrAtalho(int idUsuario) {
        return getList(UsuarioAtalho.class,"select usratalho "
                + "from UsuarioAtalho usratalho"
                + "and emp.id = ?1 ",idUsuario);
    }

    public UsuarioAtalho getUsrAtalhoById(int id) {
        return getPojo(UsuarioAtalho.class,id);
    }
    
/*    public UsuarioAtalho getUsrProgramaByPrograma(int idEmpresa, int idUsr, String urlPrograma) {
        return getPojo(UsuarioAtalho.class,"select usrprog "
                + "from UsuarioPrograma usrprog, Empresa emp, Programa prg, Usuario usr "
                + "where usrprog.empresa = emp and usrprog.programa = prg and "
                + "usrprog.usuario = usr and emp.id = ?1 and usr.id = ?2 "
                + "and prg.caminho = ?3" , idEmpresa, idUsr, urlPrograma);
    }    
*/
    public List<UsuarioAtalho> getUsrAtalhoByUsrSeq(int idUsr, int seq) {
        return getList(UsuarioAtalho.class,"select usratalho "
                + "from UsuarioAtalho usratalho, Usuario usr "
                + "where usratalho.usuario = usr "
                + "and usr.id = ?1 and usratalho.seq = ?2",idUsr, seq);
    }

    
    public List<UsuarioAtalho> getUsrAtalhoByUsrPrg(int idUsr, int idPrg) {
        return getList(UsuarioAtalho.class,"select usratalho "
                + "from UsuarioAtalho usratalho, Usuario usr, Programa prg "
                + "where usratalho.usuario = usr and usratalho.programa = prg "
                + "and usr.id = ?1 and prg.id = ?2",idUsr, idPrg);
    }
    
    public List<UsuarioAtalho> getByUsr(int idUsr) {
        return getList(UsuarioAtalho.class,"select usratalho "
                + "from UsuarioAtalho usratalho, Usuario usr "
                + "where usratalho.usuario = usr "
                + "and usr.id = ?1",idUsr);
    }

    public List<UsuarioAtalho> getByUsrLista(int idUsr) {
        return getList(UsuarioAtalho.class,"select usratalho "
                + "from UsuarioAtalho usratalho, Usuario usr "
                + "where usratalho.usuario = usr "
                + "and usr.id = ?1 order by usratalho.seq desc",idUsr);
                
    }

    
/*    
    public UsuarioPrograma getUsrProgramaByPrograma(int idUsr, String urlPrograma) {
        return getPojo(UsuarioPrograma.class,"select usrprog "
                + "from UsuarioPrograma usrprog, Programa prog, Usuario usr "
                + "where usrprog.programa = prog and usrprog.usuario = usr "
                + "and usr.id = ?1 and prog.caminho = ?2 ",idUsr, urlPrograma);
    }
    
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
    
    public UsuarioAtalho save(UsuarioAtalho emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsuarioAtalho set(UsuarioAtalho emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsuarioAtalho emp) {
        UsuarioAtalho empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}
