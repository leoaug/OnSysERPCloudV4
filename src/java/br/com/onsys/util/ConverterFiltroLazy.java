package br.com.onsys.util;

import java.util.HashMap;
import java.util.Map;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.SortMeta;

/**
 *
 * @author cristiano
 */
public class ConverterFiltroLazy implements java.io.Serializable {
    
    /**
     * Função utilizada para efeito de compatibilidade com as funções já existentes no sistema, evitando assim o refactory de tudo.
     * 
     * @param sortBy
     * @return
     */
    public static String getSortField(Map<String, SortMeta> sortBy) {
    	
    	if(sortBy != null && sortBy.isEmpty() == false) {
    		SortMeta sortM = sortBy.entrySet().stream().findFirst().get().getValue();
    		return sortM.getField().trim();
    		//return sortM.getSortField().trim();
    	}
    	
    	return null;
    }
    
    /**
     * Função utilizada para efeito de compatibilidade com as funções já existentes no sistema, evitando assim o refactory de tudo.
     * 
     * @param sortBy
     * @return
     */
    public static String getSortOrder(Map<String, SortMeta> sortBy) {
    	
    	if(sortBy != null && sortBy.isEmpty() == false) {
    		SortMeta sortM = sortBy.entrySet().stream().findFirst().get().getValue();
    		return sortM.getOrder().toString();
    		//return sortM.getSortOrder().toString();
    	}
    	
    	return null;
    }
    
    /**
     * Realiza a conversão do padrão do Primefaces para o nosso padrão, de modo que a camada de negócio não conhecerá a existência de primefaces.
     * 
     * @param sortBy
     * @return O primeiro elemento do map é a chave e o segundo é se o mesmo é ASCENDING OU DESCENDING
     */
    public static Map<String, String> getSortMap(Map<String, SortMeta> sortBy) {
    	
    	if(sortBy != null) {
    		Map<String, String> map = new HashMap<String, String>();
    		
    		for(String k : sortBy.keySet()) {
    			map.put(sortBy.get(k).getField(), sortBy.get(k).getOrder().toString());
    			//map.put(sortBy.get(k).getSortField(), sortBy.get(k).getSortOrder().toString());
    		}
    		
    		return map;
    	}
    	
    	return null;
    }
    
    /**
     * Realiza a conversão do padrão do Primefaces para o nosso padrão, de modo que a camada de negócio não conhecerá a existência de primefaces.
     * 
     * @param sortBy
     * @return O primeiro elemento do map é a chave e o segundo é o valor propriamente dito.
     */
    public static Map<String, Object> getFilterMap(Map<String, FilterMeta> filterBy) {
    	
    	if(filterBy != null) {
    		Map<String, Object> map = new HashMap<String, Object>();
    		
    		for(String k : filterBy.keySet()) {    			
    			String filterField = filterBy.get(k).getField();
    			//String filterField = filterBy.get(k).getFilterField();
    			Object filterValue = filterBy.get(k).getFilterValue();
    			
    			if(filterValue != null) {
    				map.put(filterField, filterValue);
    			}
    		}
    		
    		return map;
    	}
    	
    	return null;
    }    
    
}