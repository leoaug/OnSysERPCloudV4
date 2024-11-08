/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;

@JsonRootName(value = "shippingQuotes")
public class shippingQuotes implements Serializable {

    private double          shippingCost;         

    private deliveryTime    deliveryTime;     
    
    private String          shippingMethodId;
    
    private String          shippingMethodName;
    
    private String          shippingMethodDisplayName;

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public deliveryTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(deliveryTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getShippingMethodId() {
        return shippingMethodId;
    }

    public void setShippingMethodId(String shippingMethodId) {
        this.shippingMethodId = shippingMethodId;
    }

    public String getShippingMethodName() {
        return shippingMethodName;
    }

    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    public String getShippingMethodDisplayName() {
        return shippingMethodDisplayName;
    }

    public void setShippingMethodDisplayName(String shippingMethodDisplayName) {
        this.shippingMethodDisplayName = shippingMethodDisplayName;
    }
    
}