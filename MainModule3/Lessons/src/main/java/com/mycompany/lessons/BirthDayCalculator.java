/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lessons;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class BirthDayCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate today = LocalDate.of(2018, 12, 30);

        System.out.println("Enter Birthday: " + " Must be in format MM-dd-yyyy");
        String birthday = sc.nextLine();

        // formatting birthday
        String todayFormatted = today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate birthDate = LocalDate.parse(birthday, formatter);

        String formatted = birthDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("You were born: " + formatted);

        long years = Period.between(birthDate, today).getYears();
        System.out.println("You are " + years + " years old");
        System.out.println("You were born on a: " + birthDate.getDayOfWeek());
        System.out.println("This year, your birthday falls on : " + birthDate.plusYears(years).getDayOfWeek());

        // todays + x days = birthday
        // 
        // x days = birthday - todays
        int days = Period.between(today, birthDate.plusYears(years + 1)).getDays();

        System.out.println("And since today is: " + todayFormatted + " there's only " + days + " more days until the next one!");
        System.out.println("Bet yer excited to be turning " + (years + 1) + "!");

    }

}
