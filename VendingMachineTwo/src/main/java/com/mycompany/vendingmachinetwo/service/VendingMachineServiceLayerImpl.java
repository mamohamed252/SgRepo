/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.service;

import com.mycompany.vendingmachinetwo.DAO.NoItemInventoryException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOFileImpl;
import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    VendingMachineDAO dao = new VendingMachineDAOFileImpl();

    @Override
    public BigDecimal priceChecker(BigDecimal userInput, BigDecimal inventoryPrice) {
        if (userInput.compareTo(inventoryPrice) == 1) {
            return (userInput.subtract(inventoryPrice).abs());
        } else if (userInput.compareTo(inventoryPrice) == -1) {
            return (inventoryPrice.subtract(userInput).abs());
        } else {
            BigDecimal zero = new BigDecimal("0");
            return zero;
        }
    }

    @Override
    public Snack getSnack(String name) throws VendingMachineDAOException {
        Snack getSnack = dao.getSnack(name);
        return getSnack;
    }

    @Override
    public Snack removeSnack(String name) throws NoItemInventoryException, VendingMachineDAOException {
        Snack removeSnack = dao.removeSnack(name);
        return removeSnack;
    }

    @Override
    public List<Integer> coins(BigDecimal change) {

        List<Integer> coinsReturn = new ArrayList();
        int counterQuarter = 0;
        int counterDime = 0;
        int counterNickel = 0;
        int counterPenny = 0;

        BigDecimal quarter = new BigDecimal("0.25");
        BigDecimal dime = new BigDecimal("0.10");
        BigDecimal nickel = new BigDecimal("0.05");
        BigDecimal penny = new BigDecimal("0.01");

        // while change is greater than zero, return largest possible value 
        //if coinsReturn value is equal to or greater than .25  return x number of .25
        // if coinsReturn value is equal to or less than .24
        // if coinsReturn value is equal to or less than .9
        // if coinsReturn value is equal to or less than .4
        while ((change.compareTo(new BigDecimal("0"))) == 1) {
            
            if (change.compareTo(quarter) == 1 || change.compareTo(quarter) == 0) {
                counterQuarter++;
                change = change.subtract(quarter);
            } else if (change.compareTo(dime) == 1 || change.compareTo(dime) == 0) {
                counterDime++;
                change.subtract(dime);

            } else if (change.compareTo(nickel) == 1 || change.compareTo(nickel) == 0) {
                counterNickel++;
                change.subtract(nickel);
            } else {
                counterPenny++;
                change.subtract(penny);
            }

        }

        coinsReturn.add(counterQuarter);
        coinsReturn.add(counterDime);
        coinsReturn.add(counterNickel);
        coinsReturn.add(counterPenny);
        return coinsReturn;
    }
}
