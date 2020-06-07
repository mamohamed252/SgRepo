/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.dao;

import com.mycompany.vendingmachine.dto.Snack;
import com.mycompany.vendingmachine.servicelayer.InsufficientFundsException;
import com.mycompany.vendingmachine.servicelayer.NoItemInventoryException;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface VendingMachineDao {
    List<Snack> getAllSnacks()
            throws VendingMachineDaoException;
    Snack changeQuantity(String snackName)
            throws NoItemInventoryException;
    Snack getUserCost()
            throws InsufficientFundsException;
    
}
