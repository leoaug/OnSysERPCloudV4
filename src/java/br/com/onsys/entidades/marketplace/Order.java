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
@JsonRootName(value = "order")
public class Order implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @JsonProperty(value = "code")
    private String code;
    
    @JsonProperty(value = "channel")
    private String channel;
    
    @JsonProperty(value = "placed_at")
    private String placed_at;
    
    @JsonProperty(value = "updated_at")
    private String updated_at;
    
    @JsonProperty(value = "shipping_method")
    private String shipping_method;    
    
    @JsonProperty(value = "estimated_delivery")
    private String estimated_delivery;  
    
    @JsonProperty(value = "estimated_delivery_shift")
    private String estimated_delivery_shift;  
    
    @JsonProperty(value = "total_ordered")
    private double total_ordered;

    @JsonProperty(value = "interest")
    private double interest;

    @JsonProperty(value = "shipping_cost")
    private double shipping_cost;
    
    @JsonProperty(value = "shipping_address")
    List<Shipping_address> shipping_address;    
    
    @JsonProperty(value = "billing_address")
    private List<Billing_address> billing_address ;
    
    @JsonProperty(value = "customer")
    private List<Customer> customer;    
    
    @JsonProperty(value = "items")
    private List<Items> items;    

    @JsonProperty(value = "status")
    private List<Status> status ;
    
    @JsonProperty(value = "sync_status")
    private String sync_status;    
    
    @JsonProperty(value = "invoices")
    private String[] invoices;       
    
    @JsonProperty(value = "shipments")
    private String[] shipments;       

    @JsonProperty(value = "payments")
    private String[] payments;       
    
    @JsonProperty(value = "tags")
    private String[] tags;       

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPlaced_at() {
        return placed_at;
    }

    public void setPlaced_at(String placed_at) {
        this.placed_at = placed_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getShipping_method() {
        return shipping_method;
    }

    public void setShipping_method(String shipping_method) {
        this.shipping_method = shipping_method;
    }

    public String getEstimated_delivery() {
        return estimated_delivery;
    }

    public void setEstimated_delivery(String estimated_delivery) {
        this.estimated_delivery = estimated_delivery;
    }

    public String getEstimated_delivery_shift() {
        return estimated_delivery_shift;
    }

    public void setEstimated_delivery_shift(String estimated_delivery_shift) {
        this.estimated_delivery_shift = estimated_delivery_shift;
    }

    public double getTotal_ordered() {
        return total_ordered;
    }

    public void setTotal_ordered(double total_ordered) {
        this.total_ordered = total_ordered;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public double getShipping_cost() {
        return shipping_cost;
    }

    public void setShipping_cost(double shipping_cost) {
        this.shipping_cost = shipping_cost;
    }

    public List<Shipping_address> getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(List<Shipping_address> shipping_address) {
        this.shipping_address = shipping_address;
    }

    public List<Billing_address> getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(List<Billing_address> billing_address) {
        this.billing_address = billing_address;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
        this.status = status;
    }

    public String getSync_status() {
        return sync_status;
    }

    public void setSync_status(String sync_status) {
        this.sync_status = sync_status;
    }

    public String[] getInvoices() {
        return invoices;
    }

    public void setInvoices(String[] invoices) {
        this.invoices = invoices;
    }

    public String[] getShipments() {
        return shipments;
    }

    public void setShipments(String[] shipments) {
        this.shipments = shipments;
    }

    public String[] getPayments() {
        return payments;
    }

    public void setPayments(String[] payments) {
        this.payments = payments;
    }

}