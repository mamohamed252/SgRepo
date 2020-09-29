/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.controller;

import com.mycompany.vendingmachinetwo.DAO.InsufficientFundsException;
import com.mycompany.vendingmachinetwo.DAO.NoItemInventoryException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOFileImpl;
import com.mycompany.vendingmachinetwo.DTO.Snack;
import com.mycompany.vendingmachinetwo.UI.UserIO;
import com.mycompany.vendingmachinetwo.UI.UserIOConsoleImpl;
import com.mycompany.vendingmachinetwo.UI.VendingMachineView;
import com.mycompany.vendingmachinetwo.service.VendingMachineServiceLayer;
import com.mycompany.vendingmachinetwo.service.VendingMachineServiceLayerImpl;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mohamed
 */
@Component
public class VendingMachineController {

    @Autowired
    public VendingMachineController(VendingMachineServiceLayer service, VendingMachineView view) {
        this.view = view;
        this.service = service;
    }

    private VendingMachineServiceLayer service;
    private VendingMachineView view;
    private UserIO io = new UserIOConsoleImpl();

    public void run() {
        boolean keepGoing = true;
        try {
            int menuSelection = 0;
            listSnacks();
            getUserCost();

            exitMessage();

        } catch (VendingMachineDAOException | InsufficientFundsException e) {
            // add to view  
            displayException(e.getMessage());
        }
    }

    private void listSnacks() throws VendingMachineDAOException {
        view.displayAllSnacksBanner();
        List<Snack> snackList = service.getAllSnacks();
        view.displaySnackList(snackList);
    }

    private void removeSnack(String snackName) throws VendingMachineDAOException, NoItemInventoryException {
        view.displayAllSnacksBanner();
        Snack removedSnack = service.removeSnack(snackName);

    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    private void getUserCost() throws VendingMachineDAOException, InsufficientFundsException {
        BigDecimal userCostBD = new BigDecimal(-1);

        try {
            String snackName = getSnackName();
            Double userCost = view.getUserCost();
            userCostBD = new BigDecimal(userCost.toString());
            Snack snackObject = service.getSnack(snackName);
            BigDecimal snackCost = snackObject.getPrice();
            BigDecimal change = service.priceChecker(userCostBD, snackCost);
            List<Integer> coins = service.coins(change);
            view.getChange(coins);
            removeSnack(snackName);

        } catch (NoItemInventoryException e) {
            displaySnackNotAvailable(userCostBD);

        }

    }

    private String getSnackName() {
        String theSnack = view.getSnackName();
        return theSnack;
    }

    private void displaySnackNotAvailable(BigDecimal change) {
        view.displaySnackNotAvailable(change);

    }

    private void displayException(String exception) {
        view.displayException(exception);
    }
}
