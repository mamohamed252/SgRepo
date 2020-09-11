/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduletwoparttwo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Mohamed
 */
public class StateCapital2 {

    public static final String DELIMITTER = "::";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileReader("StateCapitals.txt"));
        Scanner userInput = new Scanner(System.in);
        Map<String, String> stateCapital = new HashMap();
        String userState;
        String userCapital;

        System.out.println("50 STATES & CAPITALS ARE LOADED.");
        System.out.println("=======");
        System.out.println("HERE ARE THE STATES :");
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] parts = currentLine.split(DELIMITTER);
            String states = parts[0];
            String capitals = parts[1];
            //stateCapital refers to MAP
            stateCapital.put(states, capitals);
            System.out.println(states);
        }

        System.out.println("READY TO TEST YOUR KNOWLEDGE? Pick one state. ");
        userState = userInput.nextLine();
        System.out.println("What is the capital of " + userState + "?");
        userCapital = userInput.nextLine();
        if (userCapital.equals(stateCapital.get(userState))) {
            System.out.println("NICE WORK " + userCapital + " is the capital of" + userState);
        }
    }

}
