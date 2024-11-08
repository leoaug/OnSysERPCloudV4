/* INTEGRACOMMERCE - MAGALU 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import java.io.Serializable;

public class delivery_options implements Serializable {

    private String  id;
    private String  type;
    private String  name;
    private String  price;
    private int     delivery_days;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getDelivery_days() {
        return delivery_days;
    }

    public void setDelivery_days(int delivery_days) {
        this.delivery_days = delivery_days;
    }

}