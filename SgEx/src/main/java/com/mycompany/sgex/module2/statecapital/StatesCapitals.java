/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sgex.module2.statecapital;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mohamed
 */
public class StatesCapitals {

    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();

        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Juneau");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");

        System.out.println("States: ");
        System.out.println("=======");
//        set is same as list but cant be duplicated
        Set<String> keys = capitals.keySet();

//        print the key in keys to the screen
        for (String left : keys) {
            System.out.println(left);

        }
        System.out.print("\n");
        System.out.println("Capitals");
        System.out.println("=========");
        for (String right : capitals.values()) {
            System.out.println(right);

        }
        System.out.print("\n");
        System.out.println("State/Capital Pairs");
        System.out.println("====================");

        System.out.println("Alabama" + " - " + capitals.get("Alabama"));
        System.out.println("Alaska" + " - " + capitals.get("Alaska"));
        System.out.println("Arizona" + " - " + capitals.get("Arizona"));
        System.out.println("Arkansas" + " - " + capitals.get("Arkansas"));

    }

}
