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
//@Entity
@JsonRootName(value = "to")
public class MELIMessageTo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "user_id")
    private String user_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    
}