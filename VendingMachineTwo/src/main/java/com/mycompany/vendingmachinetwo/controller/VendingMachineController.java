/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.controller;

import com.mycompany.vendingmachinetwo.DAO.NoItemInventoryException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOFileImpl;
import com.mycompany.vendingmachinetwo.DTO.Snack;
import com.mycompany.vendingmachinetwo.UI.UserIO;
import com.mycompany.vendingmachinetwo.UI.UserIOConsoleImpl;
import com.mycompany.vendingmachinetwo.UI.VendingMachineView;
import com.mycompany.vendingmachinetwo.service.VendingMachineServiceLayerImpl;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class VendingMachineController {

    public VendingMachineController(VendingMachineDAO dao, VendingMachineView view) {
        this.dao = dao;
        this.view = view;

    }
    VendingMachineServiceLayerImpl service = new VendingMachineServiceLayerImpl();
    private VendingMachineDAO dao;
    private VendingMachineView view;
    private UserIO io = new UserIOConsoleImpl();

    public void run(){
        boolean keepGoing = true;
        try {
            int menuSelection = 0;
            listSnacks();
            getUserCost();

            exitMessage();

        }catch( VendingMachineDAOException | NoItemInventoryException e){
            
        }
    }

    private void listSnacks() throws VendingMachineDAOException {
        view.displayAllSnacksBanner();
        List<Snack> snackList = dao.getAllSnacks();
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

    private void getUserCost() throws VendingMachineDAOException, NoItemInventoryException {
        String snackName = getSnackName();
        Double userCost = view.getUserCost();
        BigDecimal userCostBD = new BigDecimal(userCost.toString());
        Snack snackObject = service.getSnack(snackName);
        BigDecimal snackCost = snackObject.getPrice();
        BigDecimal change = service.priceChecker(userCostBD, snackCost);
        List<Integer> coins = service.coins(change);
        view.getChange(coins);
        removeSnack(snackName);
    }

    private String getSnackName() {
        String theSnack = view.getSnackName();
        return theSnack;
    }
}
