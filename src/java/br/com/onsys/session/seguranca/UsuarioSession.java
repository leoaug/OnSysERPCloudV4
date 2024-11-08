package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.ModuloSubmodulo;
import br.com.onsys.entidades.seguranca.SubmoduloPrograma;
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
public class UsuarioSession extends BasicSessionBean {
    
    private String jpqlCount = " ";   
    
    public List<Usuario> getAllUsuarios(int idEmpresa) {
        return getList(Usuario.class,""
                + "select usuario "
                + "from Usuario usuario, Empresa emp "
                + "where usuario.empresa = emp "
                + "  and emp.id          = ?1 "
                + "order by usuario.apelido", idEmpresa);
    }
    
    public List<Usuario> getAllAtivos(int idEmpresa) {
        return getList(Usuario.class,""
                + "select a "
                + "from Usuario a, Empresa emp "
                + "where a.empresa   = emp     "
                + "  and emp.id      = ?1      "
                + "  and (a.inativo    = ' '   "
                + "   or  a.inativo is null    "
                + "   or  a.inativo = 'N')     "                
                + "order by a.apelido", idEmpresa);
    }    
    
    public List<Usuario> getAllAtivos() {
        return getList(Usuario.class,""
                + "select a "
                + "from Usuario a            "
                + "where (a.inativo    = ' ' "
                + "   or  a.inativo is null  "
                + "   or  a.inativo = 'N')   "                
                + "order by a.apelido");
    }    
    
    // UTILIZADO NOS FILTROS DOS RELATORIOS COM CONTROLE DE PERMISSAO. 
    // EXEMPLO .: USUARIO EMITIR RELATARIO SOMENTE COM A SUA PRODUCAO DO PERIODO
    public List<Usuario> getUsuario(int idEmpresa, int idUsr ) {
        return getList(Usuario.class,""
                + "select usuario "
                + "from Usuario usuario, Empresa emp "
                + "where usuario.empresa = emp "
                + "  and usuario.id = ?2 "
                + "  and emp.id     = ?1 "
                + "order by usuario.apelido", idEmpresa, idUsr );
    }    
    
    public Usuario getById(int idEmpresa, int idUsr ) {
        return getPojo(Usuario.class,""
                + "select usuario "
                + "from Usuario usuario, Empresa emp "
                + "where usuario.empresa = emp "
                + "  and usuario.id = ?2 "
                + "  and emp.id     = ?1 ", idEmpresa, idUsr );
    }    
    
    public Usuario getUsuarioById(int id) {
        return getPojo(Usuario.class,id);
    }

    public Usuario getByApelido(int idEmpresa, String apelido) {
        return getPojo(Usuario.class,"select usuario "
                + "from Usuario usuario, Empresa emp "
                + " where usuario.empresa = emp "
                + "   and emp.id          = ?1 "
                + "   and usuario.apelido = ?2", idEmpresa, apelido);
    }
    
    public Usuario getByEmail(int idEmpresa, String email) {
        return getPojo(Usuario.class,"select usuario "
                + "from Usuario usuario, Empresa emp "
                + "where usuario.empresa = emp "
                + "  and emp.id        = ?1 "
                + "  and usuario.email = ?2 ", idEmpresa, email);
    }
 
    public Usuario idUsuarioOk(String email, String senha, int idEmpresa){
        return getPojo(Usuario.class,"select usuario "
                + "from Usuario usuario, Empresa emp "
                + "where usuario.empresa = emp "
                + "  and usuario.email = ?1 "
                + "  and usuario.senha = ?2 "
                + "  and emp.id = ?3 ",email, senha, idEmpresa);
    }
    
    public List<Usuario> idUsuarioOkCNPJ (String email, String senha, String cnpj){
        return getList(Usuario.class,"select usuario "
                + "from Usuario usuario, Empresa emp "
                + "where usuario.empresa = emp "
                + "  and usuario.email = ?1 "
                + "  and usuario.senha = ?2 "
                + "  and emp.cnpjcpfmatriz = ?3 ",email, senha, cnpj);
    }
    
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
                + "from Usuario a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";
        
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
    
