/* RECEBE A REQUISICAO DO FRETE MAGALU
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

public class eCommerceFreteMagalu implements Serializable {

    private String     session_id;
    private String     zipcode;    
    @JsonProperty(value = "items")
    private List<ItemsMagaluFrete> items;

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<ItemsMagaluFrete> getItems() {
        return items;
    }

    public void setItems(List<ItemsMagaluFrete> items) {
        this.items = items;
    }

}