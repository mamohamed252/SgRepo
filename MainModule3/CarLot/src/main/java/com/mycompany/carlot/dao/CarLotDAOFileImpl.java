/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carlot.dao;

import com.mycompany.carlot.dto.Car;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mohamed
 */
public class CarLotDAOFileImpl implements CarLotDAO {
    private Map<String, Car> cars = new HashMap<>();

    @Override
    public Car addCar(String newCar, Car car) {
        Car prevCar = cars.put(newCar, car);
        return prevCar;
    }

    @Override
    public Car getCar(String VIN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Car> getCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editCar(String VIN, Car car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Car removeCar(String VIN) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
