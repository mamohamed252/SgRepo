/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dto;

import java.math.BigDecimal;

/**
 *
 * @author Mohamed
 */
public class Snack {
    private final  String snackName;
    private BigDecimal cost;
    private int inventory; // number in stock
    
    public Snack(String name) {
        this.snackName = name;
    }

    public String getSnackName() {
        return snackName;
    }

    public BigDecimal getCost() {
        return cost;
    } 

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
        }
    
}
