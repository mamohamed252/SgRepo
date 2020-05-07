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
public class StayPositive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        System.out.println("Enter Digit: ");
        userInput = sc.nextInt();
        
        for (int i = userInput; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Blast Off!");
    }

}
