package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.WeakHashMap;

@FacesConverter(value="converterDualList")
public class ConverterDualList  extends ManualCDILookup implements Converter {
    
    private static Map<Object, String> entities = new WeakHashMap<Object, String>();
        
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("converterDualList--->Ponto2");        
        
        synchronized(entities) {
            if (!entities.containsKey(value)) {
                String uuid = UUID.randomUUID().toString();
                entities.put(value, uuid);
                return uuid;
            } else {
                return entities.get(value);
            }
        }
    }
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        for (Entry<Object, String> entry : entities.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}