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
public class Factorize {

    public static void main(String[] args) {
        int int1;
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Choose a number to a factor");
        input = sc.nextLine();
        int1 = Integer.parseInt(input);
        factors(int1);
    }

    public static void factors(int userInput) {
        int factorCounter = 0;
        int sumOfFactors = 0;
        System.out.print("The factors of " + userInput + " are ");
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0 && i != userInput) {
                System.out.print(i + " ");
                factorCounter++;
                sumOfFactors += i;
            }
        }
        System.out.println(userInput);
        System.out.println("There are " + (factorCounter + 1) + " factors of " + userInput);
        if (sumOfFactors == userInput && sumOfFactors > 1) {
            System.out.println(userInput + " is a perfect number.");
        } else {
            System.out.println(userInput + " is not a perfect number");
        }
        if(factorCounter == 1){
            System.out.println(userInput + " is a prime number.");
        } else{
            System.out.println(userInput + " is not a prime number.");
        }
    } 

}
