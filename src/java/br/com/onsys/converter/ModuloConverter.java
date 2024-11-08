package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import br.com.onsys.entidades.seguranca.Modulo;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.session.seguranca.ModuloSession;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.NamingException;

@FacesConverter(value="moduloConverter")
public class ModuloConverter  extends ManualCDILookup implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && !" ".equals(value)) {
            ModuloSession bean = null;
            UsuarioFace userLogado = null;
            try {
                bean = getFacadeWithJNDI(ModuloSession.class);
                userLogado = getFacadeWithJNDI(UsuarioFace.class);
            } catch (NamingException ex) {
                Logger.getLogger(ModuloConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
            Modulo modulo = bean.getByDescricao(userLogado.getLoggedUser().getEmpresa().getId(), value);
            return modulo;
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null && !" ".equals(value)) {
            Modulo modulo = (Modulo) value;
            return modulo.getDescricao();
        }
        return null;
    }
}