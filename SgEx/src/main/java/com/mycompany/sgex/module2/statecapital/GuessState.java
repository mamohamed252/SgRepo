/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module2.statecapital;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.Set;

/**
 *
 * @author Mohamed
 */
public class GuessState {

    public static void main(String[] args) {

//  scan users input  
        Scanner sc = new Scanner(System.in);
        Map<String, String> capitals = new HashMap<>();

        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");

        System.out.println("50 STATES & CAPITALS ARE LOADED.");
        System.out.println("=======");

        // Ask user to pick a state
        System.out.println("Here are the states: " + "Chose a state to begin: ");
// set is same as list but cant be duplicated
        Set<String> keys = capitals.keySet();
        for (String left : keys) {
            System.out.println(left);

        }
        System.out.print("\n");
        // Asking user for key (state)
        String userChoice = sc.nextLine();
        // declared userGuess here
        String userGuess;

// Display the state the chose and ask for capital 
        System.out.print("\n" + "READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF " + userChoice + "?\n");
        userGuess = sc.nextLine();
        System.out.println(userGuess);
        System.out.println("=========");

// For loop extra work
        if (userGuess.equals(capitals.get(userChoice))) {
            for (String right : capitals.values()) {
                if (userGuess.equals(right)) {
                    System.out.println("Correct");
                    break;
                }
            }
        } else {
            System.out.println("Incorrect, please check spelling. Case Sensitive");
        }
    }

}
