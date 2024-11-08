package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import br.com.onsys.entidades.basico.Pais;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.session.basico.PaisSession;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.NamingException;

@FacesConverter(value="paisConverter")
public class PaisConverter  extends ManualCDILookup implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        if (value != null && !" ".equals(value)) {
            PaisSession bean        = null;
            UsuarioFace usuarioFace = null;
            try {
                bean = getFacadeWithJNDI(PaisSession.class);
                usuarioFace = getFacadeWithJNDI(UsuarioFace.class);
            } catch (NamingException ex) {
                Logger.getLogger(PaisConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pais pais = bean.getByDescricao(value);
            return pais;
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null && !" ".equals(value)) {
            Pais pais = (Pais) value;
            return pais.getDescricao();
        }
        return null;
    }
}