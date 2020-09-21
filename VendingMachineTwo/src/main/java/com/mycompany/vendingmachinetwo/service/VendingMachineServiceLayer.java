/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.service;

import com.mycompany.vendingmachinetwo.DAO.NoItemInventoryException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOException;
import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface VendingMachineServiceLayer {

    public BigDecimal priceChecker(BigDecimal userInput, BigDecimal inventoryPrice);

    public Snack getSnack(String name)throws VendingMachineDAOException;
    
    public Snack removeSnack(String name) throws NoItemInventoryException, VendingMachineDAOException;
    
    public List<BigDecimal> coins(BigDecimal change);
}