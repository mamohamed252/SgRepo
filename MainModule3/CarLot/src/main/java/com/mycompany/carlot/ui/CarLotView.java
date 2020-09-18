/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carlot.ui;

import com.mycompany.carlot.dto.Car;
import java.util.List;

/**
 *
 * @author Mohamed
 */
public class CarLotView {
    private UserIO io = new UserIOConsoleImpl();
    
        public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Add Vehicle");
        io.print("2. Edit Vehicle");
        io.print("3. Remove Vehicle");
        io.print("4. List Vehicles in inventory"); 
        io.print("5. Search car by VIN");
        io.print("6. Search available cars by a color");
        io.print("7. Search available cars by max price");
        io.print("8. Search available cars by make and model");
        // vin and discount amount -- would make that car discountant
        // vin, cash -- check if car is available and remove from list
        io.print("9. Exit");
        return io.readInt("Please select from the above choices.", 1, 9);
    }
        public Car getNewCarInfo(){
            String newCar = io.readString("Enter VIN number");
            String make = io.readString("Enter the make of vehicle");
            String model = io.readString("Enter model of vehicle");
            String color = io.readString("Enter color of vehicle");
            Car currentCar = new Car(newCar);
            currentCar.setMake(make);
            currentCar.setModel(model);
            currentCar.setColor(color);
            return currentCar;
            
        }
        public void displayInventoryList(List<Car> carList){
            for(Car currentCar : carList){
                String carInfo = String.format("", args)
                
            }
        }
    
}
