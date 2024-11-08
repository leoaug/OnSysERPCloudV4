/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
/**
 *
 * @author Administrador2
 */
//@Entity
@JsonRootName(value = "product")
public class Product implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "sku")
    private String sku;
    
    @JsonProperty(value = "name")
    private String name;
    
    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "status")
    private String status;
    
    @JsonProperty(value = "qty")
    private int  qty;

    @JsonProperty(value = "price")
    private double price;

    @JsonProperty(value = "promotional_price")
    private BigDecimal promotional_price = null;

    @JsonProperty(value = "cost")
    private double cost;
    
    @JsonProperty(value = "weight")
    private double  weight;

    @JsonProperty(value = "height")
    private double  height;
    
    @JsonProperty(value = "width")
    private double  width;

    @JsonProperty(value = "length")
    private double  length;

    @JsonProperty(value = "brand")
    private String brand;

    @JsonProperty(value = "ean")
    private String ean;

    @JsonProperty(value = "nbm")
    private String nbm;
    
    @JsonProperty(value = "categories")
    private List<Categories> categories;    
    
    @JsonProperty(value = "images")
    private List<String> images ;
    
    @JsonProperty(value = "specifications")
    private List<Specifications> specifications;    
    
    @JsonProperty(value = "variations")
    private List<Variations> variations;    

    @JsonProperty(value = "variation_attributes")
    private List<String> variation_attributes ;

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Specifications> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specifications> specifications) {
        this.specifications = specifications;
    }
    
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BigDecimal getPromotional_price() {
        return promotional_price;
    }

    public void setPromotional_price(BigDecimal promotional_price) {
        this.promotional_price = promotional_price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getNbm() {
        return nbm;
    }

    public void setNbm(String nbm) {
        this.nbm = nbm;
    }

    public List<Variations> getVariations() {
        return variations;
    }

    public void setVariations(List<Variations> variations) {
        this.variations = variations;
    }

    public List<String> getVariation_attributes() {
        return variation_attributes;
    }

    public void setVariation_attributes(List<String> variation_attributes) {
        this.variation_attributes = variation_attributes;
    }
    
}