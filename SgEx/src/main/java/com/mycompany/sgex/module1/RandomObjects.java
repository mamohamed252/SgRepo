/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.util.Random;

/**
 *
 * @author Mohamed
 */
public class RandomObjects {

    public static void main(String[] args) {

       Random fixedSeed = new Random(112358);
       Random timeSeed = new Random();
        
        
        
        
        
        
        Random rng = new Random();
        for (int i = 0; i <= 10; i++) {
            int randomNumber = rng.nextInt(10);
            System.out.println("randomNumber");
        }

    }

}