    public List<Usuario> getAllPaged(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "select a       "
                + "from Usuario a ";
        
        if(!filters.isEmpty()){
            query = adicionarParametrosSemEmpresa(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.apelido      like :globalFilter or "
                               + "a.email        like :globalFilter)");
        
        return getListPagedSemEmpresa(Usuario.class,query, first, pageSize, filters);
        
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

    private String adicionarParametrosSemEmpresa(Map<String, Object> filtros, String jpql) {
        jpql += " where ";
        jpqlCount = "";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " where (a.apelido                   like '%"+entry.getValue()+ '%'+"'";
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
        String sql = "select COUNT(a) from Usuario a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public int getCountTot() {
        String sql = "select COUNT(a) from Usuario a ";        
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
    
    public Usuario save(Usuario emp) {
        getEm().persist(emp);
        return emp;
    }

    public Usuario set(Usuario emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Usuario emp) {
        Usuario empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
    public List<UsuarioModulo> getAllModuloUsr(int idEmpresa, int idUsuario) {        
        return getList(UsuarioModulo.class,""
                + "select usrmodulo "
                + "from UsuarioModulo usrmodulo, Empresa emp, Usuario usr, Modulo modulo "
                + "where usrmodulo.modulo  = modulo "
                + "  and usr.empresa       = emp "
                + "  and modulo.empresa    = emp "
                + "  and usrmodulo.empresa = emp "
                + "  and usrmodulo.usuario = usr "
                + "  and emp.id = ?1 and usr.id = ?2 "
                + "order by modulo.descricaomenu ", idEmpresa, idUsuario);        
    }
    
    public List<UsuarioModulo> getAllUsuarioModulo(int idEmpresa) {
        return getList(UsuarioModulo.class,"select usrmodulo "
                + "from UsuarioModulo usrmodulo, Empresa emp, Usuario usr, Modulo modulo "
                + "where usrmodulo.empresa = emp "
                + "  and usr.empresa = emp "
                + "  and modulo.empresa = emp "
                + "  and usrmodulo.usuario = usr "
                + "  and usrmodulo.modulo = modulo "
                + "  and emp.id = ?1 "
                + "order by usr.apelido",idEmpresa);
    }

    //UTILIZADO PARA O USUARIO ADM@ONSYS.COM.BR NA EMPRESA ONSYS
    public List<UsuarioModulo> getAllModulosUsuario(int idUsuario) {
        return getList(UsuarioModulo.class,"select usrmodulo "
                + "from UsuarioModulo usrmodulo, Usuario usr, Modulo modulo "
                + "where usrmodulo.usuario = usr    "
                + "  and usrmodulo.modulo  = modulo "
                + "  and usr.id            = ?1     "
                + "order by modulo.descricaomenu",idUsuario);
    }
    
    public List<ModuloSubmodulo> getAllSubModuloModulo(int idEmpresa, int idModulo) {        
        return getList(ModuloSubmodulo.class,""
                + "select modulosubmodulo "
                + "from Empresa emp, ModuloSubmodulo modulosubmodulo, Modulo modulo, Submodulo submodulo "
                + "where modulo.empresa = emp "
                + "  and modulosubmodulo.empresa = emp "
                + "  and submodulo.empresa = emp "
                + "  and modulosubmodulo.submodulo = submodulo "
                + "  and modulosubmodulo.modulo    = modulo "
                + "  and emp.id = ?1 and modulo.id = ?2 "
                + "order by submodulo.descricaomenu ", idEmpresa, idModulo);        
    }    
    
    public List<SubmoduloPrograma> getAllProgSubmodulo(int idEmpresa, int idSubmodulo) {        
        return getList(SubmoduloPrograma.class,""
                + "select submodprog "
                + "from SubmoduloPrograma submodprog, Submodulo submodulo, Programa programa, Empresa emp "
                + "where submodprog.submodulo = submodulo "
                + "  and submodprog.empresa   = emp "
                + "  and submodprog.programa  = programa "
                + "  and submodulo.empresa    = emp "
                + "  and programa.empresa     = emp "
                + "  and emp.id = ?1 and submodulo.id = ?2  "
                + "order by programa.descricaomenu ", idEmpresa, idSubmodulo);        
    }
    
}