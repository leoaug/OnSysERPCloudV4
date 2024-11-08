package br.com.onsys.session.seguranca;

import br.com.onsys.entidades.seguranca.Submodulo;
import java.util.List;
import java.util.Map;  
import javax.ejb.EJBException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;  
import org.primefaces.model.SortMeta;

public class SubmoduloLazy extends LazyDataModel<Submodulo> {

    private List<Submodulo> datasource;
    private Integer         empresaID;
      
    public SubmoduloLazy(Integer empresaID) {
        this.empresaID = empresaID;
    }
    
    public SubmoduloLazy(Integer empresaID, Integer tabPrecoID, Integer unidNegID) {
        this.empresaID = empresaID;
    }
      
    @Override  
    public Submodulo getRowData(String rowKey) {  
        for(Submodulo t : datasource) {  
            if(t.getId().equals(rowKey))  
                return t;  
        }    
        return null;  
    }  
  
    @Override
    public String getRowKey(Submodulo t) {
        return String.valueOf(t.getId());
    }    

    @Override
    public void setRowIndex(int rowIndex) {
        if (getPageSize() == 0) {
            rowIndex = -1;
        }        
        super.setRowIndex(rowIndex);    
    }    
    
    @Override
    public int count(Map<String, FilterMeta> map) {
        int totalRegistros = 0;
        try {
            totalRegistros = getTotalByLookUp();
        } catch (Exception e) {
            totalRegistros = 0;
        }
        return totalRegistros;
    }

    @Override
    public List<Submodulo> load(int first, int pageSize, Map<String, SortMeta> map, Map<String, FilterMeta> novoFiltro) {

        String   sortField = br.com.onsys.util.ConverterFiltroLazy.getSortField(map);
        String   sortOrder = br.com.onsys.util.ConverterFiltroLazy.getSortOrder(map);      
        Map<String, Object> filters = br.com.onsys.util.ConverterFiltroLazy.getFilterMap(novoFiltro);   
        
        datasource = getListByLookUp(first, pageSize, sortField, sortOrder, filters);  
        setRowCount(getTotalByLookUp());
        setPageSize(pageSize);        
        return datasource;
        
    }
    
    private List<Submodulo> getListByLookUp(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {    
        
        SubmoduloSession submoduloSession = doLookUp();        
        String order;        
        
        System.out.println("sortOrder===>"+sortOrder);
        
        if("DESCENDING".equals(sortOrder)){
            order = "desc";
        } else{
            order = "asc";
        }   
        
        return submoduloSession.getAllPaged(empresaID, first, pageSize, sortField, order, filters);    
        
    }

    private SubmoduloSession doLookUp() {
        
        try {
            InitialContext initialContext = new InitialContext();
            return (SubmoduloSession) initialContext.lookup("java:global/OnSysERPCloudV4/SubmoduloSession");
        } catch (NamingException ex) {
            throw new EJBException("Nao foi possivel encontrar jndiName: SubmoduloSession", ex);
        }
        
    }

    private int getTotalByLookUp() {
        
        SubmoduloSession submoduloSession = doLookUp();
        return submoduloSession.getCountTot(empresaID);
    }
    
}