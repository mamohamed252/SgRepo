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
public class GuessMe {

    public static void main(String[] args) {

        // System.out.println("I've chosen a number betcha can't guess it!");
        Scanner sc = new Scanner(System.in);
        System.out.println("I've chosen a number. Betch can't guess it!");

        System.out.print("Your guess: ");
        int number = sc.nextInt();
        int myGuess = 11;
if (number < 11){
         System.out.println("Ha, nice try - too low! I chose " + myGuess);
        }
if (number > 11){
          System.out.println("Too bad, way too high. I chose " + myGuess);
          
       }
if (number == 11){
    System.out.println("Wow, nice guess! That was it");
}
    }
}


    
    

