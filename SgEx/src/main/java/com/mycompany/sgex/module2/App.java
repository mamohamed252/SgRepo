/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module2;

import java.util.HashSet;

/**
 *
 * @author Mohamed
 */
public class App {
    public static void main(String[] args) {
        int count = 19;
        changeMyValue(count);
        System.out.println("Count = " + count);
        
        Person myPerson = new Person();
        myPerson.setAge(24);
        myPerson.SetName("Joe");
        System.out.println("Age = " + myPerson.getAge());
        System.out.println("Name = " + myPerson.getName());
        
        changeMyName(myPerson);
        
        System.out.println("Age = " + myPerson.getAge());
        System.out.println("Name = " + myPerson.getName());
        
        Vehicle car = new MidSizeSedan();
        Vehicle car2 = new Ambulance();
        car.engineOn();
        car2.engineOn();
        }
    public static void changeMyValue(int value) {
        value = 21;
        
    }
    
    public static void changeMyName(Person person) {
        person.SetName("Steve");
        
        
        
        
    }
}