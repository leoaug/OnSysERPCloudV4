package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.entidades.seguranca.UsuarioModulo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class UsuarioModuloSession extends BasicSessionBean {
    
    private String jpqlCount = " ";  
    
    public List<UsuarioModulo> getAll(int idEmpresa) {
        return getList(UsuarioModulo.class,"select usrmodulo "
                + "from UsuarioModulo usrmodulo, Empresa emp "
                + "where usrmodulo.empresa = emp "
//              + "and usrmodulo.usuario = usr "
//              + "and usrmodulo.modulo = modulo "
                + "and emp.id = ?1 ",idEmpresa);
    }

    public List<UsuarioModulo> getAllByUsuario(Empresa empresa, Usuario usuario) {
        return getList(UsuarioModulo.class,"select a "
                + "from UsuarioModulo a "
                + "where a.empresa = ?1 "
                + "  and a.usuario = ?2 ",empresa, usuario);
    }
    
    public UsuarioModulo getById(int id) {
        return getPojo(UsuarioModulo.class,id);
    }
    
    public UsuarioModulo getUsuarioModulo(int idEmpresa, int idUsr, int idMod) {
        return getPojo(UsuarioModulo.class,"select usrmodulo "
                + "from UsuarioModulo usrmodulo, Empresa emp, Usuario usr, Modulo modulo "
                + "where usrmodulo.empresa = emp    "
                + "and usrmodulo.usuario   = usr    "
                + "and usrmodulo.modulo    = modulo "
                + "and emp.id    = ?1 "
                + "and usr.id    = ?2 "
                + "and modulo.id = ?3 ",idEmpresa, idUsr, idMod);
    }

    public List<UsuarioModulo> getListaUsuarioModulo(int idEmpresa, int idUsr, int idMod) {
        return getList(UsuarioModulo.class,"select usrmodulo "
                + "from UsuarioModulo usrmodulo, Empresa emp, Usuario usr, Modulo modulo "
                + "where usrmodulo.empresa  = emp    "
                + "and usrmodulo.usuario    = usr    "
                + "and usrmodulo.modulo     = modulo "
                + "and emp.id       = ?1 "
                + "and usr.id       = ?2 "
                + "and modulo.id    = ?3",idEmpresa, idUsr, idMod);
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
    
    public List<Usuario> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.apelido ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Usuario a, Empresa emp, UsuarioEmpresa u "
                + "where a.empresa = u.empresa "
                + "  and u.usuario = a         "
                + "  and emp.id = :empresaID   ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.apelido      like :globalFilter or "
                               + "a.email        like :globalFilter)");
        
        return getListPaged(Usuario.class,query, empresaID, first, pageSize, filters);
    }
    
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " and ";
        jpqlCount = "";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (a.apelido                   like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.email                     like '%"+entry.getValue()+ '%'+"')";
                } else {
                   jpqlCount += " and a." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
                }
                
            }

            filtros.clear();
            filtros.putAll(filtrosTratados);
            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }
        return jpql;
    }   

    public int getCountTot(int idEmpresa) {
        String sql = "select COUNT(a) from Usuario a, Empresa emp, UsuarioEmpresa u "
                + " where a.empresa = u.empresa "
                + "   and u.usuario = a         "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    

    @Override
    public int count() {
        return super.count();
    }    
    
    public UsuarioModulo save(UsuarioModulo emp) {
        getEm().persist(emp);
        return emp;
    }

    public UsuarioModulo set(UsuarioModulo emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(UsuarioModulo emp) {
        UsuarioModulo empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}