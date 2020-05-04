/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import com.mycompany.sgex.module2.Ambulance;
import com.mycompany.sgex.module2.MidSizeSedan;
import com.mycompany.sgex.module2.Vehicle;


/**
 *
 * @author Mohamed
 */
public class TestForModule2 {
    public static void main(String[] args) {
        Vehicle car = new MidSizeSedan();
        Vehicle car2 = new Ambulance();
        car.engineOn();
        car2.engineOn();
        
    }
    
}
