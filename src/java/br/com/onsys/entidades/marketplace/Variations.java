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
@JsonRootName(value = "variations")
public class Variations implements Serializable {
    private static final long serialVersionUID = 1L;    

    @JsonProperty(value = "sku")        
    private String sku;    
    
    @JsonProperty(value = "qty")        
    private int qty;   

    @JsonProperty(value = "ean")        
    private String ean;    
    
    @JsonProperty(value = "images")
    private List<String> images ;

    @JsonProperty(value = "specifications")
    private List<Specifications> specifications;    

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<Specifications> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specifications> specifications) {
        this.specifications = specifications;
    }
    
}