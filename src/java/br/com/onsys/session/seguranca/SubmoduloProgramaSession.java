package br.com.onsys.session.seguranca;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.Submodulo;
import br.com.onsys.entidades.seguranca.SubmoduloPrograma;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SubmoduloProgramaSession extends BasicSessionBean {
    
    private String  jpqlCount = " ";    
    
    public List<SubmoduloPrograma> getAllSubmoduloPrograma(int idEmpresa) {
        return getList(SubmoduloPrograma.class,"select submoduloprograma "
                + "from SubmoduloPrograma submoduloprograma, Empresa emp, Submodulo submod, Programa prog "
                + "where Submoduloprograma.submodulo = submod   "
                + "  and Submoduloprograma.programa  = prog     "
                + "  and submoduloprograma.empresa   = emp      "
                + "  and submod.empresa              = emp      "
                + "  and prog.empresa                = emp      "
                + "  and emp.id = ?1                            "
                + "order by submod.descricao, prog.descricao ",idEmpresa);
    }

    public List<SubmoduloPrograma> getAllBySubmodulo(int idEmpresa, int idSubmodulo) {
        return getList(SubmoduloPrograma.class,"select submoduloprograma "
                + "from SubmoduloPrograma submoduloprograma, Empresa emp, Submodulo submod, Programa prog "
                + "where Submoduloprograma.submodulo = submod   "
                + "  and Submoduloprograma.programa  = prog     "
                + "  and submoduloprograma.empresa   = emp      "
                + "  and submod.empresa              = emp      " 
                + "  and prog.empresa                = emp      "
                + "  and emp.id                      = ?1       "
                + "  and submod.id                   = ?2       "
                + "order by submod.descricao, prog.descricao    ",idEmpresa, idSubmodulo);
    }
    
    public List<SubmoduloPrograma> getAllFiltro(String codFiltro, String descFiltro) {
        if(codFiltro!=null && descFiltro!=null){
            return getList(SubmoduloPrograma.class,""
                    + "select a "
                    + "from SubmoduloPrograma a where a.codigo = ?1"
                    + " and a.descricao like ?2", codFiltro, "%"+descFiltro+"%");
        }else{
            if(descFiltro==null){
                return getList(SubmoduloPrograma.class,""
                        + "select a "
                        + "from SubmoduloPrograma a where a.codigo = ?1", codFiltro);
            }else{
                return getList(SubmoduloPrograma.class,""
                        + "select a "
                        + "from SubmoduloPrograma a where a.descricao like ?1", "%"+descFiltro+"%");
            }
        }
    }    
    
    public List<SubmoduloPrograma> getListaSubmodProg(int idEmpresa, int idSubmod, int idProg) {
        return getList(SubmoduloPrograma.class,"select submoduloprograma "
                + "from  SubmoduloPrograma submoduloprograma, Empresa emp, Submodulo submod, Programa prog "
                + "where Submoduloprograma.submodulo = submod "
                + "  and Submoduloprograma.programa  = prog   "
                + "  and submoduloprograma.empresa   = emp    "
                + "  and submod.empresa = emp "
                + "  and prog.empresa   = emp "
                + "  and emp.id = ?1 "
                + "and submod.id = ?2 and prog.id = ?3 ",idEmpresa, idSubmod, idProg);
    }
    
    public List<SubmoduloPrograma> getAllBySubmodulo(int idEmpresa, Submodulo submodulo) {
        return getList(SubmoduloPrograma.class,"select a "
                + "from SubmoduloPrograma a, Empresa b, Submodulo c, Programa d "
                + "where a.empresa      = b  "
                + "  and a.submodulo    = c  "
                + "  and a.submodulo    = ?2 "
                + "  and a.programa     = d  "
                + "  and b.id           = ?1 ",idEmpresa, submodulo);
    }
    
    public List<SubmoduloPrograma> getListSubmoduloPrograma(int idEmpresa, Submodulo submodulo, Programa programa) {
        return getList(SubmoduloPrograma.class,"select a "
                + "from SubmoduloPrograma a, Empresa b, Submodulo c, Programa d "
                + "where a.empresa      = b  "
                + "  and a.submodulo    = c  "
                + "  and a.programa     = d  "                
                + "  and a.submodulo    = ?2 "
                + "  and a.programa     = ?3 "
                + "  and b.id           = ?1 ",idEmpresa, submodulo, programa);
    }
    
    public SubmoduloPrograma getSubmodProg(int idEmpresa, int idSubmod, int idProg) {
        return getPojo(SubmoduloPrograma.class,"select submoduloprograma "
                + "from  SubmoduloPrograma submoduloprograma, Empresa emp, Submodulo submod, Programa prog "
                + "where Submoduloprograma.submodulo = submod "
                + "  and Submoduloprograma.programa  = prog "
                + "  and submoduloprograma.empresa   = emp "
                + "  and submod.empresa = emp "
                + "  and prog.empresa   = emp "
                + "  and emp.id = ?1 "
                + "and submod.id = ?2 and prog.id = ?3 ",idEmpresa, idSubmod, idProg);
    }
    
    public SubmoduloPrograma getById(int id) {
        return getPojo(SubmoduloPrograma.class,id);
    }
    /*
    public AtividadeExecutor getAtividadeExecutorByUsrAtiv(int idUsr, int idAtiv) {
        return getPojo(AtividadeExecutor.class,"select ativexec "
                + "from AtividadeExecutor ativexec, Usuario usr, Atividade atv "
                + "where ativexec.executor = usr and ativexec.atividade = atv and usr.id  = ?1 and  atv.id = ?2", idUsr, idAtiv);
    }
    */    
    public SubmoduloPrograma getByDescricao(String descricao) {
        return getPojo(SubmoduloPrograma.class,"select submoduloprograma "
                + "from SubmoduloPrograma submoduloprograma "
                + "where submoduloprograma.descricao = ?1",descricao);
    }
    
    public List<SubmoduloPrograma> getAllPaged(Integer empresaID, Integer idSubmodulo, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem, query;        
        
        if(sortField == null){
            ordem = " order by a.programa.codigo ";
        } else{
            ordem = " order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        if(idSubmodulo == null) {
            query = ""
                    + "select a "
                    + "from SubmoduloPrograma a, Submodulo s, Programa p, Empresa e "
                    + "where a.empresa      = e "
                    + "  and a.submodulo    = s "
                    + "  and a.programa     = p "                
                    + "  and e.id           = :empresaID ";
        } else {
            query = ""
                    + "select a "
                    + "from SubmoduloPrograma a, Submodulo s, Programa p, Empresa e "
                    + "where a.empresa      = e "
                    + "  and a.submodulo    = s "
                    + "  and a.programa     = p "
                    + "  and p.vermenu      =  true  "
                    + "  and e.id           = :empresaID "
                    + "  and s.id           = "+idSubmodulo;
        }
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.programa.codigo     like :globalFilter or "
                               + "a.submodulo.codigo    like :globalFilter)");
        
        query = query.replaceAll(":programa.codigo", 
                                 ":programa_codigo");
        
        query = query.replaceAll("a.programa_codigo", 
                                 "a.programa.codigo");        
        
        query = query.replaceAll(":submodulo.codigo", 
                                 ":submodulo_codigo");
        
        query = query.replaceAll("a.submodulo_codigo", 
                                 "a.submodulo.codigo");        
        
        return getListPaged(SubmoduloPrograma.class,query, empresaID, first, pageSize, filters);
    }
    
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " and ";
        jpqlCount = "";   
        
        if(filtros != null && !filtros.isEmpty()){
            
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                System.out.println("entry.getKey()===>"+entry.getKey());
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (a.programa.codigo   like '%"+entry.getValue()+ '%'+"'";                    
                    jpqlCount += "  or  a.submodulo.codigo  like '%"+entry.getValue()+ '%'+"')";
                    
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
    
    public int getCountTot(int idEmpresa, Integer idSubmodulo) {
        String sql = null;
        if (idSubmodulo == null) {
            sql = "select COUNT(a) from SubmoduloPrograma a, Submodulo s, Programa p, Empresa e"
                + " where a.empresa     = e "
                + "   and a.submodulo   = s "
                + "   and a.programa    = p "                
                + "   and e.id          = "+idEmpresa;
        } else {
            sql = "select COUNT(a) from SubmoduloPrograma a, Submodulo s, Programa p, Empresa e"
                + " where a.empresa     = e "
                + "   and a.submodulo   = s "
                + "  and p.vermenu      =  true  "
                + "   and a.programa    = p "                
                + "   and e.id          = "+idEmpresa
                + "   and s.id          = "+idSubmodulo;                    
        }
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public SubmoduloPrograma save(SubmoduloPrograma emp) {
        getEm().persist(emp);
        return emp;
    }

    public SubmoduloPrograma set(SubmoduloPrograma emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(SubmoduloPrograma emp) {
        SubmoduloPrograma empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}