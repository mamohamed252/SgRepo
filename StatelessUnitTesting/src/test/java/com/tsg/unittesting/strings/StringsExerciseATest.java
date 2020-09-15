/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.strings;

import static com.tsg.unittesting.strings.StringsExerciseA.yell;
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
public class StringsExerciseATest {

    public StringsExerciseATest() {
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
    public void testHT() {
        //arrange

        String characters = "Hello there";

        //act
        String yell = yell(characters);

        //assert
        String upperCase = "HELLO THERE";
        assertEquals(upperCase, yell, "Expected HELLO THERE");

    }

    @Test
    public void testSH() {
        //arrange

        String charact = "shhhhhhhhhhhh";

        //act
        String yell = yell(charact);

        //assert
        String upperCase = "SHHHHHHHHHHHH";
        assertEquals(upperCase, yell, "Expected SHHHHHHHHHHHH");

    }

    @Test
    public void testAH() {
        //arrange

        String charact = "AAaAAAaAAAaaAAHHHH";

        //act
        String yell = yell(charact);

        //assert
        String upperCase = "AAAAAAAAAAAAAAHHHH";
        assertEquals(upperCase, yell, "Expected AAAAAAAAAAAAAAHHHH");

    }
}
