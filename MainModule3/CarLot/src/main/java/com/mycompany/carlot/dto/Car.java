/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carlot.dto;

import java.math.BigDecimal;

/**
 *
 * @author Mohamed
 */
public class Car extends CarKey{
     private String VIN;
    private String make;
    private String model;
    private String color;
    private String newCar;
    private String key;

    private BigDecimal price;
    private long odometerMiles;

    public Car (String newCar){
     this.newCar = newCar;
    
}
    
    
    public String getNewCar(){
        return newCar;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getOdometerMiles() {
        return odometerMiles;
    }

    public void setOdometerMiles(long odometerMiles) {
        this.odometerMiles = odometerMiles;
    }

 

    
    
}
