package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import br.com.onsys.entidades.basico.Estabelecimento;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.session.basico.EstabelSession;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.NamingException;

@FacesConverter(value="estabelConverter")
public class EstabelNomeFantasiaConverter  extends ManualCDILookup implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        if (value != null && !" ".equals(value)) {
            EstabelSession bean     = null;
            UsuarioFace usuarioFace = null;
            try {
                bean        = getFacadeWithJNDI(EstabelSession.class);
                usuarioFace = getFacadeWithJNDI(UsuarioFace.class);
            } catch (NamingException ex) {
                Logger.getLogger(EstabelNomeFantasiaConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
            Estabelecimento estabelecimento = bean.getByDescricao(usuarioFace.getLoggedUser().getEmpresa().getId(),value);
            return estabelecimento;
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null && !" ".equals(value)) {
            Estabelecimento estabelecimento = (Estabelecimento) value;
            return estabelecimento.getDescricao();
        }
        return null;
    }
}