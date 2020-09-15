/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mohamed
 */
public class ArrayExerciseATest {
    
    public ArrayExerciseATest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testMax10() {
        //arrange 
        int[] arrayOfInts = {1, 5, 8, 10};

        //act
        int max = maxOfArray(arrayOfInts);

        //assert
        int trueMax = 10;
        assertEquals(trueMax, max, "Expected max of 10");
    }

    @Test
    public void testMax5() {
        //arrange 
        int[] arrayOfInts = {1, 2, 5};

        //act
        int max = maxOfArray(arrayOfInts);

        //assert
        int trueMax = 5;
        assertEquals(trueMax, max, "Expected max of 5");
    }

    @Test
    public void testMaxZero() {
        //arrange 
        int[] arrayOfInts = {-3, -2, 0};

        //act
        int max = maxOfArray(arrayOfInts);

        //assert
        int trueMax = 0;
        assertEquals(trueMax, max, "Expected max of 0");
    }

    @Test
    public void testMaxNegative5() {
        //arrange 
        int[] arrayOfInts = {-6, -7, -5};

        //act
        int max = maxOfArray(arrayOfInts);

        //assert
        int trueMax = -5;
        assertEquals(trueMax, max, "Expected max of -5");
    }
    
}
