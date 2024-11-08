package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Grade;
import br.com.onsys.entidades.logistica.GradeColuna;
import br.com.onsys.entidades.logistica.GradeLinha;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class GradeSession extends BasicSessionBean {    

    private String jpqlCount = " ";        
    
    public List<Grade> getAll(int idEmpresa) {
        return getList(Grade.class,""
                + "select a "
                + "from Grade a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "order by a.codigo",idEmpresa);
    }    
    
    // TODAS AS GRADES PAI
    public List<Grade> getAllByPai(int idEmpresa) {
        return getList(Grade.class,"select a            "
                + "from Grade a, Empresa emp, GradeColuna c, GradeLinha l "
                + "where a.empresa      = emp       "
                + "  and a.gradeColuna  = c         "
                + "  and a.gradeLinha   = l         "
                + "  and c.tipo         = 'Grade'   "
                + "  and l.tipo         = 'Grade'   "                                
                + "  and emp.id             = ?1        ",idEmpresa);
    }    
    
    // TODAS AS GRADES DE ESTOQUE 
    public List<Grade> getAllByGradeEstoque(int idEmpresa) {
        return getList(Grade.class,"select a        "
                + "from Grade a, Empresa emp, GradeColuna c, GradeLinha l  "
                + "where a.empresa          = emp   "
                + "  and a.gradeColuna      = c     "
                + "  and a.gradeLinha       = l     "                
                + "  and emp.id             = ?1    "
                + "  and c.gradeColunaPai is not null"                
                + "  and l.gradeLinhaPai  is not null",idEmpresa);
    }    

    // GRADE QUE É GRAVADA NO MOVIMENTO E SALDO DE ESTOQUE 
    public List<Grade> getByGradeEstoque(int idEmpresa, GradeColuna gradeColunaPai, GradeLinha gradeLinhaPai) {
        return getList(Grade.class,"select a        "
                + "from Grade a, Empresa emp, GradeColuna c, GradeLinha l  "
                + "where a.empresa          = emp   "
                + "  and a.gradeColuna      = c     "
                + "  and a.gradeLinha       = l     "                
                + "  and emp.id             = ?1    "
                + "  and c.gradeColunaPai   = ?2    "                
                + "  and l.gradeLinhaPai    = ?3    ",idEmpresa, gradeColunaPai, gradeLinhaPai);
    }    
    
    public Grade getById(int idGrade) {
        return getPojo(Grade.class,idGrade);
    }

    public Grade getByDescricao(int idEmpresa, String descricao) {
        return getPojo(Grade.class,"select a "
                + "from Grade a, Empresa emp "
                + "where a.empresa  = emp "
                + " and emp.id      = ?1 "
                + " and a.descricao = ?2",idEmpresa, descricao);
    }

    public Grade getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Grade.class,"select a "
                + "from Grade a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "  and a.codigo   = ?2",idEmpresa, codigo);
    }

    public Grade getByColunaLinha(int idEmpresa, GradeColuna gradeColuna, GradeLinha gradeLinha) {
        return getPojo(Grade.class,"select a        "
                + "from Grade a, Empresa emp, GradeColuna c, GradeLinha l  "
                + "where a.empresa          = emp   "
                + "  and a.gradeColuna      = c     "
                + "  and a.gradeLinha       = l     "                
                + "  and emp.id             = ?1    "
                + "  and a.gradeColuna      = ?2    "                
                + "  and a.gradeLinha       = ?3    ",idEmpresa, gradeColuna, gradeLinha);
    }    

    public List<Grade> getByGradeColuna(int idEmpresa, int idGrade, GradeColuna gradeColuna) {
        return getList(Grade.class,"select a        "
                + "from Grade a, Empresa emp, GradeColuna c "
                + "where a.empresa          = emp   "
                + "  and a.gradeColuna      = c     "
                + "  and emp.id             = ?1    "
                + "  and a.id               = ?2    "                
                + "  and a.gradeColuna      = ?3    ",idEmpresa, idGrade, gradeColuna);
    }    

    public List<Grade> getAllGradeComplete(int idEmpresa, String prefix) {
        return getList(Grade.class,"select a "
                + "from Grade a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "  and a.codigo like ?2 "
                + "order by a.descricao", idEmpresa,  prefix + '%');        
    }
    
    public List<Grade> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
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
                + "from Grade a, Empresa emp, GradeColuna c, GradeLinha l "
                + "where a.empresa      = emp       "
                + "  and a.gradeColuna  = c         "
                + "  and a.gradeLinha   = l         "
                + "  and c.tipo         = 'Grade'   "
                + "  and l.tipo         = 'Grade'   "                
                + "  and emp.id         = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.codigo       like :globalFilter or "
                               + "a.descricao    like :globalFilter)");
        
        return getListPaged(Grade.class,query, empresaID, first, pageSize, filters);
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
        String sql = "select COUNT(a) from Grade a, Empresa emp"
                + " where a.empresa = emp "
                + "   and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Grade save(Grade emp) {
        getEm().persist(emp);
        return emp;
    }

    public Grade set(Grade emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Grade emp) {
        Grade empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }    
    
}