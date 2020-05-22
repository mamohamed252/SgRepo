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
    public void test1() {
        int[] array1 = {1, 2, 4, 2};
        assertTrue(maxOfArray(array1) == 4);

    }
     @Test
    public void test2() {
        int[] array1 = {1, 2, 3, 2};
        assertFalse(maxOfArray(array1) == 1);

    }
     @Test
    public void test3() {
        int[] array1 = {1, 2, 4, 2};
        assertEquals(maxOfArray(array1), 4);

    }

}
