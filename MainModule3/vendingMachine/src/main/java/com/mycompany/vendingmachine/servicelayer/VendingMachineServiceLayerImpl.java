/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vendingmachine.servicelayer;

import com.mycompany.vendingmachine.dao.VendingMachineDao;
import com.mycompany.vendingmachine.dao.VendingMachineDaoException;
import com.mycompany.vendingmachine.dto.Snack;
import java.util.List;


/**
 *
 * @author Mohamed
 */
public class VendingMachineServiceLayerImpl implements VendingMachineService {

    private VendingMachineDao dao;
    //private VendingMachineAuditDao auditDao;

    public VendingMachineServiceLayerImpl(VendingMachineDao dao){//VendingMachineAuditDao auditDao) {
        this.dao = dao;
        //this.auditDao = auditDao;
    }

    @Override
    public List<Snack> getAllSnacks() throws VendingMachineDaoException {
        return dao.getAllSnacks();
    }

    @Override
    public Snack changeQuantity(String snackName) throws NoItemInventoryException {
    
        return dao.changeQuantity(snackName);
    }
    
}
