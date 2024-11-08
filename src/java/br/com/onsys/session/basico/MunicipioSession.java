package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Municipio;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class MunicipioSession extends BasicSessionBean {
    
    private String jpqlCount = " ";    
    
    public List<Municipio> getAll() {
        return getList(Municipio.class,"select muni "
                + "from Municipio muni, Estado uf "
                + "where muni.estado = uf "
                + "order by uf.uf, muni.descricao");
    }

    public List<Municipio> getAllUF(String uf) {
        return getList(Municipio.class,"select muni "
                + "from Municipio muni, Estado uf "
                + "where muni.estado    = uf "
                + "  and uf.uf          = ?1 "
                + "order by uf.uf, muni.descricao", uf);
    }
    
    public Municipio getById(int id) {
        return getPojo(Municipio.class,id);
    }

    
    public Municipio getByDescricaoTeste(String descricao) {
        return getPojo(Municipio.class,"select muni "
                + "from Municipio muni  "
                + "where muni.descricao = ?1",descricao);
    }
    
    public Municipio getByDescricao(String descricao, String uf) {
        return getPojo(Municipio.class,"select muni "
                + "from Municipio muni, Estado uf  "
                + "where muni.estado    = uf "
                + "  and uf.uf          = ?2 "
                + "  and muni.descricao = ?1",descricao, uf);
    }
    
    public Municipio getByCodigo(String codigo) {
        return getPojo(Municipio.class,"select muni "
                + "from Municipio muni "
                + "where muni.codigo = ?1", codigo);
    }

    public List<Municipio> getAllMuniEstado(int id) {
        return getList(Municipio.class,"select muni "
                + "from Municipio muni "
                + "where muni.estado_id = ?1",id);
    }

    public Municipio save(Municipio emp) {
        getEm().persist(emp);
        return emp;
    }

    public Municipio set(Municipio emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Municipio emp) {
        Municipio empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
    public List<Municipio> getAllPaged(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by uf.uf, muni.descricao ";
        } else{
            ordem = "order by muni." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select muni "
                + "from Municipio muni, Estado uf "
                + "where muni.estado  = uf          ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }              
        query += ordem;      
        query = query.replaceAll("muni.globalFilter like :globalFilter", 
                                "(muni.codigo       like :globalFilter or "
                               + "muni.descricao    like :globalFilter)");        
        
        
        return getListPagedSemEmpresa(Municipio.class,query, first, pageSize, filters);
   }
    
    /**
     * Adiciona parametro de query e nao o valor direto.
     * Assim evita o ataque sql injection
     */
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " and ";
        jpqlCount = "";
        
        if(filtros != null && !filtros.isEmpty()){
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                jpql +=  "muni." + entry.getKey().replace("_", ".") + " like :" + entry.getKey().replace(".", "_") + " and ";                 
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());     
                
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (muni.codigo    like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "  or  muni.descricao like '%"+entry.getValue()+ '%'+"')";
                } else {
                   jpqlCount += " and  muni." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
                }                
                
            }
            
            filtros.clear();
            filtros.putAll(filtrosTratados);

            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }

        return jpql;
    }    
    
    public int getCountTot() {
        String sql = "select COUNT(muni) "
                + "from Municipio muni, Estado uf "
                + " where muni.estado  = uf ";
        
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
    
/*    
    public int getCountParticipTot(int idEmpresa) {
        String sql = "select COUNT(particip) "
                + " from Participante particip, Empresa emp "
                + " where particip.empresa = emp and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
  */  
    
}