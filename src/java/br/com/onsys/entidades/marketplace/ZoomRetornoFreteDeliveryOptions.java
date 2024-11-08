/* INTEGRACOMMERCE - MAGALU 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import java.io.Serializable;

public class ZoomRetornoFreteDeliveryOptions implements Serializable {

    private double  shippingPrice;
    private int     daysToDelivery;
    private String  methodId;    
    private String  methodName;

    public double getShippingPrice() {
        return shippingPrice;
    }

    public void setShippingPrice(double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    public int getDaysToDelivery() {
        return daysToDelivery;
    }

    public void setDaysToDelivery(int daysToDelivery) {
        this.daysToDelivery = daysToDelivery;
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

}