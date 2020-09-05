/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class PracticeAgain {
    public static void main(String[] args) {
        // random dice roller with each number having 1 outcome
        Random dice = new Random();
        int result = 0;

        for (int i = 0; i < 5; i++) {
            result = dice.nextInt(6) + 1;
            ifElseMethod(result);
        }
    }

    public static void ifElseMethod(int result){
     
        if (result == 1 || result == 2 || result == 3) {
            System.out.println("You won! You rolled a " + result);
        } else if (result == 4 || result == 5 || result == 6) {
            System.out.println("You lost! You rolled a " + result);
        }
        
    }
}
