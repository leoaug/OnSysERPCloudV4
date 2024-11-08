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

@JsonRootName(value = "shippingQuotes")
public class retornoFreteSkyHub implements Serializable {

    @JsonProperty(value = "shippingQuotes")    
    private List<shippingQuotes> shippingQuotes;         

    public List<shippingQuotes> getShippingQuotes() {
        return shippingQuotes;
    }

    public void setShippingQuotes(List<shippingQuotes> shippingQuotes) {
        this.shippingQuotes = shippingQuotes;
    }
    
    
}