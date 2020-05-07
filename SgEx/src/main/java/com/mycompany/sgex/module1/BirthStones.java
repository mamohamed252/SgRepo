/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module1;

import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class BirthStones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int monthDigit;

        System.out.println("What month's birthstond do you want to know: ");
        monthDigit = sc.nextInt();
        System.out.println("birthstone is: ");

        if (monthDigit < 1 || monthDigit > 12) {
            System.out.println("I think you must be confused, " + monthDigit + " doesn't match a month.");

        } else if (monthDigit == 1) {
            System.out.println("January's birthstone is Garnet");
        } else if (monthDigit == 2) {
            System.out.println("February's birthstone is Amethyst");
        } else if (monthDigit == 3) {
            System.out.println("March's birthstone is Aquamarine");
        } else if (monthDigit == 4) {
            System.out.println("April's birthstone is Diamond");
        } else if (monthDigit == 5) {
            System.out.println("May's birthstone is Emerald");
        } else if (monthDigit == 6) {
            System.out.println("June's birthstone is Pearl");
        } else if (monthDigit == 7) {
            System.out.println("July's birthstone is Ruby");
        } else if (monthDigit == 8) {
            System.out.println("August's birthstone is Peridot");
        } else if (monthDigit == 9) {
            System.out.println("September's birthstone is Sapphire");
        } else if (monthDigit == 10) {
            System.out.println("October's birthstone is Opal");
        } else if (monthDigit == 11) {
            System.out.println("November's birthstone is Topaz");
        } else {
            System.out.println("December's birthstone is Turquoise");

        }
    }
}
