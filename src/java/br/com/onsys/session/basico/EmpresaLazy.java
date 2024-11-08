package br.com.onsys.session.basico;

import java.util.List;
import java.util.Map;

import javax.ejb.EJBException;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

import br.com.onsys.entidades.basico.Empresa;

public class EmpresaLazy extends LazyDataModel <Empresa> {


    private static final long serialVersionUID = 1L;
	private List <Empresa>  datasource;
    private Integer         empresaID;
      
    public EmpresaLazy(Integer empresaID) {
        this.empresaID = empresaID;
    }
    
    public EmpresaLazy(Integer empresaID, Integer tabPrecoID, Integer unidNegID) {
        this.empresaID = empresaID;
    }
      
    @Override  
    public Empresa getRowData(String rowKey) {  
        for(Empresa t : datasource) {  
            if(t.getId().equals(rowKey))  
                return t;  
        }    
        return null;  
    }  
  
    @Override
    public String getRowKey(Empresa t) {
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
    public List<Empresa> load(int first, int pageSize, Map<String, SortMeta> map, Map<String, FilterMeta> novoFiltro) {

        String   sortField = br.com.onsys.util.ConverterFiltroLazy.getSortField(map);
        String   sortOrder = br.com.onsys.util.ConverterFiltroLazy.getSortOrder(map);      
        Map<String, Object> filters = br.com.onsys.util.ConverterFiltroLazy.getFilterMap(novoFiltro);   
        
        datasource = getListByLookUp(first, pageSize, sortField, sortOrder, filters);  
        setRowCount(getTotalByLookUp());
        setPageSize(pageSize);        
        return datasource;
        
    }
    
    private List<Empresa> getListByLookUp(int first, int pageSize, String sortField, String sortOrder, Map<String, Object> filters) {    
        
    	EmpresaSession itemSession = doLookUp();        
        String order;        
        
        System.out.println("sortOrder===>"+sortOrder);
        
        if("DESCENDING".equals(sortOrder)){
            order = "desc";
        } else{
            order = "asc";
        }   
        
        return itemSession.getAllPaged(empresaID, first, pageSize, sortField, order, filters);    
        
    }

    private EmpresaSession doLookUp() {
        
        try {
            InitialContext initialContext = new InitialContext();
            return (EmpresaSession) initialContext.lookup("java:global/OnSysERPCloudV4/EmpresaSession");
        } catch (NamingException ex) {
            throw new EJBException("Nao foi possivel encontrar jndiName: EmpresaSession", ex);
        }
        
    }

    private int getTotalByLookUp() {
        
    	EmpresaSession itemSession = doLookUp();
        return itemSession.getCountTot(empresaID);
    }
}
