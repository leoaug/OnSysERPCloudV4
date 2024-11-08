package br.com.onsys.ejb;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
/**
 *
 * @author Administrador
 */
public abstract class BasicSessionBean implements java.io.Serializable {

    @PersistenceContext
    private EntityManager em;

    public BasicSessionBean() {
    }

    public EntityManager getEm() {
        return em;
    }
    
    public <T> List<T> getList(Class<T> classToCast,String query,Object...values) {
        Query qr = createQuery(query, values);
        return qr.getResultList();
    }

    public <T> List<T> getListPagedParInteiro(Class<T> classToCast,String queryString, Integer parInteiro, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("parInteiro", parInteiro);        
        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
    
    public <T> List<T> getListPaged(Class<T> classToCast,String queryString, Integer empresaID, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        
        System.out.println("BasicSessionBean--->query ADMINISTRADOR-Empresa :"+empresaID);
        System.out.println("BasicSessionBean--->query ADMINISTRADOR:"+query);
        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
    
    public <T> List<T> getListPagedTab(Class<T> classToCast,String queryString, Integer empresaID, Integer tabPrecoID, Integer unidNegID, int first, int pageSize) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);
        query.setParameter("tabPrecoID", tabPrecoID);
        if (!empresaID.equals(3)){
            query.setParameter("unidNegID", unidNegID);
        }    
        
        System.out.println("BasicSessionBean--->query ADMINISTRADOR-Empresa :"+empresaID);
        System.out.println("BasicSessionBean--->query ADMINISTRADOR:"+query);
        
        //if(!filter.isEmpty()){
        //    popularParametros(query, filter);
        //}                
        return query.getResultList();
    }
    
    public <T> List<T> getListPagedFiltro(Class<T> classToCast,String queryString, Integer empresaID, int first, 
            int pageSize, Map<String, Object> filter, String codFiltro) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        if (codFiltro != null) {
            query.setParameter("codFiltro", codFiltro);
        }
        
        System.out.println("BasicSessionBean--->query ADMINISTRADOR-Empresa :"+empresaID);
        System.out.println("BasicSessionBean--->query ADMINISTRADOR:"+query);
        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
    
    
    public <T> List<T> getListPagedEstabel(Class<T> classToCast,String queryString, Integer empresaID, Integer estabelID, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        query.setParameter("estabelID", estabelID);                
        
        System.out.println("BasicSessionBean--->query ADMINISTRADOR-Empresa :"+empresaID);
        System.out.println("BasicSessionBean--->query ADMINISTRADOR:"+query);
        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }

/*
    public <T> List<T> getListFornecedorPaged(Class<T> classToCast,String queryString, Integer empresaID, TipoParticipante fornecedor, TipoParticipante ambos, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        query.setParameter("fornecedor", fornecedor);        
        query.setParameter("ambos", ambos);                
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }    
    
    public <T> List<T> getListFornecedorPagedByUsr(Class<T> classToCast,String queryString, Integer empresaID, Integer usuarioID, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        query.setParameter("usuarioID", usuarioID);        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
*/
    
    public <T> List<T> getListPagedByUsr(Class<T> classToCast,String queryString, Integer empresaID, Integer usuarioID, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        query.setParameter("usuarioID", usuarioID);        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
    
    public <T> List<T> getListPagedByGerente(Class<T> classToCast,String queryString, Integer empresaID,  int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID" , empresaID);        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
    
    public <T> List<T> getListPagedByBloqueioGerente(Class<T> classToCast,String queryString, Integer empresaID, String situacao) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setParameter("empresaID" , empresaID);        
        query.setParameter("situacao"  , situacao);
        return query.getResultList();
    }

    public <T> List<T> getListPagedByParticipante(Class<T> classToCast,String queryString, Integer empresaID, String email, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        query.setParameter("email", email);        
        
        System.out.println("BasicSessionBean--->empresaID :"+empresaID);
        System.out.println("BasicSessionBean--->query :"+email);        
        System.out.println("BasicSessionBean--->query :"+query);
        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
    
    public <T> List<T> getListPagedByUsrParticip(Class<T> classToCast,String queryString, Integer empresaID, Integer usrParticipID, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);        
        query.setParameter("empresaID", empresaID);        
        query.setParameter("usrParticipID", usrParticipID);        
        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }                
        return query.getResultList();
    }
    
    public <T> List<T> getListPagedSemEmpresa(Class<T> classToCast,String queryString, int first, int pageSize, Map<String, Object> filter) {
        TypedQuery<T> query = em.createQuery(queryString, classToCast);
        
        query.setMaxResults(pageSize);
        query.setFirstResult(first);

        if(!filter.isEmpty()){
            popularParametros(query, filter);
        }
                
        return query.getResultList();
    }
    
    private void popularParametros(Query query,
                                   Map<String,
                                   Object> filtros) {
        for (Map.Entry<String, Object> entry : filtros.entrySet()) {
            query.setParameter(entry.getKey(),
                               "%" + entry.getValue() + "%");
        }
    }    
    
    public <T> List<T> getLimitedList(Class<T> classToCast,String query, int limit, Object...values) {
        Query qr = createQuery(query, values);
        qr.setMaxResults(limit);
        return qr.getResultList();
    }
    
    public <T> List<T> getLazyLoad(Class<T> classToCast,String query, int first, int limit, Object...values) {
        Query qr = createQuery(query, values);
        qr.setFirstResult(first);        
        qr.setMaxResults(limit);
        return qr.getResultList();
    }

    public <T> T getPojo(Class<T> clasToCast,String query,Object...values) {
        Query qr = createQuery(query, values);
        return (T) qr.getSingleResult();
    }
    
    public <T> T getUltPojo(Class<T> classToCast,String query, int limit, Object...values) {
        Query qr = createQuery(query, values);
        qr.setMaxResults(limit);
        return (T) qr.getSingleResult();
    }    
    
    public <T> T getUltParcelaPojo(Class<T> classToCast,String query, int idEmpresa, int idDocto, Object...values) {
        Query qr = createQuery(query, values);
        qr.setMaxResults(1);
        qr.setParameter("empresaID", idEmpresa);        
        qr.setParameter("doctoID", idDocto);         
        return (T) qr.getSingleResult();
    }    

    public <T> T getPojoConverter(Class<T> clasToCast,String query,Object...values) {
        Query qr = createQuery(query, values);
        qr.setMaxResults(1);        
        return (T) qr.getSingleResult();
    }    
    
    public <T> T getCount(Class<T> clasToCast,String query,Object...values) {
        Query qr = createQuery(query, values);
        return (T) qr.getSingleResult();
    }
    
    public int count() {
        TypedQuery<Long> result = em.createQuery("select count(c) from CatServico c", Long.class);
        return result.getSingleResult().intValue();
    }

    public <T> T getPojo(Class<T> classToCast,Serializable primaryKey) {
        return em.find(classToCast, primaryKey);
    }

    public int execute(String query,Object...values) {
        Query qr = createQuery(query, values);
        return qr.executeUpdate();
    }

    private Query createQuery(String query, Object[] values) {
        Query qr = em.createQuery(query);
        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                Object object = values[i];
                qr.setParameter(i + 1, object);
            }
        }
        return qr;
    }
    
}