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

/**
 *
 * @author Mohamed
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer {

    VendingMachineDAO dao = new VendingMachineDAOFileImpl();

    @Override
    public BigDecimal priceChecker(BigDecimal userInput, BigDecimal inventoryPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Snack getSnack(String name)throws VendingMachineDAOException {
    Snack getSnack = dao.getSnack(name);
    return getSnack;
    } 

    @Override
    public Snack removeSnack(String name) throws NoItemInventoryException, VendingMachineDAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
