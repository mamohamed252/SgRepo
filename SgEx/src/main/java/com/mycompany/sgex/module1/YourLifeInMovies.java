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
public class YourLifeInMovies {

    public static void main(String[] args) {
        //String number = "";
        //int size = number.length();
        //Integer.parseInt(number);

        Scanner sc = new Scanner(System.in);
        String yourName;
        System.out.println("Hey, lets play a game! What's your name? ");
        yourName = sc.nextLine();
        System.out.println("Ok " + yourName + " , when were you born?");

        //String yourName = sc.nextLine();
        String number = sc.nextLine();
        int size = number.length();
        if (size != 4) {
            System.out.println("Invalid Year");
        } else {

            int numbers = Integer.parseInt(number);

            //System.out.println("Ok " + yourName  ", when were you born? ");
            if ( numbers < 2005) {
                System.out.println("Pixar's 'Up' came out over a decade ago.");
            } else if (numbers > 2005) {
                System.out.println("You're a too young");
            }
            if (numbers < 1995) {
                System.out.println("The First Harry Potter came out over 15 years ago.");
            }
            if (numbers < 1985) {
                System.out.println("Space Jam came out not last decade, but the one before THAT.");
            }
            if (numbers < 1975) {
                System.out.println("The Orginal Jurassic Park release is closer to the first lunar landing than it is to today");
            }
            if (numbers < 1965) {
                System.out.println("The MASH TV series has been around for almost half a century.");
            }
        }
    }

}
