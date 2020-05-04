/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class BestAdderEver {

    public static void main(String[] args) {
//        int operand1 = 1;
//        int operand2 = 2 ;
//        int operand3 = 3;
//        
//        int answer = operand1 + operand2 + operand3;
//
//        System.out.println("Total is " + answer);
        int operand1;
        int operand2;
        int operand3;
        int answer = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        operand1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a number: ");
        operand2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a number: ");
        operand3 = Integer.parseInt(sc.nextLine());

        answer = operand1 + operand2 + operand3;
        System.out.println("Total is " + answer);

    }

    public List<Integer> adder() {
        int operand1;
        int operand2;
        int operand3;
        int answer = 0;
        List<Integer> orderList = new ArrayList();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        operand1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a number: ");
        operand2 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a number: ");
        operand3 = Integer.parseInt(sc.nextLine());

        answer = operand1 + operand2 + operand3;
        System.out.println("Total is " + answer);

        orderList.add(operand1);
        orderList.add(operand2);
        orderList.add(operand3);

        return orderList;
    }

    public void menu() {

        List<Integer> theAdder = adder();
        int rico = 500;
        int pie = 2;
        int omelet = 1;
        int slices = 0;

        if (theAdder.get(0) >= 1) {
            slices = theAdder.get(0)* rico ;
            System.out.println("$ " + slices + " Slice of Big Rico Pizza");
        }

        if (theAdder.get(1) >= 1) {
            slices = theAdder.get(1) * pie ;
            System.out.println("$ " + slices + " Invisible Strawberry Pie");
        }

        if (theAdder.get(2) >= 1) {
            slices = theAdder.get(2) * omelet;
            System.out.println("$ " + slices + " Denver Omelet");
        }
        
    }
}
