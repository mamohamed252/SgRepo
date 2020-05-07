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
public class TriviaNight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yourAnswer;

        int correctAnswer1 = 4;
        int correctAnswer2 = 2;
        int correctAnswer3 = 3;

        int totalCorrect = 0;

        System.out.println("It's TRIVIA NIGHT! Are you ready?!\n"
                + "\n"
                + "FIRST QUESTION!\n"
                + "What is the Lowest Level Programming Language?\n"
                + "1) Source Code		2) Assembly Language\n"
                + "3) C#				4) Machine Code\n"
                + "Enter Your Answer: ");

        yourAnswer = sc.nextInt();
        System.out.println("YOUR ANSWER: " + yourAnswer);
        if (yourAnswer == correctAnswer1) {
            totalCorrect++;
        }

        System.out.println("\n SECOND QUESTION!\n"
                + "Website Security CAPTCHA Forms Are Descended From the Work of?\n"
                + "1) Grace Hopper		2) Alan Turing\n"
                + "3) Charles Babbage		4) Larry Page\n"
                + "Enter Your Answer: ");

        yourAnswer = sc.nextInt();
        System.out.println("YOUR ANSWER: " + yourAnswer);
        if (yourAnswer == correctAnswer2) {
            totalCorrect++;
        }

        System.out.println("\nLAST QUESTION!\n"
                + "Which of These Sci-Fi Ships Was Once Slated for a Full-Size Replica in Las Vegas?\n"
                + "1) Serenity			2) The Battlestar Galactica\n"
                + "3) The USS Enterprise	4) The Millennium Falcon\n"
                + "Enter Your Answer: ");
        yourAnswer = sc.nextInt();
        System.out.println("YOUR ANSWER: " + yourAnswer);
        if (yourAnswer == correctAnswer3) {
            totalCorrect++;
        }

        System.out.println("Nice job - you got " + totalCorrect + " correct!");

    }

}
