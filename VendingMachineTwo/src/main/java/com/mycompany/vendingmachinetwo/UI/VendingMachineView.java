/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.UI;

import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class VendingMachineView {

    public VendingMachineView(UserIO io) {
        this.io = io;
    }
    private UserIO io;

    public void displaySnackList(List<Snack> snackList) {
        String snackInfo = "";
        for (Snack selectedSnack : snackList) {
            snackInfo = String.format("%s : $%s : %s",
                    selectedSnack.getSnackName(),
                    selectedSnack.getPrice(),
                    selectedSnack.getInventory());
            io.print(snackInfo);
        }

    }

    public String getSnackName() {
        return io.readString("Please select from the above choices.");
    }

//    public BigDecimal getUserChange(){
//        return io.re
//    }
    public double getUserCost() {
        return io.readDouble("Please enter your change: ");
    }

    public void getChange(List<Integer> coins) {

        io.print("Quarter: " + coins.get(0) + " Dime: " + coins.get(1)
                + " Nickle: " + coins.get(2) + " Penny: " + coins.get(3));
    }

    public void displayAllSnacksBanner() {
        io.print("=== Display All Snacks ==");
    }

    public void displaySuccessfulBanner() {
        io.print("=== Vending is processing. Please hit enter to continue.===");
    }

    public void displayExitBanner() {
        io.print("=== Thank you for vending with us! ===");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displaySnackNotAvailable(BigDecimal change) {
        io.print("Change returned" + "$ " + change.toString());
        io.print("Snack not available!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== Error ===");
        io.print(errorMsg);
    }
    public void displayException(String exception){
        io.print(exception);
        
    }
}
