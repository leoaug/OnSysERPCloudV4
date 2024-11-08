package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import br.com.onsys.entidades.seguranca.Usuario;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.session.seguranca.UsuarioSession;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.NamingException;

@FacesConverter(value="usuarioConverter")
public class UsuarioConverter  extends ManualCDILookup implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        System.out.println("UsuarioConverter - PONTO 1");
        System.out.println("value===>"+value);
        
        if (value != null && !" ".equals(value)) {
            
            System.out.println("UsuarioConverter - PONTO 2");
            
            UsuarioSession bean     = null;
            UsuarioFace userLogado  = null;
            
            try {
                bean = getFacadeWithJNDI(UsuarioSession.class);
                userLogado = getFacadeWithJNDI(UsuarioFace.class);

            } catch (NamingException ex) {
                Logger.getLogger(UsuarioConverter.class.getName()).log(Level.SEVERE, null, ex);
            }

            Usuario usuario = bean.getByApelido(userLogado.getLoggedUser().getEmpresa().getId(), value);
            
            return usuario;
            
        }
        
        return null;
        
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {

        System.out.println("UsuarioConverter - PONTO 3");

        if (value != null && !" ".equals(value)) {
            
            System.out.println("UsuarioConverter - PONTO 4");            
            System.out.println("value===>"+value);
            
            Usuario usuario = (Usuario) value;
            return usuario.getApelido();
            
        }
        
        return null;
        
    }
}