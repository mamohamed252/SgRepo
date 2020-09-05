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
public class InterestCalculator {
    public static void main(String[] args) {
       int howMuch;
       int howManyYears;
       Double annualGrowthPercent;
              
    Scanner sc = new Scanner(System.in);
    String input;
        System.out.print("How much do you want to invest?");
    input = sc.nextLine();
        System.out.println(input);
    howMuch = Integer.parseInt(input);
        System.out.print("How many years are investing?");
        input = sc.nextLine();
    howManyYears = Integer.parseInt(input);
        System.out.println(input);
        System.out.print("What is the annual interest rate % growth?");
        input = sc.nextLine();
        annualGrowthPercent = Double.parseDouble(input);
        System.out.println(input);
        System.out.println("Calculating...");
        year(howManyYears, howMuch, annualGrowthPercent);
        
    }
    public static void year(int howManyYears, int howMuch, double annualGrowthPercent){
        double beganWith = howMuch;
        double endedWith= beganWith * (1 + (annualGrowthPercent / 100) );
        double earned = (beganWith * annualGrowthPercent/100) ;
       

        
        
        for (int i = 0; i<= howManyYears; i++){
     
            if (i <= howManyYears)
                earned = beganWith * (annualGrowthPercent/100) ;
                System.out.println("Year " + i + ":");
                System.out.println("Began with " + beganWith);
                System.out.println("Earned " + (earned));
                System.out.println("Ended with " + endedWith + "\n");
                beganWith += earned;
                endedWith += earned;
            
        }
        
    }
    
    
}
