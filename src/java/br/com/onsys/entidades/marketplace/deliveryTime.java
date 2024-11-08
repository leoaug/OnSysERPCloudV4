/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import java.io.Serializable;

public class deliveryTime implements Serializable {

    private int         total;
    private int         transit;
    private int         expedition;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTransit() {
        return transit;
    }

    public void setTransit(int transit) {
        this.transit = transit;
    }

    public int getExpedition() {
        return expedition;
    }

    public void setExpedition(int expedition) {
        this.expedition = expedition;
    }
    
}