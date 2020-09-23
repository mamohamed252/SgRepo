/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo;

import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOFileImpl;
import com.mycompany.vendingmachinetwo.UI.UserIO;
import com.mycompany.vendingmachinetwo.UI.UserIOConsoleImpl;
import com.mycompany.vendingmachinetwo.UI.VendingMachineView;
import com.mycompany.vendingmachinetwo.controller.VendingMachineController;
import com.mycompany.vendingmachinetwo.service.VendingMachineServiceLayer;
import com.mycompany.vendingmachinetwo.service.VendingMachineServiceLayerImpl;

/**
 *
 * @author Mohamed
 */
public class VendingMachineApp {

    public static void main(String[] args) {
        UserIO myIo = new UserIOConsoleImpl();
        VendingMachineView myView = new VendingMachineView(myIo);
        VendingMachineDAO myDao = new VendingMachineDAOFileImpl();
        VendingMachineServiceLayer myService = new VendingMachineServiceLayerImpl(myDao);
        VendingMachineController controller = new VendingMachineController(myService, myView);
        controller.run();
    }

}
