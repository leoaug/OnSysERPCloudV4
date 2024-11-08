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
@JsonRootName(value = "url_images")
public class ZoomUrlImages implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty()    
    private boolean main;
    
    @JsonProperty()    
    private String url;

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}