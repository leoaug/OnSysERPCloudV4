/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;
import java.util.List;

@JsonRootName(value = "packages")
public class packages implements Serializable {

    private List<ItemsMagalu> items;      
    private List<delivery_options> delivery_options;

    public List<ItemsMagalu> getItems() {
        return items;
    }

    public void setItems(List<ItemsMagalu> items) {
        this.items = items;
    }

    public List<delivery_options> getDelivery_options() {
        return delivery_options;
    }

    public void setDelivery_options(List<delivery_options> delivery_options) {
        this.delivery_options = delivery_options;
    }
    
}