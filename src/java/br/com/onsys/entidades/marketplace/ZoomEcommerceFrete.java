/* RECEBE A REQUISICAO DO FRETE MAGALU
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class ZoomEcommerceFrete implements Serializable {

    private String                  zipcode;    
    @JsonProperty(value = "items")
    private List<ZoomItemsFrete>    items;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<ZoomItemsFrete> getItems() {
        return items;
    }

    public void setItems(List<ZoomItemsFrete> items) {
        this.items = items;
    }
    
}