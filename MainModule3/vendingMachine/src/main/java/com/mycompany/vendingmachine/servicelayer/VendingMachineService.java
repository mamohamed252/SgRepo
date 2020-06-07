/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.servicelayer;

import com.mycompany.vendingmachine.dao.VendingMachineDaoException;
import com.mycompany.vendingmachine.dto.Snack;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface VendingMachineService {

    List<Snack> getAllSnacks()
            throws VendingMachineDaoException;

    Snack changeQuantity(String snackName)
            throws NoItemInventoryException;
    
    Snack getUserCost()
            throws InsufficientFundsException;
    
    

}
