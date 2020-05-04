/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

/**
 *
 * @author Mohamed
 */
public class MenuOfChampions {

    public static void main(String[] args) {

        /*Type your code into a new Java class named MenuOfChampions.
Write a program that displays a menu for a restaurant.
The menu should include at least three different foods, each with their own price.
Each value (food name and price) should be stored in its own variable, using the appropriate type.
 
        
Display the restaurant name and menu, followed by a list of dishes and their prices, similar to the output shown below.
Feel free to use some (ASCII art)[https://asciiart.website//index.php?art=art%20and%20design/borders] to decorate your menu!
Sample output follows. Your output can look different as long as it meets the criteria listed above.
        
         */
        double number;
        String welcome, menu, pizza, pie, omelet;

        pizza = "BigRicoPizza";
        pie = "InvisibleStrawberryPie";
        omelet = "DevenerOmelet";

        welcome = "WELCOME TO RESTAURANT NIGHT VALE!";
        menu = "Today's Menu Is...";
        BestAdderEver add = new BestAdderEver();
        
        //System.out.println(add.adder());

        System.out.println(welcome + "");
        System.out.println(menu + "");
        
        add.menu();
        
        
        
        

    }

}
