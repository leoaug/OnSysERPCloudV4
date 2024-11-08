package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.CNAE;
import java.util.List;
import java.util.Map;
import javax.ejb.*;
import javax.persistence.Query;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class CNAESession extends BasicSessionBean {

    public List<CNAE> getAll(int idEmpresa) {
        return getList(CNAE.class,"select cnae "
                + "from CNAE cnae, Empresa emp "
                + "where cnae.empresa = emp and emp.id = ?1 and  "
                + "order by cnae.codigo", idEmpresa);
    }
    
    public int getCountTot(int idEmpresa) {
        String sql = "select COUNT(cnae) from CNAE cnae, Empresa emp"
                + " where cnae.empresa = emp and emp.id = "+idEmpresa;
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public CNAE getById(int id) {
        return getPojo(CNAE.class,id);
    }
    
    public CNAE getUltimo() {
        return getPojo(CNAE.class,"select Max(cnae) from "
                + "CNAE cnae");
    }

    public CNAE getByCodigo(int idEmpresa, String codigo) {
        return getPojo(CNAE.class,"select cnae "
                + "from CNAE cnae, Empresa emp "
                + "where cnae.empresa = emp and "
                + "emp.id = ?1 and cnae.codigo = ?2  ", idEmpresa, codigo);
    }

    public CNAE getByDescricao(int idEmpresa, String codigo) {
        return getPojo(CNAE.class,"select cnae "
                + "from CNAE cnae, Empresa emp "
                + "where cnae.empresa = emp and "
                + "emp.id = ?1 and cnae.descricao = ?2 ", idEmpresa, codigo);
    }
    
    public List<CNAE> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;
        
        if(sortField == null){
            ordem = "order by cnae.codigo ";
        } else{
            ordem = "order by cnae." + sortField + " ";
        }
        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }
        
        String query = ""
                + "select cnae "
                + "from CNAE cnae, Empresa emp "
                + "where cnae.empresa = emp and emp.id = :empresaID ";
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        }        
        
        query += ordem;
                
        return getListPaged(CNAE.class,query, empresaID, first, pageSize, filters);
   }
    
    /**
     * Adiciona par�metro de query e n�o o valor direto.
     * Assim evita o ataque sql injection
     */
    private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " and ";
        
        if(filtros != null && !filtros.isEmpty()){
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {
                 jpql +=  "cnae." + entry.getKey() + " like :" + entry.getKey() + " and ";
            }

            //remove ultimo and desnecessario
            jpql = jpql.substring(0, jpql.length() - 4);
        }

        return jpql;
    }    
    
    @Override
    public int count() {
        return super.count();
    }
    
    public CNAE save(CNAE emp) {
        getEm().persist(emp);
        return emp;
    }

    public CNAE set(CNAE emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(CNAE emp) {
        CNAE empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }
    
}