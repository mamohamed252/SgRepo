/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.ui;

import com.mycompany.vendingmachine.dto.Snack;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class VendingMachineView {

    private UserIO io;

    public VendingMachineView(UserIO io) {
        this.io = io;
    }

//    public String printMenu() {
//        io.print("jello::1.25::5\n"
//                + "b::34.00::3\n"
//                + "adf::45::1\n"
//                + "Twix::0.75::3\n"
//                + "Doritos::1.00::0");
//        return io.readString("Please select from the above choices. Case sensitive.");
//    }
    public void displaySnack(List<Snack> snackList) {
        String snackInfo = "";
        for (Snack selectedSnack : snackList) {
            snackInfo = String.format("%s : %s : %s",
                    selectedSnack.getSnackName(),
                    selectedSnack.getCost(),
                    selectedSnack.getInventory());
            io.print(snackInfo);
        }
    }

    public String getSnackName() {
        return io.readString("Please select from the above choices. Case sensitive.");
    }
    
    public double getCost(){
       return io.readDouble("Please enter your change.", 0,34);
    }
    
    public String getUserSnack() {
        // make sure to look for case sensitive.
        return io.readString("Please choose a snack: ");
    }
    
    public void displaySuccessfulBanner(){
        io.print("Vending is processing. Please hit enter to continue.");
    }
    
    public void displayExitBanner() {
        io.print("Thank you for vending with us!");
    }
    
    public void displayErrorMessage ( String errorMsg) {
        io.print("=== Error ===");
        io.print(errorMsg);
    }

}
