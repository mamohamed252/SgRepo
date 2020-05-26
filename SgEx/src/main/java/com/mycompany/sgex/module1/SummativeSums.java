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
public class SummativeSums {

    public static void main(String[] args) {
        // declare the integer array
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};

        // sum of numbers
        int sum1 = 0;

        int lengthOfArray1 = array1.length;

        for (int i = 0; i < lengthOfArray1; i++) {
            sum1 = sum1 + array1[i];

        }
        // declare the integer array
        int[] array2 = {999, -60, -77, 14, 160, 301};

        // sum of numbers
        int sum2 = 0;

        int lengthOfArray2 = array2.length;

        for (int i = 0; i < lengthOfArray2; i++) {
            sum2 = sum2 + array2[i];

        }
        // declare the integer array
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        // sum of numbers
        int sum3 = 0;

        int lengthOfArray3 = array3.length;

        for (int i = 0; i < lengthOfArray3; i++) {
            sum3 = sum3 + array3[i];

        }
        System.out.println("Total of Array # 1 is: " + sum1);
        System.out.println("Total of Array # 1 is: " + sum2);
        System.out.println("Total of Array # 1 is: " + sum3);
        ///// How to reverse Array backwards 
        int[] array7 = {7, 8, 1, 2};

        int lengthOfArray7 = array7.length;
        for (int i = lengthOfArray7 - 1; i >= 0; i--) {
            System.out.println(array7[i]);

        }
    }
}
