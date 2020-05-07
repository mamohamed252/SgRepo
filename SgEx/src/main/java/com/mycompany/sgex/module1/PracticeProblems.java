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
public class PracticeProblems {

    public static void main(String[] args) {
        int num = 10;
        String name = "Mohamed";
        int num2 = 6;
        System.out.println("Total is: " + add(num, num2));
        System.out.println("What is my name: " + add(name, name));
    }

    public static int add(int numberAdded, int numberAdded2) {
        int sum = numberAdded + numberAdded2;
        return sum;
    }

    public static String add(String name, String name2) {
        String fullName = name + " 'Test' " + name2;
        return fullName;
    }
}
