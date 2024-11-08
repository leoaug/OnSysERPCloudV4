package br.com.onsys.session.projetos;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.projetos.FichaAprop;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FichaApropSession extends BasicSessionBean {
    
    private String jpqlCount = " ";       
    
    public List<FichaAprop> getAll(int idEmpresa, int idUsuario) {
        return getList(FichaAprop.class,
                "select fa from "
                + "FichaAprop fa, "
                + "Empresa emp, "
                + "Usuario user, ParamAdmProjetos paramprojetos "
                + "where fa.empresa = emp "
                + "  and fa.usuario = user "
                + "  and paramprojetos.empresa = emp "
                + "  and fa.dataemissao >= paramprojetos.periniaberto "
                + "  and emp.id = ?1 and user.id = ?2", idEmpresa, idUsuario);
    }

    public FichaAprop getById(int idFichaAprop) {
        return getPojo(FichaAprop.class,idFichaAprop);
    }

    public FichaAprop getByCodigo(int idEmpresa, String codigo) {
        return getPojo(FichaAprop.class,"select fa "
                + "from  FichaAprop fa, Empresa emp "
                + "where fa.empresa = emp and emp.id = ?1 and fa.codigo = ?2", idEmpresa, codigo);
    }    
    
    public List<FichaAprop> getAllPaged(Integer empresaID, Integer usuarioID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.numfa ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from FichaAprop a, Empresa emp, Usuario u, ParamAdmProjetos p "
                + "where a.empresa  = emp   "
                + "  and a.usuario  = u     "
                + "  and p.empresa  = emp   "
                + "  and u.id       =       "+usuarioID
                + "  and a.dataemissao >= p.periniaberto "                
                + "  and emp.id = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.numfa        like :globalFilter)");
        
        return getListPaged(FichaAprop.class,query, empresaID, first, pageSize, filters);
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
                    jpqlCount += " and (a.numfa                        like %"+entry.getValue()+ '%'+")";
                } else {
                   jpqlCount += " and a." + entry.getKey().replace("_", ".") + " like "+ "%"+entry.getValue()+ '%'+"";
                }
                
            }

            filtros.clear();
            filtros.putAll(filtrosTratados);
            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }
        return jpql;
    }    
    
    public int getCountTot(int idEmpresa, int idUsuario) {
        String sql = "select COUNT(a) from FichaAprop a, Empresa emp , Usuario u, ParamAdmProjetos p "
                + " where a.empresa = emp    "
                + "   and a.usuario  = u     "
                + "   and p.empresa  = emp   "
                + "   and a.dataemissao >= p.periniaberto "                
                + "   and emp.id = "+idEmpresa
                + "   and u.id   = "+idUsuario;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    

    public FichaAprop save(FichaAprop emp) {
        getEm().persist(emp);
        return emp;
    }

    public FichaAprop set(FichaAprop emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(FichaAprop emp) {
        FichaAprop empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}