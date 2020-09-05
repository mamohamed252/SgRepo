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
public class DogGeneticTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rGen = new Random();
        
        String newName;
        int fullPercentBreed = 100;
        System.out.println("What is your dog's name?");
        newName = sc.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + newName + "'s prestigious background right here." + "\n" + newName + " is:");
        
        String [] breed = {"St. Bernanrd", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"};
        
        for(int i = 0; i < 5; i++){
            
        } 
    }
}
