/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.DAO;

import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public interface VendingMachineDAO {
    
    
    List<Snack> getAllSnacks()throws VendingMachineDAOException;
    Snack getSnack(String name)throws VendingMachineDAOException;
    Snack removeSnack(String name)throws VendingMachineDAOException, NoItemInventoryException;
  
}
