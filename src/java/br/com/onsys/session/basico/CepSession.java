package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Cep;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class CepSession extends BasicSessionBean {
    
    private String jpqlCount = " ";    
    
    public List<Cep> getAll() {
        return getList(Cep.class,"select cep "
                + "from Cep cep "
                + "order by cep.cep");
    }
    
    public List<Cep> getCepByCEP(int idFirst, int idMax) {
        return getLazyLoad(Cep.class,"select cep "
                + "from Cep cep "
                + "where (cep.deletado != 'S' or cep.deletado is null) "                
                + "order by cep.cep", idFirst, idMax);
    }
    
    public List<Cep> getByLogradouro(int idFirst, int idMax) {
        return getLazyLoad(Cep.class,"select cep "
                + "from Cep cep "
                + "where (cep.deletado != 'S' or cep.deletado is null) "                
                + "order by cep.logradouro", idFirst, idMax);
    }
    
    public List<Cep> getCepComplete(String prefix) {
        return getList(Cep.class,"select cep "
                + "from Cep cep "
                + "where (cep.deletado != 'S' or cep.deletado is null) and  " 
                + "cep.cep like ?1 "
                + "order by cep.cep",  prefix + '%');
    }
    
    public List<Cep> getLograComplete(String prefix) {
        return getList(Cep.class,"select cep "
                + "from Cep cep "
                + "where (cep.deletado != 'S' or cep.deletado is null) and  " 
                + "cep.logradouro like ?1 "
                + "order by cep.logradouro",  prefix + '%');
    }
    
    public List<Cep> getCepLikeCEP(int idFirst, int idMax, String prefix) {
        return getLazyLoad(Cep.class,"select cep "
                + "from Cep cep "
                + "where cep.cep like ?1 and "                
                + "(cep.deletado != 'S' or cep.deletado is null) "                
                + "order by cep.cep", idFirst, idMax, prefix + '%');
    }
    
    public List<Cep> getLikeLogradouro(int idFirst, int idMax, String prefix) {
        return getLazyLoad(Cep.class,"select cep "
                + "from Cep cep "
                + "where cep.logradouro like ?1 and "                
                + "(cep.deletado != 'S' or cep.deletado is null) "                
                + "order by cep.logradouro", idFirst, idMax, prefix + '%');
    }
    
    public int getCountTot() {
        
        System.out.println("getCountCepTot()");
        System.out.println("jpqlCount===>"+jpqlCount);
        
        String sql = "select COUNT(cep) "
                + " from Cep cep ";
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;
        }

        System.out.println(" COUTN SQL===>"+ sql);
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }        
  
    public List<Cep> getAllPaged(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by cep.cep ";
        } else{
            ordem = "order by cep." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select cep   "
                + "from Cep cep ";
        
//        getCountCepTot();            

        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);          
        } else {
            jpqlCount = "";   
        } 
        
        query += ordem;            
        query = query.replaceAll("cep.globalFilter like :globalFilter", 
                                "(cep.cep          like :globalFilter)");
        
        return getListPagedSemEmpresa(Cep.class, query, first, pageSize, filters);
   }
    
    /**
     * Adiciona parametro de query e nao o valor direto.
     * Assim evita o ataque sql injection
     */
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {        
        jpql += " where ";
        jpqlCount = " where ";            
        
        /*
        if(filtros != null && !filtros.isEmpty()){
            for (Map.Entry<String, String> entry : filtros.entrySet()) {
                 jpql +=  " where cep." + entry.getKey() + " like :" + entry.getKey() + " and ";
            }

            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }
        */
        if(filtros != null && !filtros.isEmpty()){
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                 jpql +=  " cep." + entry.getKey().replace("_", ".") + " like :" + entry.getKey().replace(".", "_") + " and ";
                 
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                if (entry.getKey().equals("globalFilter") && !" ".equals(entry.getValue())) {
                    jpqlCount += "  (cep.cep                      like '%"+entry.getValue()+ '%'+"')";
                } else {
                    jpqlCount += " cep." + entry.getKey().replace("_", ".") + " like '"+ "%"+entry.getValue()+ '%'+"'";
                }
            }
            
            filtros.clear();
            filtros.putAll(filtrosTratados);

            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }

        return jpql;
    }    

    @Override
    public int count() {
        return super.count();
    }
    
    public Cep getCepById(int idCep) {
        return getPojo(Cep.class,idCep);
    }

    public Cep getUltCepByCep(String cep) {
        return getUltPojo(Cep.class,"select cep "
                + "from Cep cep "
                + "where cep.cep = ?1", 1, cep);
    }

    public Cep getByCep(String cep) {
        return getPojo(Cep.class,"select cep    "
                + " from Cep cep           "
                + "  where cep.cep        = ?1", cep);
    }
    
    public Cep save(Cep emp) {
        System.out.println("CepSession.save");
        getEm().persist(emp);
        return emp;
    }

    public Cep set(Cep emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Cep emp) {
        Cep empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}