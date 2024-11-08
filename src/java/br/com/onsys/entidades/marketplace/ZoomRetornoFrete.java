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

@JsonRootName(value = "zoomRetornoFrete")
public class ZoomRetornoFrete implements Serializable {

    @JsonProperty(value = "id")
    private String id;
    
    @JsonProperty(value = "estimates")    
    private List<ZoomRetornoFreteDeliveryOptions> estimates;         

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ZoomRetornoFreteDeliveryOptions> getEstimates() {
        return estimates;
    }

    public void setEstimates(List<ZoomRetornoFreteDeliveryOptions> estimates) {
        this.estimates = estimates;
    }

}