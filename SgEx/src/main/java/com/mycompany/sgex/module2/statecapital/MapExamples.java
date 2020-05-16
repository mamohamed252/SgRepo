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
public class MapExamples {

    public static void main(String[] args) {
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 200000000);

        populations.put("Canada", 3400000);

        populations.put("United Kingdom", 6300000);

        populations.put("Japan", 12700000);

        System.out.println("Map size is: " + populations.size());

        Set<String> keys = populations.keySet();
        






// list key out and ask for value pair
//        for(String currentKey : keys) {
//            Integer currentPopulation = populations.get(currentKey);
//            System.out.println("The population of " + currentKey + " is " + currentPopulation);
//        }





// replace key values
//        Integer usaPopulation = populations.get("USA");
//        System.out.println(usaPopulation);
//        populations.put("USA", 31300000);
//       usaPopulation = populations.get("USA");
//        System.out.println(usaPopulation);
    }

}
