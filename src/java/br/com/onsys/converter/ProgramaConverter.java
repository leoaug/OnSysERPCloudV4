package br.com.onsys.converter;

import br.com.onsys.ejb.ManualCDILookup;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.faces.seguranca.UsuarioFace;
import br.com.onsys.session.seguranca.ProgramaSession;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.naming.NamingException;

@FacesConverter(value="programaConverter")
public class ProgramaConverter  extends ManualCDILookup implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value != null && !" ".equals(value)) {
            ProgramaSession bean = null;
            UsuarioFace userLogado = null;
            try {
                bean = getFacadeWithJNDI(ProgramaSession.class);
                userLogado = getFacadeWithJNDI(UsuarioFace.class);
            } catch (NamingException ex) {
                Logger.getLogger(ProgramaConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //System.out.println("***PONTO 1***");
            //System.out.println("***VALUE===>"+value);            
            
            Programa programa = bean.getById(Integer.parseInt(value));
            return programa;
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value != null && !" ".equals(value)) {
            
            //System.out.println("***PONTO 2***");
            //System.out.println("***VALUE===>"+value);            
            
            Programa programa = (Programa) value;            
            ProgramaSession bean = null;
            UsuarioFace userLogado = null;
            try {
                bean = getFacadeWithJNDI(ProgramaSession.class);
                userLogado = getFacadeWithJNDI(UsuarioFace.class);
            } catch (NamingException ex) {
                Logger.getLogger(ProgramaConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
//            programa = bean.getByDescricao(userLogado.getLoggedUser().getEmpresa().getId(), value);

            String idString = Integer.toString(programa.getId());

            return idString;

            /*
            Programa programa = (Programa) value;
            return programa.getDescricao();
                    */
        }
        return null;
    }
}