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
public class WindowMaster {
    public static void main(String[] args) {
        // declare vairiables for height and width
        float height;
        float width;
        
        
        //declare string variables to hold the user's height and width input
        String stringHeight;
        String stringWidth;
        
        // declare other variables 
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        // declare and intialize the scanner
        Scanner myScanner = new Scanner(System.in);
        
        // get input from the user
        System.out.println("Please enter window height: ");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width: ");
        stringWidth = myScanner.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width);
        
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        
        
        System.out.println("Window height is: " + stringHeight);
        System.out.println("Window width is: " + stringWidth);
        System.out.println("Window area is: " + areaOfWindow);
        System.out.println("Window perimeter is: " + perimeterOfWindow);
        System.out.println("Total cost is: " + cost);
        
        
        
        
    }
    
}
