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
public class LoopPractice {
    public static void main(String[] args) {
        int b = 2;
       numberOfLoops(b);
        
    }
    public static int numberOfLoops(int loopTimes){
        for (int i = 1; i <= loopTimes; i++){
            System.out.println(i);
        }
        return loopTimes;
    }
}
