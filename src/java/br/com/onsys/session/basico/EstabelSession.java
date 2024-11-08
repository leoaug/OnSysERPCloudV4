package br.com.onsys.session.basico;

import br.com.onsys.ejb.BasicSessionBean;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.entidades.basico.Estabelecimento;
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
public class EstabelSession extends BasicSessionBean {
    
    private String jpqlCount = " ";
    
    public List<Estabelecimento> getAll(int idEmpresa) {
        return getList(Estabelecimento.class,"select estabel "
                + "from Estabelecimento estabel, Empresa emp "
                + "where Estabel.empresa = emp "
                + "  and emp.id = ?1 "
                + " order by estabel.descricao", idEmpresa);
    }
    
    public List<Estabelecimento> getAllOrderByCodigo(int idEmpresa) {
        return getList(Estabelecimento.class,"select estabel "
                + "from Estabelecimento estabel, Empresa emp "
                + "where Estabel.empresa = emp "
                + "  and emp.id = ?1 "
                + " order by estabel.codigo", idEmpresa);
    }
    
    public List<Estabelecimento> getAllByCodigo(int idEmpresa, String codigo) {
        return getList(Estabelecimento.class,"select estabel "
                + "from Estabelecimento estabel, Empresa emp "
                + "where Estabel.empresa = emp "
                + "  and emp.id = ?1 "
                + "  and estabel.codigo = ?2 " 
                + " order by estabel.descricao", idEmpresa, codigo);
    }

    public Estabelecimento getById(int id) {
        return getPojo(Estabelecimento.class,id);
    }
    
    public Estabelecimento getByCodigo(int idEmpresa, String codigo) {
        return getPojo(Estabelecimento.class,"select a "
                + "from Estabelecimento a, Empresa emp "
                + "where a.empresa  = emp "
                + "  and emp.id     = ?1 "
                + "  and a.codigo   = ?2 ", idEmpresa, codigo);
    }

    public Estabelecimento getByDescricao(int idEmpresa, String descricao) {
        return getPojo(Estabelecimento.class,"select a from Estabelecimento a, Empresa emp "
                + "where a.empresa      = emp "
                + "  and emp.id         = ?1 "
                + "  and a.descricao    = ?2 ", idEmpresa, descricao);
    }

    public Estabelecimento getByCNPJ(Empresa empresa, String cnpjFormatado) {
        return getPojo(Estabelecimento.class,"select a from Estabelecimento a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp       = ?1  "
                + "  and a.cnpj    = ?2 ", empresa, cnpjFormatado);
    }
    
    public List<Estabelecimento> getAllPaged(Integer empresaID, int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {
        String ordem;        
        if(sortField == null){
            ordem = "order by a.nomefantasia ";
        } else{
            ordem = "order by a." + sortField + " ";
        }        
        if (sortOrder != null){
            ordem += " " + sortOrder;
        }        
        String query = ""
                + "select a "
                + "from Estabelecimento a, Empresa emp "
                + "where a.empresa = emp "
                + "  and emp.id = :empresaID ";   
        
        if(!filters.isEmpty()){
            query = adicionarParametros(filters, query);            
        } else {
            jpqlCount = "";   
        }                
        
        query += ordem;          
        query = query.replaceAll("a.globalFilter like :globalFilter", 
                                "(a.codigo like :globalFilter or "
                               + "a.nomefantasia like :globalFilter)");
        
        System.out.println("QUERY 4 --->"+query);
        
        return getListPaged(Estabelecimento.class,query, empresaID, first, pageSize, filters);
    }
    
   private String adicionarParametros(Map<String, Object> filtros, String jpql) {
        jpql += " and ";
        jpqlCount = "";        
        
        if(filtros != null && !filtros.isEmpty()){
            Map<String, Object> filtrosTratados = new HashMap<String, Object>();
            
            for (Map.Entry<String, Object> entry : filtros.entrySet()) {       
                
                System.out.println("adicionarParametros");
                System.out.println("entry.getKey()--->"+entry.getKey());
                
                jpql +=  "a." + entry.getKey().replace("_", ".") + " like :" + entry.getKey().replace(".", "_") + " and ";                
                filtrosTratados.put(entry.getKey().replace(".", "_"), entry.getValue());
                if (entry.getKey().equals("globalFilter")) {
                    jpqlCount += " and (a.nomefantasia like '%"+entry.getValue()+ '%'+"'";
                    jpqlCount += "   or a.codigo like '%"+entry.getValue()+ '%'+"')";
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
        String sql = "select COUNT(a) "
                + " from Estabelecimento a, Empresa emp "
                + " where a.empresa = emp "
                + " and emp.id = "+idEmpresa;
        
        if (!jpqlCount.equals("")) {
            sql += jpqlCount;            
        }
        
        Query query = getEm().createQuery(sql);
        Number result = (Number) query.getSingleResult();
        return result.intValue();
    }    
    
    public Estabelecimento save(Estabelecimento emp) {
        getEm().persist(emp);
        return emp;
    }

    public Estabelecimento set(Estabelecimento emp) {
        getEm().merge(emp);
        return emp;
    }

    public void remove(Estabelecimento emp) {
        Estabelecimento empToRemove = getEm().merge(emp);
        getEm().remove(empToRemove);
    }

    public String getJpqlCount() {
        return jpqlCount;
    }

    public void setJpqlCount(String jpqlCount) {
        this.jpqlCount = jpqlCount;
    }
    
}