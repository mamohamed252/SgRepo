/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.UI;

import java.util.Scanner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mohamed
 */
@Component
public class UserIOConsoleImpl implements UserIO {
Scanner sc = new Scanner(System.in);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        return sc.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int value = -1;
        do {
            print(prompt);
            value = Integer.parseInt(sc.nextLine());
            if (value < min || value > max) {
                print("Error value outside of range!!!");
            }

        } while (value < min || value > max);
        return value;
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);
        double value = Double.parseDouble(sc.nextLine());
        return value;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double value = -1;
        do {
            print(prompt);
            value = Double.parseDouble(sc.nextLine());
            if (value < min || value > max) {
                print("Error value outside of range!!!");
            }

        } while (value < min || value > max);
        return value;
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);
        float value = Float.parseFloat(sc.nextLine());
        return value;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float value = -1;
        do {
            print(prompt);
            value = Float.parseFloat(sc.nextLine());
            if (value < min || value > max) {
                print("Error value outside of range!!!");
            }

        } while (value < min || value > max);
        return value;
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);
        long value = Long.parseLong(sc.nextLine());
        return value;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long value = -1;
        do {
            print(prompt);
            value = Long.parseLong(sc.nextLine());
            if (value < min || value > max) {
                print("Error value outside of range!!!");
            }

        } while (value < min || value > max);
        return value;
    }
    
}
