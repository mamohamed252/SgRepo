/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.service;

import com.mycompany.vendingmachinetwo.DAO.NoItemInventoryException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineAuditDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineAuditDAOMock;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOFileImpl;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOMock;
import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.io.FileWriter;
import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

/**
 *
 * @author Mohamed
 */
public class VendingMachineServiceLayerImplTest {
    VendingMachineDAO daoMock = new VendingMachineDAOMock();
    VendingMachineAuditDAO auditMock = new VendingMachineAuditDAOMock();
    VendingMachineServiceLayer testService = new VendingMachineServiceLayerImpl(daoMock, auditMock);

    public VendingMachineServiceLayerImplTest() {
    }

    @BeforeEach
    public void setUp() {
      
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetPriceChecker() {

    }

    @Test
    public void testRemoveSnack() {
        Snack testSnack = new Snack("kitkat", new BigDecimal("1.25"), 4);
        testSnack.setInventory(-1);
        
        
        if (testSnack.getInventory()<0) {
            try{
             Snack removeSnackTest = testService.removeSnack("kitkat");
             fail();
            }catch(NoItemInventoryException e){
                // will pass if error is caught
                //throw new NoItemInventoryException("Snack not available");
            }
        }
        //assertEquals(testSnack, true, (throw new NoItemInventoryException("Snack not available"));

    }

    @Test
    public void testCoins() {

    }

}
