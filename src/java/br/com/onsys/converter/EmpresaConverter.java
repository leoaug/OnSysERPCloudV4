package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.session.basico.EmpresaSession;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.NamingException;

@FacesConverter(value="empresaConverter")
public class EmpresaConverter  extends ManualCDILookup implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        System.out.println("***EMPRESA CONVERTER - 1***");
        System.out.println("value===>"+value);
        
        if (value != null && !" ".equals(value)) {
            EmpresaSession bean = null;
            try {
                bean = getFacadeWithJNDI(EmpresaSession.class);
            } catch (NamingException ex) {
                Logger.getLogger(EmpresaConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
            Empresa empresa = bean.getByDescricao(value);
            return empresa;
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        
        System.out.println("***EMPRESA CONVERTER - 2***");
        System.out.println("value===>"+value);        
        
        if (value != null && !" ".equals(value)) {
            Empresa empresa = (Empresa) value;
            return empresa.getDescricao();
        }
        return null;
    }
}