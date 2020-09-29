/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.service;

import com.mycompany.vendingmachinetwo.DAO.InsufficientFundsException;
import com.mycompany.vendingmachinetwo.DAO.NoItemInventoryException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineAuditDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineAuditDAOMock;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAO;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOException;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOFileImpl;
import com.mycompany.vendingmachinetwo.DAO.VendingMachineDAOMock;
import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void testGetPriceCheckerMoreThan() throws InsufficientFundsException {
        //arrange
        BigDecimal userInput = new BigDecimal("10.00");
        BigDecimal inventoryPrice = new BigDecimal("2.00");

        //act
        BigDecimal change = testService.priceChecker(userInput, inventoryPrice);

        //assert
        assertEquals(change, new BigDecimal("8.00"), "Expected change to be $8");
    }

    @Test
    public void testGetPriceCheckerEqual() throws InsufficientFundsException {
        //arrange
        BigDecimal userInput = new BigDecimal("2.00");
        BigDecimal inventoryPrice = new BigDecimal("2.00");

        //act
        BigDecimal change = testService.priceChecker(userInput, inventoryPrice);

        //assert
        assertEquals(change, BigDecimal.ZERO, "Expected change to be no change");
    }

    @Test
    public void testGetPriceCheckerLessThan() throws InsufficientFundsException {
        //arrange
        BigDecimal userInput = new BigDecimal("1.00");
        BigDecimal inventoryPrice = new BigDecimal("2.00");
        //act
        try{
         BigDecimal change = testService.priceChecker(userInput, inventoryPrice);    
        }catch(InsufficientFundsException e){
            
        }
        
    
        //assert
    }

    @Test
    public void testRemoveSnack() throws NoItemInventoryException, VendingMachineDAOException {
        Snack testSnack = new Snack("kitkat", new BigDecimal("1.25"), 4);
        testSnack.setInventory(-1);
        Snack removeSnackTest = new Snack("kitkat");

        if (testSnack.getInventory() < 0) {
            try {
                removeSnackTest = testService.removeSnack("kitkat");
                fail();
            } catch (NoItemInventoryException e) {
                // will pass if error is caught
                //throw new NoItemInventoryException("Snack not available");
            }
        }

        assertEquals(removeSnackTest.getInventory(), 0, "Expected inventory to be set to 0");

    }

    @Test
    public void testCoins() {
        //arrange
        BigDecimal magicNumber = new BigDecimal("0.41");

        //act
        List coins = testService.coins(magicNumber);

        //assert
        assertEquals(coins.size(), 4, "Expected 4 items in list");
        assertEquals(coins.get(0), 1, "Expected 1 quarter");
        assertEquals(coins.get(1), 1, "Expected 1 dime");
        assertEquals(coins.get(2), 1, "Expected 1 nickel");
        assertEquals(coins.get(3), 1, "Expected 1 penny");
    }

}
