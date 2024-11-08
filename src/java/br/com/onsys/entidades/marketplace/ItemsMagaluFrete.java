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
//@Entity
@JsonRootName(value = "items")
public class ItemsMagaluFrete implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "sku")
    private String sku;
    
    @JsonProperty(value = "quantity")
    private String quantity;

    @JsonProperty(value = "price")
    private String price;

    @JsonProperty(value = "dimensions")
    private dimensions dimensions;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(dimensions dimensions) {
        this.dimensions = dimensions;
    }
    
}