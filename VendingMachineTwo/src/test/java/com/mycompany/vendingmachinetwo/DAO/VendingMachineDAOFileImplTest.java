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
        new FileReader(newTestFile);
        newTestDao = new VendingMachineDAOFileImpl(newTestFile);
        //newTestDao = new VendingMachineDAOFileImpl(file);

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetSnack() throws Exception{
        Snack newSnack = new Snack("kitkat", new BigDecimal("1.25"), 4);
      
        Snack gotSnack = newTestDao.getSnack("kitkat");
       
        assertEquals(newSnack, gotSnack, "Expected to be kitkat::1.25::4::");      
    }

    
}
