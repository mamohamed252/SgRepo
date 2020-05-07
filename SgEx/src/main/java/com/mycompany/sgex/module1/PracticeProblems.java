/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.util.Arrays;

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
        print();
        System.out.println("My name is: " + print2());
        
        // first way to intialize array
        int[] array1 = {3, 2, 1, 0};
        array1[0]= 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        // second way
        int[] array2 = new int[6];
        
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        // how to modify array
        array1 = new int[4];
        array1[2] = 3;
        array1[3] = 4;
        System.out.println(Arrays.toString(array1));
        
        // multi-dem array
        int[][] array3 = new int[2][2];
        System.out.println(Arrays.deepToString(array3));
        // how to iterrate with array
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
            
        }
        
    }

    public static int add(int numberAdded, int numberAdded2) {
        int sum = numberAdded + numberAdded2;
        return sum;
    }

    public static String add(String name, String name2) {
        String fullName = name + " 'Test' " + name2;
        return fullName;
    }
    public static void print(){
        System.out.println("My name Jeff");
    }
    public static String print2(){
        String name = "Jon";
        System.out.println("My name Ahmed");
        return name;
    }
    
}
