package br.com.onsys.session.logistica;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.logistica.Manifesto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ManifestoSession extends BasicSessionBean {
    
    private String jpqlCount = " ";    
    
    public List<Manifesto> getAll(int idEmpresa) {
        return getList(Manifesto.class,""
                + "select a "
                + "from Manifesto a, Empresa emp, Transportadora t "
                + "where a.empresa        = emp "
                + "  and emp.id           = ?1  "
                + "  and a.transportadora = t   "
                + " order by a.nromanifesto desc" ,idEmpresa);
    }
    
    public Manifesto getById(int id) {
        return getPojo(Manifesto.class,id);
    }
    
    public Manifesto getByDocto(int idEmpresa, String nrodocto) {
        return getPojo(Manifesto.class,"select a "
                + "from Manifesto a, Empresa emp, Transportadora t "
                + "where a.empresa        = emp "
                + "  and a.transportadora = t "
                + "  and emp.id           = ?1  "
                + "  and a.nromanifesto   = ?2  ",idEmpresa, nrodocto);
    }
    
    public List<Manifesto> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.dtemissao ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Manifesto a, Empresa emp  " 
                + "where a.empresa          = emp "
                + "  and emp.id             = :empresaID ";

        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }              

        query += ordem;                
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.nromanifesto like :globalFilter or "
                               + "a.situacao     like :globalFilter)");
        
        return getListPaged(Manifesto.class,query, empresaID, first, pageSize, filters);
   }
    
    public List<Manifesto> getManifestoSaidaAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.nromanifesto ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Manifesto a, Empresa emp, SerieMDFe s "
                + "where a.empresa          = emp "
                + "  and a.serieMDFe        = s   "
                + "  and s.codigo           = 2   "  // incluir o campo tipo de serie entrada ou saida 
                + "  and emp.id             = :empresaID ";

        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }              
        
        query += ordem;  
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.nromanifesto like :globalFilter or "
                               + "a.situacao     like :globalFilter)");

        return getListPaged(Manifesto.class,query, empresaID, first, pageSize, filters);
   }
    
    public List<Manifesto> getManifestoSaidaExpedicaoAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by a.nromanifesto ";
        } else{
            ordem = "order by a." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select a "
                + "from Manifesto a, Empresa emp, SerieMDFe s "
                + "where a.empresa          = emp "
                + "  and a.serieMDFe        = s   "
                + "  and a.situacao        <> 'Expedido' "                
                + "  and s.codigo           = 2   "  // incluir o campo tipo de serie entrada ou saida 
                + "  and emp.id             = :empresaID ";

        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }              

        query += ordem;                
        return getListPaged(Manifesto.class,query, empresaID, first, pageSize, filters);
   }
    
    /**
     * Adiciona parâmetro de query e não o valor direto.
     * Assim evita o ataque sql injection
     */
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        
        jpql += " and ";
        jpqlCount = "";
        
        if(filtros != null && !filtros.isEmpty()){
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                
                jpql +=  "a." + entry.getKey() + " like :" + entry.getKey() + " and ";
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (a.nromanifesto like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  a.situacao     like '%"+entry.getValue()+ '%'+"')";
                } else {
                   jpqlCount += " and a." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
                }              
                
            }
            
            filtros.clear();
            filtros.putAll(filtrosTratados);

            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }
        System.out.println("jpql===>"+jpql);
        return jpql;
    }    
    
    public int getCountTot(int idEmpresa) {
        String sql = "select COUNT(a) from Manifesto a, Empresa emp"
                + " where a.empresa         = emp "
                + "   and emp.id            = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public int getManifestoSaidaCountTot(int idEmpresa) {
        String sql = "select COUNT(a) from Manifesto a, Empresa emp, SerieMDFe s "
                + " where a.empresa         = emp "
                + "   and a.serieMDFe       = s   "
                + "   and s.codigo          = 2   "  // incluir o campo tipo de serie entrada ou saida 
                + "   and emp.id            = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public int getManifestoSaidaExpedicaoCountTot(int idEmpresa) {
        String sql = "select COUNT(a) from Manifesto a, Empresa emp, SerieMDFe s "
                + " where a.empresa         = emp "
                + "   and a.serieMDFe       = s   "
                + "   and a.situacao       <> 'Expedido' "                
                + "   and s.codigo          = 2   "  // incluir o campo tipo de serie entrada ou saida 
                + "   and emp.id            = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Manifesto save(Manifesto emp) {
        getEm().persist(emp);
        return emp;
    }

    public Manifesto set(Manifesto emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Manifesto emp) {
        Manifesto empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}