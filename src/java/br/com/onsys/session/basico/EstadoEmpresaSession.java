package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.EstadoEmpresa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EstadoEmpresaSession extends BasicSessionBean {
    
    private String jpqlCount = " ";           
    
    public List<EstadoEmpresa> getAll(int idEmpresa) {
        return getList(EstadoEmpresa.class,"select a   "
                + " from EstadoEmpresa a , Empresa b, Estado c "
                + "where a.empresa = b                "
                + "  and a.estado  = c                "
                + "  and b.id      = ?1               "                
                + "order by c.descricao", idEmpresa);
    }

    public EstadoEmpresa getById(int idEstado) {
        return getPojo(EstadoEmpresa.class,idEstado);
    }

    public EstadoEmpresa getByDescricao(int idEmpresa, String descricao) {
        return getPojo(EstadoEmpresa.class,"select a   "
                + " from EstadoEmpresa a, Empresa b, Estado c   "
                + "where a.empresa = b                          "
                + "  and a.estado  = c                          "
                + "  and b.id = ?1                              "
                + "  and c.descricao = ?2", idEmpresa, descricao);
    }
        
    public EstadoEmpresa getByCodigo(int idEmpresa, String codigo) {
        return getPojo(EstadoEmpresa.class,"select a   "
                + " from EstadoEmpresa a, Empresa b, Estado c   "
                + "where a.empresa      = b                     "
                + "  and a.estado       = c                     "
                + "  and b.id           = ?1                    "
                + "  and c.codigo  = ?2", idEmpresa, codigo);
    }
    
    public EstadoEmpresa getByUF(int idEmpresa, String uf) {
        return getPojo(EstadoEmpresa.class,"select a            "
                + "from EstadoEmpresa a, Empresa b, Estado c    "
                + "where a.empresa  = b                         "
                + "  and a.estado   = c                         "
                + "  and b.id       = ?1                        "
                + "  and c.uf = ?2" , idEmpresa, uf);
    }
    
    public List<EstadoEmpresa> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.estado.codigo ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from EstadoEmpresa a, Empresa b, Estado c "
                + "where a.empresa  = b                         "
                + "  and a.estado   = c                         "                
                + "  and b.id = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }  
        query += ordem; 
        
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.estado.codigo       like :globalFilter or "
                              +  "a.estado.descricao    like :globalFilter or "
                              +  "a.estado.uf           like :globalFilter)");
        
        query = query.replaceAll(":estado.codigo", 
                                 ":estado_codigo");
        
        query = query.replaceAll("a.estado_codigo", 
                                 "a.estado.codigo");        
        
        query = query.replaceAll(":estado.uf", 
                                 ":estado_uf");
        
        query = query.replaceAll("a.estado_uf", 
                                 "a.estado.uf");        
        
        query = query.replaceAll(":estado.descricao", 
                                 ":estado_descricao");
        
        query = query.replaceAll("a.estado_descricao", 
                                 "a.estado.descricao");        
        
        return getListPaged(EstadoEmpresa.class,query, empresaID, first, pageSize, filters);
    }
    
    public int getCountTot(int idEmpresa) {
        String sql = "select COUNT(a) "
                + "from EstadoEmpresa a, Empresa b, Estado c "
                + "where a.empresa  = b                      "
                + "  and a.estado   = c                      "                
                + "  and b.id       = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }        
    
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " and ";
        jpqlCount = "";
        
        if(filtros != null && !filtros.isEmpty()){
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                 jpql +=  "a." + entry.getKey().replace("_", ".") + " like :" + entry.getKey().replace(".", "_") + " and ";
                 filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());

                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (a.estado.codigo    like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.estado.descricao like '%"+entry.getValue()+ '%'+"'";                    
                    jpqlCount += "  or  a.estado.uf        like '%"+entry.getValue()+ '%'+"')";
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

    public EstadoEmpresa save(EstadoEmpresa emp) {
        getEm().persist(emp);
        return emp;
    }

    public EstadoEmpresa set(EstadoEmpresa emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(EstadoEmpresa emp) {
        EstadoEmpresa empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}