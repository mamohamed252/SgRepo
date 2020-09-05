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
public class PracticePage {
    public static void main(String[] args) {
//        for(int i = 1; i <= 10; i++){
//            System.out.println("The new number is " + i);
//        }0
//    int i = 1;
//    while(i <= 10)
//            System.out.println("New number is " + i++);
//    }
//    int i = 1;
//    do{
//        System.out.println("New number is " + i++);
//    
//    }while(i <= 10);
//    } 
        String rightChoice = "right";
        String leftChoice = "left";
        String upChoice = "up";
        Scanner sc = new Scanner(System.in);
        System.out.println("Help Jimmy navigate home! Please pick path: left, right or up. \nEnter: ");
        String userResponse = sc.nextLine();
        boolean again = true;
        do {
            
            if (userResponse.equals(rightChoice)) {
                System.out.println("This is a dead end, Please pick again. Please enter left, right or up: ");
              userResponse = sc.nextLine();
            } else if (userResponse.equals(leftChoice)) {
                System.out.println("You're almost there, please pick again. Please enter left, right or up: ");
                userResponse = sc.nextLine();
            } else if(userResponse.equals(upChoice)) {
                System.out.println("Congrats! You've helped Jimmy navigate home!");
                again = false;
            }
        } while (again == true);   
    }
}
