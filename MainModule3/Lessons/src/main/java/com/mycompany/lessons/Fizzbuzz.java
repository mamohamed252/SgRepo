/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lessons;

/**
 *
 * @author Mohamed
 */
public class Fizzbuzz {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);
            }
        }

    }
    // every third number as Fizz every 5 as Fizzbuzz

}
