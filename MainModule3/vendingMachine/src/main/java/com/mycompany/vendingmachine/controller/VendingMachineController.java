/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.controller;

import com.mycompany.vendingmachine.dao.VendingMachineDaoException;
import com.mycompany.vendingmachine.dto.Snack;
import com.mycompany.vendingmachine.servicelayer.NoItemInventoryException;
import com.mycompany.vendingmachine.servicelayer.VendingMachineService;
import com.mycompany.vendingmachine.ui.VendingMachineView;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class VendingMachineController {

    private VendingMachineView view;
    private VendingMachineService service;

    // Being called to App as injection 
    public VendingMachineController(VendingMachineService service, VendingMachineView view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        try {
            displaySnack();
            getUserCost();
            getUserSnack();
            displayExitBanner();
            endTask();

        } catch (VendingMachineDaoException | NoItemInventoryException e) {
            // display error message
            // | vertical or sign
        }
// method that displays items
// method that asks for item 
// method that asks for change
// ask if user wants to quit
    }

    public void displaySnack() throws VendingMachineDaoException {
        // display items
        List<Snack> snacks = service.getAllSnacks();
        view.displaySnack(snacks);
        // delete this 
//        String testNum = view.testPass("10");
//        service.testServicePass(testNum);
//        System.out.println(service.testServicePass(testNum));
//       
    }

    public void getUserCost() {
        view.getUserCost();

    }

    public void getUserSnack() throws NoItemInventoryException, VendingMachineDaoException{
     String userSnackChoice = view.getUserSnack();
     Snack snackString = service.getUserChoice(userSnackChoice); 
        System.out.println(snackString.getInventory());
    }
    
    public void displayExitBanner() {
        view.displayExitBanner();
    }

    public void endTask() {

    }

}
