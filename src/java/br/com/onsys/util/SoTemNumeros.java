/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SoTemNumeros implements java.io.Serializable{
    
    /** Creates a new instance of ValidaCnpj */  
    public SoTemNumeros() {  
    }      

    public boolean soContemNumeros(String texto) { 
        if(texto == null) return false; 
        for (char letra : texto.toCharArray()) 
            if(letra < '0' || letra > '9') 
                return false; 
        return true; 
    }    
    
}
