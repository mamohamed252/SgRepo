/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carlot.controller;

import com.mycompany.carlot.dao.CarLotDAO;
import com.mycompany.carlot.dao.CarLotDAOFileImpl;
import com.mycompany.carlot.dto.Car;
import com.mycompany.carlot.ui.CarLotView;
import com.mycompany.carlot.ui.UserIO;
import com.mycompany.carlot.ui.UserIOConsoleImpl;

/**
 *
 * @author Mohamed
 */
public class CarLotController {

    private CarLotView view = new CarLotView();
    private UserIO io = new UserIOConsoleImpl();
    private CarLotDAO dao = new CarLotDAOFileImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    createCar();
                    break;
                case 2:
                io.print(" editVehicle");
                    break;
                case 3:
                   io.print("removeVehicle");
                    break;
                case 4:
                    io.print("inventoryList");
                    break;
                case 5:
                    io.print("searchVin");
                    break;
                case 6:
                    io.print("searchColor");
                    break;
                case 7:
                    io.print("searchMaxPrice");
                    break;
                case 8:
                    io.print("SearchMakeModel");
                    break;
                case 9:
                    keepGoing = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }

        }
        io.print("GOOD BYE");
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createCar() {
        Car createdCar = view.getNewCarInfo();
        dao.addCar(createdCar.getNewCar(), createdCar);
    }

}
