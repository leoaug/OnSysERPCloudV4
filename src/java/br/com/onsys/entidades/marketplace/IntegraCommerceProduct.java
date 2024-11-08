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
public class IntegraCommerceProduct implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "idproduct")
    private String idproduct;
    
    @JsonProperty(value = "name")
    private String name;
    
    @JsonProperty(value = "code")
    private String code;

    @JsonProperty(value = "brand")
    private String brand;
    
    @JsonProperty(value = "nbmOrigin")
    private String  nbmOrigin;

    @JsonProperty(value = "nbmNumber")
    private String nbmNumber;

    @JsonProperty(value = "warrantyTime")
    private String warrantyTime;

    @JsonProperty(value = "active")
    private boolean active;
    
    @JsonProperty(value = "categories")
    private List<IntegraCommerceCategories> categories;    
    
    @JsonProperty(value = "marketplaceStructures")
    private List<IntegraCommerceMarketplaceStructures> marketplaceStructures;
    
    @JsonProperty(value = "attributes")
    private List<IntegraCommerceAttributes> attributes;

    public String getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(String idproduct) {
        this.idproduct = idproduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNbmOrigin() {
        return nbmOrigin;
    }

    public void setNbmOrigin(String nbmOrigin) {
        this.nbmOrigin = nbmOrigin;
    }

    public String getNbmNumber() {
        return nbmNumber;
    }

    public void setNbmNumber(String nbmNumber) {
        this.nbmNumber = nbmNumber;
    }

    public String getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(String warrantyTime) {
        this.warrantyTime = warrantyTime;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<IntegraCommerceCategories> getCategories() {
        return categories;
    }

    public void setCategories(List<IntegraCommerceCategories> categories) {
        this.categories = categories;
    }

    public List<IntegraCommerceMarketplaceStructures> getMarketplaceStructures() {
        return marketplaceStructures;
    }

    public void setMarketplaceStructures(List<IntegraCommerceMarketplaceStructures> marketplaceStructures) {
        this.marketplaceStructures = marketplaceStructures;
    }

    public List<IntegraCommerceAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<IntegraCommerceAttributes> attributes) {
        this.attributes = attributes;
    }
    
}