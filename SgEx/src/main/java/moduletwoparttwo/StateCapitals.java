/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduletwoparttwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Mohamed
 */
public class StateCapitals {
    public static void main(String[] args) {
  
        Map<String, String> capitals = new HashMap();
        capitals.put("Alabama", "Montgomery");
        capitals.put("Alaska", "Junea");
        capitals.put("Arizona", "Phoenix");
        capitals.put("Arkansas", "Little Rock");
        Set<String> keys = capitals.keySet();
        System.out.println("States:");
                for (String k : keys){
            System.out.println((k));
        }
        System.out.println("=======");
        System.out.println("Capitals:");
            for (String k : keys){
            System.out.println((capitals.get(k)));
            }
        System.out.println("=======");
        System.out.println("State/Capital Pairs:");
        System.out.println("=======");
         for (String k : keys){
            System.out.println( k + " "+ (capitals.get(k)));
            }
        
    } 
}
