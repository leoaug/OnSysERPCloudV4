/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class eCommerceFrete implements Serializable {

    private String      destinationZip;
    
    @JsonProperty(value = "volumes")
    private List<eCommerceFreteVolumes> volumes;     

    public String getDestinationZip() {
        return destinationZip;
    }

    public void setDestinationZip(String destinationZip) {
        this.destinationZip = destinationZip;
    }

    public List<eCommerceFreteVolumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<eCommerceFreteVolumes> volumes) {
        this.volumes = volumes;
    }
    
}