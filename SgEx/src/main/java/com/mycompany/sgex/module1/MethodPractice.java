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
public class MethodPractice {
    public static void main(String[] args) {
        //adding 2 numbers and return value of 2 numbers
        int a = 1;
        int b = 2;
        String myName = "bob";
        System.out.println(addTwoNumbers(a, b) + myMessage(myName));
    }

    public static int addTwoNumbers(int x, int y) {
        
      
        return x + y;
    }

    public static String myMessage(String myName) {
        myName = "jackson";
        return myName;

    }
}
