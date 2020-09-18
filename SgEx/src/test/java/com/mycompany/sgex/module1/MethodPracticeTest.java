/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import static com.mycompany.sgex.module1.MethodPractice.addTwoNumbers;
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
public class MethodPracticeTest {
    
    public MethodPracticeTest() {
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
    public void testAddTwoNumbersPositiveSum3() {
       int num1 = 1;
       int num2 = 2;
       
       int sum = 3;
       int methodAnswer = addTwoNumbers(num1, num2);
       
       assertEquals(sum, methodAnswer, "Expected sum to be 3");
    }
    
}
