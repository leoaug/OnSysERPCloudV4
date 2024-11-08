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
@JsonRootName(value = "price")
public class IntegraCommercePrice implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "listPrice")
    private double listPrice;
    
    @JsonProperty(value = "salePrice")
    private double salePrice;

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    
}