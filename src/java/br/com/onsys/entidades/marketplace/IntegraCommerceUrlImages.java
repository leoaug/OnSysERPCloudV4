/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;

/**
 *
 * @author Administrador2
 */
@JsonRootName(value = "urlImages")
public class IntegraCommerceUrlImages implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty()    
    private String string;    

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
    
}
