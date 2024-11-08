/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import java.io.Serializable;

public class ZoomInstallments implements Serializable {

    private int         amount_months;
    private double      price;

    public int getAmount_months() {
        return amount_months;
    }

    public void setAmount_months(int amount_months) {
        this.amount_months = amount_months;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
}