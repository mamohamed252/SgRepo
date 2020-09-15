/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.logic;

import static com.tsg.unittesting.logic.LogicExerciseA.friendlyGreeting;
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
public class LogicExerciseATest {

    public LogicExerciseATest() {
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
    public void testisFriend() {
        //
        String visitorName = "Mo";
        boolean isFriend = true;
        String response = friendlyGreeting(visitorName, isFriend);
        String expectedReponse = "Hello," + visitorName;
        assertEquals(response, expectedReponse, "Expected Hello" + visitorName);
    
               
      
    }
    
    @Test
    public void testisNotFriendHasName() {
        //
        String visitorName = "Mo";
        boolean isFriend = false;
        String response = friendlyGreeting(visitorName, isFriend);
        String expectedReponse = "hi";
        assertEquals(response, expectedReponse, "Expected Hello ");
    
               
      
    }
    
    
    @Test
    public void testisNotFriendHasNoName() {
        //
        String visitorName = null;
        boolean isFriend = false;
        String response = friendlyGreeting(visitorName, isFriend);
        String expectedReponse = "...";
        assertEquals(response, expectedReponse, "Expected ... ");
    
               
      
    }
    
    
}
