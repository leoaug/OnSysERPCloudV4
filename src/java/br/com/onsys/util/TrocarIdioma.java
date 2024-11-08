/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
/**
 *
 * @author Cristiano
 * 
 * 
 * 
 */
@ManagedBean
@Named
@SessionScoped
public class TrocarIdioma implements java.io.Serializable {
    
    private boolean portugues   = true;
    private boolean ingles      = false;
    private boolean espanhol    = false;
    private String idiomaSelecionado = "pt";
    
    @PostConstruct
    public void init() {
        setIdiomaSelecionado("pt");
    }    
    
    public void trocarIdioma(String locale){
        System.out.println("***TROCAR IDIOMA***");
        System.out.println("LOCALE===>"+locale);
        setIdiomaSelecionado(locale);
        switch (locale) {
            case "pt":
                idiomaPortugues();
                break;
            case "en":
                idiomaIngles();
                break;
            case "es":
                idiomaEspanhol();
                break;
            default:
                break;
        }
    }
    
    public void idiomaPortugues() {
        setIdiomaSelecionado("pt");
        setPortugues(true);
        setIngles(false);        
        setEspanhol(false);        
        
        System.out.println("***TROCAR IDIOMA-PORTUGUES***");
        
    }

    public void idiomaIngles() {
        setIdiomaSelecionado("en");
        setIngles(true);
        setPortugues(false);
        setEspanhol(false);                
    }
    
    public void idiomaEspanhol() {
        setIdiomaSelecionado("es");
        setEspanhol(true);
        setIngles(false);
        setPortugues(false);
    }
    
    public void trocarIdioma(){
        System.out.println("***TROCAR IDIOMA***");
        //System.out.println("***EMPRESA ATUAL===>"+loginFace.getUsuarioLogado().getEmpresa().getCodigo());
        //idiomaSelecionado = loginFace.getUsuarioLogado().getEmpresa();
        PrimeFaces.current().executeScript("PF('trocarIdioma').show()");
    }
    
    public void fimTrocarIdioma(){
        System.out.println("***FIM TROCAR IDIOMA***");
        //System.out.println("***NOVA EMPRESA===>"+empresaSelecionada.getCodigo());
        PrimeFaces.current().executeScript("PF('trocarIdioma').hide()");
        
        FacesContext context = FacesContext.getCurrentInstance();  
        Application application = context.getApplication();  
        ViewHandler viewHandler = application.getViewHandler();  
        UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());  
        context.setViewRoot(viewRoot);  
        context.renderResponse();        
        
        
        
    }
    
    
    
    
    
    public boolean isPortugues() {
        return portugues;
    }

    public void setPortugues(boolean portugues) {
        this.portugues = portugues;
    }

    public boolean isIngles() {
        return ingles;
    }

    public void setIngles(boolean ingles) {
        this.ingles = ingles;
    }

    public boolean isEspanhol() {
        return espanhol;
    }

    public void setEspanhol(boolean espanhol) {
        this.espanhol = espanhol;
    }

    public String getIdiomaSelecionado() {
        return idiomaSelecionado;
    }

    public void setIdiomaSelecionado(String idiomaSelecionado) {
        this.idiomaSelecionado = idiomaSelecionado;
    }
    
}