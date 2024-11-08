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

@JsonRootName(value = "shipment")
public class B2WRetornoShipment implements Serializable {

    @JsonProperty(value = "code")
    private String code;
    
    @JsonProperty(value = "items")    
    private List<B2WRetornoItems> items;         
    
    @JsonProperty(value = "track")
    private B2WRetornoTrack track;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<B2WRetornoItems> getItems() {
        return items;
    }

    public void setItems(List<B2WRetornoItems> items) {
        this.items = items;
    }

    public B2WRetornoTrack getTrack() {
        return track;
    }

    public void setTrack(B2WRetornoTrack track) {
        this.track = track;
    }
    
    
    


}