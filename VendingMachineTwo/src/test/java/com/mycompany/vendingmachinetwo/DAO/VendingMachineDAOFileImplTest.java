/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.DAO;

import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mohamed
 */
public class VendingMachineDAOFileImplTest {

    VendingMachineDAO newTestDao;

    public VendingMachineDAOFileImplTest() {
    }

    @BeforeEach
    public void setUp() throws Exception {
        String newTestFile = "VendingMachineUnitTest.txt";
        // Created this to remember that the perameter for the constructor of 
        // VendingMachineDAOFileImpl can be named anything as long as
        // it is a STRING
        //String file = "VendingMachineUnitTest.txt";
       FileWriter fw =  new FileWriter(newTestFile);
       fw.append("kitkat::1.25::4::");
       fw.close();
        newTestDao = new VendingMachineDAOFileImpl(newTestFile);

        //newTestDao = new VendingMachineDAOFileImpl(file);
        //Snack kitkatResetInventory = new Snack("kitkat", new BigDecimal("1.25"), 4);
        
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetSnack() throws Exception {
        Snack newSnack = new Snack("kitkat", new BigDecimal("1.25"), 4);

        Snack gotSnack = newTestDao.getSnack("kitkat");

        assertEquals(newSnack, gotSnack, "Expected to be Expected to be kitkat 1.25 4 ");
    }

    @Test
    public void testGetAllSnacks() throws Exception {

        List<Snack> allSnacks = newTestDao.getAllSnacks();
        Snack newSnack = new Snack("kitkat", new BigDecimal("1.25"), 4);
        boolean doesContain = allSnacks.contains(newSnack);

        assertEquals(allSnacks.size(), 1, "Expected to be list of all snacks to be 4");
        assertEquals(doesContain, true, "Expected to be Expected to be kitkat 1.25 4 ");

    }

    @Test
    public void testRemoveSnack() throws Exception {
        int removeSnack = newTestDao.removeSnack("kitkat").getInventory();
        int newSnack = newTestDao.getSnack("kitkat").getInventory();

        assertEquals(newSnack, removeSnack, "Expected to be Expected to be kitkat 1.25 3");

    }
}
