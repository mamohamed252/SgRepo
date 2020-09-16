/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduletwoparttwo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class BirthdayCalulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Period period;
        String userInput;
        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        userInput = sc.nextLine();
        System.out.println(userInput);
        LocalDate ld = LocalDate.now();
        LocalDate now = LocalDate.now();
        ld = LocalDate.parse(userInput, DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        String getThisYear = (ld.getMonthValue() + "-" + ld.getDayOfMonth() + "-" + now.getYear());
        now = LocalDate.parse(getThisYear, DateTimeFormatter.ofPattern("M-d-yyyy"));
        period = Period.between(ld, now.plusYears(1));
        int nextBirthday = period.getDays();
        int age = period.getYears();
        

        System.out.println("That's means you were born on a " + ld.getDayOfWeek() + "!");
        System.out.println("This year it falls on a " + now.getDayOfWeek());
        System.out.println("And since today is " + now.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"))
                + ", there's only " + nextBirthday + " more days until the next one!");
        System.out.println("Bet yer excited to be turning " + age +"!");
    }

}
