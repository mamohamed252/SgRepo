/*********************************
* The Software Guild
* Copyright (C) 2020 Wiley edu LLC - All Rights Reserved
*********************************/
package com.tsg.unittesting.arrays;

/**
 *
 * @author ahill
 */
public class ArrayExerciseA {
    
    /**
     * Given an array of ints, find and return the maximum value.
     * 
     * Example Results:
     * maxOfArray( {1}  ) ->  1
     * maxOfArray( {3,4,5}  ) ->  5
     * maxOfArray( {-9000, -700, -50, -3}  ) ->  -3
     * 
     * @param numbers array of integers
     * @return int max
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 4, 2};
        System.out.println(maxOfArray(array1));
    }
    public static int maxOfArray(int[] numbers){
        
        // Place holder
        int number = 0;
        
        for (int i = 0; i < numbers.length - 1; i++){
          
            if (number < numbers[i+1]) {
                number = numbers[i+1];
                
            }
            
        }
        return number;
    }
    
}
