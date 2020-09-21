/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.DTO;

import java.math.BigDecimal;

/**
 *
 * @author Mohamed
 */
public class Snack {

    private final String name;
    private BigDecimal price;
    private int inventory;

    public Snack(String name) {
        this.name = name;
    }

    public String getSnackName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

}
