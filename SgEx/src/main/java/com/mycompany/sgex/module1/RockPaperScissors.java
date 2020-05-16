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
public class RockPaperScissors {

    public static void main(String[] args) {
        boolean again = true;

        while (again) {
            //while again
            Scanner sc = new Scanner(System.in);

            System.out.println("Let's play a game of Rock Paper Scissors!\n" + "How many games would you like to play out of 10 Games:  ");

            int gameRequests;

            int rock = 1;
            int paper = 2;
            int scissors = 3;
            
            gameRequests = sc.nextInt();
            if (gameRequests > 10 || gameRequests < 1) {
                System.out.println("Invalid amount of rounds entered. Please enter a digit between 1-10 to begin!");
            } else {
                System.out.println("Ok let's play " + gameRequests + " rounds!");
                round(gameRequests);

            }
            int yes = 1;
            int no = 2;
            int userA;
            
            System.out.println("Would you like to play again? 1) Yes: \n" + " 2) No: " );
            userA = sc.nextInt();
            
            if (userA == yes){
                // if it true it will loop again
                // look at line 20 for start again
            } else if (userA == no){
                // boolean is now false which will stop at end of SOUT
                again = false;
                System.out.println("Thank you for playing!");
                
            }
           
            
        } 
       
        //end of while loop
    }

    public static void round(int numRound) {
        Scanner sc = new Scanner(System.in);

        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int player;
        int win = 0;
        int lost = 0;
        int ties = 0;
        for (int counter = 1; counter <= numRound; counter++) {
            System.out.println("Chose Rock, Paper or Scissors!\n"
                    + " 1) Rock" + " 2) Paper\n"
                    + " 3) Scissors\n"
                    + "Enter Your Answer:");
            player = sc.nextInt();

            if (player == auto()) {
                ties++;
                System.out.println("Computer guessed: " + auto());
                System.out.println("Number of ties: " + ties);

            } else if (player == rock || auto() == paper) {
                lost++;
                System.out.println("Computer guessed: " + auto());
                System.out.println("Number of loses: " + lost);

            } else if (player == rock || auto() == scissors) {
                lost++;
                System.out.println("Computer guessed: " + auto());
                System.out.println("Number of loses: " + lost);

            } else if (player == paper || auto() == rock) {
                win++;
                System.out.println("Computer guessed: " + auto());
                System.out.println("Number of wins: " + win);

            } else if (player == paper || auto() == scissors) {
                lost++;
                System.out.println("Computer guessed: " + auto());
                System.out.println("Number of loses: " + lost);

            } else if (player == scissors || auto() == paper) {
                win++;
                System.out.println("Computer guessed: " + auto());
                System.out.println("Number of wins: " + win);

            } else if (player == scissors || auto() == scissors) {
                ties++;
                System.out.println("Computer guessed: " + auto());
                System.out.println("Number of ties: " + ties);

            }

        }
        if (win > lost) {
            System.out.println("You won");
        } else if (win == lost) {
            System.out.println("You tied");
        } else {
            System.out.println("You lost");
        }

    }

    public static int auto() {
        Scanner sc = new Scanner(System.in);

        Random cpu = new Random();
        int rock = 1;
        int paper = 2;
        int scissors = 3;
        int genNum;
// generate 10 numbers, each between 0 and 3
        for (int i = 1; i <= 3; i++) {
            int randomNumber = cpu.nextInt(3);
            switch (randomNumber) {
                case 1:

                    return randomNumber;
                case 2:

                    return randomNumber;
                case 3:

                    return randomNumber;
                default:
                    break;
            }
        }
        return 0;

    }

}
