/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;
import java.util.List;

@JsonRootName(value = "packages")
public class retornoFreteMagalu implements Serializable {

    @JsonProperty(value = "packages")    
    private List<packages> packages;         

    public List<packages> getPackages() {
        return packages;
    }

    public void setPackages(List<packages> packages) {
        this.packages = packages;
    }
    
}