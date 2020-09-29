/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachinetwo.DAO;

import com.mycompany.vendingmachinetwo.DTO.Snack;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mohamed
 */
public class VendingMachineDAOMock implements VendingMachineDAO {

    @Override
    public List<Snack> getAllSnacks() throws VendingMachineDAOException {
        Map<String, Snack> snacks = new HashMap<>();
        return new ArrayList(snacks.values());
    }

    @Override
    public Snack getSnack(String name) throws VendingMachineDAOException {
        Snack nothing = new Snack("nothing");
        return nothing;
    }

    @Override
    public Snack removeSnack(String name) throws VendingMachineDAOException, NoItemInventoryException {
<<<<<<< HEAD
        Snack nothing = new Snack(name);
        nothing.setInventory(-1);
=======
        Snack nothing = new Snack("nothing");
>>>>>>> 0532c8b3b7510e848db49a296f99952219f27fb3
        return nothing;
    }

}
