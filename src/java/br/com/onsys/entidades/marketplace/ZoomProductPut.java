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
/**
 *
 * @author Administrador2
 */
//@Entity
@JsonRootName(value = "product")
public class ZoomProductPut implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "id")
    private String id;
    
    @JsonProperty(value = "price")
    private double price;
    
    @JsonProperty(value = "installments")
    private ZoomInstallments installments;
    
    @JsonProperty(value = "quantity")
    private int quantity;

    @JsonProperty(value = "availability")
    private boolean availability;
    
    @JsonProperty(value = "url")
    private String url;
    
    @JsonProperty(value = "attributes")
    private List<ZoomAttributes> attributes;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ZoomInstallments getInstallments() {
        return installments;
    }

    public void setInstallments(ZoomInstallments installments) {
        this.installments = installments;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ZoomAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<ZoomAttributes> attributes) {
        this.attributes = attributes;
    }
   
}