package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.GradeColuna;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class GradeColunaSession extends BasicSessionBean {    

    private String jpqlCount = " ";        
    
    public List<GradeColuna> getAll(int idEmpresa) {
        return getList(GradeColuna.class,""
                + "select a "
                + "from GradeColuna a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "  and a.gradeColunaPai is null "                                
                + "order by a.codigo",idEmpresa);
    }    
    
    public List<GradeColuna> getAllGrade(int idEmpresa) {
        return getList(GradeColuna.class,""
                + "select a "
                + "from GradeColuna a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and a.gradeColunaPai is null "                
                + "  and a.tipo     = 'Grade'     "                                
                + "  and emp.id     = ?1 "
                + "order by a.codigo",idEmpresa);
    }    
    
    public List<GradeColuna> getAllGradeColuna(int idEmpresa) {
        return getList(GradeColuna.class,""
                + "select a "
                + "from GradeColuna a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and a.gradeColunaPai is not null "                
                + "  and a.tipo     = 'Coluna'        "                                
                + "  and emp.id     = ?1 "
                + "order by a.codigo",idEmpresa);
    }    
    
    public List<GradeColuna> getAllByGradeColunaFilhas(int idEmpresa, GradeColuna gradeColunaPai) {
        return getList(GradeColuna.class,""
                + "select   a "
                + "from     GradeColuna a, Empresa emp "
                + "where    a.empresa           = emp "
                + "     and emp.id              = ?1 "
                + "     and a.gradeColunaPai    = ?2 "
                + "order by a.codigo", idEmpresa, gradeColunaPai);
    }    
    
    public GradeColuna getById(int idGradeColuna) {
        return getPojo(GradeColuna.class,idGradeColuna);
    }

    public GradeColuna getByDescricao(int idEmpresa, String descricao) {
        return getPojo(GradeColuna.class,"select a "
                + "from GradeColuna a, Empresa emp "
                + "where a.empresa  = emp "
                + " and emp.id      = ?1 "
                + " and a.descricao = ?2",idEmpresa, descricao);
    }

    public GradeColuna getByCodigo(int idEmpresa, String codigo) {
        return getPojo(GradeColuna.class,"select a "
                + "from GradeColuna a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "  and a.codigo   = ?2",idEmpresa, codigo);
    }

    public List<GradeColuna> getAllGradeColunaComplete(int idEmpresa, String prefix) {
        return getList(GradeColuna.class,"select a "
                + "from GradeColuna a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "  and a.codigo like ?2 "
                + "order by a.descricao", idEmpresa,  prefix + '%');        
    }
    
    public List<GradeColuna> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.descricao ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from GradeColuna a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id    = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.codigo       like :globalFilter or "
                               + "a.descricao    like :globalFilter)");
        
        return getListPaged(GradeColuna.class,query, empresaID, first, pageSize, filters);
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
                    jpqlCount += " and (a.codigo                        like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.descricao                     like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) from GradeColuna a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public GradeColuna save(GradeColuna emp) {
        getEm().persist(emp);
        return emp;
    }

    public GradeColuna set(GradeColuna emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(GradeColuna emp) {
        GradeColuna empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }    
    
}