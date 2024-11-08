/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.onsys.entidades.marketplace;

import java.io.Serializable;

public class ZoomStockInfo implements Serializable {

    private int         cross_docking;
    private double      height;
    private double      length;
    private double      weight;
    private double      width;

    public int getCross_docking() {
        return cross_docking;
    }

    public void setCross_docking(int cross_docking) {
        this.cross_docking = cross_docking;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}