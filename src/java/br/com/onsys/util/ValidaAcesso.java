/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;
import br.com.onsys.entidades.seguranca.Programa;
import br.com.onsys.entidades.seguranca.UsuarioPrograma;
import br.com.onsys.faces.seguranca.LoginFace;
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
public class ValidaAcesso implements java.io.Serializable{
    
    @Inject
    private LoginFace   loginFace;   
    private Integer     idUsrValido = null;
    private Programa    programaAtivo;
    
    //METODO PARA VALIDAR SER USUARIO TEM ACESSO A PAGINA 
    public boolean validaUsrUrl(String cURL) {
        
        for (UsuarioPrograma usuarioPrograma : loginFace.getListUsrProg()) { 
          //System.out.println("ValidaAcesso.validaUsrUrl");
          //System.out.println("cURL--->"+cURL);
          //System.out.println("caminho--->"+usuarioPrograma.getPrograma().getCaminho());
          if (usuarioPrograma.getPrograma().getCaminho() != null) {
            if (cURL.equals(usuarioPrograma.getPrograma().getCaminho().trim())) { 
                programaAtivo = usuarioPrograma.getPrograma();
  //                try {
  //                    paramTemplates = paramTemplatesSession.getByIdEmpresaIdProg(usuarioFace.getLoggedUser().getEmpresa().getId(), usuarioPrograma.getPrograma().getId());
  //                    cURL = paramTemplates.getCaminho().trim();
  //                    System.out.println("cURL alterada--->"+cURL);
  //                    return true;
  //                } catch (Exception e) {
                      return true;                          
  //                }
              } 
          }
        }
        return false;
    }

    // METODO PARA VALIDAR NIVEL DE ACESSO DO USUARIO LOGADO    
    public boolean validaAcesso(String cURL, String operacao){
      System.out.println("valisaAcesso-001");
      System.out.println(cURL);        
      System.out.println(operacao);                
      System.out.println("valisaAcesso-002");        
        for (UsuarioPrograma usuarioPrograma : loginFace.getListUsrProg()) {    
            if ("A".equals(operacao)) {                                       //ALTERAR
                if (cURL.equals(usuarioPrograma.getPrograma().getCaminho())) { 
                    return usuarioPrograma.isEditar();
                } 
            }
            if ("C".equals(operacao)) {                                        //CONSULTAR
                if (cURL.equals(usuarioPrograma.getPrograma().getCaminho())) { 
                    return usuarioPrograma.isConsultar();
                } 
            }
            if ("D".equals(operacao)) {                                       //DELETAR
                if (cURL.equals(usuarioPrograma.getPrograma().getCaminho())) { 
                    return usuarioPrograma.isEditar();
                } 
            }
            if ("E".equals(operacao)) {                                       //EDITAR
                if (cURL.equals(usuarioPrograma.getPrograma().getCaminho())) { 
                    return usuarioPrograma.isEditar();
                } 
            }
            if ("I".equals(operacao)) {                                        //INCLUIR
                if (cURL.equals(usuarioPrograma.getPrograma().getCaminho())) { 
                    return usuarioPrograma.isIncluir();
                } 
            }
            if ("R".equals(operacao)) {                                       //REMOVER
                if (cURL.equals(usuarioPrograma.getPrograma().getCaminho())) { 
                    return usuarioPrograma.isIncluir();
                } 
            }
        }
        return false; 
    }
    
    public void doValidaUsr() {
        //if (!loginFace.getLoggedUser().getId().equals(idUsrValido) || idUsrValido == null) {
         //     usuarioFace.doLogOut();        
        //}        
    }        

    public Integer getIdUsrValido() {
        return idUsrValido;
    }

    public void setIdUsrValido(Integer idUsrValido) {
        this.idUsrValido = idUsrValido;
    }

    public Programa getProgramaAtivo() {
        return programaAtivo;
    }

    public void setProgramaAtivo(Programa programaAtivo) {
        this.programaAtivo = programaAtivo;
    }
    
}