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
public class ZoomProduct implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "id")
    private String id;
    
    @JsonProperty(value = "sku")
    private String sku;
    
    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "description")
    private String description;
    
    @JsonProperty(value = "department")
    private String  department;

    @JsonProperty(value = "sub_department")
    private String sub_department;

    @JsonProperty(value = "ean")
    private String ean;

    @JsonProperty(value = "free_shipping")
    private String free_shipping;
    
    @JsonProperty(value = "base_price")
    private double base_price;
    
    @JsonProperty(value = "price")
    private double price;
    
    @JsonProperty(value = "installments")
    private ZoomInstallments installments;
    
    @JsonProperty(value = "quantity")
    private int quantity;

    @JsonProperty(value = "availability")
    private boolean availability;
    
    @JsonProperty(value = "stock_info")
    private ZoomStockInfo stock_info;
    
    @JsonProperty(value = "url")
    private String url;
    
    @JsonProperty(value = "url_images")
    private List<ZoomUrlImages> url_images;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSub_department() {
        return sub_department;
    }

    public void setSub_department(String sub_department) {
        this.sub_department = sub_department;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getFree_shipping() {
        return free_shipping;
    }

    public void setFree_shipping(String free_shipping) {
        this.free_shipping = free_shipping;
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
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

    public ZoomStockInfo getStock_info() {
        return stock_info;
    }

    public void setStock_info(ZoomStockInfo stock_info) {
        this.stock_info = stock_info;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<ZoomUrlImages> getUrl_images() {
        return url_images;
    }

    public void setUrl_images(List<ZoomUrlImages> url_images) {
        this.url_images = url_images;
    }
    
}