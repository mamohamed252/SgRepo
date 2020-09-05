/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.util.Random;

/**
 *
 * @author Mohamed
 */
public class CoinFlip {

    //flip coin using random
    //one side is for loop 1-10
    // other side is while loop that counts down 10-1
    // 3 different methods
    // switch statement case:1 force print you won and you lost
    public static void main(String[] args) {
        int coinNumber = 2;
        coinToss(coinNumber );
        countCount(coinNumber );
        caseSwitch(coinNumber );
        System.out.println(coinToss(coinNumber ));
    }

    public static int coinToss(int toss) {
        if (toss == 1) {
            System.out.println("You flippped tails!");
        } else {
            System.out.println("You flipped heads!");
        }
        return toss;
    }

    public static void countCount(int toss) {
        if (toss == 1) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        } else {
            int i = 10;
            while (i >= 1) {
                System.out.println(i);
                i--;
            }

        }
    }

    public static void caseSwitch(int toss) {
        switch(toss) {
            case 1:
                
                System.out.println("You Won!");
                break;
            case 2:
                System.out.println("You lost!");
                break;
        }
 
        }

}

