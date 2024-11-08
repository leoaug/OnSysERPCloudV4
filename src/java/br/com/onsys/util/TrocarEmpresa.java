/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.onsys.util;

import br.com.onsys.entidades.basico.Empresa;
import br.com.onsys.faces.seguranca.LoginFace;
import javax.annotation.ManagedBean;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.PrimeFaces;
/**
 *
 * @author Cristiano
 */
@ManagedBean
@Named
@SessionScoped
public class TrocarEmpresa implements java.io.Serializable {
    
    @Inject
    private LoginFace   loginFace;
    private Empresa     empresaSelecionada = null;
    
    public void trocarEmpresa(){
        System.out.println("***TROCAR EMPRESA***");
        System.out.println("***EMPRESA ATUAL===>"+loginFace.getUsuarioLogado().getEmpresa().getCodigo());
        empresaSelecionada = loginFace.getUsuarioLogado().getEmpresa();
        PrimeFaces.current().executeScript("PF('trocarEmpresa').show()");
    }
    
    public void fimTrocarEmpresa(){
        System.out.println("***FIM TROCAR EMPRESA***");
        System.out.println("***NOVA EMPRESA===>"+empresaSelecionada.getCodigo());
        PrimeFaces.current().executeScript("PF('trocarEmpresa').hide()");
    }

    public Empresa getEmpresaSelecionada() {
        return empresaSelecionada;
    }

    public void setEmpresaSelecionada(Empresa empresaSelecionada) {
        this.empresaSelecionada = empresaSelecionada;
    }
    
}