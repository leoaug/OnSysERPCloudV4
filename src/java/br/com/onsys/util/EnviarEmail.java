/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.UsuarioProgramaEmail;
import br.com.onsys.faces.seguranca.UsuarioFace;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
/**
 *
 * @author Assis
 */
@ManagedBean
@Named
@SessionScoped
public class EnviarEmail implements java.io.Serializable{
    
    @Inject
    private UsuarioFace usuarioFace;   
    private Integer     idUsrValido = null;
    private Programa    programaAtivo;

    public List<String> enviarEmail(Programa programa)  {
        System.out.println("EMAIL PROSPECT");
        List<String> listEmailDestinario = new ArrayList<>();
        try {
            if (!programa.getListUsuarioProgramaEmail().isEmpty()){                 
                for (UsuarioProgramaEmail l : programa.getListUsuarioProgramaEmail()) {
                    listEmailDestinario.add(l.getUsuario().getEmail().trim());
                    System.out.println("email===>"+l.getUsuario().getEmail().trim());
                }
            }
        } catch (Exception e) {
        }
        return listEmailDestinario;
        
    }
}