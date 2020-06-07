/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dao;

import com.mycompany.vendingmachine.dto.Snack;
import com.mycompany.vendingmachine.servicelayer.InsufficientFundsException;
import com.mycompany.vendingmachine.servicelayer.NoItemInventoryException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mohamed
 */
public class VendingMachineFileImpl implements VendingMachineDao {

    public static final String SNACKS_FILE = "snacks.txt";
    public static final String DELIMITER = "::";
    private Map<String, Snack> snacks = new HashMap<>();

    @Override
    public List<Snack> getAllSnacks() throws VendingMachineDaoException {
        loadSnacks();
        return new ArrayList(snacks.values());
    }

    @Override
    public Snack changeQuantity(String snackName) throws NoItemInventoryException, VendingMachineDaoException {
        Snack snackObject = snacks.get(snackName);
        snackObject.setInventory(snackObject.getInventory() -1);
        //snacks.get(snackName).setInventory(snacks.get(snackName).getInventory() -1);
        writeSnack();
        return snackObject;
    }
    
    @Override
    public Snack getUserCost() throws InsufficientFundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Snack unmarshallSnack(String snackAsText) {
        String[] snackTokens = snackAsText.split(DELIMITER);
        String snacksName = snackTokens[0];
        Snack snackFromFile = new Snack(snacksName);
        snackFromFile.setCost(new BigDecimal(snackTokens[1]));
        snackFromFile.setInventory(Integer.parseInt(snackTokens[2]));
        return snackFromFile;
    }

    private String marshallSnack(Snack aSnack) {
        String snackAsText = aSnack.getSnackName() + DELIMITER;
        snackAsText += aSnack.getCost() + DELIMITER;
        snackAsText += aSnack.getInventory();
        return snackAsText;
    }

    private void loadSnacks() throws VendingMachineDaoException {
        Scanner scanner;

        try {
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(SNACKS_FILE)));
        } catch (FileNotFoundException e) {
            throw new VendingMachineDaoException(
                    "-_- Could not load roster data into memory.", e);
        }
        String currentLine;
        Snack currentSnack;
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentSnack = unmarshallSnack(currentLine);
            snacks.put(currentSnack.getSnackName(), currentSnack);
        }
        scanner.close();
    }

    private void writeSnack() throws VendingMachineDaoException {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(SNACKS_FILE));
        } catch (IOException e) {
            throw new VendingMachineDaoException(
                    "Could not save snack data.", e);
        }
        String snackAsText;
        List<Snack> snackList = new ArrayList(snacks.values());
        for (Snack currentSnack : snackList) {
            snackAsText = marshallSnack(currentSnack);
            out.println(snackAsText);
            out.flush();
        }
        out.close();
    }

    
}
