package br.com.onsys.session.basico;

import br.com.onsys.entidades.basico.Cep;
import java.util.List;
import java.util.Map;  
import javax.ejb.EJBException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;  
import org.primefaces.model.SortMeta;

public class CepLazy extends LazyDataModel<Cep> {

    private List<Cep>   datasource;
    private Integer     empresaID;
      
    public CepLazy(Integer empresaID) {
        this.empresaID          = empresaID;
    }
    
    public CepLazy(Integer empresaID, Integer tabPrecoID, Integer unidNegID) {
        this.empresaID          = empresaID;
    }
      
    @Override  
    public Cep getRowData(String rowKey) {  
        for(Cep t : datasource) {  
            if(t.getId().equals(rowKey))  
                return t;  
        }    
        return null;  
    }  
  
    @Override
    public String getRowKey(Cep t) {
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
    public List<Cep> load(int first, int pageSize, Map<String, SortMeta> map, Map<String, FilterMeta> novoFiltro) {

        String   sortField = br.com.onsys.util.ConverterFiltroLazy.getSortField(map);
        String   sortOrder = br.com.onsys.util.ConverterFiltroLazy.getSortOrder(map);      
        Map<String, Object> filters = br.com.onsys.util.ConverterFiltroLazy.getFilterMap(novoFiltro);   
        
        datasource = getListByLookUp(first, pageSize, sortField, sortOrder, filters);  
        setRowCount(getTotalByLookUp());
        setPageSize(pageSize);        
        return datasource;
        
    }
    
    private List<Cep> getListByLookUp(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {    
        
        CepSession cepSession = doLookUp();        
        String order;        
        
        System.out.println("sortOrder===>"+sortOrder);
        
        if("DESCENDING".equals(sortOrder)){
            order = "desc";
        } else{
            order = "asc";
        }   
        
        return cepSession.getAllPaged(first, pageSize, sortField, order, filters);    
        
    }

    private CepSession doLookUp() {
        
        try {
            InitialContext initialContext = new InitialContext();
            return (CepSession) initialContext.lookup("java:global/OnSysERPCloudV4/CepSession");
        } catch (NamingException ex) {
            throw new EJBException("Nao foi possivel encontrar jndiName: CepSession", ex);
        }
        
    }

    private int getTotalByLookUp() {
        
        CepSession cepSession = doLookUp();
        return cepSession.getCountTot();
    }
    
}