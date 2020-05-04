/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        int myAge;
        int maxHeartRate;
        double minTarget;
        double maxTarget;
                
        Scanner sc = new Scanner(System.in);
        
        
        
        
        System.out.println("What is your age: ");
        myAge = sc.nextInt();
        
        maxHeartRate = 220 - myAge;
        minTarget = maxHeartRate * .50;
        maxTarget = maxHeartRate * .85;
        
        System.out.println("Your maximum heart rate should be " + 
                maxHeartRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + minTarget + " - " 
                + maxTarget + " beats per minute.");
     
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
