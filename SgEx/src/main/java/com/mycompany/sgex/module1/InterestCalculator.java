/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input;
        System.out.print("How much do you want to invest?");
        input = sc.nextLine();
        BigDecimal howMuch = new BigDecimal(input);
        System.out.println(howMuch);

        System.out.print("How many years are investing?");
        input = sc.nextLine();
        int howManyYears = Integer.parseInt(input);
        System.out.println(howManyYears);

        System.out.print("What is the annual interest rate % growth?");
        input = sc.nextLine();
        BigDecimal annualGrowthPercent = new BigDecimal(input);
        System.out.println(annualGrowthPercent);
        System.out.println("Calculating...");
        year(howManyYears, howMuch, annualGrowthPercent);

    }

    public static void year(int howManyYears, BigDecimal howMuch, BigDecimal annualGrowthPercent) {
        BigDecimal oneHundred = new BigDecimal("100.00");
        BigDecimal one = new BigDecimal("1.00");
        BigDecimal beganWith = howMuch;
        BigDecimal endedWith = (annualGrowthPercent.divide(oneHundred.add(one), 2, RoundingMode.HALF_UP).multiply(beganWith));
        BigDecimal earned = (annualGrowthPercent.divide(oneHundred, 2, RoundingMode.HALF_UP)).multiply(beganWith);
        // BigDecima earned = (beganWith * annualGrowthPercent/100) ;

        for (int i = 0; i <= howManyYears; i++) {

            if (i <= howManyYears) {
                earned = (annualGrowthPercent.divide(oneHundred)).multiply(beganWith);
                System.out.println("Year " + i + ":");
                System.out.println("Began with " + beganWith.setScale(2, RoundingMode.HALF_UP));
                System.out.println("Earned " + (earned).setScale(2, RoundingMode.HALF_UP));
                System.out.println("Ended with " + endedWith.setScale(2, RoundingMode.HALF_UP) + "\n");
                beganWith = beganWith.add(earned);
                endedWith = endedWith.add(earned);
            }

        }
    }

}
