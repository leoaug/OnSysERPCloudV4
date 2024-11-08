/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;

@JsonRootName(value = "invoice")
public class B2WRetornoFaturamento implements Serializable {

    @JsonProperty(value = "volume_qty")
    private int volume_qty;
    
    @JsonProperty(value = "key")    
    private String key;         

    public int getVolume_qty() {
        return volume_qty;
    }

    public void setVolume_qty(int volume_qty) {
        this.volume_qty = volume_qty;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    
    


}