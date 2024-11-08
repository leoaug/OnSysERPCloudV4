/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.util;

import br.com.onsys.entidades.basico.Sequence;
import br.com.onsys.session.basico.SequenceSession;
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
public class ValidaSequencia implements java.io.Serializable{
    
    @Inject
    private SequenceSession sequenceSession;   
    
    public void validaSequencia() {
      
        Sequence sequencia = sequenceSession.getByName("SEQ_GEN");
        System.out.println("sequencia--->"+sequencia.getSeqCount());
        
    }
    
}