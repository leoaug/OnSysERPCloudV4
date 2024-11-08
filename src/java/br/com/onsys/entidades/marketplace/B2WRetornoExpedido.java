/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import java.io.Serializable;

@JsonRootName(value = "shipments")
public class B2WRetornoExpedido implements Serializable {

    @JsonProperty(value = "status")
    private String status;
    
    @JsonProperty(value = "shipment")
    private B2WRetornoShipment shipment;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public B2WRetornoShipment getShipment() {
        return shipment;
    }

    public void setShipment(B2WRetornoShipment shipment) {
        this.shipment = shipment;
    }

}