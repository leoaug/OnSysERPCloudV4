package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import br.com.onsys.entidades.seguranca.Submodulo;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.session.seguranca.SubmoduloSession;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.NamingException;

@FacesConverter(value="submoduloConverter")
public class SubmoduloConverter  extends ManualCDILookup implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && !" ".equals(value) && !"Selecione um submódulo".equals(value)) {
            SubmoduloSession bean = null;
            UsuarioFace userLogado = null;
            try {
                bean = getFacadeWithJNDI(SubmoduloSession.class);
                userLogado = getFacadeWithJNDI(UsuarioFace.class);
            } catch (NamingException ex) {
                Logger.getLogger(SubmoduloConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
            Submodulo submodulo = bean.getByDescricao(userLogado.getLoggedUser().getEmpresa().getId(), value);
            return submodulo;
        } 
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null && !" ".equals(value) && !"Selecione um submódulo".equals(value)) {
            Submodulo submodulo = (Submodulo) value;
            return submodulo.getDescricao();
        } 
        return null;        
    }
}