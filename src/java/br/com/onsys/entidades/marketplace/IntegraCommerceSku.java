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
@JsonRootName(value = "sku")
public class IntegraCommerceSku implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "idSku")
    private String idSku;
    
    @JsonProperty(value = "idSkuErp")
    private String idSkuErp;
    
    @JsonProperty(value = "idProduct")
    private String idProduct;

    @JsonProperty(value = "name")
    private String name;
    
    @JsonProperty(value = "description")
    private String  description;

    @JsonProperty(value = "height")
    private double height;

    @JsonProperty(value = "width")
    private double width;

    @JsonProperty(value = "length")
    private double length;

    @JsonProperty(value = "weight")
    private double weight;
    
    @JsonProperty(value = "codeEan")
    private String  codeEan;
    
    @JsonProperty(value = "codeNcm")
    private String  codeNcm;    
    
    @JsonProperty(value = "codeIsbn")
    private String  codeIsbn;       
    
    @JsonProperty(value = "codeNbm")
    private String  codeNbm;       
    
    @JsonProperty(value = "variation")
    private String  variation;       
    
    @JsonProperty(value = "status")
    private boolean  status;       
    
    @JsonProperty(value = "price")
    private IntegraCommercePrice  price;       
    
    @JsonProperty(value = "stockQuantity")
    private int  stockQuantity;       

    @JsonProperty(value = "mainImageUrl")
    private String  mainImageUrl;       
    
    @JsonProperty(value = "urlImages")
    private String urlImages[];
//    private List<IntegraCommerceUrlImages> urlImages;    
    
    @JsonProperty(value = "attributes")
    private List<IntegraCommerceAttributes> attributes;

    public String getIdSku() {
        return idSku;
    }

    public void setIdSku(String idSku) {
        this.idSku = idSku;
    }

    public String getIdSkuErp() {
        return idSkuErp;
    }

    public void setIdSkuErp(String idSkuErp) {
        this.idSkuErp = idSkuErp;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getMainImageUrl() {
        return mainImageUrl;
    }

    public void setMainImageUrl(String mainImageUrl) {
        this.mainImageUrl = mainImageUrl;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCodeEan() {
        return codeEan;
    }

    public void setCodeEan(String codeEan) {
        this.codeEan = codeEan;
    }

    public String getCodeNcm() {
        return codeNcm;
    }

    public void setCodeNcm(String codeNcm) {
        this.codeNcm = codeNcm;
    }

    public String getCodeIsbn() {
        return codeIsbn;
    }

    public void setCodeIsbn(String codeIsbn) {
        this.codeIsbn = codeIsbn;
    }

    public String getCodeNbm() {
        return codeNbm;
    }

    public void setCodeNbm(String codeNbm) {
        this.codeNbm = codeNbm;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public IntegraCommercePrice getPrice() {
        return price;
    }

    public void setPrice(IntegraCommercePrice price) {
        this.price = price;
    }

    public String[] getUrlImages() {
        return urlImages;
    }

    public void setUrlImages(String[] urlImages) {
        this.urlImages = urlImages;
    }
    

//    public List<IntegraCommerceUrlImages> getUrlImages() {
//        return urlImages;
//    }

//    public void setUrlImages(List<IntegraCommerceUrlImages> urlImages) {
//        this.urlImages = urlImages;
//    }

    public List<IntegraCommerceAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<IntegraCommerceAttributes> attributes) {
        this.attributes = attributes;
    }    
    
}